public class Exercise03 {
    public static void main(String[] args) {
        Vegetable cabbage = VegetableFactory.getVegetable("Cabbage");
        System.out.println(cabbage.getInfo());
        Vegetable pumpkin = VegetableFactory.getVegetable("Pumpkin");
        System.out.println(pumpkin.getInfo());
        Vegetable carrot = VegetableFactory.getVegetable("Carrot");
        System.out.println(carrot.getInfo());
}
}
