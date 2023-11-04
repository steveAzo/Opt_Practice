public class Main2{
    public static void main(String[] args){
        Person person = new Person("Stephen", "19-02-2003");
        person.setName("Stephen");
        person.setDateOfBirth("19-02-2003");
        System.out.println("Name: " + person.getName());
        System.out.println("Date of Birth: " + person.getDateOfBirth());

        Student student = new Student("Precious", "23-09-2004", "Computer Science");
        student.setMajor("Computer Science");
        System.out.println("Name: " + student.getName());
        System.out.println("Date of Birth: " + student.getDateOfBirth());
        System.out.println("Major: " + student.getMajor());

        Instructor instructor = new Instructor("Mark Attah", "20-06-1985", 17000);
        instructor.setSalary(17000);
        System.out.println("Name: " + instructor.getName());
        System.out.println("Date of Birth: " + instructor.getDateOfBirth());
        System.out.println("Major: " + instructor.getSalary());

    }
}
    


