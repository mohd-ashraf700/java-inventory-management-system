import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("welcome to the Inventory System");

        while(running){
            System.out.println("\n---Main Menu ---");
            System.out.println("1. Add a new Kurta ");
            System.out.println("2. View All Items");
            System.out.println("3. Search Item by Id");
            System.out.println("4. delete item");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice (1 - 5) : ");

            String choice = sc.nextLine();
            switch (choice){
                case "1" :
                    System.out.println("Enter Id (e.g. , k-103");
                    String id = sc.nextLine();
                    try {
                        System.out.println("Enter price : ");
                        double price = Double.parseDouble(sc.nextLine());

                        System.out.println("Enter Stock Quantity");
                        int stock = Integer.parseInt(sc.nextLine());

                        System.out.println("Enter base color");
                        String color = sc.nextLine();

                        System.out.println("Enter sleeve Pattern ");
                        String sleeve = sc.nextLine();

                        System.out.println("enter print style");
                        String print = sc.nextLine();

                        Kurta newKurta = new Kurta(id, price, stock, color, sleeve, print);
                        manager.addGarment(newKurta);
                    }catch (Exception e){
                        System.out.println("error: price and stock must be valid numbers");
                    }
                    break;
                case "2" :
                    manager.viewAllGarment();
                    break;
                case "3" :
                    System.out.println("enter the Id for Search : ");
                    String searchId = sc.nextLine();
                    manager.searchGarmentById(searchId);
                    break;
                case "4" :
                    System.out.println("enter the id");
                    String targetId = sc.nextLine();
                    manager.deleteItem(targetId);
                    break;
                case "5" :
                    System.out.println("saving data... Exiting program. goodbye !");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Choice... please enter the number between 1 - 5");
            }
        }
        sc.close();
    }
}