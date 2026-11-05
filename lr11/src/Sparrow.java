public class Sparrow extends Bird {

    public Sparrow(String name, double wingspan) {
        super(name, "Воробей", wingspan);
    }

    @Override
    public String getFlightStyle() {
        return "Порхающий полет";
    }
}