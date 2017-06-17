package com.cafintech.framework.model.dic;

/**
 * Created by nick on 2017/6/17.
 */
public enum Trade {

    buy(1),sell(-1),hold(0);

    private int value;

    Trade(int value) {
        this.value = value;
    }
}
