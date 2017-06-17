package com.cafintech.framework.model;

/**
 * Created by nick on 2017/6/17.
 */
public class Result {

    //交易指示
    private Integer trade;
    //买入卖出数量，单位手
    private Integer hands;

    public Integer getTrade() {
        return trade;
    }

    public void setTrade(Integer trade) {
        this.trade = trade;
    }

    public Integer getHands() {
        return hands;
    }

    public void setHands(Integer hands) {
        this.hands = hands;
    }
}
