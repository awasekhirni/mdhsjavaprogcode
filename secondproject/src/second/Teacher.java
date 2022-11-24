package second;

public class Teacher {

    //
    public String name;
    public String grade;
    public String language;

    private int age;
    private String address;
    private int salary;

    public Teacher(String tName, String tgrade, String tLanguage, int tage, String taddress, int tsalary) {
        this.name = tName;
        this.grade = tgrade;
        this.language = tLanguage;
        this.age = tage;
        this.address = taddress;
        this.salary = tsalary;
    }

    // getter
    protected String getAddress() {
        return address;
    }

    private int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public String getLanguage() {
        return language;
    }

    public String getName() {
        return name;
    }

    private int getSalary() {
        return salary;
    }
    // setter

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
