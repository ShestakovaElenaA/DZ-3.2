public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;// рост в метрах
        double weight = 98.0;// вес в килограммах
        double index = service.Calculate(height, weight);
        int bmi = (int) index;
        System.out.println(bmi);
    }
}