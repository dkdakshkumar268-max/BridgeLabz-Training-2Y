import java.util.*;
public class UniqueFrequency{
    public static char[] unique(String text){
        char[] temp=new char[text.length()];
        int k=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            boolean found=false;
            for(int j=0;j<i;j++){
                if(text.charAt(j)==ch){
                    found=true;
                    break;
                }
            }
            if(!found){
                temp[k]=ch;
                k++;
            }
        }
        char[] res=new char[k];
        for(int i=0;i<k;i++)
            res[i]=temp[i];
        return res;
    }
    public static String[][] freq(String text){
        char[] u=unique(text);
        String[][] res=new String[u.length][2];
        for(int i=0;i<u.length;i++){
            int c=0;
            for(int j=0;j<text.length();j++)
                if(text.charAt(j)==u[i])
                    c++;
            res[i][0]=u[i]+"";
            res[i][1]=String.valueOf(c);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[][] res=freq(text);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i][0]+" "+res[i][1]);
    }
}
