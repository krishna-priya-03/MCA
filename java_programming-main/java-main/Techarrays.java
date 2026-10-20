/*co 3*/
/*create  class employee, employee (id,name,salary, address) create constructor to intilaizer the variable create another class teacher which inherit all the properties of class employee. add data members (department,subject) display all the details using array of N numder of teachers. */
import java.util.*;
class EmployeeT
{
    int empid;
    String name;
    float salary;
    String address;
    
    
    EmployeeT(int empid,String name,float salary ,String address)
    {
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.address=address;

    }
}

class Teacher extends EmployeeT
{
    String dept,sub;
    Teacher(int empid,String name,float salary ,String address,String dept,String sub)
    {
        super(empid,name,salary,address);
        this.dept=dept;
        this.sub=sub;

    }

    public void display()
    {
        System.out.println("\nTeacher id\n" +empid);
        System.out.println("Teacher name\n" +name);
        System.out.println("Teacher salary\n" +salary);
        System.out.println("Teacher address\n" +address);
        System.out.println("Teacher department\n" +dept);
        System.out.println("Teacher subject\n" +sub);
    }
}

public class Techarrays
{
     public static void main(String args[])
     {
        System.out.println("Enter number of teachers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter teacher details:");
        Teacher teacher[] = new Teacher[n];
        Scanner sc1 = new Scanner(System.in);
        int id;
        String na;
        float sal;
        String a;
        String d,s;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter teacher id:");
            id = sc.nextInt();
            System.out.println("Enter teacher name:");
            na= sc1.nextLine();
            System.out.println("Enter teacher salary:");
            sal = sc.nextFloat();
            System.out.println("Enter teacher address:");
            a = sc1.nextLine();
            System.out.println("Enter teacher department:");
            d = sc1.nextLine();
            System.out.println("Enter teacher subject:");
            s = sc1.nextLine();
            teacher[i] = new Teacher(id,na,sal,a,d,s);
        }

        System.out.println("Teacher details:");

        for(int i=0;i<n;i++)
        {
            teacher[i].display();
        }


     }
}