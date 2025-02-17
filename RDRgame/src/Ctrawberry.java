import java.util.Scanner;

public class Ctrawberry {
    boolean carriagesIdeaC = false;
    int strawberryFirstCh;
    int smell;
    boolean smellBought = false;

    Scanner in = new Scanner(System.in);
    Hunt hunt = new Hunt();
    public void ctrawberryWTD(Player player){
        System.out.println("\nJesteś w Ctrawberry...\n" +
                "Malym, cichym, przytulnym miasteczku posrod dzikich gor i lasow idealnym na miejsce wypadowe dla lesniczych i mysliwych\nco chcesz zrobić:\n");
        System.out.println("(1)Pojdz na polowanie");
        System.out.println("(2)Odwiedzic woznice\n");
        System.out.println("(3)Spojrzec ponownie na mape");
        strawberryFirstCh = in.nextInt();
        ctrawberryActions(player);
    }

    public void ctrawberryActions(Player player){
        if (strawberryFirstCh == 1){
            System.out.println("Przygotowujac sie do wyprawy, zagaduje cie handlarz czy nie chcesz kupic zapachu maskujacego, dzieki ktoremu bedziesz mogl blizej podejsc do zwierzyny bez wykrycia.\nCo robisz: Kup zapach maskujacy(1) lub odmow(2)");
            smell = in.nextInt();
            if(smell == 1){
                if(player.money >= 2){
                    System.out.println("Kupujesz zapach maskujacy.");
                    System.out.println("----Money decreased by 2----");
                    player.money -= 2;
                    smellBought = true;
                }else{
                    System.out.println("Nie masz pieniedzy na zapach maskujacy");
                }
            }else{
                System.out.println("Odmawiasz kupna.");
            }
            System.out.println("Zabierasz niezbedny sprzet i udajesz sie na polowanie. Zmierzajac w gesta glusze lasu...");
            hunt.hunting(player, smellBought);
            smellBought = false;
            ctrawberryWTD(player);
        } else if (strawberryFirstCh == 2) {
            System.out.println("Przechodzac nieopodal starego woznycy zauwazasz pare wozow kazdy z dwoma konmi, zapalajac zamaszyscie papierosa i upajajac sie wonia wydobywajaca sie powoli z twoich pluc przychodzi Ci do glowy nie najgorszy pomysl...\n" +
                    "Mozliwe ze gdybys przygotowal sie do kradziezy i zakradl sie tu noca to moglbys niezauwazenie ukrasc jeden z wozow");
            carriagesIdeaC = true;
            ctrawberryWTD(player);
        } else if (strawberryFirstCh == 3) {

        }
    }
}
