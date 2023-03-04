public class Sparrow extends Animal implements Flyable {
    @Override
    public void makeVoice() {
        System.out.println("Чик чирик");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC26");
    }

    @Override
    public String draw3D(String material) {
        return "Воробей изображен в 3D из материала " + material;
    }

    @Override
    public void fly() {
        System.out.println("Воробей полетел");
    }
}
