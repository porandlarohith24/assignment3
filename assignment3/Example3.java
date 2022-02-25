// WAP to accept start and stop values and print between values.

//   10
//   50
//      10 11 12 .....50


//   50
//   10
//      50 49 48......10




import java.util.Scanner;
class Example3{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         int start=0,stop=0;
         System.out.println("Enter start and stop values");
         start=s.nextInt();
         stop=s.nextInt(); 
         
         if(start<stop){
             
             for(int i=start;i<=stop;i++){
                 System.out.print(i+" ");
             }
         }
         else if(start>stop){
             for(int i=start;i>=stop;i--){
                 System.out.print(i+" ");
             }
         }
         else{
             System.out.println("Your start and stop values are same");
         }

    }
}