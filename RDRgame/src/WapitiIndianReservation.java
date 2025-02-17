import java.util.Scanner;

public class WapitiIndianReservation {

    int indianFirstCh;
    int indianLife;
    boolean indianDocuments = true;
    boolean indianGun = false;
    Firearm rewolwer3 = new Firearm("Colt Navy 1851", 65, 100);


    Fight fight = new Fight();
    Scanner in = new Scanner(System.in);

    public void indianFriends(Player player){
        if(player.indiansLove){
            System.out.println("\nWjezdzasz do Wapiti Indian Reservation Twoi indianscy kumple ciesza sie na twoj widok.");
            indianWTD(player);
        }else{
            System.out.println("\nProbujesz wjechac do Wapiti Indian Reservation, jednak nie jestes tu mile widziany. Indianie wypraszaja cie ze swojej ziemi.");
        }
    }
    public void indianWTD(Player player){
        System.out.println("\nJesteś w Wapiti Indian Reservation...\n" +
                "Przed Twoimi oczyma maluje sie masa pieknych namiotow rdzennych mieszkancow, a w powietrzu unosi sie klimat ich niesamowitej kultury i spokoju\nco chcesz zrobić:\n");
        System.out.println("(1)Odwiedzic szamana");
        System.out.println("(2)Odwiedzic przywodce\n");
        System.out.println("(3)Spojrzec ponownie na mape");
        indianFirstCh = in.nextInt();
        indianActions(player);
    }

    public void indianActions(Player player){
        if(indianFirstCh == 1){
            if(player.hp > 110){
                System.out.println("Nie masz po co odwiedzac szamana, twoje zycie jest wysokie\n");
                indianWTD(player);
            }else{
                System.out.println("Wchodzisz do namiotu i twoj nos puchnie od ilosci aromatow ziol rozpuszczonych w powietrzu. Po sprobowaniu jednego z naparow starranie przygotowanego przez Indianina czujesz sie znacznie lepiej.");
                System.out.println("----Przywrocono 30hp----");
                indianLife = player.getHP() + 30;
                player.setHP(indianLife);
                indianWTD(player);
            }
        } else if (indianFirstCh == 2) {
            if(indianDocuments){
                System.out.println("Wchodzisz do namiotu przywodcy plemienia, juz kiedys przezyliscie wiele przygod chroniacych indian, ma on dla Ciebie jednak ostatnie zadanie. Rozmawiacie az do zmierzchu przy ognisku i cieplej herbacie z wielu ziol\n" +
                        "Zadanie polega na zniszczeniu dokumentow amerykanskich wazniakow, ktorzy chca wymuszeniami i wymyslonym prawem wlasnosci odbic tereny rdzennych indian. Przywodca daje Ci do tego zadania rewolwer jednego z poleglych braci.\n");
                rewolwer3.setFirearmDamage(player);
                indianGun = true;
                System.out.println("Przygladasz sie broni, to stary, lecz dobry " + rewolwer3.name + ".\n");
                System.out.println("----Firearm damage increased, now its: " + player.firearmDamage + "----\n");
                System.out.println("Dojezdzasz do kopalni ropy naftowej gdzies na obrzezach pustkowia. Wpatrujac sie w nocne niebo ladujesz swoj rewolwer i ruszasz przed siebie skradajac sie. Dochodzisz do plotu przez ktory sprawnie przeskakujesz.\n" +
                        "Na terenie osrodka glosno pracuja maszyny wydobywcze, lecz kierujac sie instynktem wchodzisz do glownego budynku. Caly czas nie zauwazony przedostajesz sie na drugie pietro gdzie znajduja sie drzwi z widniejacym napisem 'gubernator'\n" +
                        "Wchodzisz do pomieszczenia, odpalasz lampe naftowa rozswietlajac pomieszczenie, po czym zaczynasz lustrowac skromny gabinet. Glownym obiektem zainteresowan staje sie biurko w ktorym szybko znajdujesz dokumenty.\n" +
                        "Zgniatasz je i spalasz o plomien z lampy, a wychodzac gasisz lampe naftowa\n" +
                        "i schodzisz schodami w dol kryyjac sie przed ochrona i pracownikami za paroma olbrzymimi wagonami z transportem. Udaje Ci sie uciec przez ten sam plot. Kierujesz sie za nieopodal polozone skaly gdzie przywiazales konia.\n" +
                        "Bedac juz blisko celu slyszysz szelest w krzakach, orientujac sie ze ktos moze na ciebie czekac. Wyjmujesz rewolwer napinajac kurek, nagle zza glazow i krzaka wychyla sie dwoch funkcjonariuszy celujacy do ciebie z broni.\n" +
                        "Bez zastanowienia podejmujesz walke.");
                player.setHP(fight.Fight1(2, player.getHP(), player.firearmDamage));
                System.out.println("Naciskasz spust trafiajac ostatniego ostalego przy zyciu prosto w glowe. Jego cialo bezwladnie pada na ziemie w momencie wsiadania na konia. Mkniesz przed siebie wracajac do Wapiti Indian Reservation.\n" +
                        "Wiedzac ze moze nie wygrales calej wojny ale na pewno bitwe. Bo chciwosc ludzi nowego kontynentu nie zna granic.\n");
                indianDocuments = false;
                indianWTD(player);
            }else{
                System.out.println("Wchodzisz do namiotu wodza indian nie ma dla ciebie zadnych zadan, lecz milo spedzacie czas przy kawie i na rozmowach.");
                indianWTD(player);
            }
        } else if (indianFirstCh == 3) {

        }
    }
}
