package AssistedProblems;

import java.util.*;
public class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r,area;
        System.out.print("Enter radius:");
        r=sc.nextDouble();
        area=Math.PI*r*r;
        System.out.println("Area="+area);
    }
}