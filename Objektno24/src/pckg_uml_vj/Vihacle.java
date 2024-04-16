package pckg_uml_vj;

import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Vihacle {

    protected String model;
    protected String brand;
    protected Date dateProduced;

    private int id;
    private static int cnt = 200;
    private static String datePattern;

    public Vihacle(){
        this.id = cnt++;
    }

    public Vihacle(String brand){
        this.brand = brand;
        this.id = cnt++;
    }

    public Vihacle(String brand, String model){
        this.brand = brand;
        this.id = cnt++;
        this.model = model;
    }

    private void setDate(String date){
//        SimpleFormatter simpleFormatter = new SimpleFormatter(datePattern);
        this.dateProduced = dateProduced;
    }

    @Override
    public String toString() {
        return "Vihacle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", dateProduced=" + dateProduced +
                ", id=" + id +
                '}';
    }


    public void info(){
        System.out.println(this);
    }
    public void start(){
        System.out.println(getClass().getSimpleName() + " starting engine...");
    }

    public void stop(){
        System.out.println(getClass().getSimpleName() + " engine stoped...");
    }
}
