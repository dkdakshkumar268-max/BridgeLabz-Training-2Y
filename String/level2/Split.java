import java.util.*;
public class Split{
    public static String[] splitWords(String text){
        int spaces=0;
        for(int i=0;i<text.length();i++)
            if(text.charAt(i)==' ')
                spaces++;
        String[] words=new String[spaces+1];
        int index=0;
        String temp="";
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                words[index++]=temp;
                temp="";
            }
            else
                temp+=text.charAt(i);
        }
        words[index]=temp;
        return words;
    }
    public static boolean compare(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++)
            if(!a[i].equals(b[i]))
                return false;
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] user=splitWords(text);
        String[] built=text.split(" ");
        System.out.println(compare(user,built));
    }
}
