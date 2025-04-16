abstract class Product {
    int price;
    String description;
    static int totalPrice;
    abstract void setPrice(int price);
    abstract void setDescription(String description);
    abstract int getPrice();
    abstract String getDescription();
}
class ElectronicsProduct extends Product {
    void setPrice(int ElectronicsProductprice) {
        price = ElectronicsProductprice;
        totalPrice+= price;
    }
    void setDescription(String description) {
        this.description = description;
    }
    int getPrice() {
        return price;
    }
    String getDescription() {
        return description;
    }
}
class ClothingProduct  extends Product {
    void setPrice(int ClothingProductprice) {
        price = ClothingProductprice;
        totalPrice+= price;
    }
    void setDescription(String description) {
        this.description = description;
    }
    int getPrice() {
        return price;
    }
    String getDescription() {
        return description;
    }
}  
class BookProduct  extends Product {
    void setPrice(int BookProductprice){
        price=BookProductprice;
        totalPrice+=price;
    }
    void setDescription(String BookProductdescription){
        description=BookProductdescription;
    }
    int getPrice() {
        return price;
    }
    String getDescription() {
        return description;
    }
}       
class AbstractProductMain {
    public static void main(String[] args) {
        Product product= new ElectronicsProduct();
        product.setPrice(1000);
        product.setDescription("Electronics Product");
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Description: " + product.getDescription());
        product= new ClothingProduct();
        product.setPrice(1200);
        product.setDescription("Clothing Product");
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Description: " + product.getDescription());
        product= new BookProduct();
        product.setPrice(300);
        product.setDescription("Book Product");
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Description: " + product.getDescription());
        System.out.println("Total Price of all products: " + Product.totalPrice);}
}