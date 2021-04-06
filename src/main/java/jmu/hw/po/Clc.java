package jmu.hw.po;

public class Clc {
    private String clcId;

    private String clcUpId;

    private String clcName;

    public String getClcId() {
        return clcId;
    }

    public void setClcId(String clcId) {
        this.clcId = clcId == null ? null : clcId.trim();
    }

    public String getClcUpId() {
        return clcUpId;
    }

    public void setClcUpId(String clcUpId) {
        this.clcUpId = clcUpId == null ? null : clcUpId.trim();
    }

    public String getClcName() {
        return clcName;
    }

    public void setClcName(String clcName) {
        this.clcName = clcName == null ? null : clcName.trim();
    }
}