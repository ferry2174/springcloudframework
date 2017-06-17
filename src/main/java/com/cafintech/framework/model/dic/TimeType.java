package com.cafintech.framework.model.dic;

/**
 * Created by nick on 2017/6/17.
 *
 * 本次演示仅仅支持minute类型时间序列数据
 */
public enum TimeType {

    second(1),minute(2),hour(3),day(4);

    private int value;

    TimeType(int value) {
        this.value = value;
    }

}
