public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private String designation;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }

    public Employee(String firstname, String lastname, int age, String designation) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }

    public static void main(String aA[]) {
        Employee emp = new Employee("Himanshu", "nayal", 23, "JVM");
        System.out.println(emp);
    }
}
