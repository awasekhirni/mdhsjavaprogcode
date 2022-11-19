package myfirstproject;

public class LightSwitch {

    int id;
    Boolean handleState;
    String wireConnectionPositive;
    String wireConnectionNegative;
    int Amp;
    String mountingBracket;
    String material;
    String ManufacturerInfo;
    float price;

    public LightSwitch(int sid, Boolean switchHandle, String swcPositive, String swcNegative, int samp, String mBracket,
            String switchMaterial, String sManu, float sprice) {
        this.id = sid;
        this.handleState = switchHandle;
        this.wireConnectionNegative = swcNegative;
        this.wireConnectionPositive = swcPositive;
        this.Amp = samp;
        this.mountingBracket = mBracket;
        this.material = switchMaterial;
        this.ManufacturerInfo = sManu;
        this.price = sprice;

    }

    // getter

    // setter

    public Boolean isStateTurnedON() {
        if (handleState) {
            System.out.println("The Light Switch is Already Turned ON, please return boolean state");
            return handleState = true;
        } else {
            handleState = true;
            return handleState;
        }

    }

    public Boolean isStateTurnedOFF() {
        if (!handleState) {
            System.out.println("The Light Switch is Already Turned ON, please return boolean state");
            return handleState = false;
        } else {
            handleState = true;
            return handleState;
        }

    }

}
