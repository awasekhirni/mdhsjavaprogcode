package myfirstproject;

//class specification
public class Product {

    // properties
    int productId;
    String productName;
    String productDesc;
    int productAvailability;
    float productPrice; // initialization => float productPrice=0.00F
    Boolean isProductOnSale;
    float productWeight;
    String productDimension;

    // build product construct
    public Product(int pId, String pName, String pDesc, int pAvail, float pPrice, Boolean isOnSale, float pWeight,
            String pDimension) {
        this.productId = pId;
        this.productName = pName;
        this.productDesc = pDesc;
        this.productAvailability = pAvail;
        this.productPrice = pPrice;
        this.isProductOnSale = isOnSale;
        this.productWeight = pWeight;
        this.productDimension = pDimension;

    }

    // getter methods
    public Boolean getIsProductOnSale() {
        return isProductOnSale;
    }

    public int getProductAvailability() {
        return productAvailability;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public String getProductDimension() {
        return productDimension;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public float getProductWeight() {
        return productWeight;
    }
    // setter methods

    public void setIsProductOnSale(Boolean isProductOnSale) {
        this.isProductOnSale = isProductOnSale;
    }

}
