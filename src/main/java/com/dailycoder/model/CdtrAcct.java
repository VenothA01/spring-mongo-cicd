package com.dailycoder.model;

public class CdtrAcct {

    private String id;
    private String nm;
    private String tp;
    private boolean wfAcctFlg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public boolean isWfAcctFlg() {
        return wfAcctFlg;
    }

    public void setWfAcctFlg(boolean wfAcctFlg) {
        this.wfAcctFlg = wfAcctFlg;
    }
}
