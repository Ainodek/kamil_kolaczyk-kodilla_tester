import java.util.Random;

public class Loop {
    public int suma(int[] numbers) {

        int numbersOfElements = numbers.length;
        int sumOfArray = 0;

        for(int i = 0; i < numbersOfElements; i++){
            sumOfArray += numbers[i];
        }

        System.out.println("Suma elementów z tablicy to: " + sumOfArray);

        return sumOfArray;
    }
/*
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
*/
}
