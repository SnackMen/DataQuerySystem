package com.ws.spring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


/**
 * Created by laowang on 16-10-21.
 */

public class SDBSCollectionModel {
    @Id
    private ObjectId _id;
    private int sdbsno;
    private String mole_Formula;
    private String mole_Weight;
    private String ms;
    private String cnmr;
    private String hnmr;
    private String ir;
    private String raman;
    private String esr;
    private String compound_Name;

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

    public String getMole_Formula() {
        return mole_Formula;
    }

    public void setMole_Formula(String mole_Formula) {
        this.mole_Formula = mole_Formula;
    }

    public String getMole_Weight() {
        return mole_Weight;
    }

    public void setMole_Weight(String mole_Weight) {
        this.mole_Weight = mole_Weight;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getCnmr() {
        return cnmr;
    }

    public void setCnmr(String cnmr) {
        this.cnmr = cnmr;
    }

    public String getHnmr() {
        return hnmr;
    }

    public void setHnmr(String hnmr) {
        this.hnmr = hnmr;
    }

    public String getIr() {
        return ir;
    }

    public void setIr(String ir) {
        this.ir = ir;
    }

    public String getRaman() {
        return raman;
    }

    public void setRaman(String raman) {
        this.raman = raman;
    }

    public String getEsr() {
        return esr;
    }

    public void setEsr(String esr) {
        this.esr = esr;
    }

    public String getCompound_Name() {
        return compound_Name;
    }

    public void setCompound_Name(String compound_Name) {
        this.compound_Name = compound_Name;
    }

    @Override
    public String toString(){
        return "sdbs_Collection[id = "+_id +", sdbsno = "+sdbsno+", mole_Formula="+mole_Formula+", mole_Weight"+
                mole_Weight+", ms = "+ms+", cnmr = "+cnmr+", hnmr = "+hnmr+", ir = "+ir+", raman = "+raman+", esr = "+
                esr+", compound_Name"+compound_Name;
    }

}
