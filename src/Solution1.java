import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {


        System.out.println("Введите первое число в промежутке");
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Введите целое");
        }

        int numberFirst = scan.nextInt();


        while (numberFirst < 0) {
            System.out.println("введите положительно первое число  промежутке");
            numberFirst = scan.nextInt();
        }


        System.out.println("Введите последнее число в промежутке");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Введите целое");
        }
        int numberLast = scan.nextInt();

        while (numberLast < 0) {
            System.out.println("введите положительное последние число  промежутке  ");
            numberLast = scan.nextInt();
        }


        boolean b = true;

        if (numberFirst < 2) {
            numberFirst = 2;
        }
        for (int P = numberFirst; P <= numberLast; P++) {

            for (int i = 2; i < P; i++) {

                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)

                System.out.println(P);
            else b = true;

        }

    }
}
