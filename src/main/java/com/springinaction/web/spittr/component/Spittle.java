package com.springinaction.web.spittr.component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import  org.apache.commons.lang.builder.*;

/**
 * @author DW
 * @version 1.0
 * @date 2021/5/12 22:36
 **/
public class Spittle {
    private final  Long id;
    private final  String message;
    private final  Date time;
    private Double latitude;
    private Double longitude;

    public Spittle(String message, Date time){
        this(message,time,null,null);
    }

    public Spittle(String message, Date time, Double longitude, Double latitude){
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, new String[] {"id","time"});
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj, new String[] {"id","time"});

    }
}
