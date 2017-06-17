package com.cafintech.framework.model;

/**
 * Created by nick on 2017/6/17.
 */
public class Strategy{
    String trade;
    @Deprecated
    String hands;

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getHands() {
        return hands;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }
}
