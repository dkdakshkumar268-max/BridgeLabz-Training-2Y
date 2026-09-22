import java.util.*;
public class Calendar{
    public static boolean leap(int y){
        return (y%400==0)||(y%4==0&&y%100!=0);
    }
    public static int days(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && leap(y)) return 29;
        return d[m-1];
    }
    public static int firstDay(int m,int y){
        int d=1;
        if(m<3){m+=12;y--;}
        int k=y%100;
        int j=y/100;
        int h=(d+13*(m+1)/5+k+k/4+j/4+5*j)%7;
        return (h+6)%7;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start=firstDay(m,y);
        int total=days(m,y);
        for(int i=0;i<start;i++)
            System.out.print("    ");
        for(int i=1;i<=total;i++){
            System.out.printf("%3d ",i);
            if((i+start)%7==0)
                System.out.println();
        }
    }
}
