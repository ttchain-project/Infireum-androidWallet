package com.ttchain.walletproject.model;


import com.chad.library.adapter.base.entity.MultiItemEntity;

public abstract class BaseEntity implements MultiItemEntity {

    protected int itemType = 1;
    protected int itemSpanSize = 1;

    @Override
    public int getItemType() {
        return itemType;
    }

//    public int getItemSpanSize() {
//        return itemSpanSize;
//    }
}
