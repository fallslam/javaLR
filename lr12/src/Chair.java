public class Chair extends Furniture {
    boolean backrest;

    public Chair(String name, int id, String material, boolean backrest) {
        super(name, id, material);
        this.backrest = backrest;
    }

    @Override
    public String toString() {
        String hasBackrest = backrest ? "Да" : "Нет";
        return "Стул " + super.toString() + ", Спинка: " + hasBackrest + " ";
    }
}
