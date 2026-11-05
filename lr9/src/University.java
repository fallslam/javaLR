class University extends EducationalInstitution {
    private int faculties;

    public University(String name, String address, int students, int faculties) {
        super(name, address, students);
        this.faculties = faculties;
    }

    @Override
    public String getType() {
        return "Университет";
    }

    @Override
    public String getAdmissionRequirements() {
        return "Требуются результаты ЕГЭ";
    }

    public void showFaculties() {
        System.out.println("Факультетов: " + faculties);
    }
}
