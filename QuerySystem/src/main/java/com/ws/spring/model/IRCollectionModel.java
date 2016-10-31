package com.ws.spring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by laowang on 16-10-21.
 */
public class IRCollectionModel {
    @Id
    private ObjectId _id;

    private int sdbsno;

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

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "IRCollectionModel{" +
                "_id=" + _id +
                ", sdbsno=" + sdbsno +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}
