public class BmiService {
    public static int calculate(int weightInKg, double heightInMeters) {
        double bmi = weightInKg / Math.pow(heightInMeters, 2);
        return (int) bmi;
    }
}
