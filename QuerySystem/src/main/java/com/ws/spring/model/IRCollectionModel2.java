package com.ws.spring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by laowang on 16-10-22.
 */
public class IRCollectionModel2 {
    @Id
    private ObjectId _id;

    private int sdbsno;

    private String head;

    private String tile;

    private String tileTitle;

    private String  firstPicUrl;

    private String secondPicUrl;

    private String firstPicCdn;

    private String secondPicCdn;

    public String getFirstPicCdn() {
        return firstPicCdn;
    }

    public void setFirstPicCdn(String firstPicCdn) {
        this.firstPicCdn = firstPicCdn;
    }

    public String getSecondPicCdn() {
        return secondPicCdn;
    }

    public void setSecondPicCdn(String secondPicCdn) {
        this.secondPicCdn = secondPicCdn;
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

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getTileTitle() {
        return tileTitle;
    }

    public void setTileTitle(String tileTitle) {
        this.tileTitle = tileTitle;
    }

    public String getFirstPicUrl() {
        return firstPicUrl;
    }

    public void setFirstPicUrl(String firstPicUrl) {
        this.firstPicUrl = firstPicUrl;
    }

    public String getSecondPicUrl() {
        return secondPicUrl;
    }

    public void setSecondPicUrl(String secondPicUrl) {
        this.secondPicUrl = secondPicUrl;
    }

    @Override
    public String toString() {
        return "IRCollectionModel2{" +
                "_id=" + _id +
                ", sdbsno=" + sdbsno +
                ", head='" + head + '\'' +
                ", tile='" + tile + '\'' +
                ", tileTitle='" + tileTitle + '\'' +
                ", firstPicUrl='" + firstPicUrl + '\'' +
                ", secondPicUrl='" + secondPicUrl + '\'' +
                '}';
    }
}
