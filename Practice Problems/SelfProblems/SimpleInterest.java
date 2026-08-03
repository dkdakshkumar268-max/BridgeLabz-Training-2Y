package SelfProblems;

import java.util.*;
public class SimpleInterest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double p,r,t,si;
        System.out.print("Enter principal:");
        p=sc.nextDouble();
        System.out.print("Enter rate:");
        r=sc.nextDouble();
        System.out.print("Enter time:");
        t=sc.nextDouble();
        si=(p*r*t)/100;
        System.out.println("Simple Interest="+si);
    }
}