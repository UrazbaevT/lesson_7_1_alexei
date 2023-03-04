public class Car extends Transport {
    @Override
    public void draw() {
        System.out.println("\uD83D\uDE97");
    }

    @Override
    public String draw3D(String material) {
        return "Машина изображена в 3D из материала " + material;
    }

    @Override
    public void drawWithColor() {
        System.out.println("\u001B[35m" + "МАШИНА" + "\u001B[0m");
    }
}
