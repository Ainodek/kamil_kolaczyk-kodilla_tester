public class SimpleArray {
    public static void main(String[] args) {
        String array[] = new String[] {"Kamil", "Janek", "Zosia", "Franek", "Ania"};

        String name = array[3];

        System.out.println(name);

        int numbersOfElements = array.length;

        System.out.println("Liczna elementow w tablicy: " + numbersOfElements);
    }
}
