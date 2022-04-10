public class Employee {
    private String full_name;
    private String position;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    public Employee(String full_name, String position, String email, int telephone, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getFull_name() {
        return full_name;
    }

    public String gePosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "full_name ='" + full_name + '\'' +
                ", position ='" + position + '\'' +
                ", email ='" + email + '\'' +
                ", telephone = " + telephone +
                ", salary = " + salary +
                ", age = " + age +
                '}';
    }
}

