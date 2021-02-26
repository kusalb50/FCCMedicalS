package kusalbandara.com.medical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient("Tom",28,new Eye("Left Eye","Short sighted","blue",true),new Eye("Right Eye","Normal","blue",true),new Heart("Heart","Normal",70),new Skin("Skin","Burned","Black",40),new Stomach("Stomach","PUD",false));
        System.out.println("Name: "+patient.getName());
        System.out.println("Age: "+patient.getAge());
        Scanner scanner=new Scanner(System.in);
        boolean shouldFinish=false;
        while (!shouldFinish){
            System.out.println("Choose an Organ: "+"\n\t1. Left Eye"+"\n\t2. Right Eye"+"\n\t3. Heart"+"\n\t4. Skin"+"\n\t5.Stomach"+"\n\t6.Exit");
            int choice= scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpen()){
                        System.out.println("\t\t1. Exit from LEye");
                        if (scanner.nextInt()==1){patient.getLeftEye().close();}else {continue;}
                    }else {
                        System.out.println("\t\t1. Open file LEye");
                        if (scanner.nextInt()==1){patient.getLeftEye().open();}else {continue;}
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpen()){
                        System.out.println("\t\t1. Exit from REye");
                        if (scanner.nextInt()==1){patient.getRightEye().close();}else {continue;}
                    }else {
                        System.out.println("\t\t1. Open file REye");
                        if (scanner.nextInt()==1){patient.getRightEye().open();}else {continue;}
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (scanner.nextInt()==1){int newHearRate= scanner.nextInt();
                    patient.getHeart().setRate(newHearRate);
                        System.out.println("Heart rate change to "+patient.getHeart().getRate());}
                    else {continue;}
                    break;
                case 4:
                    patient.getSkin().getDetails();

                    break;
                case 5:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt()==1){
                        patient.getStomach().digest();
                    }else {continue;}
                    break;
                default:
                    shouldFinish=true;
            }

        }
    }
}
