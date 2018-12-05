package com.hero.entity;

import java.util.Date;

public class Employee {
    private Integer eId;

    private String eName;

    private String eSex;

    private String eIdcard;

    private Date eBirthday;

    private String ePwd;

    private Date eLogintime;

    private Date eCreatetime;

    private Date eUpdatetime;

    private Integer eIslockout;

    private Date eLockouttime;

    private String eEmail;

    private String eTelphone;

    private Byte ePwdwrongcount;

    private Integer eIsexit;

    private Integer eDeptid;

    private String eLoginname;

    @Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSex=" + eSex + ", eIdcard=" + eIdcard + ", eBirthday="
				+ eBirthday + ", ePwd=" + ePwd + ", eLogintime=" + eLogintime + ", eCreatetime=" + eCreatetime
				+ ", eUpdatetime=" + eUpdatetime + ", eIslockout=" + eIslockout + ", eLockouttime=" + eLockouttime
				+ ", eEmail=" + eEmail + ", eTelphone=" + eTelphone + ", ePwdwrongcount=" + ePwdwrongcount
				+ ", eIsexit=" + eIsexit + ", eDeptid=" + eDeptid + ", eLoginname=" + eLoginname + "]";
	}

	public Employee() {
		super();
	}

	public Employee(Integer eId, String eName, String eSex, String eIdcard, Date eBirthday, String ePwd,
			Date eLogintime, Date eCreatetime, Date eUpdatetime, Integer eIslockout, Date eLockouttime, String eEmail,
			String eTelphone, Byte ePwdwrongcount, Integer eIsexit, Integer eDeptid, String eLoginname) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSex = eSex;
		this.eIdcard = eIdcard;
		this.eBirthday = eBirthday;
		this.ePwd = ePwd;
		this.eLogintime = eLogintime;
		this.eCreatetime = eCreatetime;
		this.eUpdatetime = eUpdatetime;
		this.eIslockout = eIslockout;
		this.eLockouttime = eLockouttime;
		this.eEmail = eEmail;
		this.eTelphone = eTelphone;
		this.ePwdwrongcount = ePwdwrongcount;
		this.eIsexit = eIsexit;
		this.eDeptid = eDeptid;
		this.eLoginname = eLoginname;
	}

	public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteSex() {
        return eSex;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex == null ? null : eSex.trim();
    }

    public String geteIdcard() {
        return eIdcard;
    }

    public void seteIdcard(String eIdcard) {
        this.eIdcard = eIdcard == null ? null : eIdcard.trim();
    }

    public Date geteBirthday() {
        return eBirthday;
    }

    public void seteBirthday(Date eBirthday) {
        this.eBirthday = eBirthday;
    }

    public String getePwd() {
        return ePwd;
    }

    public void setePwd(String ePwd) {
        this.ePwd = ePwd == null ? null : ePwd.trim();
    }

    public Date geteLogintime() {
        return eLogintime;
    }

    public void seteLogintime(Date eLogintime) {
        this.eLogintime = eLogintime;
    }

    public Date geteCreatetime() {
        return eCreatetime;
    }

    public void seteCreatetime(Date eCreatetime) {
        this.eCreatetime = eCreatetime;
    }

    public Date geteUpdatetime() {
        return eUpdatetime;
    }

    public void seteUpdatetime(Date eUpdatetime) {
        this.eUpdatetime = eUpdatetime;
    }

    public Integer geteIslockout() {
        return eIslockout;
    }

    public void seteIslockout(Integer eIslockout) {
        this.eIslockout = eIslockout;
    }

    public Date geteLockouttime() {
        return eLockouttime;
    }

    public void seteLockouttime(Date eLockouttime) {
        this.eLockouttime = eLockouttime;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail == null ? null : eEmail.trim();
    }

    public String geteTelphone() {
        return eTelphone;
    }

    public void seteTelphone(String eTelphone) {
        this.eTelphone = eTelphone == null ? null : eTelphone.trim();
    }

    public Byte getePwdwrongcount() {
        return ePwdwrongcount;
    }

    public void setePwdwrongcount(Byte ePwdwrongcount) {
        this.ePwdwrongcount = ePwdwrongcount;
    }

    public Integer geteIsexit() {
        return eIsexit;
    }

    public void seteIsexit(Integer eIsexit) {
        this.eIsexit = eIsexit;
    }

    public Integer geteDeptid() {
        return eDeptid;
    }

    public void seteDeptid(Integer eDeptid) {
        this.eDeptid = eDeptid;
    }

    public String geteLoginname() {
        return eLoginname;
    }

    public void seteLoginname(String eLoginname) {
        this.eLoginname = eLoginname == null ? null : eLoginname.trim();
    }
}