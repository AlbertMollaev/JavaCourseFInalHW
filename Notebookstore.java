import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Notebookstore {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин по продаже ноутбуков! По какому критерию ноутбук Вам найти? ");
        while (true) {
        System.out.println("1 - ОЗУ \n2 - Жесткий диск \n3 - Операционная система \n4 - Цвет устройства \n5 - Завершить работу");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 4: ");
        int choseNum = scan.nextInt();
        switch (choseNum) {
            case 1:
                System.out.println("Минимальный объем ОЗУ(оперативная память) в Gb: ");
                int ramFind = scan.nextInt();
                filterRam(ramFind);
                break;
            case 2:
                System.out.println("Минимальный объем жесткого диска  в Tb: ");
                int hddFind = scan.nextInt();
                filterHdd(hddFind);
                break;
            case 3:
                System.out.println("Операционная система(Windows, DOS, macOS): ");
                String osFind = scan.next();
                filterOs(osFind);
                break;
            case 4:
                System.out.println("Цвет устройства: ");
                String colorFind = scan.next();
                filterColor(colorFind);
                break;
            case 5:
                break;    
            default:
                break;
        }
        if (choseNum == 5) {
            break;
        }
    }
}

    public static int filterHdd(int hddFind) {
        Notebook Notebook1 = new Notebook("Dell", 8, 1, "Windows", "Black");
        Notebook Notebook2 = new Notebook("HP", 16, 2, "Windows", "Black");
        Notebook Notebook3 = new Notebook("Acer", 16, 3, "DOS", "Black");
        Notebook Notebook4 = new Notebook("Lenovo", 16, 2, "Windows", "White");
        Notebook Notebook5 = new Notebook("Apple", 8, 3, "macOS", "Grey");
        Notebook Notebook6 = new Notebook("MSI", 16, 3, "DOS", "Красный");
        Notebook Notebook7 = new Notebook("Acer", 32, 2, "Windows", "White");
        Notebook Notebook8 = new Notebook("Dell", 4, 1, "Windows", "Black");
        Notebook Notebook9 = new Notebook("HP", 4, 2, "DOS", "Black");
        Notebook Notebook10 = new Notebook("Apple", 8, 3, "macOS", "Black");
        Notebook Notebook11 = new Notebook("Acer", 16, 2, "DOS", "Black");
        Notebook Notebook12 = new Notebook("Realme", 16, 1, "Windows", "Black");
        Set<Notebook> hashSet = new HashSet<>();
        hashSet.add(Notebook1);
        hashSet.add(Notebook2);
        hashSet.add(Notebook3);
        hashSet.add(Notebook4);
        hashSet.add(Notebook5);
        hashSet.add(Notebook6);
        hashSet.add(Notebook7);
        hashSet.add(Notebook8);
        hashSet.add(Notebook9);
        hashSet.add(Notebook10);
        hashSet.add(Notebook11);
        hashSet.add(Notebook12);
        for (Notebook filter : hashSet) {
            if (filter.getHdd() >= hddFind) {
                System.out.println();
                System.out.println(filter);
                System.out.println();
            }
        }
        return hddFind;
    }

    public static int filterRam(int ramFind) {
        Notebook Notebook1 = new Notebook("Dell", 8, 1, "Windows", "Black");
        Notebook Notebook2 = new Notebook("HP", 16, 2, "Windows", "Black");
        Notebook Notebook3 = new Notebook("Acer", 16, 3, "DOS", "Black");
        Notebook Notebook4 = new Notebook("Lenovo", 16, 2, "Windows", "White");
        Notebook Notebook5 = new Notebook("Apple", 8, 3, "macOS", "Grey");
        Notebook Notebook6 = new Notebook("MSI", 16, 3, "DOS", "Красный");
        Notebook Notebook7 = new Notebook("Acer", 32, 2, "Windows", "White");
        Notebook Notebook8 = new Notebook("Dell", 4, 1, "Windows", "Black");
        Notebook Notebook9 = new Notebook("HP", 4, 2, "DOS", "Black");
        Notebook Notebook10 = new Notebook("Apple", 8, 3, "macOS", "Black");
        Notebook Notebook11 = new Notebook("Acer", 16, 2, "DOS", "Black");
        Notebook Notebook12 = new Notebook("Realme", 16, 1, "Windows", "Black");
        Set<Notebook> hashSet = new HashSet<>();
        hashSet.add(Notebook1);
        hashSet.add(Notebook2);
        hashSet.add(Notebook3);
        hashSet.add(Notebook4);
        hashSet.add(Notebook5);
        hashSet.add(Notebook6);
        hashSet.add(Notebook7);
        hashSet.add(Notebook8);
        hashSet.add(Notebook9);
        hashSet.add(Notebook10);
        hashSet.add(Notebook11);
        hashSet.add(Notebook12);
        for (Notebook filter : hashSet) {
            if (filter.getRam() >= ramFind) {
                System.out.println();
                System.out.println(filter);
                System.out.println();
            }
        }
        return ramFind;
    }

    public static String filterOs(String osFind) {
        Notebook Notebook1 = new Notebook("Dell", 8, 1, "Windows", "Black");
        Notebook Notebook2 = new Notebook("HP", 16, 2, "Windows", "Black");
        Notebook Notebook3 = new Notebook("Acer", 16, 3, "DOS", "Black");
        Notebook Notebook4 = new Notebook("Lenovo", 16, 2, "Windows", "White");
        Notebook Notebook5 = new Notebook("Apple", 8, 3, "macOS", "Grey");
        Notebook Notebook6 = new Notebook("MSI", 16, 3, "DOS", "Красный");
        Notebook Notebook7 = new Notebook("Acer", 32, 2, "Windows", "White");
        Notebook Notebook8 = new Notebook("Dell", 4, 1, "Windows", "Black");
        Notebook Notebook9 = new Notebook("HP", 4, 2, "DOS", "Black");
        Notebook Notebook10 = new Notebook("Apple", 8, 3, "macOS", "Black");
        Notebook Notebook11 = new Notebook("Acer", 16, 2, "DOS", "Black");
        Notebook Notebook12 = new Notebook("Realme", 16, 1, "Windows", "Black");
        Set<Notebook> hashSet = new HashSet<>();
        hashSet.add(Notebook1);
        hashSet.add(Notebook2);
        hashSet.add(Notebook3);
        hashSet.add(Notebook4);
        hashSet.add(Notebook5);
        hashSet.add(Notebook6);
        hashSet.add(Notebook7);
        hashSet.add(Notebook8);
        hashSet.add(Notebook9);
        hashSet.add(Notebook10);
        hashSet.add(Notebook11);
        hashSet.add(Notebook12);
        for (Notebook filter : hashSet) {
            if (Objects.equals(filter.getOS(), osFind)) {
                System.out.println();
                System.out.println(filter);
                System.out.println();
            }
        }
        return osFind;
    }

    public static String filterColor(String colorFind) {
        Notebook Notebook1 = new Notebook("Dell", 8, 1, "Windows", "Black");
        Notebook Notebook2 = new Notebook("HP", 16, 2, "Windows", "Black");
        Notebook Notebook3 = new Notebook("Acer", 16, 3, "DOS", "Black");
        Notebook Notebook4 = new Notebook("Lenovo", 16, 2, "Windows", "White");
        Notebook Notebook5 = new Notebook("Apple", 8, 3, "macOS", "Grey");
        Notebook Notebook6 = new Notebook("MSI", 16, 3, "DOS", "Красный");
        Notebook Notebook7 = new Notebook("Acer", 32, 2, "Windows", "White");
        Notebook Notebook8 = new Notebook("Dell", 4, 1, "Windows", "Black");
        Notebook Notebook9 = new Notebook("HP", 4, 2, "DOS", "Black");
        Notebook Notebook10 = new Notebook("Apple", 8, 3, "macOS", "Black");
        Notebook Notebook11 = new Notebook("Acer", 16, 2, "DOS", "Black");
        Notebook Notebook12 = new Notebook("Realme", 16, 1, "Windows", "Black");
        Set<Notebook> hashSet = new HashSet<>();
        hashSet.add(Notebook1);
        hashSet.add(Notebook2);
        hashSet.add(Notebook3);
        hashSet.add(Notebook4);
        hashSet.add(Notebook5);
        hashSet.add(Notebook6);
        hashSet.add(Notebook7);
        hashSet.add(Notebook8);
        hashSet.add(Notebook9);
        hashSet.add(Notebook10);
        hashSet.add(Notebook11);
        hashSet.add(Notebook12);
        for (Notebook filter : hashSet) {
            if (Objects.equals(filter.getColor(), colorFind)) {
                System.out.println();
                System.out.println(filter);
                System.out.println();
            }
        }
        return colorFind;
    }      
}