import java.util.Scanner;
public class SumDigits {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kérem, adjon meg egy nem negatív egész számot: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Az adott szám negatív, kérlek adj meg egy nem negatív számot.");
            } else {
                int sum = sumOfDigits(n);
                System.out.println("A számjegyek összege: " + sum);
            }

            scanner.close();
        }

        public static int sumOfDigits(int n) {

            if (n < 10) {
                return n;
            }


            int lastDigit = n % 10;
            int remainingDigits = n / 10;


            return lastDigit + sumOfDigits(remainingDigits);
        }
    }

