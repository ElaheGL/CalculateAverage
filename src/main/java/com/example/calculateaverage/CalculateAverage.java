package com.example.calculateaverage;

import javax.swing.*;

public class CalculateAverage {
    public static void main(String[] args){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog
                (null,"Enter the first number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog
                (null,"Enter the second number"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog
                (null,"Enter the third number"));

        double MinResult = calculateMin(num1,num2,num3);
        double MaxResult = calculateMax(num1,num2,num3);
        double AveResult =calculateAve(num1,num2,num3);

        JOptionPane.showMessageDialog
                (null,"the smallest number is :" +
                        ""+MinResult+"\nthe maximum number is :"+MaxResult+"\nthe avrage is:"+AveResult);

    }
    private static double calculateMin(double a,double b,double c){
        return Math.min(a,Math.min(b,c));
    }
    private static double calculateMax(double x,double y,double z){
        return Math.max(x,Math.max(y,z));
    }
    private static double calculateAve(double p,double q,double r){
        final int n=3;
        return (p+q+r)/n;
    }
}