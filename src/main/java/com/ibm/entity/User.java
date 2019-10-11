package com.ibm.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {

    private Integer year;

    private Double starting_salary;

    private BigDecimal increment;

    private BigDecimal deduction;

    private Integer incrementsNumber;

    private Integer deductionNumber;

    private Double incrementAmount;

    private Double deductionAmount;

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

    public BigDecimal getIncrement() {
        return increment;
    }

    public void setIncrement(BigDecimal increment) {
        this.increment = increment;
    }

    public BigDecimal getDeduction() {
        return deduction;
    }

    public void setDeduction(BigDecimal deduction) {
        this.deduction = deduction;
    }

    public Integer getIncrementsNumber() {
        return incrementsNumber;
    }

    public void setIncrementsNumber(Integer incrementsNumber) {
        this.incrementsNumber = incrementsNumber;
    }

    public Integer getDeductionNumber() {
        return deductionNumber;
    }

    public void setDeductionNumber(Integer deductionNumber) {
        this.deductionNumber = deductionNumber;
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

    public User() {
    }

    public User(Integer year, Double starting_salary, BigDecimal increment, BigDecimal deduction, Integer incrementsNumber, Integer deductionNumber) {
        this.year = year;
        this.starting_salary = starting_salary;
        this.increment = increment;
        this.deduction = deduction;
        this.incrementsNumber = incrementsNumber;
        this.deductionNumber = deductionNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "year=" + year +
                ", starting_salary=" + starting_salary +
                ", increment=" + increment +
                ", deduction=" + deduction +
                ", incrementsNumber=" + incrementsNumber +
                ", deductionNumber=" + deductionNumber +
                '}';
    }

    public double Amount(double salary, BigDecimal percentage, Integer num) {
        return new BigDecimal(Double.toString(salary)).multiply(percentage).multiply(new BigDecimal(Integer.toString(num))).doubleValue();
    }

}
