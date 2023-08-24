import java.util.Scanner;

public class ArrayHelperTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов одномерного массива -> ");
        int raznumch = in.nextInt();
        double[] prices = new double[raznumch];
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Введите значение элемента массива с индексом [" + i +
                    "] -> ");
            prices[i] = in.nextInt();
        }
        ArrayHelper arrayHelper = new ArrayHelper(prices);
        var minMaxAndSumInArray = arrayHelper.findMinMaxAndSumInArray();
        System.out.println("Максимальное значение в массиве: " + minMaxAndSumInArray.getMax());
        System.out.println("Минимальное значение в массиве: " + minMaxAndSumInArray.getMin());
        System.out.println("Сумма элементов массива: " + minMaxAndSumInArray.getSum());
        in.close();
    }
}
