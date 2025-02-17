import java.util.Scanner;

public class EmeraldRanch {
    int emeraldFirstCh;
    int sellMoney;
    boolean lionEvent = false;
    int shouldContinue;
    Scanner in = new Scanner(System.in);
    Fight fight = new Fight();
    public void emeraldWTD(Player player, SaintDenis saint){
        System.out.println("\nJesteś na Ranczu Emerald...\n" +
                "Stabilnie trwajacym ranczu z historia, zasadami i niezbita renoma:\n");
        System.out.println("(1)Odwiedzic skup wozow");
        System.out.println("(2)Odwiedzic stacje kolejowa");
        System.out.println("(3)Odwiedzic farmerow przy stodole\n");
        System.out.println("(4)Spojrzec ponownie na mape");
        emeraldFirstCh = in.nextInt();
        emeraldActions(player, saint);
    }

    public void emeraldActions(Player player, SaintDenis saint){
        if(emeraldFirstCh == 1){
            if(player.carriagesNum >= 1){
                System.out.println("'Haha, witaj przyjacielu! Zawsze milo robic z toba interesy'\nMowiac to z usimechem na ustach czujesz uscisk jego szorstkiej dloni.\n" +
                        "W drugiej dloni czujesz natomist boski dotyk swiezej gotowki.\n\n----Zarobione pieniadzena sprzedazy wozu: 25$----");
                player.carriagesNum -= 1;
                sellMoney =  player.getMoney() + 25;
                player.setMoney(sellMoney);
                emeraldWTD(player, saint);
            }else{
                System.out.println("Podchodzac do drzwi stodoly pukasz piescia w drzwi zamaszyscie. Po chwili ledwo je uchylajac wychodzi farmer w srednim wieku.\n" +
                        "'Hej, zapukaj tu jak bedziesz mial chec sprzedac jakis woz, bez zbednych interesownych oczu...' po czym zatrzaskuje drzwi jeszcze predzej niz je otworzyl\n");
                emeraldWTD(player, saint);
            }
        } else if (emeraldFirstCh == 2) {
            if(saint.doctorVisit){
                System.out.println("Wchodzisz na stacje ociezalym krokiem, rozmyslajac ile to juz zlego zrobiles w zyciu i siadasz na lawce z palcami splecionymi u dloni spoczywajacych na twoich kolanach\n" +
                        "Relaksujesz sie mimo czarnych mysli dzieki cwierkaniu ptakow, odglosom rancza ktore spoczywa jakies 50m za twoimi plecami, gdzies slychac szum lasu, gdzies rwacy strumyk.\n" +
                        "Mimo tego wszystkiego nadal twoje mysli skupione sa na tym kiedy karma sie o ciebie upomni za twoje wszystkie grzechy.\nNagle przysiada sie do Ciebie zakonnica zwracajac sie do Ciebie:\n" +
                        "-'Wszystko w porzadku.'\n-'Tak tak, nigdy nie bylo lepiej...\n aaa... Co tu robisz siostro?'\n-'W koncu wysylaja mnie na misje do Meksyku, czekalam cale lata.'\n" +
                        "*Zaczynasz zamaszyscie kaszlec, coraz mocniej i krwawiej*\n-'Co Ci dolega?'\n-'Ghrr... hmm... Mam gruzlice siostro.'\n-'Wiem ze sie boisz, bardzo boisz ale nie ma czego, staraj sie po prostu zyc lepiej.'");
                emeraldWTD(player, saint);
            }else{
                System.out.println("Wchodzisz na stacje, nie pamietajac kiedy ostatni raz widziales tu zatrzymujacy sie pociag. Siadasz na lawce odprezajac sie po czym wracasz na ranczo.");
                emeraldWTD(player, saint);
            }
        } else if (emeraldFirstCh == 3) {
            if(lionEvent){
                System.out.println("Przechadzasz sie po ranchu Emerald, tu witasz farmera, tam lesniczego. Pochlania cie sielanka do czasu az przypominasz sobie ze nie tutaj znajduje sie twoj dom, ale zawsze milo spotkac milych ludzi jak tu.");
                emeraldWTD(player, saint);
            }else {
                System.out.println("Przechadzasz sie po ranczu od domostwa do zagrody kierujac sie w strone duzej czerwonej stodoly. Nagle slyszysz krzyki paru farmerow i pracownikow, przyspieszasz kroku podbiegajac wrecz do nich.\n" +
                        "Ze stodoly wybiegaja farmerzy i jeden cyrkowiec krzyczacy cos o jakims potworze. Zblizasz sie do drzwi stodoly na przekor wszystkim trzymajac juz rewolwer w dloni, za toba ustawia sie masa ludzi naklaniajacych Cie do wejscia do srodka i uratowaniu ich wszystkich.\n" +
                        "Niepewnie wchodzisz do srodka trzymajac palec na spuscie. Otaczaja cie klatki ze zwierzetami, ktore staly tez przed stodola jednak jedna dosc spora jest ewidentnie otwarta. 'Cos musialo im uciec' syczysz przez zeby.\n" +
                        "Slyszysz jak cos przewraca worki na drugim pietrze stodoly, chodzi i lamie trzeszczace deski, co jakis czas roznosi sie ciche warczenie. Gdy juz chwytasz drabine aby dostac sie na drugi poziom slyszysz gwaltowny trzask\n" +
                        "i wiory desek razem z pylem unosza sie gdzies przy scianie, myslisz sobie 'to cos musialo wyskoczyc'. Pedzisz do drzwi, a kiedy je otwierasz widzisz ze jeden czlowiek lezy caly w krwi na ziemi, ze sladami po olbrzymich szponach\n" +
                        "z tak poturbowanym brzuchem ze ledwo wyglada jak ludzki. Dookola stoja ludzie chwytajacy sie do pomocy rannemu i w przerazeniu patrzacy na ciebie jak na wyrocznie. Sciskasz rewolwer w dloni napinajac kurek jestes pewien ze musisz zabic to monstrum.\n" +
                        "Jednak nie masz pojecia co na Ciebie czyha, idac po krwawym sladzie rozbryzgnietym na blocie, i ziemi z uklepana trawa. Dochodzisz do zagrody widzac jak jeda krowa lezy martwa z ogoloconym brzuchem a jej zebra wystaja spod skory niczym chcac sie przyjzec sytuacji\n" +
                        "Kroczysz dalej krwawym sladem, gdzie nie gdzie widzac resztki krowy. Dochodzisz do kolejnej zagrody tym razem tak zabudowanej ze widzisz jedynie cien besti kryjacej sie za rogiem. Wreszczie wylania sie...\n" +
                        "Czegos takiego nigdy nie widziales, przypomina pume lecz w zlotej jasnej siersci z grzywa i mrozacym krew w zylach rykiem. Nogi tego wielgasnego kota sie napinaja i zaczyna na ciebie biec z wsciekloscia w oczach.\n" +
                        "Natychmiastowo i od ruchowo kierujesz lufe rewolweru w jego strone. Dalej(1)");
                shouldContinue = in.nextInt();
                if(shouldContinue == 1){
                    fight.FightLion();
                }
                System.out.println("Pokonales lwa, cale ranczo zbiera sie, aby razem z toba to swietowac. Dziekuja Ci i przynosza barylke piwa. Pijecie i swietujecie az do zmierzchu w koncu rozstajac sie z usmiechem na ustach.");
                lionEvent = true;
                emeraldWTD(player, saint);
            }
        } else if (emeraldFirstCh == 4){

        }
    }
}
