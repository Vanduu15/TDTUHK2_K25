public class Carrot implements Vegetable {
    private String type = "Carrot";
   
    @Override
    public String getInfo() {
        return String.format("Cabbage[%s]", type);
    }
}
