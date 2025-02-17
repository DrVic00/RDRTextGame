import java.util.Scanner;

public class Valentine {
    public int valentineFirstCh;
    boolean bankIdea = false;
    boolean carriagesIdeaV = false;
    int barFightsNum = 0;
    int drunk = 0;
    int health;
    int drinkOrNot;
    Scanner in = new Scanner(System.in);
    public void valentineWTD(Player player){
        System.out.println("\nJesteś w Valentine...\n" +
                "Miasteczku malym, lecz prężnie się rozwijającym co chcesz zrobić:\n");
        System.out.println("(1)Odwiedzic bank");
        System.out.println("(2)Odwiedzic saloon");
        System.out.println("(3)Odwiedzic woznice\n");
        System.out.println("(4)Spojrzec ponownie na mape");
        valentineFirstCh = in.nextInt();
        valentineActions(player);
    }

    public void valentineActions(Player player){
        if(valentineFirstCh == 1){
            System.out.println("Wchodzisz powolnym krokiem do banku w akompaniamencie skrzypiacych drzwi i szeleszczacych gazet klientow. Skrzypiacy skórzany pas z rewolwerem na biodrze wzbudzał niepokój wśród innych klientów.\n" +
                    "Jego szeroki kapelusz skrywał twarz, na ktorej malowalo sie skupienie. Bowiem nie wszedl tu, aby wyplacac pieniadzy skoro nawet nie mial konta. Rozgladal sie bacznie na ilosc bankierow i straznikow, wyjsc i okien\n" +
                    "Przez szybe za lada dojrzal wejscie na zaplecze bedac pewnym ze to tam trzymany jest sejf. W miedzy czasie kolejka sie przesunela i nadeszla jego kolej. Patrzac bankierce prosto w oczy z dziarskim usmiechem poprosil\n" +
                    "o zaprowadzenie do skrytek. Mila kobieta zaprowadzila go wprost do nich znajdujacych sie w sasiednim pomieszczeniu do zaplecza, gdzie prawdopodobnie byl sejf. Wtedy oznajmiasz, ze najwyrazniej zapomniales klucza.\n" +
                    "Powoli wyszedl z Banku czujac ciezar buchanego powietrza przez drzwi zamykajace sie za jego plecami. Wiedzial juz ze moze obrabowac ten bank ale bedzie potrzebowal pomocy swojego gangu.");
            bankIdea = true;
            valentineWTD(player);
        }else if(valentineFirstCh == 2){
            if(barFightsNum > 3){
                int caught = (int) Math.round(1 + (Math.random() * (2 - 1)));
                if(caught == 1){
                    System.out.println("Wchodzisz do saloonu, drzwi za toba powiewiaja niczym skrzydla motyla, a ty robisz krok w przod. Nagle czujesz chlodny uscisk na swoim ramieniu.\n" +
                            "To wlasciciel...\n\n" +
                            "*---Zostales wyrzucony z baru za czesto robisz tam burdy---*");
                            valentineWTD(player);
                }else{
                    System.out.println("Wszedles do saloonu, rozglaajac sie zauwazasz wlasciciela, ale mu nie udalo sie ciebie dostrzec. Usmiechasz sie pod nosem i siadasz przy jednym ze stolikow");
                }
            }else{
                System.out.println("Wchodzisz do saloonu, wiatr ciosajacy w twarz ustaje a drobinki piasku opadaja z twoich butow. Drzwi za toba powiewajac niczym skrzydla motyla i lapiesz kontakt wzrokowy z barmanem mimo tlumu.\n" +
                        "idac miedzy ludzmi i stolikami dochodzisz wreszcie do baru. Siadasz i rozpoczynasz pogawedke z barmanem z wasem tak duzym ze sam Stalin by sie nie powstydzil.\n");
                drinkAndDrink(player);
            }
        }else if(valentineFirstCh == 3){
            System.out.println("Przechodzac nieopodal starego woznycy zauwazasz pare wozow kazdy z dwoma konmi, zapalajac zamaszyscie papierosa i upajajac sie wonia wydobywajaca sie powoli z twoich pluc przychodzi Ci do glowy nie najgorszy pomysl...\n" +
                    "Mozliwe ze gdybys przygotowal sie do kradziezy i zakradl sie tu noca to moglbys niezauwazenie ukrasc jeden z wozow");
            carriagesIdeaV = true;
            valentineWTD(player);
        }else if(valentineFirstCh == 4){

        }
    }

    public void drinkAndDrink(Player player){
        System.out.println("Siedzisz przy stoliku\nCo robisz dalej? Napij sie(1) lub wyjdz z saloonu(2)\n");
        drinkOrNot = in.nextInt();
        if (drinkOrNot == 1){
            if(drunk <= 2){
                System.out.println("Mmm...\nTo bylo cos na prawde smacznego...\n");
                drunk++;
                drinkAndDrink(player);
            } else if (drunk <=5) {
                System.out.println("Mmm..\n ghrr...\n yhmm.. to bylo calkiem, ale chyba pownienem juz powoli konczyc...");
                drunk++;
                drinkAndDrink(player);
            } else if (drunk <= 7) {
                System.out.println("O chryste....\n ahgrra...\n na dzis mi juz wystarczy...");
                drunk++;
                drinkAndDrink(player);
            } else {
                System.out.println("....\n\n......\n...\n\n\n");
                System.out.println("Otwierasz ledwo oczy budzisz sie obrzygany pod drzewem caly w blocie z podartym ubraniem gdzie niegdzie, zle sie czujesz i masz wrazenie ze zaraz rozsadzi Ci glowe. Obok ciebie na przydroznej lawce\n" +
                        "siedzi jeden ze starszych miejscowych opowiadajacych czego to ty wczoraj nie robiles: Po za duzej ilosci procentow pobiles sie z paroma typami rozwaliles pare butelek lustro i ostatecznie po paru beltach\n" +
                        "wlasciciel wyrzucil cie z saloonu krzyczac: 'Zeby wiecej to nie mialo miejsca!!!'");
                System.out.println("Ledwo sie podnosisz, otrzepujac ubranie i trzymajac pekajaca z bolu glowe, swiatlo cie oslepia a halas miasta robi sie nie znosny. Przelykasz zastala flegme spluwajac do splujki nieopodal lawki\n" +
                        "i wdychasz swierze zimne orzezwiajace powietrze wypelniajace twoje przepalone czarne pluca. Patrzych na horyzont przebijacy sie niczym w wyscgu ze wschodem slonca zza domostw Valentine.");
                drunk = 0;
                health = player.getHP();
                health -= 20;
                if(health <= 0){
                    System.out.println("Przepiles sie na smierc\n\n*--Game Over--*");
                    System.exit(0);
                }else {
                    player.setHP(health);
                    System.out.println("Zycie spadlo o 20hp");
                    valentineWTD(player);
                }
            }
        }else if(drinkOrNot == 2){
            System.out.println("Wstajesz od stolu i charchajac zaparczywie w akompaniamencie skrzypiacych krzesel szurania butow i kilkunastu nieustannych barowych wokali.\n" +
                    "Otwierasz drzwi wychodzisz na ganek biorac gleboki oddech i pewnie patrzac przed siebie.");
            valentineWTD(player);
        }
    }


}
