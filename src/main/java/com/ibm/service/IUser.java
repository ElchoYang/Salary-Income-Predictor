package com.ibm.service;

import com.ibm.entity.User;

import java.math.BigDecimal;
import java.util.List;

public interface IUser {
    void add(User u);

    User getUser();

    void incrementReport();

    void deductionReport();

    void Prediction();
}
