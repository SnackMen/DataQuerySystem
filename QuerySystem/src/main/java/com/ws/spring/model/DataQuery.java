package com.ws.spring.model;

import java.io.Serializable;

/**
 * Created by laowang on 16-10-23.
 */

//注意这里面的get方法不能和model里面的其他get方法相同,否则会报错
public class DataQuery implements Serializable {

    private Integer dataSbdsno;

    private String dataFormula;

    public DataQuery(){

    }

    public Integer getDataSbdsno() {
        return dataSbdsno;
    }

    public void setDataSbdsno(Integer dataSbdsno) {
        this.dataSbdsno = dataSbdsno;
    }

    public String getDataFormula() {
        return dataFormula;
    }

    public void setDataFormula(String dataFormula) {
        this.dataFormula = dataFormula;
    }

    @Override
    public String toString() {
        return "DataQuery{" +
                "dataSbdsno=" + dataSbdsno +
                ", dataFormula='" + dataFormula + '\'' +
                '}';
    }
}
