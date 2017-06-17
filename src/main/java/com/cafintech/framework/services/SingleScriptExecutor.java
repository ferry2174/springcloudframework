package com.cafintech.framework.services;

import com.cafintech.framework.model.Inputs;
import com.cafintech.framework.model.MoneyAccount;
import com.cafintech.framework.model.Result;
import com.cafintech.framework.model.Strategy;

import java.util.List;
import java.util.Map;

/**
 * Created by nick on 2017/6/17.
 */
public interface SingleScriptExecutor {


    /**
     * 定义策略回测接口,与客户账户无关
     * @param strategy
     * @param inputs
     * @return
     */
    Map<String,Object> execute(Strategy strategy, Inputs inputs);


    /**
     * 定义策略回测接口,与客户账户相关
     * @param strategy
     * @param inputs
     * @param account
     * @return
     */
    Map<String,Object> execute(Strategy strategy, Inputs inputs,MoneyAccount account);

}
