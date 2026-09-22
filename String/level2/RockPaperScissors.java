import java.util.*;
public class RockPaperScissors{
    public static int computerChoice(){
        return (int)(Math.random()*3)+1;
    }
    public static int winner(int user,int comp){
        if(user==comp) return 0;
        if((user==1&&comp==3)||(user==2&&comp==1)||(user==3&&comp==2))
            return 1;
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int userWin=0,compWin=0,draw=0;
        for(int i=0;i<games;i++){
            int user=sc.nextInt();
            int comp=computerChoice();
            int res=winner(user,comp);
            if(res==1) userWin++;
            else if(res==-1) compWin++;
            else draw++;
        }
        double up=(userWin*100.0)/games;
        double cp=(compWin*100.0)/games;
        System.out.println("UserWins="+userWin);
        System.out.println("ComputerWins="+compWin);
        System.out.println("Draws="+draw);
        System.out.println("User%="+up);
        System.out.println("Computer%="+cp);
    }
}
