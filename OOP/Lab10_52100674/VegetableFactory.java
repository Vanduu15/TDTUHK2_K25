public class VegetableFactory {
    public static Vegetable getVegetable(String type) {
        if (type.equals("Cabbage")) {
            return new Cabbage();
        } else if (type.equals("Pumpkin")) {
            return new Pumpkin();
        } else if (type.equals("Carrot")) {
            return new Carrot();
        } else {
            return null;
        }
    }
}