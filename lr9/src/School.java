class School extends EducationalInstitution {
    private int grades;

    public School(String name, String address, int students, int grades) {
        super(name, address, students);
        this.grades = grades;
    }

    @Override
    public String getType() {
        return "Школа";
    }

    @Override
    public String getAdmissionRequirements() {
        return "Требуется справка о прививках";
    }

    public void showGrades() {
        System.out.println("Классов: " + grades);
    }
}