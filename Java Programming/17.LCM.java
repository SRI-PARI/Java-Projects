import java.util.Scanner;

 class LCMofTwoNumbers {
    
    // Method to find GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Method to find LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int lcm = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
}

