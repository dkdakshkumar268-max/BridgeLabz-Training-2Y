import java.util.*;
public class CardDistribution {
    static String[] suits={"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    public static String[] createDeck(){
        String[] deck=new String[suits.length*ranks.length];
        int k=0;
        for(int i=0;i<suits.length;i++)
            for(int j=0;j<ranks.length;j++)
                deck[k++]=ranks[j]+" of "+suits[i];
        return deck;
    }
    public static void shuffle(String[] deck){
        int n=deck.length;
        for(int i=0;i<n;i++){
            int r=i+(int)(Math.random()*(n-i));
            String temp=deck[i];
            deck[i]=deck[r];
            deck[r]=temp;
        }
    }
    public static String[][] distribute(String[] deck,int players,int cards){
        if(players*cards>deck.length)
            return new String[0][0];
        String[][] p=new String[players][cards];
        int k=0;
        for(int i=0;i<players;i++)
            for(int j=0;j<cards;j++)
                p[i][j]=deck[k++];
        return p;
    }
    public static void print(String[][] p){
        for(int i=0;i<p.length;i++){
            System.out.println("Player "+(i+1)+":");
            for(int j=0;j<p[i].length;j++)
                System.out.println(p[i][j]);
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int players=sc.nextInt();
        int cards=sc.nextInt();
        String[] deck=createDeck();
        shuffle(deck);
        String[][] p=distribute(deck,players,cards);
        print(p);
    }
}

