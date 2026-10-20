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

public class teachsingle
{
     public static void main(String args[])
     {
        System.out.println("Enter number of teachers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter teacher details one by one:");
        Scanner sc1 = new Scanner(System.in);
        int id;
        String na;
        float sal;
        String a;
        String d,s;
     
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
            Teacher t = new Teacher(id,na,sal,a,d,s);
            
    

        System.out.println("Teacher details:");

    
        
            t.display();
     }
    }