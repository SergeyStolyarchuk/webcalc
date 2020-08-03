package com.testcalc.webcalc;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlType(propOrder = {"numCode", "charCode", "nominal", "name", "value"})

public class Valute {

    private int id;
    private int numCode;
    private String charCode;
    private int nominal;
    private String name;
    private double value;

    public Valute(){}

    public Valute(int id, int numCode, String charCode, int nominal, String name, double value) {
        this.id = id;
        this.numCode = numCode;
        this.charCode = charCode;
        this.nominal = nominal;
        this.name = name;
        this.value = value;
    }
    @XmlAttribute
    public int getId() {
        return id;
    }

    public int getNumCode() {
        return numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public int getNominal() {
        return nominal;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumCode(int numCode) {
        this.numCode = numCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Valute{" +
                "id=" + id +
                ", numCode=" + numCode +
                ", charCode='" + charCode + '\'' +
                ", nominal=" + nominal +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
