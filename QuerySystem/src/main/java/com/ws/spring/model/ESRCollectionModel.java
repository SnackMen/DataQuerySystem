package com.ws.spring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by laowang on 16-10-21.
 */
public class ESRCollectionModel {
    @Id
    private ObjectId _id;

    public int getSdbsno() {
        return sdbsno;
    }

    public void setSdbsno(int sdbsno) {
        this.sdbsno = sdbsno;
    }

    private int sdbsno;

    private String topText;

    private String underText;

    private String picUrl;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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
    public String toString(){
        return "esr_collection[id = "+_id+", sdbsno="+sdbsno+", picUrl="+picUrl+"]";
    }
}
