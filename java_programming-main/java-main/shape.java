import java.util.*;
class shape{
    void calculateArea(float side){
        System.out.println("Area of square: " + (side * side));
    }
    void calculateArea(int length, int breadth){
        System.out.println("Area of rectangle: " + (length * breadth));
    }
    void calculateArea(double radius){
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    public static void main(String[] args) {
        shape s = new shape();
        System.out.println("Calculating area of square:");// Prompt the user to enter the side of the square
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Enter the side of the square: "); // Prompt the user to enter the side of the square
        float side = sc.nextFloat();// Read the side of the square from the user
        s.calculateArea(side);// Call the calculateArea method to calculate and display the area of the square

        System.out.println("Calculating area of rectangle:");// Prompt the user to enter the length and breadth of the rectangle
        System.out.print("Enter the length of the rectangle: ");// Prompt the user to enter the length of the rectangle
        int length = sc.nextInt();// Read the length of the rectangle from the user

        System.out.print("Enter the breadth of the rectangle: ");// Prompt the user to enter the breadth of the rectangle
        int breadth = sc.nextInt();// Read the breadth of the rectangle from the user
        s.calculateArea(length, breadth);// Call the calculateArea method to calculate and display the area of the rectangle


        System.out.println("Calculating area of circle:");// Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");// Prompt the user to enter the radius of the circle
        double radius = sc.nextDouble();// Read the radius of the circle from the user
        s.calculateArea(radius);// Call the calculateArea method to calculate and display the area of the circle
    }
}