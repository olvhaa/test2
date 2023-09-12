import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       /* int skladnik1 = 15;
        System.out.println(skladnik1);
        int skladnik2 = 9;
        System.out.println(skladnik2);
        int suma = skladnik1 + skladnik2;
        System.out.println(suma);

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną");
        int skladnik = czytnik.nextInt();
       // skladnik = czytnik.nextInt();
        System.out.println(skladnik + skladnik1);
    */
        produkt mleko = new produkt("Mlekovita", 4.99, "nabiał", 7,23);

        mleko.setName("Łaciate");
        mleko.setPrize(-6.99);
//        mleko.category = "Nabiał";
//        mleko.ammount = 5;

        produkt cukier = new produkt();


        System.out.println(mleko);
        System.out.println(mleko.getName());
        System.out.println(mleko.getPrize());
        System.out.println(mleko.getCategory());
        System.out.println(mleko.getAmmount());
        System.out.println(mleko.countPriceVAT());

        System.out.printf("Cena brutto %s wynosi %.2f", mleko.getName(), mleko.countPriceVAT());
        System.out.println();

        System.out.printf("%.2f", mleko.countValuePriceBrutto());



    }
}