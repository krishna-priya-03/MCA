import java.util.*;
public class employee
{
    int id;
    String name;
    float salary;
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        id = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter salary");
        salary = sc.nextFloat();
    }
    public void display()
    {
        System.out.println("id=" + id);
        System.out.println("name=" + name);
        System.out.println("salary=" + salary);
    }
    public static void main(String args[])
    {
        employee e1 = new employee();
        e1.read();
        e1.display();

        employee e2 = new employee();
        e2.read();  
        e2.display();

        employee e3 = new employee();
        e3.read();
        e3.display();
    }

}