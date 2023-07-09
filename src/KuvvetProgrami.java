import java.util.Scanner;

public class KuvvetProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************** FOR DÖNGÜSÜ *****************************");

        System.out.print("Bir sayı girin: ");
        int us1 = scanner.nextInt();

        for (int i = 1; i <= us1; i++) {
            int kuvvetDort = (int) Math.pow(4, i);
            int kuvvetBes = (int) Math.pow(5, i);

            System.out.println("4^" + i + " = " + kuvvetDort);
            System.out.println("5^" + i + " = " + kuvvetBes);
        }


        System.out.println("*********************** WHİLE DÖNGÜSÜ *****************************");


        System.out.print("Bir sayı girin: ");
        int us2 = scanner.nextInt();

        int i = 1;
        while (i <= us2) {
            System.out.println("4^" + i + " = " + (int) Math.pow(4, i));
            System.out.println("5^" + i + " = " + (int) Math.pow(5, i));
            i++;
        }

        System.out.println("*********************** İF-ELSE DÖNGÜSÜ *****************************");

        System.out.print("Bir sayı girin: ");
        int us3 = scanner.nextInt();

        for (int a = 1; a <= us3; a++) {
            int kuvvetDort = (int) Math.pow(4, a);
            int kuvvetBes = (int) Math.pow(5, a);

            if (i % 2 == 0) {
                System.out.println("4^" + a + " = " + kuvvetDort);
            } else {
                System.out.println("5^" + a + " = " + kuvvetBes);
            }
        }
    }

}
