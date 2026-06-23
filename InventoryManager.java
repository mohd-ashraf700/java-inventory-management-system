import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Garment> inventoryList;
    public InventoryManager(){
        this.inventoryList = new ArrayList<>();
    }
    public void addGarment(Garment garment){
        inventoryList.add(garment);
        System.out.println("Success: Added item " + garment.getId() + " to inventory.");
    }
    public void viewAllGarment(){
        if(inventoryList.isEmpty()){
            System.out.println("the inventory is empty");
            return;
        }
        System.out.println("\n=== Current Inventory ===");
        for(Garment g : inventoryList){
            g.displayDetails();
        }
    }
    public void searchGarmentById(String targetId){
        System.out.println("Searching for id: " + targetId + "...");
        for(Garment g : inventoryList){
            if(g.getId().equalsIgnoreCase(targetId)){
                System.out.println("Item found !");
                g.displayDetails();
                return;
            }
        }
        System.out.println("Item not found with id: " + targetId);
    }
    public void deleteItem(String targetId){
        for(int i = 0; i < inventoryList.size(); i++){
            if(inventoryList.get(i).getId().equalsIgnoreCase(targetId)){
                inventoryList.remove(i);
                System.out.println("item removed successfully");
                return;
            }
        }
        System.out.println("item not found");
    }
}
