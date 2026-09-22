import java.util.*;
public class Frequency2{
    public static String[] freq(String text){
        char[] ch=text.toCharArray();
        int[] count=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0')
                continue;
            count[i]=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count[i]++;
                    ch[j]='0';
                }
            }
        }
        String[] res=new String[ch.length];
        int k=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){
                res[k]=ch[i]+" "+count[i];
                k++;
            }
        }
        String[] ans=new String[k];
        for(int i=0;i<k;i++)
            ans[i]=res[i];
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] res=freq(text);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
}

