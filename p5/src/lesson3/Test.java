package lesson3;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 230);
        Car car2 = new Car("Volkswagen", "Touareg", 250);

        car1.start();
        car2.stop();

        System.out.println(car1.toString());
        System.out.println(car2.toString());

        //2
        printName("Mansyr", "Kekilbaev");


        //3
        System.out.println("Сумма трех чисел равна: " + printSum(2, 3, 5));

        //5
        System.out.println(printSumOfTwo(25, 24));

        //6
        System.out.println(helloWorld());
    }

    //Problem 2
    public static void printName(String name, String surname) {
        System.out.println("Ваше фамилия: " + surname + ", ваше имя: " + name);
    }

    //Problem 3
    public static int printSum(int a, int b, int c) {
        return a + b + c;
    }

    //Problem 5
    public static int printSumOfTwo (int a, int b){
        return a + b;
    }

    //Problem 6
    public static String helloWorld(){
        return "Hello World";
    }
}
