package com.example.meeting3;

import java.util.Date;
import java.util.UUID;
public class Todo {
    private UUID mid;
    private String mTitle;
    private Date mDate;
    private boolean mDone;

    public Todo() {
        this.mid = UUID.randomUUID();
        this.mDate = new Date();
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getMid() {
        return mid;
    }

    public void setMid(UUID mid) {
        this.mid = mid;
    }

    public boolean ismDone() {
        return mDone;
    }

    public void setmDone(boolean mDone) {
        this.mDone = mDone;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }
}
