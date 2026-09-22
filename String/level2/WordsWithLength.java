import java.util.*;
public class WordsWithLength {
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
    public static String[][] make2D(String[] words){
        String[][] arr=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            arr[i][0]=words[i];
            arr[i][1]=String.valueOf(words[i].length());
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] words=splitWords(text);
        String[][] res=make2D(words);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i][0]+" "+res[i][1]);
    }
}
