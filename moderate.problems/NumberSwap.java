
public class NumberSwap {
    public static void main(String[] args) {
        int[] numbers = {-10, -20};
        swapNumbers(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    static void swapNumbers(int[] numbers) {
        int a = numbers[0];
        int b = numbers[1];

        //Swap without tmp variable
        a = a + b;
        b = a - b;
        a = a - b;

        numbers[0] = a;
        numbers[1] = b;
    }
}
