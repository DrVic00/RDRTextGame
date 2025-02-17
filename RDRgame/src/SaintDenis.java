import java.util.Scanner;

public class SaintDenis {

    int saintFirstCh;
    int policeCh;
    int prisonLife;
    int policeMoney;
    int randomStreet;
    int streetMoney;
    int kinoMoney;
    int indianChoice;
    boolean doctorVisit = false;

    Scanner in = new Scanner(System.in);

    public void saintWTD(Player player, GangCamp camp, Valentine valentine, Ctrawberry ctrawberry, WapitiIndianReservation indian){
        System.out.println("\nJesteś w SaintDenis...\n" +
                "Najwiekszym miejscie wschodniej ameryki, prężnie się rozwijającym,\nniebo przyslanija Ci kominy fabryk i buchajacy z nich dym, Wysokie budynki wznosza sie do okola.\n" +
                "Szum wielkomiejskiego zycia rozbrzmiewa w twoich uszach przerywany dzwonkiem jezdzacych tramwaji, co chcesz zrobić:\n");
        System.out.println("(1)Odwiedzic stajnie");
        System.out.println("(2)Pojsc w jedna z ciemnych uliczek ");
        System.out.println("(3)Odwiedzic kino");
        System.out.println("(4)Odwiedzic lekarza\n");
        System.out.println("(5)Spojrzec ponownie na mape");
        saintFirstCh = in.nextInt();
        saintActions(player, camp, valentine, ctrawberry, indian);
    }

    public void saintActions(Player player, GangCamp camp, Valentine valentine, Ctrawberry ctrawberry, WapitiIndianReservation indian){
        if(saintFirstCh == 1){
            System.out.println("Wchodzisz do stajni z zamiarem obejrzenia koni, od wejscia uderza cie smrod konskiego lajna. Wchodzac glebiej zauwazasz miejskiego stroza prawa, ktory zaczyna Ci sie bacznie przygladac...");
            if(!player.white){
                System.out.println("Podchodzi do ciebie spluwajac Ci pod nogi i patrzac sie na Ciebie wyraziscie z ewidentna pogarda 'Spadaj do swojego lasu indianinie!'\nCo robisz strzel mu prosto w twarz(1) lub olej to(2)");
                indianChoice = in.nextInt();
                if(indianChoice == 1){
                    System.out.println("Wyjmujesz rewolwer i spluwajac na tego rasistowskiego stroza prawa wypalasz mu prostwo w przerazona twarz.\n Kiedy huk cichnie do stajni wbiega 10 strozow prawa, zobaczyc co sie stalo\n" +
                            "Myslisz krotko 'cholera, gdyby nie bylo to centrum miasta...'. Po czym momentalnie zostajesz rozstrzelany.\n");
                    System.out.println("*-Game Over - dales sie sprowokowac-*");
                    System.exit(0);

                } else if (indianChoice == 2) {
                    System.out.println("Patrzac mu sie prosto w oczy, dalej jasno do zrozumienia ze cie to nie rusza.");
                }
            }
            if(camp.banditNum >= 5){
                System.out.println("Odwraca po chwili wzrok, a ty kierujesz ku najblizszemu koniu, aby dokladniej go obejrzec. Patrzysz na jego lsniaca grzywe i swiezo wyczesane wlosie gdy nagle czujesz lufe przy skroni.\n" +
                        "To ten policjant, musial w tobie rozpoznac bandyte znanego juz z niejednego napadu i kradziezy. Chrypliwym glosem po papierosach rozpoczyna: 'Masz wybor albo pojdziesz ze mna albo zginiesz tu i teraz posrod konskiego gowna, wybieraj cwaniaczku!'\n" +
                        "Co robisz: Pojdz z nim(1) lub sprobuj go przekupic(2) lub walcz(3)");
                policeCh = in.nextInt();
                if(policeCh == 1){
                    System.out.println("Godzisz sie na jego warunki, chwile pozniej w stajni znajduje sie juz caly kordon policji. Zwiazuja Cie i wrzucaja na konia przy okazji zabierajac wszystko co masz. Londujesz w lokalnym wiezieniu...\n\n" +
                            "Po pierwszym tygodniu widzisz jak ten ktory cie dorwal dostal awans, i orientujesz sie ze okropnie tu karmia\n\nW trzecim tygodniu zaczynasz drastycznie hudnac i twoje policzki zaczynaja sie zapadac a skora oplatac zebra.\n\n" +
                            "Po poltora miesiaca zygasz juz tym miejscem, cela jest zimna mokra ale do tego juz sie przyzwyczailes podobnie jak do bicia przez straznikow\n\nMyslisz ze spedzisz tu wiecznosc az do konca swych dni...\n\n" +
                            "Pewnej nocy jednak w nocy slyszysz huk za nim kolejny potem alaram krzyki, swiatlo sie zapala, slyszysz jak na komisariacie rozpetuje sie strzelanina. W koncu ktos rzuca z pierwszego pietra klucze pod twoja cele.\n" +
                            "Otwierasz ja i uwalniasz jeszcze paru kumpli, ktorych zdarzyles poznac. biegnac do wyjscia zgarnia cie twoj gang. To oni Cie odbili, sciskajac cie zwracaja Ci twoje rzeczy i zaczynacie uciekac na koniach w strone swojego obozu\n\n" +
                            "----HP decreased by 30 - slabo cie tam karmili----\n----Policja nadal bedzie do ciebie uprzedzona----");
                    prisonLife = player.getHP() - 30;
                    if(prisonLife <= 0){
                        System.out.println("Mimo ucieczki twoj organizm nie dal juz rady po dlugiej odsiadce, przed twoimi oczami robi sie czarno osuwasz sie z konia.\n\n*-Game Over - Umarles z glodu i wycieczenia-*");
                        System.exit(0);
                    }else{
                        player.setHP(prisonLife);
                    }
                    camp.banditNum ++;
                    camp.gangWTD(player, valentine, ctrawberry, indian);
                } else if (policeCh == 2) {
                    System.out.println("-'A co by pan powiedzial na to zebysmy sie jakos dogadali?' mowisz z pewnoscia siebie w glosie powoli wyciagajac plik gotowki.");
                    if(player.money >= 50){
                        System.out.println("-'Dorzuc do tego jeszcze 20 dolarow i moze kto wie...' odpowiada policjant z nie ukrywana fascynacja w glosie.\n Wyciagasz dodatkowe pieniadze i wreczasz im je. Lufa pistoletu powoli opuszcza granice twojej czaszki,\n" +
                                "a stroz prawa oddala sie w swoja strone, a ty mozesz odetchnac\n----Money decreased by 50----\n----Masz czyste konto u policji----");
                        policeMoney = player.getMoney() - 50;
                        player.setMoney(policeMoney);
                        camp.banditNum = 0;
                        saintWTD(player, camp, valentine, ctrawberry, indian);
                    }else{
                        System.out.println("-'Nie mam az tyle' odpowiadasz ze slabnaca pewnoscia w glosie\n-'Chryste, i pewnie zaraz wszystkim powiesz ze chcialem wziasc lapowke' To osatnie slowa jakie slyszysz...\n" +
                                "*-Game Over - zostales zastrzelony-*");
                        System.exit(0);
                    }
                } else if (policeCh == 3) {
                    System.out.println("Siegasz po bro...\n\n*-Game Over - zostales zastrzelony, bylo nie igrac z ogniem-*");
                    System.exit(0);
                }
            }else{
                System.out.println("Odwraca po chwili wzrok, a ty kierujesz sie w storne koni, jednak po dluzszym namysle nie widzisz nic interesujacego i wychodzisz ze stajni.");
                saintWTD(player, camp, valentine, ctrawberry, indian);
            }
        } else if (saintFirstCh == 2) {
            randomStreet = (int)Math.round(10 * Math.random());
            if(randomStreet <=5){
                System.out.println("Zwykla ciemna i z lekka przerazajaca uliczka wielkiego miasta. Nie ma tu nic ciekawego, a przynajmniej na razie...");
                saintWTD(player, camp, valentine, ctrawberry, indian);
            }else{
                streetMoney = player.getMoney() - 5;
                if(streetMoney <=0){
                    System.out.println("Zwykla ciemna i z lekka przerazajaca uliczka wielkiego miasta. Nie ma tu nic ciekawego, a przynajmniej na razie...");
                    saintWTD(player, camp, valentine, ctrawberry, indian);
                }else {
                    System.out.println("Wchodzac w glab uliczki i jezdzac wzrokiem po bruku i ceglach nagle czujesz szarpniecie za torbe po czym widzisz jak niski mlody chlopaczek ucieka w ciemnosc miedzy zakretami. I tak go juz nie dogonisz, trudno. Myslisz nie przejety\n" +
                            "----Money decreased by 5----");
                    streetMoney = player.getMoney() - 5;
                    player.setMoney(streetMoney);
                    saintWTD(player, camp, valentine, ctrawberry, indian);
                }
            }
        } else if (saintFirstCh == 3) {
            if(player.money <= 0){
                System.out.println("Nie mozesz wejsc do kina, nie masz na nie pieniedzy");
                saintWTD(player, camp, valentine, ctrawberry, indian);
            }else {
                System.out.println("Wchodzisz do kina, rozsiadasz sie w fotelu, cieszac sie spektaklem. Czarno bialy film przemyka Ci przed oczami w ciagu 15min, lecz uwazasz ze bylo warto zaplacic 10 dolary za taka przyjemnosc.\n" +
                        "----Money decreased by 10----");
                kinoMoney = player.getMoney() - 10;
                player.setMoney(kinoMoney);
                saintWTD(player, camp, valentine, ctrawberry, indian);
            }
        } else if (saintFirstCh == 4) {
            System.out.println("Wchodzisz do lekarza, czujac charakterystyczny ostry zapach spirytusu. Stary lekarz z olbrzymim wasem spoglada na ciebie i twoj zamaszysty kaszel. Poprawia swoje okulary i sie krzywi.\n" +
                    "Klepie cie po plecach zdradzajac Ci ze masz gruzlice. Wyjasnia ze to nieuleczalna choroba i teraz trzeba juz tylko czekac na smierc. Diagnoza przytlacza Cie na tyle ze reszta jego slow staje sie mglista.\n" +
                    "Mowi cos o odpoczynku, urlopie, ale ty nie masz mozliwosci na cos takiego. Zalamany wychodzisz a twoj swiat wlasnie zostal zburzony, wszystko leglo w ciagu sekundy, gdybym tylko byl ostrozniejszy.\n" +
                    "Lecz teraz nie ma to znaczenia masz jedynie nadzieje ze, lekarz mylil sie z danym Ci czasem jedynie pol roku. Przecierasz oczy czujac na sobie zimny pot. Wychodzisz myslac o sobie, swoich uczynkach i zyciu.\n" +
                    "Masz jedynie nadzieje ze dzis nie bedzie twoim ostatnim dniem...");
            doctorVisit = true;
            saintWTD(player, camp, valentine, ctrawberry, indian);
        } else if (saintFirstCh == 5) {

        }
    }
}
