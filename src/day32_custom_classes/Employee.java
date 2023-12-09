package day32_custom_classes;

public class Employee {
    //4 instance variables
    String name;
    int id;
    String jobTitle;
    double salary;

    public Employee (String name,  String jobTitle){
    //Java prioritize local variable over instance variables
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee (String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void goToMeeting() {
        System.out.println(name + " is going into a meeting");
    }

    @Override
    public String toString() {//This is a method has a return type
        String result = "Info about the employee: " + name +
                "\n\tID: \t\t\t" + id +
                "\n\tJob Title: \t\t"+ jobTitle +
                "\n\tSalary: $\t\t" + salary;

        return result;
    }
}
