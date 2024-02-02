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