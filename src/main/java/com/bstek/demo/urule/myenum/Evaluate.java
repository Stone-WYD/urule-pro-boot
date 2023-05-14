package com.bstek.demo.urule.myenum;

public enum Evaluate {

    GOOD("良好"),
    MIDDLE("中等"),
    BAD("差");

    private String evalue;

    Evaluate(String evalue) {
        this.evalue = evalue;
    }

    public String getEvalue() {
        return evalue;
    }

    public void setEvalue(String evalue) {
        this.evalue = evalue;
    }
}
