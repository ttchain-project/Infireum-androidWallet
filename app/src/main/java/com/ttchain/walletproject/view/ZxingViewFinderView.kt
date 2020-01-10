package com.ttchain.walletproject.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.util.AttributeSet
import android.util.TypedValue
import androidx.core.content.ContextCompat
import com.journeyapps.barcodescanner.ViewfinderView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.dp2px


/**
 * Created by williamhuang on 2017/12/12.
 */
class ZxingViewFinderView(context: Context?, attrs: AttributeSet?) :
    ViewfinderView(context, attrs) {
    var laserLinePosition = 0
    // 边角线厚度 (建议使用dp)
    var mLineDepth = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        4f,
        resources.displayMetrics
    )
    // "边角线长度/扫描边框长度"的占比 (比例越大，线越长)
    var mLineRate = 0.07f

    override fun onDraw(canvas: Canvas) {
        refreshSizes()
        if (framingRect == null || previewFramingRect == null) {
            return
        }
        val frame = framingRect
        val width = width
        val height = height
        // Draw the exterior
        drawExteriorDarkened(canvas, frame, width, height)
        if (resultBitmap != null) { // Draw the opaque result bitmap over the scanning rectangle
            paint.alpha = CURRENT_POINT_OPACITY
            canvas.drawBitmap(resultBitmap, null, frame, paint)
        } else {
//            drawEdge(frame, canvas)
            //            drawLaserLine(canvas, frame);
// Request another update at the animation interval, but only repaint the laser line,
// not the entire viewfinder mask.
            postInvalidateDelayed(
                ANIMATION_DELAY,
                frame.left - POINT_SIZE,
                frame.top - POINT_SIZE,
                frame.right + POINT_SIZE,
                frame.bottom + POINT_SIZE
            )
        }
//        drawEdge(frame, canvas)
        drawFrameBound(canvas, frame)

    }
    //    /**
//     * 畫掃描線
//     *
//     * @param canvas canvas
//     * @param frame  frame
//     */
//    private void drawLaserLine(Canvas canvas, Rect frame) {
//        paint.setColor(getResources().getColor(R.color.scan_laser_color));
//        if (resultBitmap != null) {
//            // Draw the opaque result bitmap over the scanning rectangle
//            paint.setAlpha(CURRENT_POINT_OPACITY);
//            canvas.drawBitmap(resultBitmap, null, frame, paint);
//        } else {
//            //  paint.setAlpha(SCANNER_ALPHA[scannerAlpha]);
//            laserLinePosition = laserLinePosition + 5;
//            if (laserLinePosition > frame.height()) {
//                laserLinePosition = 0;
//            }
//            //繪製掃描線
//            canvas.drawRect(frame.left + 20, frame.top + laserLinePosition, frame.right - 20, frame.top + MeasureUtil.dp2px(BaseApplication.getInstance(), 2.2f) + laserLinePosition, paint);
//            float scaleX = frame.width() / (float) frame.width();
//            float scaleY = frame.height() / (float) frame.height();
//            List<ResultPoint> currentLast = lastPossibleResultPoints;
//            int frameLeft = frame.left;
//            int frameTop = frame.top;
//            if (currentLast != null) {
////                paint.setAlpha(CURRENT_POINT_OPACITY / 2);
//                float radius = POINT_SIZE / 2.0f;
//                for (int i = 0; i < currentLast.size(); i++) {
//                    ResultPoint point = currentLast.get(i);
//                    canvas.drawCircle(frameLeft + (int) (point.getX() * scaleX),
//                            frameTop + (int) (point.getY() * scaleY),
//                            radius, paint);
//                }
//            }
//            postInvalidateDelayed(16,
//                    frame.left,
//                    frame.top,
//                    frame.right,
//                    frame.bottom);
//            // postInvalidate();
//        }
//    }
    /**
     * Draw scanner frame bound
     * Note: draw inside frame
     */
    private fun drawFrameBound(
        canvas: Canvas,
        frame: Rect
    ) {
        val scannerBoundWidth = 2.toFloat().dp2px(context).toFloat()
        paint.color = ContextCompat.getColor(context , R.color.white)
        // top
        canvas.drawRect(
            frame.left.toFloat(),
            frame.top.toFloat(),
            frame.right.toFloat(),
            frame.top + scannerBoundWidth,
            paint
        )
        // left
        canvas.drawRect(
            frame.left.toFloat(),
            frame.top.toFloat(),
            frame.left + scannerBoundWidth,
            frame.bottom.toFloat(),
            paint
        )
        // right
        canvas.drawRect(
            frame.right - scannerBoundWidth,
            frame.top.toFloat(),
            frame.right.toFloat(),
            frame.bottom.toFloat(),
            paint
        )
        // bottom
        canvas.drawRect(
            frame.left.toFloat(),
            frame.bottom - scannerBoundWidth,
            frame.right.toFloat(),
            frame.bottom.toFloat(),
            paint
        )
    }

    /**
     * Draw the exterior (i.e. outside the framing rect) darkened
     */
    private fun drawExteriorDarkened(
        canvas: Canvas,
        frame: Rect,
        width: Int,
        height: Int
    ) {
//        paint.color = if (resultBitmap != null) resultColor else maskColor
        paint.color = ContextCompat.getColor(context , R.color.black_85)
        //top
        canvas.drawRect(0f, 0f, width.toFloat(), frame.top.toFloat(), paint)
        //left
        canvas.drawRect(
            0f,
            frame.top.toFloat(),
            frame.left.toFloat(),
            frame.bottom.toFloat() + 1,
            paint
        )
        //right
        canvas.drawRect(
            frame.right.toFloat() + 1,
            frame.top.toFloat(),
            width.toFloat(),
            frame.bottom.toFloat() + 1,
            paint
        )
        //bottom
        canvas.drawRect(
            0f,
            frame.bottom.toFloat() + 1,
            width.toFloat(),
            height.toFloat(),
            paint
        )
    }

    /**
     * 劃編筐的四個角
     *
     * @param frame  frame
     * @param canvas canvas
     */
    private fun drawEdge(
        frame: Rect,
        canvas: Canvas
    ) {
        paint.color = ContextCompat.getColor(context, R.color.white) // 定义画笔的颜色
        canvas.drawRect(
            frame.left.toFloat(),
            frame.top.toFloat(),
            frame.left + frame.width() * mLineRate,
            frame.top + mLineDepth,
            paint
        )
        canvas.drawRect(
            frame.left.toFloat(),
            frame.top.toFloat(),
            frame.left + mLineDepth,
            frame.top + frame.height() * mLineRate,
            paint
        )
        canvas.drawRect(
            frame.right - frame.width() * mLineRate,
            frame.top.toFloat(),
            frame.right.toFloat(),
            frame.top + mLineDepth,
            paint
        )
        canvas.drawRect(
            frame.right - mLineDepth,
            frame.top.toFloat(),
            frame.right.toFloat(),
            frame.top + frame.height() * mLineRate,
            paint
        )
        canvas.drawRect(
            frame.left.toFloat(),
            frame.bottom - mLineDepth,
            frame.left + frame.width() * mLineRate,
            frame.bottom.toFloat(),
            paint
        )
        canvas.drawRect(
            frame.left.toFloat(),
            frame.bottom - frame.height() * mLineRate,
            frame.left + mLineDepth,
            frame.bottom.toFloat(),
            paint
        )
        canvas.drawRect(
            frame.right - frame.width() * mLineRate,
            frame.bottom - mLineDepth,
            frame.right.toFloat(),
            frame.bottom.toFloat(),
            paint
        )
        canvas.drawRect(
            frame.right - mLineDepth,
            frame.bottom - frame.height() * mLineRate,
            frame.right.toFloat(),
            frame.bottom.toFloat(),
            paint
        )
    }
}