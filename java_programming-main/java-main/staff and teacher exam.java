import java.util.*;
class staff
{
    int id;
    String name;
    float salary;


    staff()
    {   
    }

    staff(int id,String name,float salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
class Teacher extends staff
{
    String dept,sub;
    Teacher(int id,String name,float salary,String dept,String sub)
    {
        super(id,name,salary);
        this.dept=dept;
        this.sub=sub;
    }
    public void display()
    {
        System.out.println("\nTeacher id\n: "+id);
        System.out.println("\nTeacher Name\n: "+name);
        System.out.println("\nTeacher Salary\n "+salary);
        System.out.println("\n Teacher Department\n: "+dept);
        System.out.println("\n Teacher Subject:\n "+sub);
    }
}
public class teacherarray
{
    public static void main(String[]args)
    {
        System.out.println("Enter the number of teachers:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the details one by one:");
        Teacher[] teachers = new Teacher[n];
        Scanner sc1=new Scanner(System.in);
        int tid;
        String name;
        float salary;
        String add;
        String dept,sub;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter teacher id:");
            tid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter teacher name:");
            name=sc.nextLine();
            System.out.println("Enter teacher salary:");
            salary=sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter teacher department:");
            dept=sc.nextLine();
            System.out.println("Enter teacher subject:");
            sub=sc.nextLine();
            teachers[i]=new Teacher(tid,name,salary,dept,sub);
        }
        System.out.println("\nDisplaying all teacher details:");
        for(int i=0;i<n;i++)
        {
            teachers[i].display();
        }
    }
}