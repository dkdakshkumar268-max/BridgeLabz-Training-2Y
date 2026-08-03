package AssistedProblems;

import java.util.*;
public class VolumeOfCylinder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r,h,volume;
        System.out.print("Enter radius:");
        r=sc.nextDouble();
        System.out.print("Enter height:");
        h=sc.nextDouble();
        volume=Math.PI*r*r*h;
        System.out.println("Volume="+volume);
    }
}