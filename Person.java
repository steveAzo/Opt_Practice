public class Person {
    private String name;
    private String dateOfBirth;
    
    //constructors
    public Person(String name, String dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    //setter for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    //setter for date of dateOfBirth
    public void setDateOfBirth(String dateOfBirth) {
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            this.dateOfBirth = dateOfBirth;
        }
    }

    //getter for name
    public String getName() {
        return name;
    }

    //getter for dateOfBirth
    public String getDateOfBirth() {
        return dateOfBirth;
    }  
}

class Student extends Person{
    private String major;

    //contstructor for the the attribute major which is specific to only the student class
    public Student(String name, String dateOfBirth, String major){
        super(name, dateOfBirth);
        this.major = major;
    }
    //setter for the attribute major
    public void setMajor(String major) {
        this.major = major;
    }

    //getter for the attribute major
    public String getMajor() {
        return major;
    }
}

class Instructor extends Person{
    private double salary;

    //constructors
    public Instructor(String dateOfBirth, String name, double salary) {
        super(name, dateOfBirth);
        this.salary = salary;
    }

    //setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //getter
    public double getSalary() {
        return salary;
    }
}

