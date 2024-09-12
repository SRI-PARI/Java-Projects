import java.util.Scanner;
class SingleDigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%9==0){
            System.out.println("Sum is 9");

        }
        else if(n==0){
            System.out.println("sum is 0");

        }
        else{
            System.out.println("sum is"+" "+n%9);
        }
        sc.close();
    }

    
}
