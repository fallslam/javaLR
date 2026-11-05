public class Eagle extends Bird {

    public Eagle(String name, double wingspan) {
        super(name, "Орёл", wingspan);
    }

    @Override
    public String getFlightStyle() {
        return "Парящий полет";
    }
}