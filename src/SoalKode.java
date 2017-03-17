/**
 * Created by MY ASUS on 17/03/2017.
 */
public class SoalKode {
        int max = 100;

    public void ganjilGenap() {
        System.out.println("Bilangan Genap");

        for (int i = 0; i <= max ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Bilangan ganjil");

        for (int i = 0; i <= max ; i++) {
            if ((i % 2)== 1) {
                System.out.println(i);
            }
        }
    }

    public void fibonacci() {
        int n1 = 0, n2 = 1;

        for (int i = 0; i <= 100 ; i++) {
            if (i == 0 || i == 1) {
                System.out.println(i);
            } else {
                int n3 = n1+n2;

                n1 = n2;
                n2 = n3;

                System.out.println(n3);
            }
        }
    }

    public void fizzBuzz(){
        for (int i = 0; i <= max ; i++) {
            boolean fizz = (i % 3) == 0;
            boolean buzz = (i % 5) == 0;
            boolean fizzbuzz = fizz && buzz;

            if (fizzbuzz) {
                    System.out.println("fizzbuzz");
            } else if (fizz) {
                    System.out.println("fizz");
            } else if (buzz) {
                    System.out.println("buzz");
            } else {
                    System.out.println(i);
            }
        }
    }
}
