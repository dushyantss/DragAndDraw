package dushyant.android.dragdraw.model;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Dushyant Singh Shekhawat
 * on 01-07-2016.
 */
public class Box implements Parcelable {
    public static final Parcelable.Creator<Box> CREATOR
            = new Parcelable.Creator<Box>() {
        public Box createFromParcel(Parcel in) {
            return new Box(in);
        }

        public Box[] newArray(int size) {
            return new Box[size];
        }
    };
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF point) {
        mOrigin = point;
        mCurrent = point;
    }

    private Box(Parcel in) {
        mOrigin = in.readParcelable(PointF.class.getClassLoader());
        mCurrent = in.readParcelable(PointF.class.getClassLoader());
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(mOrigin, 0);
        dest.writeParcelable(mCurrent, 0);
    }
}
