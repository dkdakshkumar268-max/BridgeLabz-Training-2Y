package AssistedProblems;

import java.util.*;
public class CelsiusToFahrenheit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double c,f;
        System.out.print("Enter temperature in Celsius:");
        c=sc.nextDouble();
        f=(c*9/5)+32;
        System.out.println("Temperature in Fahrenheit="+f);
    }
}