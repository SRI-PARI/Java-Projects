import java.util.Scanner;
class even_or_odd {
   public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       int n= scanner.nextInt();
       if (n%2==0){
           System.out.println(n+"Even");
       }
       else{
           System.out.println(n+"Odd");
       }
       scanner.close();
   }

}
