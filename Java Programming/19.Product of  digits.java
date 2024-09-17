import java.util.Scanner;

 class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int product = 1;

        while (num != 0) {
            product *= num % 10;  // Multiply the current digit
            num /= 10;  // Remove the last digit
        }

        System.out.println("Product of digits: " + product);
        sc.close();
    }
}
