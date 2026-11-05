class Counter {
    private int count;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Counter(String name){
        this();
        this.name = name;
    }

    public Counter(int Count, String name){
        this.count = count;
        this.name = name;
    }

    public static void print(){
        
    }

































    public Counter() {

        this.count = 0;
    }
    public void increment() {

        this.count++;
    }

    public void decrement() {

        this.count--;
    }

    public int getValue() {

        return this.count;
    }
}