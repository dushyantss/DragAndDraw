package dushyant.android.dragdraw.model;

import android.graphics.PointF;

/**
 * Created by Dushyant Singh Shekhawat
 * on 01-07-2016.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF point) {
        mOrigin = point;
        mCurrent = point;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public PointF getCurrent() {

        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }
}
