import java.util.Scanner;

 class Prime {
    public static boolean isPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count == 2;  // Prime if there are exactly two divisors
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (isPrime(number)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

