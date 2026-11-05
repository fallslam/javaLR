public class Test implements Testing {
    String naz;
    public void Test(String naz){
        this.naz = naz;
    }
    public void playt() {
        System.out.println("Игра"+naz);
    }
    public void playt(String naz){
        System.out.println("Игрaaa"+naz);
    }
    public String getNaz() {
        return "Вышка";
    }
}
