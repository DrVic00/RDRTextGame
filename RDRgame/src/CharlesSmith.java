import java.util.Scanner;

public class CharlesSmith {
    int charlesCh;
    Scanner in = new Scanner(System.in);
    Fight fight = new Fight();
    Firearm rifle = new Firearm("springfield", 20, 100);
    WapitiIndianReservation indian = new WapitiIndianReservation();
    public void quote(){
        System.out.println("\uD835\uDE1B\uD835\uDE29\uD835\uDE26 \uD835\uDE22\uD835\uDE2E\uD835\uDE30\uD835\uDE36\uD835\uDE2F\uD835\uDE35 \uD835\uDE30\uD835\uDE27 \uD835\uDE29\uD835\uDE26\uD835\uDE2D\uD835\uDE2D \uD835\uDE38\uD835\uDE26'\uD835\uDE37\uD835\uDE26 \uD835\uDE33\uD835\uDE22\uD835\uDE2A\uD835\uDE34\uD835\uDE26\uD835\uDE25, \uD835\uDE38\uD835\uDE26'\uD835\uDE33\uD835\uDE26 \uD835\uDE30\uD835\uDE38\uD835\uDE26\uD835\uDE25 \uD835\uDE34\uD835\uDE30\uD835\uDE2E\uD835\uDE26 \uD835\uDE23\uD835\uDE22\uD835\uDE24\uD835\uDE2C, \uD835\uDE3A\uD835\uDE30\uD835\uDE36 \uD835\uDE2C\uD835\uDE2F\uD835\uDE30\uD835\uDE38?");
    }

    public void charlesFirstSteps(Player player){
        System.out.println("Znajdujesz sie w lesnej gluszy, polujesz juz od paru dobrych dni. Nie przymierasz glodem bo jestes wprawionym mysliwym, jednak czas tutaj dobiega konca, musisz wracac do braci\n" +
                "Przywolujac swojego konia zliczasz ile zwierzat udalo Ci sie oskorowac, jest to okolo 5 skor z jeleniowatych i 2 z wilkow plus w jukach pare mniejszej zwierzyny. Nie zliczysz ile lotek i upierzenia ptakow\n" +
                "wszystkie te zdobycze przydadza sie plemieniu lub gangowi do ktorego nalezysz. Wsiadasz na konia wdychajac jeszcze raz piekna won lasu, przyrody i spokoju. Swoj luk przypinasz do siodla, aby jego cieciwa nie wpinala Ci sie w brzuch i rozpoczynasz podroz\n" +
                "W koncu docierasz do Wapiti Indian Reservation kierujac sie w strone namiotu wodza. Wita cie jak syna mimo ze jestescie daleka rodzina. Dzieli on sie z toba szczegolami tego ze\n" +
                "twoje indianskie plemie jest zagrozone i dobrze o tym wiesz, a przynaleznosc do gangu Van der Linde nic tu nie zmienia. Chlopcy z gangu Ci teraz nie pomoga. Jest to sprawa miedzy twoim plemieniem, a amerykanska biurokracja.\n" +
                "Razem z najwazniejszymi czlonkami plemienia omawiacie szczegoly planu, ataku na jeden z obozow wojskowych amerykanow, ktory swiadomie wybudowali na czesci waszych terenow zabijajac waszych braci i niszczac faune i flore.\n" +
                "Czas wiec pokazac ze nie boicie sie walczyc o to co wasze mowi wodz zagrzewajac do walki. Zabierasz ze soba karabin ze swojego namiotu i razem z calym kordonem indian ruszacie w wyznaczone miejsce");
        System.out.println("Zdobyles bron");
        rifle.setFirearmDamage(player);
        System.out.println("Rozpedzeni nie zatrzymujac koni, podnoszac swoj orez do gory i krzyczac napadacie na oboz. Dookola ciebie fruwaja pociski, ludzie z szablami i dzidami, ktos strzela z luku ktos ucieka.\n" +
                "Postod tego choasu Charles, biegnie na zolnierza ktorego powala i zabija jego wlasnym bagnetem. Wstajac widzi celujacego do niego kolejnego zolnierza.\n");
        fight.Fight1(1,player.hp, player.firearmDamage);
        System.out.println("Twoj pocisk z karabinu trafia w jego brzuch, a obonent osowa sie o jedna z barykad. Biegniesz dalej strzelajac jeszcze do paru zolnierzy. Az w koncu rozbrzmiewa okrzyk wodza.\n" +
                "Wiesz ze bitwa zostala wygrana. Razem z reszta plemienia zbieracie i pomagacie rannym i poleglym. Wracacie do obozu w chwale, na miejscu organizowana zostaje wielka uczta przy ognisku.\n" +
                "Wszyscy sie ciesza i siwtuja wygrana, nadchodzi kolejny dzien. Czujesz sie wypoczety i gotowy do dzialania, a prawdopodobnie wodz ma jeszcze jakies zadanie dla ciebie, lecz gang i swiat tez na ciebie czekaja.\n" +
                "Co robisz (1)Zostan w Wapiti Indian Reservation lub (2)spojrz na mape");
        charlesCh = in.nextInt();
        if(charlesCh == 1){
            indian.indianWTD(player);
        } else if (charlesCh == 2) {
            System.out.println("Wsiadasz na swojego wierzchowca wyjezdzajac z plemienia  i trzymajac mape w dloniach pewnie na nia spogladasz: \n");
        }
    }
}
