import java.util.*;
public class Frequency{
    public static String[][] freq(String text){
        int[] count=new int[256];
        for(int i=0;i<text.length();i++)
            count[text.charAt(i)]++;
        String[][] res=new String[text.length()][2];
        int k=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(count[ch]>0){
                res[k][0]=ch+"";
                res[k][1]=String.valueOf(count[ch]);
                count[ch]=0;
                k++;
            }
        }
        String[][] ans=new String[k][2];
        for(int i=0;i<k;i++)
            ans[i]=res[i];
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[][] res=freq(text);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i][0]+" "+res[i][1]);
    }
}
