import java.util.*;
public class emparray
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
        int i,n=3;
        int No;
        emparray emp[] = new emparray[n];
        for(i=0;i<n;i++)
        {
            emp[i] = new emparray();
            emp[i].read();
        }
        System.out.println("Search");
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id");
            No = Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++)
            {
                if(emp[i].id == No)
                {
                    emp[i].display();
                    break;
                }
            }
        }
    }
}