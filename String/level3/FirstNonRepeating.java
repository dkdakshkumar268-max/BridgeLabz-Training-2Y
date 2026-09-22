import java.util.*;
public class FirstNonRepeating {
    public static char find(String text){
        int[] freq=new int[256];
        for(int i=0;i<text.length();i++)
            freq[text.charAt(i)]++;
        for(int i=0;i<text.length();i++)
            if(freq[text.charAt(i)]==1)
                return text.charAt(i);
        return '#';
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        System.out.println(find(text));
    }
}
