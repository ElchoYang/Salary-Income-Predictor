package com.ibm.service.impl;

import com.ibm.entity.PredictionSalary;
import com.ibm.entity.User;
import com.ibm.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 业务实现类
 */
@Service
public class UserServiceImpl implements IUser {

    @Autowired
    private User user;

    @Autowired
    private List<PredictionSalary> predictionList;

    @Override
    public void add(User u) {
        user = u;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void incrementReport() {
        System.out.println("incrementReport Report");
        System.out.format("%10s %20s %25s %15s %20s\n",
                "Year", "Starting Salary", "Number of Increments", "Increment %", "Increment Amount");
        double salary = user.getStarting_salary();
        double incrementSalary = user.getStarting_salary();
        double deductionSalary = user.getStarting_salary();
        double salaryPrediction = user.getStarting_salary();
        double incrementAmount = user.Amount(salary,user.getIncrement(), user.getIncrementsNumber());
        double deductionAmount = user.Amount(salary,user.getDeduction(), user.getDeductionNumber());
        for (int i = 1; i <= user.getYear();i++){
            System.out.format("%8d %20.2f %20d %20.2f %20s%n",
                    i,
                    incrementSalary,
                    user.getIncrementsNumber(),
                    user.getIncrement(),
                    incrementAmount
                    );

            PredictionSalary predictionSalary = new PredictionSalary(i,salaryPrediction,incrementAmount,deductionAmount);
            incrementSalary = salary + incrementAmount;
            deductionSalary = salary - deductionAmount;
            salaryPrediction = user.getStarting_salary() + incrementAmount - deductionAmount;
            incrementAmount = user.Amount(incrementSalary,user.getIncrement(), user.getIncrementsNumber());
            deductionAmount = user.Amount(deductionSalary,user.getDeduction(), user.getDeductionNumber());

            predictionList.add(predictionSalary);
        }
        System.out.println("\n\n");
    }

    @Override
    public void deductionReport() {
        System.out.println("DeductionReport Report");
        System.out.format("%10s %20s %25s %15s %20s\n",
                "Year", "Starting Salary", "Number of Deduction", "Deduction %", "Deduction Amount");
        double deductionSalary = user.getStarting_salary();
        double deductionAmount = user.Amount(deductionSalary,user.getDeduction(), user.getDeductionNumber());
        for (int i = 1; i <= user.getYear();i++){
            System.out.format("%8s %20.2f %20s %20s %20.2f%n",
                    i,
                    deductionSalary,
                    user.getDeductionNumber(),
                    user.getDeduction(),
                    deductionAmount
            );
            deductionSalary = deductionSalary - deductionAmount;
            deductionAmount = user.Amount(deductionSalary,user.getDeduction(), user.getDeductionNumber());
        }
        System.out.println("\n\n");
    }

    @Override
    public void Prediction() {
        System.out.println("Prediction Report");
        System.out.format("%10s %20s %25s %25s %20s\n",
                "Year", "Starting Salary", "Increment Amount", "Deduction Amount", "Salary Growth");
        for (PredictionSalary ps : predictionList) {
            System.out.format("%10s %20.2f %25.2f %25.2f %20.2f\n",
                    ps.getYear(), ps.getStarting_salary(), ps.getIncrementAmount(), ps.getDeductionAmount(), ps.getSalaryGrowth());
        }
        System.out.println("\n\n");
    }
}
