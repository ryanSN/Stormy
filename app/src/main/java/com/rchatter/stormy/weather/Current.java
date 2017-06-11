package com.rchatter.stormy.weather;

import com.rchatter.stormy.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by blackbox on 6/11/2015.
 */
public class Current {
    private String mIcon;
    private long mTime;
    private double mTempature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    private String mTimeZone;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId() {
        return Forecast.getIconId(mIcon);
    }

    public long getTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date datetime = new Date(getTime() * 1000);
        String timeString = formatter.format(datetime);

        return timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTempature() {
        return (int)Math.round(mTempature);
    }

    public void setTempature(double tempature) {
        mTempature = tempature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        double precipPercetange = mPrecipChance *100;
        return (int)Math.round(precipPercetange);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
