public class Pumpkin implements Vegetable {
    private double weight = 5.0;

    @Override
    public String getInfo() {
        return String.format("Pumpkin[%.2f]", weight);
    }
    
}
