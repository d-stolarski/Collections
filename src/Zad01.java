import com.sun.org.apache.xpath.internal.SourceTree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zad01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choice;
        int counter = 0;
        do {
            System.out.println("Podaj liczbę:");
            choice = scan.nextInt();
            if (choice < 0) {
                System.out.println("Podano liczbę ujemną. Koniec wczytywania.");
                break;
            }
            numbers.add(choice);
            counter++;
        } while (choice > 0);

        System.out.println("\nPodane liczby w kolejności odwrotnej:");
        for (int i = counter; i > 0; i--) {
            System.out.println(numbers.get(i - 1));
        }
        int sum = 0;
        System.out.println("Suma:");
        for (int i = 0; i < counter; i++) {
            System.out.print(numbers.get(i));
            if (i < counter - 1) {
                System.out.print(" + ");
            }
            sum += numbers.get(i);
        }
        System.out.print(" = " + sum);

        int theHighestVal = Collections.max(numbers);
        System.out.println("\nNajwiększa wartość to " + theHighestVal);
        int theLowestVal = Collections.min(numbers);
        System.out.println("Najmniejsza wartość to " + theLowestVal);
    }
}
