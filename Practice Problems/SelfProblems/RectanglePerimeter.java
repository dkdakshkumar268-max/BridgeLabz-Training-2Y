package SelfProblems;

import java.util.*;
public class RectanglePerimeter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double l,w,p;
        System.out.print("Enter length:");
        l=sc.nextDouble();
        System.out.print("Enter width:");
        w=sc.nextDouble();
        p=2*(l+w);
        System.out.println("Perimeter="+p);
    }
}