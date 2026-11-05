class Tett extends Test {
    protected String naz;

    public Tett(int a, float b, int c) {
        super(a, b);
        this.naz = naz;
    }
    @Override
    public void getType() {
        System.out.println(super.name);
        System.out.println("Тест"+ naz);
    }

}

