package lesson4;

public class Practice {
    public static void main(String[] args) {
        int[] someArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] arrayWithNegatives = {-21, -16, -9, -8, -4, -3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        //Problem 1
        for (int i = 0; i < 3; i++) {
            System.out.print(someArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Problem 2
        for (int i = 0; i < someArray.length / 2; i++){
            System.out.print(someArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Problem 3
        for (int i = someArray.length / 2; i < someArray.length; i++){
            System.out.print(someArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Problem 4
        for (int i = 1; i < someArray.length - 1; i++){
            System.out.print(someArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Problem 5
        int[] givenArray = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = givenArray.length - 3; i < givenArray.length; i++){
            System.out.print(givenArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Problem 6
        for (int i = 0; i < someArray.length; i++){
            if (i % 2 == 1){
                System.out.print(someArray[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        //Problem 7
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < arrayWithNegatives.length; i++){
            if (arrayWithNegatives[i] < 0){
                negativeCount++;
            } else positiveCount++;
        }
        System.out.println(negativeCount);
        System.out.println(positiveCount);
        System.out.println(" ");

        //Problem 8
        int firstNum = givenArray[0];
        for (int i = 1; i < givenArray.length; i++){
            if (givenArray[i] > firstNum){
                System.out.print(givenArray[i] + " ");
            }
            firstNum = givenArray[i];
        }
        System.out.println(" ");
        System.out.println(" ");

        //Problem 9
        int min = givenArray[0];
        int max = givenArray[0];
        for (int i = 1; i < givenArray.length; i++){
            if (givenArray[i] < min){
                min = givenArray[i];
            }
            if (givenArray[i] > max){
                max = givenArray[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
