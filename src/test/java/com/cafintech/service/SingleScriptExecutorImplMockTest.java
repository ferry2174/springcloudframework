package com.cafintech.service;

import com.cafintech.framework.Application;
import com.cafintech.framework.services.SingleScriptExecutor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.Map;

/**
 * Created by nick on 2017/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class SingleScriptExecutorImplMockTest {


    @Autowired
    SingleScriptExecutor singleScriptExecutor;


    @Test
    public void testFire() {
        Map<String,Object> result = singleScriptExecutor.execute(null, null);
        Assert.isTrue(Integer.valueOf(result.get("trade").toString()) == 1);

        Assert.isTrue(Integer.valueOf(result.get("hands").toString()) < 300);
    }
}
