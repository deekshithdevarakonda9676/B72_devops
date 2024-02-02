import java.util.*;  
public class ReverseNumberExample4  
{   
public static void main(String args[])   
{  
System.out.print("Enter the number that you want to reverse: ");  
Scanner sc = new Scanner(System.in);  
int n = sc.nextInt();  
int reverse_number = reverseNumber(n);   
System.out.println("The reverse of the given number is: "+reverse_number);   
}  
#developer 1 added new code from here

class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  