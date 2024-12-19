package lesson2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Problem 1
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");


        //Problem 2
        for (int i = 1; i < 11; i++){
            System.out.println("3 * " + i + " = " + (3 * i));
        }


        //Problem 3
        System.out.println("Напишите ваше число и проверьте простое ли оно");
        int isSimple = scanner.nextInt();
        if (isSimple <= 1){
            System.out.println("Ваше число не простое");
        } else {
            boolean isTrue = true;
            for (int i = 2; i <= Math.sqrt(isSimple); i++){
                if (isSimple % i == 0){
                    isTrue = false;
                }
            }
            if (isTrue){
                System.out.println("Ваше число простое");
            } else {
                System.out.println("Ваше число не простое");
            }
        }


        //Problem 4
        System.out.println("Напишите ваше число и посмотрите его факториал");
        int factorial = scanner.nextInt();
        int isFactorial = 1;
        for (int i = factorial; i > 1; i--){
            isFactorial *= i;
        }
        System.out.println(isFactorial);


        //Problem 5
        System.out.println("Сумма всех чисел от 1 до 100, которые делятся на 3.");
        int divisibleBy3 = 0;
        for (int i = 1; i < 101; i++){
            if (i % 3 == 0){
                divisibleBy3 += i;
            }
        }
        System.out.println(divisibleBy3);


        //Problem 6
        System.out.println("Введите первое число");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNum = scanner.nextInt();
        System.out.println("Введите операцию (- + / *)");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '-':
                System.out.println(firstNum - secondNum);
            case '+':
                System.out.println(firstNum + secondNum);
            case '/':
                System.out.println((double) firstNum / secondNum);
            case '*':
                System.out.println(firstNum * secondNum);
        }


        //Problem 7
        System.out.println("Введите год в формате \"yyyy\"");
        int year = scanner.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))){
            System.out.println("Количество дней 366");
        } else {
            System.out.println("Количество дней 365");
        }
    }
}
