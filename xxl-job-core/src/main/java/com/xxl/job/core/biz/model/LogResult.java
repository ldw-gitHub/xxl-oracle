package com.xxl.job.core.biz.model;

import java.io.Serializable;

/**
 * Created by xuxueli on 17/3/23.
 */
public class LogResult implements Serializable {
    private static final long serialVersionUID = 42L;

    public LogResult(Long fromLineNum, int toLineNum, String logContent, boolean isEnd) {
        this.fromLineNum = fromLineNum;
        this.toLineNum = toLineNum;
        this.logContent = logContent;
        this.isEnd = isEnd;
    }

    private Long fromLineNum;
    private int toLineNum;
    private String logContent;
    private boolean isEnd;

    public Long getFromLineNum() {
        return fromLineNum;
    }

    public void setFromLineNum(Long fromLineNum) {
        this.fromLineNum = fromLineNum;
    }

    public int getToLineNum() {
        return toLineNum;
    }

    public void setToLineNum(int toLineNum) {
        this.toLineNum = toLineNum;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
