public class BmiService {
    public double Calculate(double height, double weight) {
        double index;
        index = (weight / (height * height));
        return index;
    }
}
