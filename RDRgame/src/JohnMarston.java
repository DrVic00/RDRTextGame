import java.util.Scanner;

public class JohnMarston {
    int johnCh;

    Scanner in = new Scanner(System.in);
    Fight fight = new Fight();
    public void quote() {
        System.out.println("\uD835\uDE17\uD835\uDE26\uD835\uDE30\uD835\uDE31\uD835\uDE2D\uD835\uDE26 \uD835\uDE25\uD835\uDE30\uD835\uDE2F'\uD835\uDE35 \uD835\uDE27\uD835\uDE30\uD835\uDE33\uD835\uDE28\uD835\uDE26\uD835\uDE35. \uD835\uDE15\uD835\uDE30\uD835\uDE35\uD835\uDE29\uD835\uDE2A\uD835\uDE2F\uD835\uDE28 \uD835\uDE28\uD835\uDE26\uD835\uDE35\uD835\uDE34 \uD835\uDE27\uD835\uDE30\uD835\uDE33\uD835\uDE28\uD835\uDE2A\uD835\uDE37\uD835\uDE26\uD835\uDE2F.\n");
    }

    public void johnFirstSteps(Player player) {

        System.out.println("Budzisz sie na swojej farmie, mimo ze jeszcze jestes w gangu Van der Linde to powoli starasz sie skonczyc z tym zyciem bandyty.\n" +
                "Calujesz zone w policzek konczac sniadanie i czochrasz wlosy synowi przed wyjsciem. Wiesz ze to zdolny chlopak, na razie zaczytany w ksiazkach i dobrze. Kierujesz sie w strone swojej zagrody czekalo tu troche bydla do wydojenia i pare do sprzedania\n" +
                "Jednak okazuje sie ze zagroda jest zdemolowana, a bydla nie ma. Widzisz jednak slady kopyt stada ktore szarzowalo przed siebie. Czym predzej wsiadasz na kon i jedziesz za sladami. Trop urywa sie niedaleko jakiegos gospodarstwa i domyslasz sie ze padles ofiara kradziezy.\n" +
                "Powoli starasz sie rozeznac w terenie zostawiajac konia przy po bliskim lesie. Wchodzisz na teren farmy udajac zainteresowanego kupnem konia. Wlasciciel szybko zaczyna sie toba opiekowac odpowiadajac jednak z irytacja w glosie ze nie ma koni na sprzedaz.\n" +
                "Ty jednak nie ustepujesz i choc widzisz juz swoje bydlo to udajesz ze szukasz koni sprawdzajac czy w zadnej stodole i na farmie nie ma innych ludzi niz on. W koncu jestes pewien i kiedy on wyprowadzony z rownowagi zaczyna Ci juz grozic\n" +
                "zebys opuscil jego posesje. Wyciagasz rewolwer i celujac mu prosto w nos grzecznie zaczynasz z nim rozmawiac,a by oddal Ci bydlo. Ten pokornieje i otwiera zagrode oddajac Ci wszystkie krowy, a ty dalej masz go na muszcze.\n" +
                "Co robisz: zastrzel go i tak(1) lub opusc bron i zabierz co twoje(2)");
        johnCh = in.nextInt();
        if (johnCh == 1) {
            System.out.println("Strzelasz, a kula przeszywa mu czaszke i wylatuje druga strona. Nagle slyszysz rozpaczliwy krzyk, i widzisz jak z jednego budynku wybiega na ciebie mlody mezczyzna z bronia strzelajac na oslep.");
            fight.Fight1(1, 160, player.firearmDamage);
            System.out.println("Twoj pociski przeszywaja jego cialo i pada na ziemie martwy. Moze byl to jego krewny, moze wspolpracownik, nie masz na to teraz czasu nie oni pierwsi nie ostatni mysli John. Zabierajac bydlo wraca na swoja farme.\n" +
                    "Zjadasz, odpoczywasz, regenerujesz i po dniu pracy, kladac sie spac. Juz wieczorem przed zasnieciem wspominasz dzisiejsze wydarzenia, daly Ci one adrenaline jakiej dawno nie czules\n" +
                    "i wiesz ze chcesz wrocic choc ostatni do tego zycia az na dobre zalozysz farme.");

        } else if (johnCh == 2) {
            System.out.println("Opuszczasz bron i zabierasz bydlo. Wyjezdzajac ze swoja wlasnoscia zauwazasz ze z budynku obok wychodzi mlody postawny mezczyzn i klepie starszego z ktorym rozmawiales po ramieniu.\n" +
                    "Myslisz o tym ze dobrze ze nie dales sie sprowokowac i go zastrzelic bo moglyby byc problemy z tym drugim. Wracasz do domu, przezywasz zwykly dzien pracy na farmie po czym kladziesz sie spac.\n" +
                    "Juz wieczorem przed zasnieciem w twej glowie kolocza sie mysli o tym ze brakuje Ci gangu i tego zycia i postanawiasz wrocic do tego zycia jeszcze na chwile zanim na dobre zalozysz farme.");
        }
        System.out.println("Opowiadasz sie za tym pomyslem przy porannym sniadaniu i mimo niezadwolenia zony. Postanawiasz wyjechac na przygode ten ostatni raz, wsiadasz na konia i pewnym wzrokiem spogladasz na mape: \n");
    }
}
