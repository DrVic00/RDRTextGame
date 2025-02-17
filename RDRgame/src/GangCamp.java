import java.util.Scanner;

public class GangCamp {
    int gangFirstCh;
    int stealChoice;
    int roomChoice;
    int roomHealth;
    int boyLifeChoice;
    int health;
    int bankMoney;
    int banditNum = 0;
    boolean gangGun = false;
    final boolean defaultGun = true;
    int gunChoice;
    Scanner in = new Scanner(System.in);
    Firearm rewolwer2 = new Firearm("S&W Model 3", 45, 100);
    Firearm rewolwerDef = new Firearm("Colt Single Action Army", 20, 3);
    Fight fight = new Fight();

    public void gangWTD(Player player, Valentine valentine, Ctrawberry ctrawberry, WapitiIndianReservation indian) {
        System.out.println("\nJesteś w obozowisku swojego gangu...\n" +
                "\uD835\uDE08 \uD835\uDE28\uD835\uDE22\uD835\uDE2F\uD835\uDE28 \uD835\uDE30\uD835\uDE27 \uD835\uDE24\uD835\uDE33\uD835\uDE2A\uD835\uDE2E\uD835\uDE2A\uD835\uDE2F\uD835\uDE22\uD835\uDE2D\uD835\uDE34, \uD835\uDE25\uD835\uDE2A\uD835\uDE34\uD835\uDE34\uD835\uDE2A\uD835\uDE25\uD835\uDE26\uD835\uDE2F\uD835\uDE35\uD835\uDE34 \uD835\uDE22\uD835\uDE2F\uD835\uDE25 \uD835\uDE27\uD835\uDE33\uD835\uDE26\uD835\uDE26-\uD835\uDE35\uD835\uDE29\uD835\uDE2A\uD835\uDE2F\uD835\uDE2C\uD835\uDE26\uD835\uDE33\uD835\uDE34 \uD835\uDE38\uD835\uDE29\uD835\uDE30 \uD835\uDE29\uD835\uDE22\uD835\uDE37\uD835\uDE26 \uD835\uDE24\uD835\uDE29\uD835\uDE30\uD835\uDE34\uD835\uDE26\uD835\uDE2F \uD835\uDE35\uD835\uDE30 \uD835\uDE33\uD835\uDE26\uD835\uDE2B\uD835\uDE26\uD835\uDE24\uD835\uDE35 \uD835\uDE22 \uD835\uDE24\uD835\uDE30\uD835\uDE33\uD835\uDE33\uD835\uDE36\uD835\uDE31\uD835\uDE35 \uD835\uDE34\uD835\uDE3A\uD835\uDE34\uD835\uDE35\uD835\uDE26\uD835\uDE2E \uD835\uDE30\uD835\uDE27 \uD835\uDE31\uD835\uDE30\uD835\uDE38\uD835\uDE26\uD835\uDE33 \uD835\uDE22\uD835\uDE2F\uD835\uDE25 \uD835\uDE2D\uD835\uDE2A\uD835\uDE37\uD835\uDE26 \uD835\uDE2A\uD835\uDE2F\uD835\uDE34\uD835\uDE35\uD835\uDE26\uD835\uDE22\uD835\uDE25 \uD835\uDE23\uD835\uDE3A \uD835\uDE35\uD835\uDE29\uD835\uDE26\uD835\uDE2A\uD835\uDE33 \uD835\uDE30\uD835\uDE38\uD835\uDE2F \uD835\uDE24\uD835\uDE30\uD835\uDE25\uD835\uDE26. \uD835\uDE08\uD835\uDE34 \uD835\uDE35\uD835\uDE29\uD835\uDE26 \uD835\uDE31\uD835\uDE33\uD835\uDE2A\uD835\uDE24\uD835\uDE26 \uD835\uDE30\uD835\uDE2F \uD835\uDE35\uD835\uDE29\uD835\uDE26\uD835\uDE2A\uD835\uDE33 \uD835\uDE29\uD835\uDE26\uD835\uDE22\uD835\uDE25\uD835\uDE34 \uD835\uDE24\uD835\uDE30\uD835\uDE2F\uD835\uDE35\uD835\uDE2A\uD835\uDE2F\uD835\uDE36\uD835\uDE26\uD835\uDE34 \uD835\uDE35\uD835\uDE30 \uD835\uDE28\uD835\uDE33\uD835\uDE30\uD835\uDE38, \uD835\uDE34\uD835\uDE30 \uD835\uDE25\uD835\uDE30\uD835\uDE26\uD835\uDE34 \uD835\uDE35\uD835\uDE29\uD835\uDE26 \uD835\uDE34\uD835\uDE35\uD835\uDE33\uD835\uDE36\uD835\uDE28\uD835\uDE28\uD835\uDE2D\uD835\uDE26 \uD835\uDE35\uD835\uDE30 \uD835\uDE33\uD835\uDE26\uD835\uDE2E\uD835\uDE22\uD835\uDE2A\uD835\uDE2F \uD835\uDE27\uD835\uDE33\uD835\uDE26\uD835\uDE26.\n");
        System.out.println("(1)Pojsc do namiotu planowania napadow");
        System.out.println("(2)Pojsc do lidera gangu, Dutcha");
        System.out.println("(3)Pojsc do swojego namiotu\n");
        System.out.println("(4)Spojrzec ponownie na mape");
        gangFirstCh = in.nextInt();
        gangActions(player, valentine, ctrawberry, indian);
    }

    public void gangActions(Player player, Valentine valentine, Ctrawberry ctrawberry, WapitiIndianReservation indian) {
        if (gangFirstCh == 1) {
            System.out.println("Wchodzisz do namiotu planowania napadu w nim stoly, skrzynie, mnostwo papierow olowkow i pustych puszek po fasoli\nCo chcesz zrobic: ");
            if (valentine.bankIdea && valentine.carriagesIdeaV && ctrawberry.carriagesIdeaC) {
                System.out.println("Napad na bank(1) lub kradziez wozu Valentine(2) lub kradziez wozu Ctrawberry(3) lub zrezygnuj(4)");
                stealChoice = in.nextInt();
                if (stealChoice == 1) {
                    bankRobbery(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 2) {
                    carriagesSteal(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 3) {
                    carriagesSteal2(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 4) {
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            } else if (valentine.bankIdea && valentine.carriagesIdeaV) {
                System.out.println("Napad na bank(1) lub kradziez wozu Valentine(2) lub ...poszukaj wozu do kradziezy... lub zrezygnuj(3)");
                stealChoice = in.nextInt();
                if (stealChoice == 1) {
                    bankRobbery(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 2) {
                    carriagesSteal(player, valentine, ctrawberry, indian);
                }else if (stealChoice == 3) {
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            } else if (valentine.bankIdea && ctrawberry.carriagesIdeaC) {
                System.out.println("Napad na bank(1) lub ...poszukaj wozu do kradziezy... lub kradziez wozu Ctrawberry(2) lub zrezygnuj(3)");
                stealChoice = in.nextInt();
                if (stealChoice == 1) {
                    bankRobbery(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 2) {
                    carriagesSteal2(player, valentine, ctrawberry, indian);
                }else if (stealChoice == 3) {
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            } else if (valentine.bankIdea) {
                System.out.println("Napad na bank(1) lub ...poszukaj wozu do kradziezy... lub ...poszukaj wozu do kradziezy... lub zrezygnuj(2)");
                stealChoice = in.nextInt();
                if (stealChoice == 1) {
                    bankRobbery(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 2) {
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            } else if (valentine.carriagesIdeaV && ctrawberry.carriagesIdeaC) {
                System.out.println("...poszukaj banku do obrabowania... lub kradziez wozu Valentine(1) lub kradziez wozu Ctrawberry(2) lub zrezygnuj(3)");
                stealChoice = in.nextInt();
                if (stealChoice == 1) {
                    carriagesSteal(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 2) {
                    carriagesSteal2(player, valentine, ctrawberry, indian);
                }else if (stealChoice == 3) {
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            } else if (valentine.carriagesIdeaV) {
                System.out.println("...poszukaj banku do obrabowania... lub kradziez wozu Valentine(1) lub ...poszukaj wozu do kradziezy... lub zrezygnuj(2)");
                stealChoice = in.nextInt();
                if (stealChoice == 1) {
                    carriagesSteal(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 2) {
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            } else if (ctrawberry.carriagesIdeaC) {
                System.out.println("...poszukaj banku do obrabowania... lub ...poszukaj wozu do kradziezy... lub kradziez wozu Ctrawberry(1) lub zrezygnuj(2)");
                stealChoice = in.nextInt();
                if (stealChoice == 1) {
                    carriagesSteal2(player, valentine, ctrawberry, indian);
                } else if (stealChoice == 2) {
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            } else {
                System.out.println("...poszukaj banku do obrabowania... lub ...poszukaj wozu do kradziezy... lub ...poszukaj wozu do kradziezy... lub zrezygnuj(1)");
                stealChoice = in.nextInt();
                if (stealChoice == 1) {
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            }
        } else if (gangFirstCh == 2) {
            System.out.println("Wchodzisz do namiotu Dutch'a, ten lapie cie dynamicznie za barki i sciskajac mruzy oczy. Wpatruje sie przed chwile po czym zaczyna: 'I have a plan'\n'I have a damn plan Arthur'\n" +
                    "Wychodzi z namiotu jeszcze mowiac pod nosem 'I have a plan...'. Caly Ducht, zawsze ma plan myslisz po czym wychodzisz na swieze powietrze.");
            gangWTD(player, valentine, ctrawberry, indian);
        } else if (gangFirstCh == 3) {
            System.out.println("Wchodzisz do swojego namiotu, uderza cie specyficzny zapach, ktory czujesz tylko tu. Uspokaja cie i koi twoje mysli. Przegladasz sie w lustrze, suniesz palcem po ksiazce lezacej na jednej ze skrzyn.\n" +
                    "W koncu siadasz na lozku i zastanawiasz sie co zrobic: zregenerowac sie(1) lub spojrz w glab siebie i na zewnatrz(2) lub zmien bron(3) lub wyjdz z namiotu(4)");
            roomChoice = in.nextInt();
            if (roomChoice == 1) {
                System.out.println("Palaszujesz kilka puszek przysmakow ktore znalazles w swojej skrzyni, kladziesz sie na drzemke...\nOdzyskujesz sily...");
                if (player.hp > 120) {
                    System.out.println("Czujesz sie wypoczety jak mlody bog");
                    gangWTD(player, valentine, ctrawberry, indian);
                } else {
                    System.out.println("----Przywrocono 20hp----");
                    roomHealth = player.getHP() + 20;
                    player.setHP(roomHealth);
                    gangWTD(player, valentine, ctrawberry, indian);
                }

            } else if (roomChoice == 2) {
                player.roomShowInfo();
                gangWTD(player, valentine, ctrawberry, indian);
            } else if (roomChoice == 3) {
                if(indian.indianGun && gangGun && defaultGun){
                    System.out.println("Wybierz bron: " + indian.rewolwer3.name + " 65 damage(1) lub " + rewolwer2.name + " 45 damage(2) lub " + "Colt Single Action Army 20 damage(3)");
                    gunChoice = in.nextInt();
                    if(gunChoice == 1){
                        indian.rewolwer3.setFirearmDamage(player);
                    } else if (gunChoice == 2) {
                        rewolwer2.setFirearmDamage(player);
                    } else if (gunChoice == 3) {
                        rewolwerDef.setFirearmDamage(player);
                    }
                    System.out.println("Firearm damage is: " + player.getFirearmDamage());
                    gangWTD(player, valentine, ctrawberry, indian);
                } else if (defaultGun && gangGun) {
                    System.out.println("Wybierz bron: " + "---Nie posiadasz tej broni--- lub " + rewolwer2.name + " 45 damage(1) lub " + "Colt Single Action Army 20 damage(2)");
                    gunChoice = in.nextInt();
                    if (gunChoice == 1){
                        rewolwer2.setFirearmDamage(player);
                    } else if (gunChoice == 2) {
                        rewolwerDef.setFirearmDamage(player);
                    }
                    System.out.println("Firearm damage is: " + player.getFirearmDamage());
                    gangWTD(player, valentine, ctrawberry, indian);
                } else if (defaultGun && indian.indianGun) {
                    System.out.println("Wybierz bron: " + indian.rewolwer3.name + " 65 damage(1) lub " + "---Nie posiadasz tej broni--- lub " + "Colt Single Action Army 20 damage(2)");
                    gunChoice = in.nextInt();
                    if (gunChoice == 1){
                        indian.rewolwer3.setFirearmDamage(player);
                    } else if (gunChoice == 2) {
                        rewolwerDef.setFirearmDamage(player);
                    }
                    System.out.println("Firearm damage is: " + player.getFirearmDamage());
                    gangWTD(player, valentine, ctrawberry, indian);
                }else{
                    System.out.println("Wybierz bron: " + "---Nie posiadasz tej broni--- lub " + "---Nie posiadasz tej broni--- lub " +"Colt Single Action Army 20 damage(1)");
                    gunChoice = in.nextInt();
                    if (gunChoice == 1) {
                        rewolwerDef.setFirearmDamage(player);
                    }
                    System.out.println("Firearm damage is: " + player.getFirearmDamage());
                    gangWTD(player, valentine, ctrawberry, indian);
                }
            } else if (roomChoice == 4) {
                gangWTD(player, valentine, ctrawberry, indian);
            }
        } else if (gangFirstCh == 4) {

        }
    }

    public void bankRobbery(Player player, Valentine valentine, Ctrawberry ctrawberry, WapitiIndianReservation indian) {
        if(!gangGun){
            System.out.println("Przed napadem Dutch daje Ci nowy swietny rewolwer.\n Gratulacje zdobyles rewolwer Smith and Wesson\n\n");
            gangGun = true;
            rewolwer2.setFirearmDamage(player);
        }
        System.out.println("Wyjazd z obozu gangu był pełen napięcia i oczekiwania. Wszyscy członkowie naszego gangu, uzbrojeni po zęby, zbierali się przy ognisku, planując każdy szczegół naszej misji. \n" +
                "Teraz w trakcie podróży do miasta Valentine caly gang nie mogl oderwać wzroku od rozległych, malowniczych krajobrazów otaczających trasę.\n" +
                "Galopując na koniach, z wiatrem w włosach, czuliśmy się jak wolne duchy na dzikim zachodzie. W miarę zbliżania się do celu, atmosfera zrobiła się coraz bardziej elektryzująca.\n" +
                "Woz wjechal do Valentine, sciskajac w dloniach lejce myslisz o kazdym etapie planu, w wozie oprcz ciebie jada Karen Jones, Bill Williamson, Lenny Summers, Javier Escuella i Sean MacGuire.\n" +
                "Pod kopytami koni tarabanilo sie coraz mniej piachu i ziemi, woz zwolnil poczym sie zatrzymal. Wszyscy procz Karen wysiedlismy wkladajac bandany na twarz i napinajac kurki w rewolwerach i karabinach.\n" +
                "Ona wyjela jedynie biala chuste i zaczela plakac, wbiegajac do banku, cala reszta razem z toba stanela przed bankiem czujac buzujaca w zylach krew. Z banku dobiegalu odglosy Karen przerywane szlochaniem: 'On mnie juz nie kocha!!',\n" +
                "'a tak mowil, a tak mowil', 'Co za niewychowana swinia!!', 'Co ja teraz... co ja poczne!'. W koncu rozleglo sie 'Wszyscy na ziemie to jest napad', weszlismy do banku celujac we wszystkich obecnych i wszystkie obecne.\n" +
                "Bill zdobyl klucze od jednego z bankierow obijajac mu twarz lufa od karabinu i zgrabnie rzucil je do Karen ktora bez wahania otworzyla wejscie za lady. Z kopniaka uderzyles te drzwi, a te stanely otworem, wchodzac na zaplecze,\n" +
                "zlapales za szyje bankiera ktory jeszcze stal na nogach i cisnales nim o sciane rozkazujac mu otwierac sejf. Klienci sterroryzowani, pracownicy tak samo. Bankier z lufa przy skroni coraz szybciej przekrecal zamek.\n" +
                "Celowales w jego skron myslac o calej reszcie planu, w tym momencie Javier i Sean wyszli bocznym wyjsciem zachodzac na tyly banku na wypadek szybkiej reakcji szeryfa. Jednak na razie wszystko szlo jak po masle.\n" +
                "Reszta ekipy sprawowala caly czas kontrole nad ludzmi, kiedy nagle otworzyl sie sejf. Buchnales kolba rewolweru w twarz bankiera, jego nos wydal skrzekotliwy trzask po czym poplynal struga krwi, a sam bankier stracil przytomnosc.\n" +
                "Wchodzac do sejfu zobaczyles 4 pancerne szafy kazda z zamkiem na szyfr. Przylozyles ucho do kazdej po kolei i zaczales je uwaznie otwierac szukajac prawidlowej kombinacji nasluchujac charakterystycznego cyk!\n" +
                "W tym czasie pod glownymi drzwiami banku zaczelo zbierac sie duzo ludzi w tym ludzie szeryfa i glowne wyjscie zostalo odciete. Zamki szaf opancerzonych zaczely puszczac, a dlonmi zbierales pospiesznie pliki gotowki do workow.\n" +
                "Lenny obrabowal juz wszystkie skrytki, naszla pora zeby sie wynosic zanim szeryf i reszta jego ludzi wejdzie tu sila. W tym momencie Javier i Sean podlozyli na tylach banu ladunki wybuchowe, lont dynamitu swiszczal zaparczywie.\n" +
                "W koncu ceglana sciana stala sie tylko wspomnieniem ktorego wspomnienia rozrzucone spadaly na ziemie. Z pylu i dymu opadajacym po wybuchu wyszlismy my z workami wypchanymi gotowka. Szeryf i jego ludzie zdazyli w tym czasie konmi podjechac na tylt banku.\n" +
                "Tak zaczal sie poscig i strzelanie uciekajac na koniach w strone zachodu slonca ociekajacego zwyciestwem. Paru dostalo w aorty, klatki piersiowe chyba jednego czaszke kula przeszyla na wylot.\n" +
                "Gdy zostalo ich juz nie wielu musielismy sie rozdzielic aby zatrzec trop, na mojej muszcze spoczywal jeden z 3 ktorzy pojechali za mna.");
        player.setHP(fight.Fight1(3, player.getHP(), player.getFirearmDamage()));
        System.out.println("Strzelajac ostatniemu wrogowi w brzuch chowasz rewolwer, widzac jak zsuwa sie z siodla, a jego wciaz pedzacy kon zmienia trase znikajac gdzies miedzy drzewami.\n" +
                "Zwalniasz i orientujac sie gdzie cie wywialo, zaczynasz kierowac sie w strone obozu gangu.\n\n" +
                "Docierasz w koncu do obozu, caly gang i oboz spowity radoscia w akompaniamencie stukotu flaszek, gry instrumentow i radosnych spiewow oraz tancow. Tak koncy sie ten dzien, a ty kladziesz sie do lozka z usmiechem na twarzy.\n\n" +
                "Nadchodzi kolejny dzien...\n----Zarobione pieniadze z napadu po rozdzieleniu na czlonkow gangu: 230$----");
        banditNum += 1;
        bankMoney = player.getMoney() + 230;
        player.setMoney(bankMoney);
        valentine.bankIdea = false;
        gangWTD(player, valentine, ctrawberry, indian);
    }

    public void carriagesSteal(Player player, Valentine valentine, Ctrawberry ctrawberry, WapitiIndianReservation indian){
        System.out.println("Zabierasz ze soba niezbedny sprzet i pod oslona nocy zmierzasz na koniu do Valentine. Miasto wydaje sie uspione, a sprychy wozow lsnia w blasku ksiezyca. Konie spia przywiazane do plotu, a rozgladajac sie nigdzie nie widzisz pilnujacego woznicy.\n" +
                "Zostawiasz swojego konia na tylach sklepu wielobranzowego i zagradajac sie odwiazujesz konie, lekko je klepiac budzisz je ze snu i wzbudzajac zaufanie dajesz kazdemu pare ciasteczek, ktore za chwile beda dzialac jako cukrowe nitro przy ucieczce.\n" +
                "Rozgladasz sie jeszcze raz miedzy konmi i plotem patralujac okolice czy, aby na pewno nikt cie nie obserwuje. Po chwili stwierdzasz ze nie i spokojnie wsiadasz na woz oczami lapiac juz lejce...\n" +
                "Nagle slyszysz cieniutki niczym dziewczecy, lecz zalamujacy sie ton glosu ewidentie dziecka: 'Haloo! Pomocy! Zlodziej! Zlodziej!'\n" +
                "Wskakujac w pospiechu na woz zauwazasz ze to co najwyzej 11letni chlopiec, dostrzegasz tez katem oka zapalajace sie swiatlo w paru oknach domostw. Musisz decydowac szybko: Zastrzel chlopaka i ucieknij(1) lub uciekaj czym predzej(2)");
        boyLifeChoice = in.nextInt();
        if(boyLifeChoice == 1){
            System.out.println("Patrzysz na mlode lico napinajac kurek w rewolwerze i powoli wysuwajac go z kabury. Nagle slyszysz swist i...\n...\nwszystko stalo sie ciemne...\nslyszysz glos\n'Zabila cie kometa, kto to pomyslal zabijac dzieci?!'\n\n" +
                    "Game Over *---najwyrazniej chlopak mial jakas Boska opieke--*");
            System.exit(0);
        }else if(boyLifeChoice == 2){
            System.out.println("Czym predzej odwracasz od niego wzrok, kierujac go w strone drogi ktora bedziesz uciekac. Dynamicznie uderzasz lejcami a konie niczym na wyscigu zwrywaja sie do ucieczki. Nagle slyszysz huk.\n" +
                    "Katem oka widzisz jak krew trysnela z twojego ramienia, dzieki adrenalinie na razie poczules tylko przeszywajacy ogien rozpierajacy twoje ramie... jak na razie. Odwracasz glowe przez bark, aby zobaczyc kto mial takiego cela\n" +
                    "Tam stoi tylko ten 11 letni chlopiec, wymachujacy do ciebie srodkowym palcem znad dymu unoszacego sie z lufy rewolweru ktory trzyma w drugiej rece. Pedzisz jednak dalej przed siebie syczac miedzy zacisnietymi zebami przeklenstwami.");
            System.out.println("---");
            banditNum += 1;
            valentine.carriagesIdeaV = false;
            health = player.getHP() - 15;
            if(health <= 0){
                System.out.println("Mialej malo zycia, a cios chlopca okazal sie decydujacy\n\n*--Game Over--*");
                System.exit(0);
            }else {
                player.setHP(health);
                valentine.carriagesIdeaV = false;
                player.carriagesNum += 1;
                System.out.println("Zycie spadlo o 15hp");
                System.out.println("Udalo Ci sie ukrasc woz, mozesz teraz poszukac miejsca, aby go sprzedac");
                gangWTD(player, valentine, ctrawberry, indian);
            }
        }
    }

    public void carriagesSteal2(Player player, Valentine valentine, Ctrawberry ctrawberry, WapitiIndianReservation indian){
        System.out.println("Zabierasz ze soba niezbedny sprzet i pod oslona nocy zmierzasz na koniu do Valentine. Miasto wydaje sie uspione, a sprychy wozow lsnia w blasku ksiezyca. Konie spia przywiazane do plotu, a rozgladajac sie nigdzie nie widzisz pilnujacego woznicy.\n" +
                "Zostawiasz swojego konia na tylach sklepu wielobranzowego i zagradajac sie odwiazujesz konie, lekko je klepiac budzisz je ze snu i wzbudzajac zaufanie dajesz kazdemu pare ciasteczek, ktore za chwile beda dzialac jako cukrowe nitro przy ucieczce.\n" +
                "Rozgladasz sie jeszcze raz miedzy konmi i plotem patralujac okolice czy, aby na pewno nikt cie nie obserwuje. Wsiadasz na woz i uderzajac z impetem lejcami zachecach konie do galopu. Wyjezdzajac ze Strawberry pedzisz juz bez opamietania\n" +
                "Po dlugiej podrozy w blasku ksiezyca w koncu dojezdzasz do obozu gangu cieszac sie swoja zdobycza");
        System.out.println("---");
        ctrawberry.carriagesIdeaC = false;
        banditNum += 1;
        player.carriagesNum += 1;
        System.out.println("Udalo Ci sie ukrasc woz, mozesz teraz poszukac miejsca, aby go sprzedac");
        gangWTD(player, valentine, ctrawberry, indian);
    }
}
