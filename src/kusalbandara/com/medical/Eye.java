package kusalbandara.com.medical;

public class Eye extends Organ{
    private String color;
    private boolean isOpen;

    public Eye(String name, String medicalConditional, String color, boolean isOpen) {
        super(name, medicalConditional);
        this.color = color;
        this.isOpen = isOpen;
    }

    public String getColor() {
        return color;
    }



    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: "+this.getColor());
    }
    public void open(){
        this.setOpen(true);
        System.out.println(this.getName()+" Opened");
    }
    public void close(){this.setOpen(false);
        System.out.println(this.getName()+" closed");}
}
