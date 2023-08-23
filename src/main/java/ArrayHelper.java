public class ArrayHelper {
    public MinMaxAndSum findMinMaxAndSumInArray(double[] prices) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        for (double price : prices) {
            if (price < min) {
                min = price;
            }
            if (price > max) {
                max = price;
            }
            sum += price;
        }
        return new MinMaxAndSum(min, max, sum);
    }
}
