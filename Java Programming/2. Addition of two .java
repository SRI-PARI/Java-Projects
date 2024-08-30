import java.util.Scanner;
class Addition_of_two_nums {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int c = a + b; // Add 'a' and 'b', store the result in variable 'c'
        System.out.println(c);  // Print the value of 'c' (whic.h is 15)
        scanner.close();
    }
}
