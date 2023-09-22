package org.example.calculate;

import org.example.calculate.tobe.AdditionOperator;
import org.example.calculate.tobe.DivisionOperator;
import org.example.calculate.tobe.MultiplicationOperator;
import org.example.calculate.tobe.SubtractionOperator;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {

        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙 연산이 아닙니다."));

        /*리펙토링 전*/
//        if("+".equals(operator)){
//            return operand1 + operand2;
//        }
//        if("-".equals(operator)){
//            return operand1 - operand2;
//        }
//        if("*".equals(operator)){
//            return operand1 * operand2;
//        }
//        if("/".equals(operator)){
//            return operand1 / operand2;
//        }
//        return 0;
        /*리펙토링 후*/
//        return ArithmeticOperator.calculate(operand1, operator, operand2);
    }
}
