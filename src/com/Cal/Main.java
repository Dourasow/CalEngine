package com.Cal;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            MathEquation[] Equation = new MathEquation[4];
            Equation[0] = new MathEquation('d',100.0d,50.0d);
            Equation[1] = new MathEquation('a',25.0d , 92.0d);
            Equation[2] = new MathEquation('s',225.0d , 17.0d);
            Equation[3] = new MathEquation( 'm',11.0d,3.0d);

            for (MathEquation equation: Equation)
            {
                equation.execute();
                System.out.println("Result: "  + equation.result);
            }
            System.out.println("Average = " + MathEquation.getAverageResult());

            System.out.println();
            System.out.println("using execute overload");
            System.out.println();

            MathEquation EquationOverload = new MathEquation('d');
            double leftDouble = 9.0d;
            double rightDouble = 4.0d;
            EquationOverload.execute(leftDouble, rightDouble);
            System.out.println("Overloaded Result with doubles: " + EquationOverload.result);

            int leftint = 9;
            int rightint = 4;
            EquationOverload.execute(leftint, rightint);
            System.out.println("Overload Result with int: " + EquationOverload.result);

            Divider divider = new Divider();
            doCalculation(divider , 100.0d, 50.0d);

            Adder adder = new Adder();
            doCalculation(adder, 25.0d , 92.0d);
        }

        static void doCalculation(CalculateBase calculation, double leftVal, double rightVal) {
            calculation.setLefVal(leftVal);
            calculation.setRightVal(rightVal);
            calculation.Calculate();
                    System.out.println("Calculation Result = " + calculation.getResult());

                }
        }






















