import java.util.Objects;

public class Notebook {
    private String name;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public  Notebook(String name, int ram, int hdd, String os, String color){
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOS() {
        return os;
    }

    public String getColor() {
        return color;
    }
    
    public void addColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        String out = "Наименование -> " + name + "\n"
                    + "Обьем ОЗУ -> " + ram + "\n"
                    + "Обьем ЖД -> " + hdd + "\n"
                    + "Операционная система -> " + os + "\n"
                    + "Цвет -> " + color;
        return out;
    }  
    
    @Override
    public boolean equals(Object obj){
        Notebook cat = (Notebook) obj;
        boolean result = ram == cat.ram 
        && color.equals(cat.color) 
        && os.equals(cat.os) 
        && hdd == cat.hdd;
        return result;
    }
    
    @Override
    public int hashCode(){
       return Objects.hash(name, ram, color, os, hdd);
    }
}