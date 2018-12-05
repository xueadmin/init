package com.hero.entity;

import java.util.Date;

public class Module {
    private Integer mId;

    private String mName;

    private Integer mParentid;

    private String mPath;

    private Integer mWeight;

    private Date mCreatetime;

    private Date mUpdatetime;

    private String mRemark;

    @Override
	public String toString() {
		return "Module [mId=" + mId + ", mName=" + mName + ", mParentid=" + mParentid + ", mPath=" + mPath
				+ ", mWeight=" + mWeight + ", mCreatetime=" + mCreatetime + ", mUpdatetime=" + mUpdatetime
				+ ", mRemark=" + mRemark + "]";
	}

	public Module() {
		super();
	}

	public Module(Integer mId, String mName, Integer mParentid, String mPath, Integer mWeight, Date mCreatetime,
			Date mUpdatetime, String mRemark) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mParentid = mParentid;
		this.mPath = mPath;
		this.mWeight = mWeight;
		this.mCreatetime = mCreatetime;
		this.mUpdatetime = mUpdatetime;
		this.mRemark = mRemark;
	}

	public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmParentid() {
        return mParentid;
    }

    public void setmParentid(Integer mParentid) {
        this.mParentid = mParentid;
    }

    public String getmPath() {
        return mPath;
    }

    public void setmPath(String mPath) {
        this.mPath = mPath == null ? null : mPath.trim();
    }

    public Integer getmWeight() {
        return mWeight;
    }

    public void setmWeight(Integer mWeight) {
        this.mWeight = mWeight;
    }

    public Date getmCreatetime() {
        return mCreatetime;
    }

    public void setmCreatetime(Date mCreatetime) {
        this.mCreatetime = mCreatetime;
    }

    public Date getmUpdatetime() {
        return mUpdatetime;
    }

    public void setmUpdatetime(Date mUpdatetime) {
        this.mUpdatetime = mUpdatetime;
    }

    public String getmRemark() {
        return mRemark;
    }

    public void setmRemark(String mRemark) {
        this.mRemark = mRemark == null ? null : mRemark.trim();
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Module other = (Module) obj;
		if (mCreatetime == null) {
			if (other.mCreatetime != null)
				return false;
		} else if (!mCreatetime.equals(other.mCreatetime))
			return false;
		if (mId == null) {
			if (other.mId != null)
				return false;
		} else if (!mId.equals(other.mId))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (mParentid == null) {
			if (other.mParentid != null)
				return false;
		} else if (!mParentid.equals(other.mParentid))
			return false;
		if (mPath == null) {
			if (other.mPath != null)
				return false;
		} else if (!mPath.equals(other.mPath))
			return false;
		if (mRemark == null) {
			if (other.mRemark != null)
				return false;
		} else if (!mRemark.equals(other.mRemark))
			return false;
		if (mUpdatetime == null) {
			if (other.mUpdatetime != null)
				return false;
		} else if (!mUpdatetime.equals(other.mUpdatetime))
			return false;
		if (mWeight == null) {
			if (other.mWeight != null)
				return false;
		} else if (!mWeight.equals(other.mWeight))
			return false;
		return true;
	}
   

}