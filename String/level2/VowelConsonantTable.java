import java.util.*;
public class VowelConsonantTable{
    public static String type(char ch){
        if(ch>='A'&&ch<='Z')
            ch=(char)(ch+32);
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not Letter";
    }
    public static String[][] build(String text){
        String[][] arr=new String[text.length()][2];
        for(int i=0;i<text.length();i++){
            arr[i][0]=String.valueOf(text.charAt(i));
            arr[i][1]=type(text.charAt(i));
        }
        return arr;
    }
    public static void display(String[][] arr){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i][0]+" "+arr[i][1]);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[][] res=build(text);
        display(res);
    }
}
