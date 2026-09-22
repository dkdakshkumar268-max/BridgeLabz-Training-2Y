import java.util.Scanner;
public class TwoDToOneD 
{
public static void main(String[]args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows and columns :");
int rows=sc.nextInt();
int columns=sc.nextInt();
int[][] matrix=new int[rows][columns];
System.out.println("Enter a 2D matrix of "+rows+" rows and "+columns+" columns");
for(int i=0;i<rows;i++) 
{
for(int j=0;j<columns;j++) 
{
matrix[i][j]=sc.nextInt();
}
}
int[] array=new int[rows*columns];
int index=0;
for(int i=0;i<rows;i++) 
{
for(int j=0;j<columns;j++) 
{
array[index]=matrix[i][j];
index++;
}
}
System.out.println("The same 2D matrix in 1D :-");
for(int i=0;i<array.length;i++) 
{
System.out.print(array[i]+" ");
}
}
}
