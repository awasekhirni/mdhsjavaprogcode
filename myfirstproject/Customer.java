package myfirstproject;

//class is a specification/template 
public class Customer {

    // properties
    int customerId;
    String customerName;
    String customerAddress;
    String gender;
    String postalCode;

    // constructor to build object instance
    public Customer(int cId, String cName, String cAddress, String genderType, String postalCodeInfo) {
        // this => refers to the current object
        // assigning the input parameters to the customer specification
        this.customerId = cId;
        this.customerName = cName;
        this.customerAddress = cAddress;
        this.gender = genderType;
        this.postalCode = postalCodeInfo;
    }

    // getter properties //fetch data or request for data
    // get operation
    public int getcustomerId() {
        return customerId;
    }

    public String getcustomerAddress() {
        return customerAddress;
    }

    public String getGender() {
        return gender;
    }

    public String postalCode() {
        return postalCode;
    }

    // setter properties
    // set operations // change the state of the application
    // set new property values that represent the current state
    public void setcustomerId(int cId) {
        this.customerId = cId;

    }

    public void setcustomerName(String cName) {
        this.customerName = cName;
    }

    public void setcustomerAddress(String cAdd) {
        this.customerAddress = cAdd;
    }

}
