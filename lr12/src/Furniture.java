public class Furniture {
    String name;
    int id;
    String material;

    public Furniture(String name, int id, String material) {
        this.name = name;
        this.id = id;
        this.material = material;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Материал: " + material;
    }
}
