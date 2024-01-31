package Productv5;

public class TV extends Product{
    private String ScreenSize;
    private String manufacturer;

    public TV (){
        super();
        ScreenSize = "";
        manufacturer = "";
        count++;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + "ScreenSize= " + ScreenSize + "\nManufacturer= " + manufacturer;
    }
}
