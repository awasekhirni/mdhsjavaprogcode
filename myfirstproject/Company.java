package myfirstproject;

//Scope 
//class is  blueprint or template 
public class Company {

    // Statically compiled programming language// declare the variable properties.
    // declare or type property in order to ensure that at run-time no garbage
    // information is entered. (accurate information)
    // properties // to maintain the state of your object
    // Compile time programming
    // variable => this value represent state of the object => state keeps on change
    // when you perform an operation.
    String companyName;
    String companyAddress;
    String warehouseAddress;
    int companyId;

    // build/construct an object(real-time object) to store the state
    public Company(int companyId, String companyName, String companyAddress, String warehouseAddress) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.warehouseAddress = warehouseAddress;

    }

    // it sells products/ Operation/Function
    public void onSale() {
        System.out.println("I am Selling Products on my website!");
    }

    // fetch or get the information
    public String getCompanyName() {
        return companyName;

    }

    public int getCompanyId() {
        return companyId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    // update/push the information/set new information
    public String setcompanyName(String cName) {
        this.companyName = cName;
        return companyName;
    }

    public String toString() {
        return (this.getCompanyId() + " " + this.getCompanyName() + " " + this.getCompanyAddress() + " "
                + this.getWarehouseAddress());
    }

}
