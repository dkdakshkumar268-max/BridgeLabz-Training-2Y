import java.util.*;
public class Palindrome{
    public static boolean check1(String text){
        int s=0,e=text.length()-1;
        while(s<e){
            if(text.charAt(s)!=text.charAt(e))
                return false;
            s++; e--;
        }
        return true;
    }
    public static boolean check2(String text,int s,int e){
        if(s>=e)
            return true;
        if(text.charAt(s)!=text.charAt(e))
            return false;
        return check2(text,s+1,e-1);
    }
    public static boolean check3(String text){
        char[] a=text.toCharArray();
        char[] b=new char[a.length];
        for(int i=0;i<a.length;i++)
            b[i]=a[a.length-1-i];
        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i])
                return false;
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        System.out.println(check1(text));
        System.out.println(check2(text,0,text.length()-1));
        System.out.println(check3(text));
    }
}
