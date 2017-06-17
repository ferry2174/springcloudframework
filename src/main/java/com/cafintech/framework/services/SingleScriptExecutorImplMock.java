package com.cafintech.framework.services;

import com.cafintech.framework.model.Inputs;
import com.cafintech.framework.model.MoneyAccount;
import com.cafintech.framework.model.Strategy;
import com.cafintech.framework.model.dic.Trade;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by nick on 2017/6/17.
 */

@Service
public class SingleScriptExecutorImplMock implements SingleScriptExecutor{
    @Override
    public Map<String, Object> execute(Strategy strategy, Inputs inputs) {

        Map<String, Object> result = new HashMap<String, Object>();

        result.put("trade", Trade.buy.value);

        result.put("hands", new Random().nextInt(300));

        return result;
    }

    @Override
    public Map<String, Object> execute(Strategy strategy, Inputs inputs, MoneyAccount account) {
        return null;
    }
}
