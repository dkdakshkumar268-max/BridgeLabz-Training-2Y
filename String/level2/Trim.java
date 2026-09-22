import java.util.*;
public class Trim{
    public static int[] bounds(String text){
        int start=0,end=text.length()-1;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ')
                start++;
            else
                break;
        }
        for(int i=text.length()-1;i>=0;i--){
            if(text.charAt(i)==' ')
                end--;
            else
                break;
        }
        return new int[]{start,end};
    }
    public static String makeSubstring(String text,int s,int e){
        String res="";
        for(int i=s;i<=e;i++)
            res+=text.charAt(i);
        return res;
    }
    public static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i))
                return false;
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int[] b=bounds(text);
        String user=makeSubstring(text,b[0],b[1]);
        String built=text.trim();
        System.out.println(compare(user,built));
    }
}
