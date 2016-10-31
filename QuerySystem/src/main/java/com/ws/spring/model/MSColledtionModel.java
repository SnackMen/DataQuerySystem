package com.ws.spring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by laowang on 16-10-21.
 */
public class MSColledtionModel {
    @Id
    private ObjectId _id;

    private int sdbsno;

    private String topText;

    private String underText;

    private String picUrl;

    private String picCdn;

    public String getPicCdn() {
        return picCdn;
    }

    public void setPicCdn(String picCdn) {
        this.picCdn = picCdn;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public int getSdbsno() {
        return sdbsno;
    }

    public void setSdbsno(int sdbsno) {
        this.sdbsno = sdbsno;
    }

    public String getTopText() {
        return topText;
    }

    public void setTopText(String topText) {
        this.topText = topText;
    }

    public String getUnderText() {
        return underText;
    }

    public void setUnderText(String underText) {
        this.underText = underText;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "MSColledtionModel{" +
                "_id=" + _id +
                ", sdbsno=" + sdbsno +
                ", topText='" + topText + '\'' +
                ", underText='" + underText + '\'' +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}
