package com.cafintech.framework.model.dic;

/**
 * Created by nick on 2017/6/17.
 */
public enum ResultTrade {

    buy(1),sell(-1),hold(0);

    private int value;

    ResultTrade(int value) {
        this.value = value;
    }
}
