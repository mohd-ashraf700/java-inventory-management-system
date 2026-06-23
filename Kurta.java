public class Kurta extends Garment{
    private String baseColor;
    private String sleevePattern;
    private String digitalPrintStyle;

    public Kurta(String id , double price , int stockQuantity , String baseColor , String sleevePattern , String digitalPrintStyle){
        super(id , price , stockQuantity);
        this.baseColor = baseColor;
        this.digitalPrintStyle = digitalPrintStyle;
        this.sleevePattern = sleevePattern;
    }

    @Override
    public void displayDetails(){
        System.out.println("--- Kurta Details ---");
        System.out.println(" id " + getId());
        System.out.println(" price " + getPrice());
        System.out.println(" Stock " + getStockQuantity());
        System.out.println(" base color " + baseColor);
        System.out.println(" sleeve pattern " + sleevePattern);
        System.out.println((" digital print " + digitalPrintStyle));
        System.out.println("-----------------------");
    }
}