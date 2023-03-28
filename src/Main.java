public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 69;
        double heightInMeters = 1.80;
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}