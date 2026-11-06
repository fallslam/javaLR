public class Smartphone {
        String brand;
        double screenSize;
        int batteryLife;

        public Smartphone(String brand, double screenSize, int batteryLife) {
            this.brand = brand;
            this.screenSize = screenSize;
            this.batteryLife = batteryLife;
        }
    @Override
    public String toString(){
        return this.brand+"   "+this.screenSize+" "+this.batteryLife+"  ";
    }
        public boolean isGoodBattery() {
            return batteryLife > 10;
        }
}
