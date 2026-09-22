import java.util.*;
public class Unique{
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        char[] ans=unique(text);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
}

