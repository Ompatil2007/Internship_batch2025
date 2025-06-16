class Device {
    void powerOn() {
        System.out.println("Device is powering on!");
    }
}

class Smartphone extends Device {
    
    void powerOn() {
        System.out.println("Smartphone is starting with fingerprint sensor!!");
    }
}

class Tablet extends Device {

    void powerOn() {
        System.out.println("Tablet is starting with face recognition!!");
    }
}

public class  Assignment6{
    public static void main(String[] args) {
        Device myPhone = new Smartphone();
        Device myTablet = new Tablet();

        myPhone.powerOn();   
        myTablet.powerOn();  
    }
}

