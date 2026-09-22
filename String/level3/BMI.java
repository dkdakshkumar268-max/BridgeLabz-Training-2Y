import java.util.*;
public class BMI{
    public static double[][] input(){
        Scanner sc=new Scanner(System.in);
        double[][] hw=new double[10][2];
        for(int i=0;i<10;i++){
            hw[i][0]=sc.nextDouble();
            hw[i][1]=sc.nextDouble();
        }
        return hw;
    }
    public static String status(double bmi){
        if(bmi<18.5)
            return "Underweight";
        else if(bmi<25)
            return "Normal";
        else if(bmi<40)
            return "Overweight";
        else
            return "Obese";
    }
    public static String[][] compute(double[][] hw){
        String[][] res=new String[hw.length][4];
        for(int i=0;i<hw.length;i++){
            double weight=hw[i][0];
            double height=hw[i][1]/100.0;
            double bmi=weight/(height*height);
            bmi=Math.round(bmi*100)/100.0;
            res[i][0]=String.valueOf(hw[i][1]);
            res[i][1]=String.valueOf(weight);
            res[i][2]=String.valueOf(bmi);
            res[i][3]=status(bmi);
        }
        return res;
    }
    public static void display(String[][] arr){
        System.out.println("Height Weight BMI Status");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]+" "+arr[i][3]);
    }
    public static void main(String args[]){
        double[][] data=input();
        String[][] res=compute(data);
        display(res);
    }
}
