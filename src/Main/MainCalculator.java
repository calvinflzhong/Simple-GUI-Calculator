package Main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainCalculator{

    //Create method for addition using BigDecimal to avoid double rounding errors
    public static double add(double A, double B){
        BigDecimal bdA= BigDecimal.valueOf(A);
        BigDecimal bdB= BigDecimal.valueOf(B);
        return bdA.add(bdB).doubleValue();
    }

    //Create method for subtraction
    public static double subtract(double A, double B){
        BigDecimal bdA= BigDecimal.valueOf(A);
        BigDecimal bdB= BigDecimal.valueOf(B);
        return bdA.subtract(bdB).doubleValue();
    }

    //Create method for multiplication
    public static double multiply(double A, double B){
        BigDecimal bdA= BigDecimal.valueOf(A);
        BigDecimal bdB= BigDecimal.valueOf(B);
        return bdA.multiply(bdB).doubleValue();
    }

    //Create method for division, set scale as 16(rounding digits)
    public static double divide(double A, double B){
        BigDecimal bdA= BigDecimal.valueOf(A);
        BigDecimal bdB= BigDecimal.valueOf(B);
        return bdA.divide(bdB, 16, RoundingMode.HALF_UP).doubleValue();
    }
}