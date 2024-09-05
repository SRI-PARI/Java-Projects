import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r, rev = 0;  // Initialize rev to 0
        sc.close();

        while (n != 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;  // Use single slash for division
        }

        System.out.println(rev);
    }
}
