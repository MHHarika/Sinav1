
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RefactorSinav {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");

        double input = 0;
        try {

            input = scan.nextDouble();


            List<Double> list = new ArrayList<>();

            if (input > 0) {

                double karekok = Math.sqrt(input);

                int tamkare = (int) karekok;
                double karesi = Math.pow(tamkare, 2);
                list.add(karesi);


                double fark = input - karesi;


                while (fark > 3) {

                    double karekok2 = Math.sqrt(fark);

                    int tamkare2 = (int) karekok2;
                    double karesi2 = Math.pow(tamkare2, 2);
                    list.add(karesi2);

                    fark = fark - karesi2;

                }
                if (fark == 3) {

                    list.add(1.0);
                    list.add(1.0);
                    list.add(1.0);


                } else if (fark == 2) {

                    list.add(1.0);
                    list.add(1.0);

                } else if (fark == 1) {

                    list.add(1.0);
                }

                System.out.println("Zemini kaplayan halılar: " + list);
            } else {
                System.out.println("Lütfen sıfırdan büyük bir değer giriniz.");
            }


        } catch (Exception e) {

            System.out.println("Lütfen input olarak sadece sayı giriniz! ");

        }


    }
}
