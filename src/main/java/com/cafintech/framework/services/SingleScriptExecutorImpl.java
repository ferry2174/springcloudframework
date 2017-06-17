package com.cafintech.framework.services;

import com.cafintech.framework.model.Inputs;
import com.cafintech.framework.model.MoneyAccount;
import com.cafintech.framework.model.Strategy;
import com.cafintech.framework.model.dic.Trade;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by nick on 2017/6/17.
 */

/*@Service do not open this annotation,use mock class first*/
public class SingleScriptExecutorImpl implements SingleScriptExecutor{


    @Override
    public Map<String,Object> execute(Strategy strategy, Inputs inputs) {
        Map<String,Object> result = new HashMap<String, Object>();

        //validate and replace

        //regex replace function

        //extract function and compute function

        //execute set of case then and obtain the result of target such as trade or hands

        //loop and return

        result.put("trade", Trade.buy.value);
        return result;
    }

    @Override
    public Map<String,Object> execute(Strategy strategy, Inputs inputs, MoneyAccount account) {
        return null;
    }
}
