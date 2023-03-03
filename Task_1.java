import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        int number = sc.nextInt();

        if (number < 5){
            System.out.println("Число меньше 5");
        } else if (number > 5){
            System.out.println("Число больше 5");
        }else if (number == 5){
            System.out.println("Число равно 5");
        }

    }
}
