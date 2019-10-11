package com.ibm.service;

import com.ibm.config.AppConfig;
import com.ibm.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

@ContextConfiguration(classes = AppConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Autowired
    private IUser userService;

    @Test
    public void testPrediction(){
        User u = new User(5, 10000.00, new BigDecimal("0.5"), new BigDecimal("0.1"),
                1, 1);

        userService.add(u);

        userService.incrementReport();
        userService.deductionReport();
        userService.Prediction();
    }
}
