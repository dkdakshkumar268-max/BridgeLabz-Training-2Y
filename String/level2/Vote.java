import java.util.*;
public class Vote{
    public static int[] inputAges(int n){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[n];
        for(int i=0;i<n;i++)
            age[i]=sc.nextInt();
        return age;
    }
    public static String[][] check(int[] age){
        String[][] res=new String[age.length][2];
        for(int i=0;i<age.length;i++){
            res[i][0]=String.valueOf(age[i]);
            if(age[i]>=18)
                res[i][1]="true";
            else
                res[i][1]="false";
        }
        return res;
    }
    public static void display(String[][] arr){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i][0]+" "+arr[i][1]);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ages=inputAges(n);
        String[][] res=check(ages);
        display(res);
    }
}
