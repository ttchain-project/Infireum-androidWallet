package com.ttchain.walletproject.rx;


import com.ttchain.walletproject.net.ApiException;

import java.lang.reflect.Field;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RxUtils {

    public static <T> ObservableTransformer<T, T> toMainThread() {
        return upstream -> upstream.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * Create a data of response if status enum is pass.
     *
     * @param enums status enum of response model object
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T> handleResult(final Object... enums) {
        return upstream -> upstream.flatMap(response -> {
            try {
                Field status = response.getClass().getDeclaredField("code");
                status.setAccessible(true);
                for (Object successEnum : enums) {
                    if (status.get(response).equals(successEnum)) {
                        return createData(response);
                    }
                }
                return Observable.error(new ApiException(getMessage(response), status.get(response).toString()));
            } catch (Exception e) {
                e.printStackTrace();
                return Observable.error(new ApiException(getMessage(response)));
            }
        });
    }

    /**
     * Create data from response
     *
     * @param response response type model
     * @param <T>
     * @return
     */
    public static <T> Observable<T> createData(final T response) {
        return Observable.create(emitter -> {
            try {
                emitter.onNext(response);
                emitter.onComplete();
            } catch (Exception e) {
                emitter.onError(e);
            }
        });
    }

    /**
     * Get message from response model
     *
     * @param response
     * @param <T>
     * @return
     */
    public static <T> String getMessage(T response) {
        try {
            Field status = response.getClass().getDeclaredField("message");
            status.setAccessible(true);
            return (String) status.get(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
