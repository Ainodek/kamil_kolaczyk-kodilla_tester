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
}
