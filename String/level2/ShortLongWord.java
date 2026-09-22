import java.util.*;
public class ShortLongWord{
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
    public static void find(String[] words){
        String min=words[0];
        String max=words[0];
        for(int i=1;i<words.length;i++){
            if(words[i].length()<min.length())
                min=words[i];
            if(words[i].length()>max.length())
                max=words[i];
        }
        System.out.println("Shortest="+min);
        System.out.println("Longest="+max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] words=splitWords(text);
        find(words);
    }
}
