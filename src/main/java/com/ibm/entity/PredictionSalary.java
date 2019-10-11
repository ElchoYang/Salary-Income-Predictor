package com.ibm.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class PredictionSalary implements Serializable {

    private Integer year;

    private Double starting_salary;

    private Double incrementAmount;

    private Double deductionAmount;

    private Double salaryGrowth;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getStarting_salary() {
        return starting_salary;
    }

    public void setStarting_salary(Double starting_salary) {
        this.starting_salary = starting_salary;
    }

    public Double getIncrementAmount() {
        return incrementAmount;
    }

    public void setIncrementAmount(Double incrementAmount) {
        this.incrementAmount = incrementAmount;
    }

    public Double getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(Double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public Double getSalaryGrowth() {
        return salaryGrowth;
    }

    public void setSalaryGrowth(Double salaryGrowth) {
        this.salaryGrowth = salaryGrowth;
    }

    public PredictionSalary(Integer year, Double starting_salary, Double incrementAmount, Double deductionAmount) {
        this.year = year;
        this.starting_salary = starting_salary;
        this.incrementAmount = incrementAmount;
        this.deductionAmount = deductionAmount;
        this.salaryGrowth = starting_salary + incrementAmount - deductionAmount;
    }
}
