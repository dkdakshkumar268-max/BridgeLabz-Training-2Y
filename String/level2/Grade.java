import java.util.*;
public class Grade{
    public static int[][] generateMarks(int n){
        int[][] marks=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                marks[i][j]=(int)(Math.random()*90)+10;
        return marks;
    }
    public static double[][] calculate(int[][] m){
        double[][] res=new double[m.length][3];
        for(int i=0;i<m.length;i++){
            int total=m[i][0]+m[i][1]+m[i][2];
            double avg=total/3.0;
            double per=(total/300.0)*100;
            avg=Math.round(avg*100)/100.0;
            per=Math.round(per*100)/100.0;
            res[i][0]=total;
            res[i][1]=avg;
            res[i][2]=per;
        }
        return res;
    }
    public static String grade(double p){
        if(p>=80) return "A";
        else if(p>=70) return "B";
        else if(p>=60) return "C";
        else if(p>=50) return "D";
        else if(p>=40) return "E";
        else return "R";
    }
    public static void display(int[][] marks,double[][] calc){
        System.out.println("Phy Chem Math Total Avg % Grade");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i][0]+"   "+ marks[i][1]+"   "+ marks[i][2]+"   "+ (int)calc[i][0]+"   "+ calc[i][1]+"   "+ calc[i][2]+"   "+ grade(calc[i][2]));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] marks=generateMarks(n);
        double[][] calc=calculate(marks);
        display(marks,calc);
    }
}
