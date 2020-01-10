package com.ttchain.walletproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExplorerQuotesResponseModel {
    @SerializedName("coinmarket")
    private List<Trend> coinmarket;

    public List<Trend> getCoinmarket() {
        return coinmarket;
    }

    public class Trend {

        @SerializedName("title")
        private String title;
        @SerializedName("price")
        private String price;
        @SerializedName("change")
        private String change;
        @SerializedName("url")
        private String url;
        @SerializedName("img")
        private String img;

        public String getTitle() {
            return title;
        }

        public String getPrice() {
            return price;
        }

        public String getChange() {
            return change;
        }

        public String getUrl() {
            return url;
        }

        public String getImg() {
            return img;
        }
    }
}
