public class Product{
    private int id ;
    private String name ;
    private float price ;
    private int quantity ;

    public  Product(int id, String name,float price,int quantity){
        this.id = id ;
        this.name = name ; 
        this.price = price ;
        this.quantity = quantity ;
    }

    public void reduceStock(int amount){
        quantity = quantity - amount ;
        

    }
    
    public int getId() {
        return id ;
    }

    public String getName() {
        return name ;
    }

    public int getQuantity() {
        return quantity ;
    }
    public float getPrice(){
        return price ;
    }


}