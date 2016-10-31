package com.ws.spring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by laowang on 16-10-21.
 */
public class CNMRCollectionModel {
    @Id
    private ObjectId _id;

    private int sdbsno;

    private String top_NO;

    private String top_Mhz;

    private String top_gMl;

    private String firstPicUrl;

    private String secondPicUrl;

    private String under_Title;

    private String under_Text;

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

    public String getTop_NO() {
        return top_NO;
    }

    public void setTop_NO(String top_NO) {
        this.top_NO = top_NO;
    }

    public String getTop_Mhz() {
        return top_Mhz;
    }

    public void setTop_Mhz(String top_Mhz) {
        this.top_Mhz = top_Mhz;
    }

    public String getTop_gMl() {
        return top_gMl;
    }

    public void setTop_gMl(String top_gMl) {
        this.top_gMl = top_gMl;
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

    public String getUnder_Title() {
        return under_Title;
    }

    public void setUnder_Title(String under_Title) {
        this.under_Title = under_Title;
    }

    public String getUnder_Text() {
        return under_Text;
    }

    public void setUnder_Text(String under_Text) {
        this.under_Text = under_Text;
    }

    @Override
    public String toString(){
        return "cnmr_collection[Id = "+_id+", sdbsno = "+sdbsno+", top_NO = "+top_NO+"]";
    }
}
