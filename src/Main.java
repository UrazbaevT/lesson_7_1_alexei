public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void draw() {
                System.out.println("\uD83D\uDC31");
            }

            @Override
            public String draw3D(String material) {
                return "Кошка изображена в 3D из материала " + material;
            }

            @Override
            public void makeVoice() {
                System.out.println("Мяу мяу");
            }
        };
        cat.makeVoice();
        cat.draw();
        System.out.println(cat.draw3D("Wood"));

        Dog dog = new Dog();
        // a = b
        Drawable[] drawables = {cat, dog, new Plane(),
                new Sparrow(), new Car(), new Snake()};
        for (int i = 0; i < drawables.length; i++) {
            drawAll(drawables[i]);
            if (drawables[i] instanceof Animal) {
                ((Animal) drawables[i]).makeVoice();
            }
            if (drawables[i] instanceof Flyable) {
                ((Flyable) drawables[i]).fly();
            }
            if (drawables[i] instanceof ColorDrawable) {
                ((ColorDrawable) drawables[i]).drawWithColor();
            }
        }

        int a = 9;
        System.out.println((double) a);
        String myNumber = "98";
        System.out.println(a + Integer.parseInt(myNumber));
        double b = 5.7;
        System.out.println((int) b);
        System.out.println(Math.round(b));
    }

    public static void drawAll(Drawable drawable) {
        drawable.draw();
        System.out.println(drawable.draw3D("Plastic"));
    }
}
