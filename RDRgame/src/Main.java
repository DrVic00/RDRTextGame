import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ############################ BEGIN OF STORY ################################
        System.out.println("                                                                                                           \n" +
                " ____  _____ ____    ____  _____    _    ____       _    ______     _______ _   _ _____ _   _ ____  _____  \n" +
                "|  _ \\| ____|  _ \\  |  _ \\| ____|  / \\  |  _ \\     / \\  |  _ \\ \\   / | ____| \\ | |_   _| | | |  _ \\| ____| \n" +
                "| |_) |  _| | | | | | | | |  _|   / _ \\ | | | |   / _ \\ | | | \\ \\ / /|  _| |  \\| | | | | | | | |_) |  _|   \n" +
                "|  _ <| |___| |_| | | |_| | |___ / ___ \\| |_| |  / ___ \\| |_| |\\ V / | |___| |\\  | | | | |_| |  _ <| |___  \n" +
                "|_| \\_|_____|____/  |____/|_____/_/   \\_|____/  /_/   \\_|____/  \\_/  |_____|_| \\_| |_|  \\___/|_| \\_|_____| \n" +
                "                                                                                                           ");

        HeroChoose heroCh = new HeroChoose();
        Map mapCh = new Map();
        heroCh.showInfoToChoose();

        Player player = null;
        PlayerNoChance playerNoChance = null;
        Firearm rewolwer1 = null;

        ArthurMorgan arthur = new ArthurMorgan();
        CharlesSmith charles = new CharlesSmith();
        JohnMarston john = new JohnMarston();
        SadieAdler sadie = new SadieAdler();

        if (heroCh.pickedCh.equals("A")) {
            player = new Player("Arthur", 140, 4, true, true, 0, 0, 100, 60, 0);
            rewolwer1 = new Firearm("Colt", 20, 3);
            player.showInfo();
            arthur.quote();
            rewolwer1.setFirearmDamage(player);
            arthur.arthurFirstSteps(player);
            while (true) mapCh.showMapToChoose(player);

        } else if (heroCh.pickedCh.equals("C")) {
            player = new Player("Charles", 120, 6, true, false, 0, 0, 60, 100, 0);
            player.showInfo();
            charles.quote();
            charles.charlesFirstSteps(player);
            while (true) mapCh.showMapToChoose(player);

        } else if (heroCh.pickedCh.equals("J")) {
            player = new Player("John", 160, 3, false, true, 0, 0, 40, 50, 0);
            rewolwer1 = new Firearm("Colt", 20, 3);
            rewolwer1.setFirearmDamage(player);
            player.showInfo();
            john.quote();
            john.johnFirstSteps(player);
            while (true) mapCh.showMapToChoose(player);

        } else if (heroCh.pickedCh.equals("M")) {
            playerNoChance = new PlayerNoChance("Micah", 130, 4, false, true, true, 0, 0, 0);
            playerNoChance.showInfo();
            if (playerNoChance.noChance) {
                System.out.println("Przykro mi twoja postac byla strasznym gosciem, wszyscy sie wkurzyli i cie rozstrzelali, taki dziki zachod.");
                System.exit(0);
            }
        } else if (heroCh.pickedCh.equals("S")) {
            player = new Player("Sadie", 150, 2, false, true, 0, 0, 100, 40, 0);
            rewolwer1 = new Firearm("Colt", 20, 3);
            rewolwer1.setFirearmDamage(player);
            player.showInfo();
            sadie.quote();
            sadie.sadieFirstSteps(player);
            while (true) mapCh.showMapToChoose(player);

        } else if (heroCh.pickedCh.equals("U")) {
            playerNoChance = new PlayerNoChance("Uncle", 60, 1, false, true, true, 0, 0, 0);
            playerNoChance.showInfo();
            Scanner in = new Scanner(System.in);
            if (playerNoChance.noChance) {
                System.out.println("Budzisz sie pod drzewem, ptaki cwierkaja, Uncle częściej kończy w przydrożnym rowie niż na grzbiecie konia.\n" +
                        "Przecierasz oczy, i lekko pbracając glowę w lewo, wycierając resztki flegmy na ustach patrzysz na nie dopitą butelke starej Brandy leżącej niopodal\n" +
                        "Powoli wstajesz wołajac, 'Choleraa, Lumbeegoo!' Rozgladasz się stękając i decydujesz się ruszyć w kolejny dzień.\n" +
                        "Przed tobą stoi dom Johna nie dziwne biorac pod uwage ze zasnales pod jego drzewem na jego farmie\n" +
                        "Masz, więc wybór iść do kuchni(1) lub do stodoły(2)");
                int wyborUncle = in.nextInt();
                while (wyborUncle != 1 && wyborUncle != 2) {
                    System.out.println("Nie wybrałes zadnej z podanych opcji sprobuj jeszcze raz: ");
                    wyborUncle = in.nextInt();
                }
                if (wyborUncle == 1) {
                    System.out.println("Wchodzisz do przestronnej kuchni w której rozbrzmiewa dźwięk świstu wiatru przez szczeliny okien.\n" +
                            "Na stoliku stoi butelka mocnego alkoholu, a zapach rozlanej beztroski wypełnia pomieszczenie. Twoje dłonie instynktownie sięgają po butelkę, a pierwszy łyk otwiera zasłonę zapomnienia.\n" +
                            "Bezgraniczna ochota na ucieczkę przed rzeczywistością prowadzi do kolejnych łyków, a świat zaczyna płynąć jak rzeka w zapomnienie.\n" +
                            "Gdy opada zasłona ciemności, wiesz, że znowu przegrałeś walkę z własnymi demonami. Krzyczysz mimoduchem Lumbagoo i zapadasz w sen\n\n\n" +
                            "*Game Over --Upiles się i przespales przygode--*");
                    System.exit(0);
                } else {
                    System.out.println("Wchodzisz do stodoły, sam już nie pamiętasz po co i dlaczego, ale wzrokiem szukasz czegoś ciekawego.\n" +
                            "Stawiasz ktok i... BAMC!!! Uncle wszedl na grabie ktore z impetem uderzaja go w glowe. Cieżko upadając na ziemie\n" +
                            "i tracąc przytomność krzyczy przyciszonym glosem Lumbago! i zasypia na dobre\n\n\n" +
                            "*Game Over --Straciles przytomnosc i przespales przygode--*");
                    System.exit(0);
                }

            }
        } else {
            System.out.println("Nie wybrales bohatera do zobaczenia innym razem!");
            System.exit(0);
        }

    }
}