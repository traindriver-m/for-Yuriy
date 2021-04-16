package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите пример.");
            String str = sc.nextLine();
            Calculation.setParcer(str);
            Number number = new Number();
            number.calculated();
            System.out.println("Результат равен: " + number.getResult());


        }

    }
}
