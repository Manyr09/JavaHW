package lesson3;

public class Animal {
    String name;
    int age;
    double weight;
    boolean isHunter;

    public void eat() {
        int food = 3;
        int time = 10;
        for (int i = 0; i < 3; i++){
            if (isHunter == true){
                System.out.println("Животное ест мясо");
            } else System.out.println("Животное ест траву");
        }
        System.out.println("Прошло " + time + " минут");
    }
}