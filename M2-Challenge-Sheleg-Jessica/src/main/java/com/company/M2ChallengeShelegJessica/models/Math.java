package com.company.M2ChallengeShelegJessica.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.Objects;


public class Math {
    @NotNull(message = "You must supply a value for operand1")
    Integer  operand1;
    @NotNull(message = "You must supply a value for operand2")
    @Min(value = 1, message = "select value larger than 0")
    Integer operand2;
    String operation;
    int answer;

    public Math(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Math() {
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Math math = (Math) o;
        return operand1 == math.operand1 && operand2 == math.operand2 && answer == math.answer && Objects.equals(operation, math.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer);
    }
}
