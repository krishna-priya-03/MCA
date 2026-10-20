import java.util.Scanner;
public class staff
{
String name;
int id;
float salary;
Staff(String name, int id, float salary)
{
    this.name = name;
    this.id = id;
    this.salary = salary;
}
voiddisplayStaff()
{
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Salary: " + salary);
}
class teacher extends Staff
{
    int id;
    String subject;
    float salary;
    teacher(String name, int id, float salary, String subject)
    {
        super(name, id, salary);
        this.subject = subject;
        this.salary = salary;
    }
    void displayTeacher()
    {
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
    public class Staff teacherdemo{
    public static void main(String[] args) {
        scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String Name = sc.nextLine();
        System.out.println("Enter ID:");
        int Id = sc.nextInt();
        System.out.println("Enter salary:");
        float Salary = sc.nextFloat();
        System.out.println("Enter subject:");
        String Subject = sc.next();
        teacher t = new teacher(Name, Id, Salary, Subject);
        system.out.println("Staff Information:");
        t.displayStaff();
        System.out.println("Teacher Information:");
        t.displayTeacher();


    }
} 
}