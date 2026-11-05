public class Main {
    public static void main(String[] args) {

        School school1 = new School("Школа №101", "ул.Дзержинсокго 12", 800, 11);
        School school2 = new School("Гимназия №8", "ул.Семашка", 600, 9);
        School school3 = new School("Лицей №194", "пр.Ленина", 450, 10);

        University uni1 = new University("БГУ", "пр. Независимости, 4", 15000, 12);
        University uni2 = new University("БГТУ", "ул. Свердлова, 13", 9000, 8);


        System.out.println("Школа");
        school1.displayInfo();
        school2.displayInfo();
        school3.displayInfo();

        System.out.println("Университет");
        uni1.displayInfo();
        uni2.displayInfo();
    }
}