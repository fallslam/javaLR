public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Птичка", "Неизвестный", 30.5);
        Eagle eagle = new Eagle("Орелл", 220);
        Sparrow sparrow = new Sparrow("Воробейй", 25);

        bird.fly();
        bird.fly(100);
        bird.fly(2.5);
        System.out.println(bird.name + " — стиль: " + bird.getFlightStyle());
        System.out.println();

        eagle.fly();
        eagle.fly(200);
        eagle.fly(3.7);
        System.out.println(eagle.name + " — стиль: " + eagle.getFlightStyle());
        System.out.println();

        sparrow.fly();
        sparrow.fly(1);
        sparrow.fly(0.5);
        System.out.println(sparrow.name + " — стиль: " + sparrow.getFlightStyle());
    }
}