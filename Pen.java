public class Pen {
    private String manufacturer = "Parker ";
    private String color = "Black ";
    private String type = "Ink ";
    public void describePen(){
        System.out.println("manufacturer " + manufacturer+" " + color +" "+type);
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer(){
        return manufacturer;

    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }
}
