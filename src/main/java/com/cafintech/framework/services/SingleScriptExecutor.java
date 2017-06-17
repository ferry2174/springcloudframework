package com.cafintech.framework.services;

import com.cafintech.framework.model.MoneyAccount;
import com.cafintech.framework.model.Result;

/**
 * Created by nick on 2017/6/17.
 */
public interface SingleScriptExecutor {


    /**
     * 定义策略回测接口,与客户账户无关
     * @param script
     * @param time
     * @param timeType
     * @return
     */
    Result execute(String script, String time, int timeType,String stockCode);



    /**
     * 定义策略回测接口,与客户账户相关
     * @param script
     * @param time
     * @param timeType
     * @return
     */
    Result execute(String script, String time, int timeType,String stockCode,MoneyAccount account);

}
