public class Cabbage implements Vegetable {
    private String type = "Cabbage";
    private double weight = 0.5;

    @Override
    public String getInfo() {
        return String.format("Cabbage[%s,%.2f]", type, weight);
    }
}
    

