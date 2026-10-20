import java.io.*;
import java.util.Scanner;

public class FileWriteRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            System.out.println("Enter text (type 'end' to stop):");

            // Writing to file
            FileWriter writer = new FileWriter(fileName);
            String input;

            while (!(input = sc.nextLine()).equalsIgnoreCase("end")) {
                writer.write(input + "\n");
            }
            writer.close();

            // Reading from file
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nFile Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}