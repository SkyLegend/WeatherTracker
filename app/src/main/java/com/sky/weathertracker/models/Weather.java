package com.sky.weathertracker.models;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by Thomas Tran on 15-03-29.
 */
public class Weather {
    public ArrayList<Forecast> forecastList = new ArrayList<Forecast>();
    public Location location;
    public Units units;
    public Wind wind;
    public Atmosphere atmosphere;
    public Astronomy astronomy;
    public Image image;
    public Item item;
    public Forecast forecast;

    public class Location{
        public String city;
        public String country;
        public String region;
    }

    public class Units{
        public String distance;
        public String pressure;
        public String speed;
        public String temperature;
    }

    public class Wind{
        public Double chill;
        public Double direction;
        public Double speed;
    }

    public class Atmosphere{
        public Double humidity;
        public Double pressure;
        public Double rising;
        public Double visibility;
    }

    public class Astronomy{
        public String sunrise;
        public String sunset;
    }

    public class Image{
        public String title;
        public Double width;
        public Double height;
        public String link;
        public String url;
    }

    public class Item{
        public Condition condition;
        public String title;
        public Double latitude;
        public Double longitude;
        public String link;
        public Date publishDate;
        public String description;

        public class Condition{
            public String code;
            public Date date;
            public Double temp;
            public String text;
        }
    }

    public class Forecast{
        public String code;
        public Date date;
        public String day;
        public Double high;
        public Double low;
        public String text;
    }
}
