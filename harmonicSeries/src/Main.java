public class Main {
    public static void main(String[] args) {
        double[] numbers = {1,2,3,4,5,6,7};
        double total = 0.0;
        for (double i : numbers) {
            total += 1 / i;
        }
        System.out.println("Harmonic Average: "+ numbers.length / total);


    }
}
