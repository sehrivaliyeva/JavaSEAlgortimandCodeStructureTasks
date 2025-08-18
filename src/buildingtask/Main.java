package buildingtask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BuildingHome buildingHome = new BuildingHome();
        buildingHome.setId(1);
        buildingHome.setPrice(50.000);
        buildingHome.setType("Modern");
        buildingHome.setRoomCount(5);
        buildingHome.setFloor(3);
        buildingHome.setHasElevator(true);

        Villa villa = new Villa();
        villa.setId(2);
        villa.setPrice(600.000);
        villa.setType("Avangard");
        villa.setRoomCount(7);
        villa.setGarageCapacity(100);
        villa.setHasPool(false);

        YardHome yardHome = new YardHome();
        yardHome.setId(3);
        yardHome.setPrice(70.000);
        yardHome.setType("Luxury");
        yardHome.setRoomCount(2);
        yardHome.setYardArea(80);

        Base[] base = {villa, yardHome, buildingHome};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipi daxil edin : ");
        String tip = scanner.nextLine();
        System.out.println("Min qiymet daxil edin : ");
        double minQiymet = scanner.nextDouble();
        System.out.println("Max qiymet daxil edin : ");
        double maxQiymet = scanner.nextDouble();

        boolean found = false;
        for (Base b : base) {
            if (b.getType().equalsIgnoreCase(tip)
            && b.getPrice() >= minQiymet
            && b.getPrice() <= maxQiymet) {
                found = true;
                System.out.println("Ev tapildi");
                System.out.println(b);
            }
        }
        if (!found) {
            System.out.println("Ev tapilmadi ");
        }

    }
}
