package com.testcalc.webcalc;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "ValCurs")

public class ValCurs {
    private LocalDate date;
    private List<Valute> valuteList;

    public ValCurs(){}

    public ValCurs(LocalDate date, List<Valute> valuteList) {
        this.date = date;
        this.valuteList = valuteList;
    }

    @XmlAttribute
    public LocalDate getDate() {
        return date;
    }

    public List<Valute> getValuteList() {
        return valuteList;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setValuteList(List<Valute> valuteList) {
        this.valuteList = valuteList;
    }

    @Override
    public String toString() {
        return "ValCurs{" +
                "date=" + date +
                ", valuteList=" + valuteList +
                '}';
    }
}
