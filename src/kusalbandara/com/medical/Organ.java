package kusalbandara.com.medical;

public class Organ {
    private String name;
    private String medicalConditional;

    public Organ(String name, String medicalConditional) {
        this.name = name;
        this.medicalConditional = medicalConditional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalConditional() {
        return medicalConditional;
    }

    public void setMedicalConditional(String medicalConditional) {
        this.medicalConditional = medicalConditional;
    }
    public void getDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Medical Condition: "+this.getMedicalConditional());
    }
}
