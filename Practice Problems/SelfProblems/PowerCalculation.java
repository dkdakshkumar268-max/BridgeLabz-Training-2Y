package SelfProblems;

import java.util.*;
public class PowerCalculation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double base,exp,result;
        System.out.print("Enter base:");
        base=sc.nextDouble();
        System.out.print("Enter exponent:");
        exp=sc.nextDouble();
        result=Math.pow(base,exp);
        System.out.println("Result="+result);
    }
}