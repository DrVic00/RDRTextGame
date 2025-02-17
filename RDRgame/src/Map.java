import java.util.Scanner;

public class Map {

    String mapCh;
    Valentine valentine = new Valentine();
    GangCamp camp = new GangCamp();
    EmeraldRanch emerald = new EmeraldRanch();
    SaintDenis saint = new SaintDenis();
    Ctrawberry ctrawberry = new Ctrawberry();
    WapitiIndianReservation indian = new WapitiIndianReservation();

    public void showMapToChoose(Player player) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------Map------------------");
        System.out.println("Wapiti Indian Reservation");
        System.out.println("Saint Denis");
        System.out.println("Ctrawberry");
        System.out.println("Valentine");
        System.out.println("Emerald Ranch");
        System.out.println("Gang Camp");
        System.out.println("----------------------------------------");
        System.out.println("\nPierwsza litera miejsca gdzie chcesz sie udac:");
        mapCh = in.nextLine();
        mapCh = mapCh.toUpperCase();
        whereToGoMap(player);
    }

    public void whereToGoMap(Player player) {
        if (mapCh.equals("V")) {
            System.out.println("-----------\uD83D\uDC0E after a long way---------\n");
            valentine.valentineWTD(player);
        } else if (mapCh.equals("G")) {
            System.out.println("-----------\uD83D\uDC0E after a long way---------\n");
            camp.gangWTD(player, valentine, ctrawberry, indian);
        } else if (mapCh.equals("E")) {
            System.out.println("-----------\uD83D\uDC0E after a long way---------");
            emerald.emeraldWTD(player, saint);
        }else if(mapCh.equals("S")){
            System.out.println("-----------\uD83D\uDC0E after a long way---------");
            saint.saintWTD(player, camp, valentine, ctrawberry, indian);
        }else if(mapCh.equals("C")){
            System.out.println("-----------\uD83D\uDC0E after a long way---------");
            ctrawberry.ctrawberryWTD(player);
        } else if (mapCh.equals("W")) {
            System.out.println("-----------\uD83D\uDC0E after a long way---------");
            indian.indianFriends(player);
        }
    }
}
