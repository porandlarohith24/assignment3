import java.util.Scanner;

class factorial{  
 public static void main(String args[]){  
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number:");
     int num=sc.nextInt();
  int i,fact=1;  
 
  for(i=1;i<=num;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+num+" is: "+fact);    
 }  
}  