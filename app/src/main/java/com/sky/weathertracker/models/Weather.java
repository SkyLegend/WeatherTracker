package com.sky.weathertracker.models;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by Thomas Tran on 15-03-29.
 */
public class Weather {
    private ArrayList<Forecast> mForecastList;
    private Location mLocation;
    private Units mUnits;
    private Wind mWind;
    private Atmosphere mAtmosphere;
    private Astronomy mAstronomy;
    private Image mImage;
    private Item mItem;
    private Forecast mForecast;

    public ArrayList<Forecast> getmForecastList() {
        return mForecastList;
    }

    public void setmForecastList(ArrayList<Forecast> mForecastList) {
        this.mForecastList = mForecastList;
    }

    public Location getmLocation() {
        return mLocation;
    }

    public void setmLocation(Location mLocation) {
        this.mLocation = mLocation;
    }

    public Units getmUnits() {
        return mUnits;
    }

    public void setmUnits(Units mUnits) {
        this.mUnits = mUnits;
    }

    public Wind getmWind() {
        return mWind;
    }

    public void setmWind(Wind mWind) {
        this.mWind = mWind;
    }

    public Atmosphere getmAtmosphere() {
        return mAtmosphere;
    }

    public void setmAtmosphere(Atmosphere mAtmosphere) {
        this.mAtmosphere = mAtmosphere;
    }

    public Astronomy getmAstronomy() {
        return mAstronomy;
    }

    public void setmAstronomy(Astronomy mAstronomy) {
        this.mAstronomy = mAstronomy;
    }

    public Image getmImage() {
        return mImage;
    }

    public void setmImage(Image mImage) {
        this.mImage = mImage;
    }

    public Item getmItem() {
        return mItem;
    }

    public void setmItem(Item mItem) {
        this.mItem = mItem;
    }

    public Forecast getmForecast() {
        return mForecast;
    }

    public void setmForecast(Forecast mForecast) {
        this.mForecast = mForecast;
    }

    public Weather(){
        mForecastList = new ArrayList<>();
    }

    public class Location{
        private String mCity;
        private String mCountry;
        private String mRegion;

        public String getmCity() {
            return mCity;
        }

        public void setmCity(String mCity) {
            this.mCity = mCity;
        }

        public String getmCountry() {
            return mCountry;
        }

        public void setmCountry(String mCountry) {
            this.mCountry = mCountry;
        }

        public String getmRegion() {
            return mRegion;
        }

        public void setmRegion(String mRegion) {
            this.mRegion = mRegion;
        }
    }

    public class Units{
        private String mDistance;
        private String mPressure;
        private String mSpeed;
        private String mTemperature;

        public String getmDistance() {
            return mDistance;
        }

        public void setmDistance(String mDistance) {
            this.mDistance = mDistance;
        }

        public String getmPressure() {
            return mPressure;
        }

        public void setmPressure(String mPressure) {
            this.mPressure = mPressure;
        }

        public String getmSpeed() {
            return mSpeed;
        }

        public void setmSpeed(String mSpeed) {
            this.mSpeed = mSpeed;
        }

        public String getmTemperature() {
            return mTemperature;
        }

        public void setmTemperature(String mTemperature) {
            this.mTemperature = mTemperature;
        }
    }

    public class Wind{
        private Double mChill;
        private Double mDirection;
        private Double mSpeed;

        public Double getmChill() {
            return mChill;
        }

        public void setmChill(Double mChill) {
            this.mChill = mChill;
        }

        public Double getmDirection() {
            return mDirection;
        }

        public void setmDirection(Double mDirection) {
            this.mDirection = mDirection;
        }

        public Double getmSpeed() {
            return mSpeed;
        }

        public void setmSpeed(Double mSpeed) {
            this.mSpeed = mSpeed;
        }
    }

    public class Atmosphere{
        private Double mHumidity;
        private Double mPressure;
        private Double mRising;
        private Double mVisibility;

        public Double getmHumidity() {
            return mHumidity;
        }

        public void setmHumidity(Double mHumidity) {
            this.mHumidity = mHumidity;
        }

        public Double getmPressure() {
            return mPressure;
        }

        public void setmPressure(Double mPressure) {
            this.mPressure = mPressure;
        }

        public Double getmRising() {
            return mRising;
        }

        public void setmRising(Double mRising) {
            this.mRising = mRising;
        }

        public Double getmVisibility() {
            return mVisibility;
        }

        public void setmVisibility(Double mVisibility) {
            this.mVisibility = mVisibility;
        }
    }

    public class Astronomy{
        private String mSunrise;
        private String mSunset;

        public String getmSunrise() {
            return mSunrise;
        }

        public void setmSunrise(String mSunrise) {
            this.mSunrise = mSunrise;
        }

        public String getmSunset() {
            return mSunset;
        }

        public void setmSunset(String mSunset) {
            this.mSunset = mSunset;
        }
    }

    public class Image{
        private String mTitle;
        private Double mWidth;
        private Double mHeight;
        private String mLink;
        private String mUrl;

        public String getmTitle() {
            return mTitle;
        }

        public void setmTitle(String mTitle) {
            this.mTitle = mTitle;
        }

        public Double getmWidth() {
            return mWidth;
        }

        public void setmWidth(Double mWidth) {
            this.mWidth = mWidth;
        }

        public Double getmHeight() {
            return mHeight;
        }

        public void setmHeight(Double mHeight) {
            this.mHeight = mHeight;
        }

        public String getmLink() {
            return mLink;
        }

        public void setmLink(String mLink) {
            this.mLink = mLink;
        }

        public String getmUrl() {
            return mUrl;
        }

        public void setmUrl(String mUrl) {
            this.mUrl = mUrl;
        }
    }

    public class Item{
        private Condition mCondition;
        private String mTitle;
        private Double mLatitude;
        private Double mLongitude;
        private String mLink;
        private Date mPublishDate;
        private String mDescription;

        public Condition getmCondition() {
            return mCondition;
        }

        public void setmCondition(Condition mCondition) {
            this.mCondition = mCondition;
        }

        public String getmTitle() {
            return mTitle;
        }

        public void setmTitle(String mTitle) {
            this.mTitle = mTitle;
        }

        public Double getmLatitude() {
            return mLatitude;
        }

        public void setmLatitude(Double mLatitude) {
            this.mLatitude = mLatitude;
        }

        public Double getmLongitude() {
            return mLongitude;
        }

        public void setmLongitude(Double mLongitude) {
            this.mLongitude = mLongitude;
        }

        public String getmLink() {
            return mLink;
        }

        public void setmLink(String mLink) {
            this.mLink = mLink;
        }

        public Date getmPublishDate() {
            return mPublishDate;
        }

        public void setmPublishDate(Date mPublishDate) {
            this.mPublishDate = mPublishDate;
        }

        public String getmDescription() {
            return mDescription;
        }

        public void setmDescription(String mDescription) {
            this.mDescription = mDescription;
        }

        public class Condition{
            public String mCode;
            public Date mDate;
            public Double mTemp;
            public String mText;

            public String getmCode() {
                return mCode;
            }

            public void setmCode(String mCode) {
                this.mCode = mCode;
            }

            public Date getmDate() {
                return mDate;
            }

            public void setmDate(Date mDate) {
                this.mDate = mDate;
            }

            public Double getmTemp() {
                return mTemp;
            }

            public void setmTemp(Double mTemp) {
                this.mTemp = mTemp;
            }

            public String getmText() {
                return mText;
            }

            public void setmText(String mText) {
                this.mText = mText;
            }
        }
    }

    public class Forecast{
        private String mCode;
        private Date mDate;
        private String mDay;
        private Double mHigh;
        private Double mLow;
        private String mText;

        public String getmCode() {
            return mCode;
        }

        public void setmCode(String mCode) {
            this.mCode = mCode;
        }

        public Date getmDate() {
            return mDate;
        }

        public void setmDate(Date mDate) {
            this.mDate = mDate;
        }

        public String getmDay() {
            return mDay;
        }

        public void setmDay(String mDay) {
            this.mDay = mDay;
        }

        public Double getmHigh() {
            return mHigh;
        }

        public void setmHigh(Double mHigh) {
            this.mHigh = mHigh;
        }

        public Double getmLow() {
            return mLow;
        }

        public void setmLow(Double mLow) {
            this.mLow = mLow;
        }

        public String getmText() {
            return mText;
        }

        public void setmText(String mText) {
            this.mText = mText;
        }
    }
}
