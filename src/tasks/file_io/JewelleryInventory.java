package tasks.file_io;

import java.io.*;
import java.util.Scanner;

public class JewelleryInventory {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/tasks/file_io/inventory.txt", true))
        ){

            String input;
            while (true) {
                System.out.println("do you want to add item? Yes or No");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("No"))
                    break;

                System.out.println("Enter jewel name");
                String name = sc.nextLine();
                System.out.println("Enter jewel quantity");
                int quantity = Integer.parseInt(sc.nextLine());
                System.out.println("Enter jewel price");
                float price = Float.parseFloat(sc.nextLine());
                writer.write("Jewel name: " + name + " | Quantity: " + quantity + " | Price: Rs:" + price + "\n");
            }
        }
        catch (IOException e) {
            System.out.println("IO Execption occurs while writing");
        }
        System.out.println("Read and Display all items");
        readItems();
        searchItems();
    }

    public static void readItems(){
        int count = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader("src/tasks/file_io/inventory.txt"))
        ) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                count ++;
            }
        }
        catch (IOException e){
            System.out.println("IO Execption occurs while reading");
        }
        System.out.println("Total items: "+count);
    }
    public static void searchItems(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter item to be searched");
        String search = sc.nextLine();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/tasks/file_io/inventory.txt"))
        ) {
            if(reader.readLine().equalsIgnoreCase(search))
            {
                flag = true;
                System.out.println(search+" not present");
                //break;
            }
            if(!flag)
                System.out.println(search+" is not present");
        }
        catch (IOException e){
            System.out.println("IO Execption occurs while reading");
        }
    }
}
