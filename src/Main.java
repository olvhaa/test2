import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int skladnik1 = 15;
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

    }
}