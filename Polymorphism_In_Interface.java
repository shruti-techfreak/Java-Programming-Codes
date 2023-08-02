package com.company;

interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        // we can't access private methods in Smartphone classes or can't be directly run(access) into the main class then what's the use of private method:
        //we can use it in default method when the logic(content) of default method gets larger
        System.out.println("Good Morning");
    }
    default void record4KVideo(){         //default methods not mandatory to define in classes implementing interface
        greet();                          // when this method is called, greet will get executed
        System.out.println("Recording in 4K");
    }
}

interface WiFi2{
    String[] getNetworks();
    void connectToNetworks(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements Camera2, WiFi2{
    @Override
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }
    /*
    @Override
    public void record4KVideo(){              //but we can override the default methods and overridden method will be output
        System.out.println("Overriding: Recording 4K Video");
    }
     */
    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networksList = {"TPLink1", "TPLink2", "TPLink3"};
        return networksList;
    }
    @Override
    public void connectToNetworks(String network) {
        System.out.println("Connecting to "+ network);
    }


}

public class PolymorphismInInterface_59 {
    public static void main(String[] args) {
        Camera2 cam1= new MySmartPhone2();   //this is a smartphone but should use it as a camera
        //cam1.getNetworks();  --error, only access to Camera2 methods
        cam1.record4KVideo();
    }
}
