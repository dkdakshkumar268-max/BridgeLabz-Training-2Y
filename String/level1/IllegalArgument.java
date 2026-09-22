import java.util.Scanner;
class IllegalArgument 
{
static void generate(String s)
{
System.out.println(s.substring(5,2));
}
static void handle(String s)
{
try
{
System.out.println(s.substring(5,2));
}catch(IllegalArgumentException e)
{
System.out.println("Illegal Argument handled");
}catch(RuntimeException e){
System.out.println("Runtime handled");
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
generate(s);
}
}


