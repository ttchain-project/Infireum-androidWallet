package com.ttchain.walletproject.view;

import java.lang.System;

/**
 * Created by williamhuang on 2017/12/12.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J(\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/ttchain/walletproject/view/ZxingViewFinderView;", "Lcom/journeyapps/barcodescanner/ViewfinderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "laserLinePosition", "", "getLaserLinePosition", "()I", "setLaserLinePosition", "(I)V", "mLineDepth", "", "getMLineDepth", "()F", "setMLineDepth", "(F)V", "mLineRate", "getMLineRate", "setMLineRate", "drawEdge", "", "frame", "Landroid/graphics/Rect;", "canvas", "Landroid/graphics/Canvas;", "drawExteriorDarkened", "width", "height", "drawFrameBound", "onDraw", "app_proPlayDebug"})
public final class ZxingViewFinderView extends com.journeyapps.barcodescanner.ViewfinderView {
    private int laserLinePosition;
    private float mLineDepth;
    private float mLineRate;
    private java.util.HashMap _$_findViewCache;
    
    public final int getLaserLinePosition() {
        return 0;
    }
    
    public final void setLaserLinePosition(int p0) {
    }
    
    public final float getMLineDepth() {
        return 0.0F;
    }
    
    public final void setMLineDepth(float p0) {
    }
    
    public final float getMLineRate() {
        return 0.0F;
    }
    
    public final void setMLineRate(float p0) {
    }
    
    @java.lang.Override()
    public void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    /**
     * Draw scanner frame bound
     * Note: draw inside frame
     */
    private final void drawFrameBound(android.graphics.Canvas canvas, android.graphics.Rect frame) {
    }
    
    /**
     * Draw the exterior (i.e. outside the framing rect) darkened
     */
    private final void drawExteriorDarkened(android.graphics.Canvas canvas, android.graphics.Rect frame, int width, int height) {
    }
    
    /**
     * 劃編筐的四個角
     *
     * @param frame  frame
     * @param canvas canvas
     */
    private final void drawEdge(android.graphics.Rect frame, android.graphics.Canvas canvas) {
    }
    
    public ZxingViewFinderView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
}