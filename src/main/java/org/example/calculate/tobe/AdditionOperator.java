package org.example.calculate.tobe;

import org.example.calculate.NewArithmeticOperator;
import org.example.calculate.PositiveNumber;

public class AdditionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        System.out.println("더하기"+ operator);
        return "+".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() + operand2.toInt();
    }
}
