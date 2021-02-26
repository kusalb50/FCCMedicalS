package kusalbandara.com.medical;

public class Heart extends Organ{
    private int rate;

    public int getRate() {
        return rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate: "+this.getRate());
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Heart(String name, String medicalConditional, int rate) {
        super(name, medicalConditional);
        this.rate = rate;

    }
}
