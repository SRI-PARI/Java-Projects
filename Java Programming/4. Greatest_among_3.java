 import java.util.Scanner;
 class Greatesr_among_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a>b){
            if (a>c){
                System.out.println(a+ "  Is Big");
            }
            else{
                System.out.println(c+ "  Is Big");
            }
        }
        else{
            if(b>c){
                System.out.println(b+ " Is Big");
            }
            else{
                System.out.println(c+ " Is Big");
            }

        }

        scanner.close();
    }
}
