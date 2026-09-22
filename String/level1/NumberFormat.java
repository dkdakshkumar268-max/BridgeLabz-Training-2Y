import java.util.Scanner;
class NumberFormat 
{
static void generate(String text)
{
int num=Integer.parseInt(text);
System.out.println(num);
}
static void handle(String text)
{
try{
int num=Integer.parseInt(text);
System.out.println(num);
}catch(NumberFormatException e){
System.out.println("Number Format handled");
}catch(RuntimeException e){
System.out.println("Runtime handled");
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String text=sc.next();
generate(text);
}
}

