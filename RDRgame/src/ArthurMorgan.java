import java.util.Scanner;

public class ArthurMorgan {

    Scanner in = new Scanner(System.in);

    public void quote(){
        System.out.println("\"\uD835\uDE20\uD835\uDE30\uD835\uDE36 \uD835\uDE2C\uD835\uDE2F\uD835\uDE30\uD835\uDE38, \uD835\uDE22\uD835\uDE2D\uD835\uDE2D \uD835\uDE35\uD835\uDE29\uD835\uDE22\uD835\uDE35 \uD835\uDE26\uD835\uDE37\uD835\uDE26\uD835\uDE33 \uD835\uDE2E\uD835\uDE22\uD835\uDE35\uD835\uDE35\uD835\uDE26\uD835\uDE33\uD835\uDE26\uD835\uDE25 \uD835\uDE35\uD835\uDE30 \uD835\uDE2E\uD835\uDE26 \uD835\uDE38\uD835\uDE22\uD835\uDE34 \uD835\uDE2D\uD835\uDE30\uD835\uDE3A\uD835\uDE22\uD835\uDE2D\uD835\uDE35\uD835\uDE3A. \uD835\uDE10\uD835\uDE35 \uD835\uDE38\uD835\uDE22\uD835\uDE34 \uD835\uDE22\uD835\uDE2D\uD835\uDE2D \uD835\uDE10 \uD835\uDE2C\uD835\uDE2F\uD835\uDE26\uD835\uDE38. \uD835\uDE10\uD835\uDE35 \uD835\uDE38\uD835\uDE22\uD835\uDE34 \uD835\uDE22\uD835\uDE2D\uD835\uDE2D \uD835\uDE10 \uD835\uDE26\uD835\uDE37\uD835\uDE26\uD835\uDE33 \uD835\uDE23\uD835\uDE26\uD835\uDE2D\uD835\uDE2A\uD835\uDE26\uD835\uDE37\uD835\uDE26\uD835\uDE25 \uD835\uDE2A\uD835\uDE2F...\"");
    }

    public void arthurFirstSteps(Player player){
        System.out.println("\n\nOdczuwasz gwałtowny szarpnięcie i natychmiastowa świadomość przychodzi do Ciebie, gdy otwierasz oczy.\n" +
                "Arthur znajduje się na twardym podlozu, które wydaje się być ziemią, a jego dłonie i nogi są sztywno związane.\n" +
                "Czuje zimny powiew powietrza na twarzy i słyszy odgłosy otoczenia – szelest liści, świergot ptaków, a w oddali przeciągający się wyciekający warkot koni.\n" +
                "Jego oczy szybko przystosowują się do półmroku, a gdy rozejrzy się, zauważa palący się ogień odbijający się od skupiska namiotów.\n" +
                "Widać sylwetki uzbrojonych ludzi, poruszających się wokół ogniska. Atmosfera jest napięta, Arthur wyczuwa przemożny dreszcz niepewności,\n" +
                "kiedy rozumie, że znajduje się w środku obozu wrogiego gangu O'Driscollów. Nie ma duzo czasu, czujesz jak tetno Ci rosnie i wiesz że muszi sie spieszyc,\n" +
                "zanim ktos zauwazy ze oddzyskales przytomnosc. Rozgladasz sie i zauwazasz ostry glaz nieopodal: przeczolgaj sie do niego(1) lub grzecznie czekaj(2)");
        int aw1 = in.nextInt();
        if (aw1==1){
            System.out.println("Arthur czolga sie niezgrabnie do glazu i zaczyna powoli ocierac line o najostrzejsze kawalki kamienia\n" +
                    "Każdy ruch jest wyczuwalny, a adrenalina płynąca przez jego żyły sprawia, że staje się bardziej wytrwały i skupiony. Jego palce zaciskają się wokół lin, próbując znaleźć drogę do uwolnienia.\n" +
                    "Nagle zauważa spojrzenie jednego z O'Driscollów, który zaczął się zbliżać w jego kierunku. Jednak nie przestaje probowac i udaje mu sie rozwiazac gdy jeden z chlopakow jest juz 2m od niego.\n" +
                    "'Ha-Ha Probujesz sie rozwiazac? Prosze cie sam te wezly suplalem.' wtedy wykorzystujac chwile nie uwagi i popisow napastnika Arthur lapie go za nogi i szarpie gwaltownie\n" +
                    "bierze pozostala line z ziemi i owija ja wokol szyji zdezeorientowanego O'Driscolla, zaciskajac tak mocno ze najpierw odbiera mu glos a potem przytomnosc.\n" +
                    "Gwaltownie rozglada sie czy nikt go nie zauwazyl i ma szczescie bo nie. Zwiazuje i knebluje napastnika po czym go przeszukuje. Pech zadnej broni procz noza. Pewnie zostawil gdzies rewolwer\n" +
                    "Teraz skupiajac sie i odzyskujac wiecej trzezwych mysli Arthur obmysla gdzie moze pojsc: do drewnianego malego budynku nieopodal(1) do namiotu stojacego dalej niz budynek(2)");
            aw1 = in.nextInt();
            if(aw1==1){
                System.out.println("Przemykasz nie zauwazony do drewnianej chaty wchodzac tylnim wyjsciem, caly czas bacznie sie rozgladajac. W budynku nie ma nikogo oprocz ciebie i jest szansa ze moze ktos zostawil tu cos uzytecznego\n" +
                        "mijasz jedno, drugie pomieszczenie pospiesznie je przeszukujac lecz nie znajdujesz tam nic interesujacego oporcz kawalka batonika ktorego szybko zjadasz z glodu.\n" +
                        "Dochodzisz do glownego wiekszego pomieszczenia na srodku ktorego stoi krzeslo z przewieszona lina domyslasz sie ze predzej czy pozniej by cie tu przyprowadzili\n");
            }else if(aw1==2){
                System.out.println("Przemykasz do namiotu przystajac co jakis czas w wysokiej trawie i za paroma drzewami, gdy docierasz do celu twoim oczom ukazuje sie wlasnie to czego szukales.\n" +
                        "Skrzynie z karabinami i rewolwerami, krzatajace sie naboje, troche jedzenia, dostrzegasz gdzies w rogu nawet buklak.\n" +
                        "W tym momencie czujesz jak cos tempego uderza cie w tym glowy, przed oczami robi sie czarno i tracisz przytomnosc.\n" +
                        "Budzi cie haust zimnej wody, siedzisz na krzesle zwiazany w jakims pomieszczeniu. Widzisz wszystko tunelowo i twoim oczom ukazuje sie sam Colm O'Driscoll.\n" +
                        "Przywodca gangu i niezla gnida, patrzy Ci prosto w oczy i plujac zamaszycie mowi ze juz dawno na to czekal. Funduje Ci pare mosieznych uderzen w brzuch po czym wychodzi z pokoju." +
                        "Dwoch przydupasow wlasnie szturcha cie kolba i zaczyna sie smiac wypuszczajac swiszczacy wiatr przez szpary w zebach.\n" +
                        "Jeden otwiera ktoras z szuflad malej szafki stojacej w rogu i wyjmuje zawieniete w szamtke papierosy. Patrza na siebie porozumiewawczo i udajac sie na strone wychodza z budynku.\n" +
                        "Myslisz sobie 'Cale szczescie ze wiazal Cię teraz jakis imbecyl', szunr jest calkiem luzny. Udaje Ci sie oswobodzic.");
            }
        }else if(aw1==2){
            System.out.println("Po dluzszej chwili lezac niezgrabnie na glebie z przszywajacym chlodem zjawia sie jeden z wartownikow. Siedzisz cicho bacznie obserwujac co chce zrobic.\n" +
                    "On tez raczej z tych malo rozmownych i kierujac sie poza twoje pole widzenia staje tuz za toba.\n" +
                    "W tym momencie czujesz jak cos tempego uderza cie w tym glowy, przed oczami robi sie czarno i tracisz przytomnosc.\n" +
                    "Budzi cie haust zimnej wody, siedzisz na krzesle zwiazany w jakims pomieszczeniu. Widzisz wszystko tunelowo i twoim oczom ukazuje sie sam Colm O'Driscoll.\n" +
                    "Przywodca gangu i niezla gnida, patrzy Ci prosto w oczy i plujac zamaszycie mowi ze juz dawno na to czekal. Funduje Ci pare mosieznych uderzen w brzuch po czym wychodzi z pokoju." +
                    "Dwoch przydupasow wlasnie szturcha cie kolba i zaczyna sie smiac wypuszczajac swiszczacy wiatr przez szpary w zebach.\n" +
                    "Jeden otwiera ktoras z szuflad malej szafki stojacej w rogu i wyjmuje zawieniete w szamtke papierosy. Patrza na siebie porozumiewawczo i udajac sie na strone wychodza z budynku.\n" +
                    "Myslisz sobie 'Cale szczescie ze wiazal Cię teraz jakis imbecyl', szunr jest calkiem luzny. Udaje Ci sie oswobodzic.");
        }
        System.out.println("Rozgladajac sie po pomieszczeniu zauwazasz uchylone drzwiczki jedenj z szafek i tam postanawiasz sprawdzic i poszukac czegos przydatnego do ujscia z zyciem z tej patowej sytuacji.\n" +
                "BINGO! przemyka Ci przez mysl gdy otwierajac drzwiczki do konca twoim oczom ukazuje sie lsniaca od wpadajacego przez okno slonca rekojesc i bebenek rewolweru.\n" +
                "Obok niego spoczywa pare paczek amunicji, ktore momentalnie chowasz do kieszeni.\n");
        System.out.println("----Firearm damage increased, now its: " + player.firearmDamage + "----");
        System.out.println("Wyglasz powoli za okno chowajac rewolwer za pasek od spodni przy plecach. Patrzych juz pewniejszym wzrokiem na oboz\n" +
                "i wiesz ze zaczynasz miec szanse ujsc z zyciem. W obozie naliczyles okolo 30ludzi kazdy prawdopodobnie z bronia palna. Dlugo nie myslac wniosek jest jasny nie dasz im rady,\n" +
                "jednak te szczury juz troche zlego zrobily wiec zastanawiasz sie: zaatakowac(1) lub uciec tylnim wyjsciem(2)");
        int aw2 = in.nextInt();
        if(aw2==1){
            arthurFirstStepsAttack(player);
        }else if(aw2==2){
            System.out.println("Wychodzisz tylnim wyjsciem, powoli oddalasz sie od obozu po cichu mijajac kolejne zdzbla wysokiej trawy, w koncu udaje Ci sie dostac na skraj lasu.\n" +
                    "Patrzysz za siebie upewniajac sie ze nikt cie nie sledzi, na szczescie nie. Wbiegasz w las i  kierujac sie na polnoc zwalniasz temo po jakims czasie dalej idac szybkim krokiem.\n" +
                    "Docierasz do Valentine, Arthur prosi wlasciciela najblizszego saloonu o mape i jeden nocleg opowiadajac mu historie porwania. Tak po nocy najedzony, wyspany i gotowy do dzialania\n" +
                    "spoglada na mape pewnym wzrokiem: \n");
        }
    }

    public void arthurFirstStepsAttack(Player player){
        Fight fight = new Fight();
        player.setHP(fight.Fight1(32, player.getHP(), player.getFirearmDamage()));
    }

}
