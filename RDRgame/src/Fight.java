import java.util.Scanner;

public class Fight {
    private volatile boolean countdownFinished = false;
    private volatile int count = 0;

    Scanner in = new Scanner(System.in);
    public int Fight1(int enemyNum, int heroLife, int heroFirearm) {
        System.out.println("Liczba przeciwnikow do pokonania: " + enemyNum);
        int enemyLife = 0;
        int damageGet;
        for (int i = 1; i <= enemyNum; i++) {
            enemyLife = (int) Math.round(55 + (Math.random() * (70 - 55)));
            int obrona = 3;
            while (enemyLife > 0 && heroLife > 0) {
                System.out.println("\n\n--------------------\nEnemy life: " + enemyLife);
                System.out.println("\nYour life: " + heroLife);
                System.out.println("\nYour firearm damage: " + heroFirearm);
                System.out.println("\n\nCo chcesz zrobic?\nAtak(1)\nObrona(2)");
                int fightChoose = in.nextInt();
                if (fightChoose == 1) {
                    int damageDid = (int) Math.round(5 + (Math.random() * (heroFirearm - 5)));
                    enemyLife -= damageDid;
                    damageGet = (int) Math.round(5 + (Math.random() * (15 - 5)));
                    heroLife -= damageGet;
                } else if (fightChoose == 2) {
                    damageGet = (int) Math.round(2 * Math.random());
                    heroLife -= damageGet;
                    if (obrona > 0) {
                        int heal = (int) Math.round(10 * Math.random());
                        heroLife +=heal;
                        obrona--;
                        if(obrona ==  0){
                            System.out.println("Wykorzystales juz wszystkie regenerowania");
                        }else{
                            System.out.println("Zostalo Ci jeszcze " + obrona + "zregenerowan zycia");
                        }
                    }else{
                        System.out.println("Wykorzystales juz wszystkie regenerowania");
                    }
                }
                if(enemyLife <= 0){
                    System.out.println("Gratulacje pokonales przeciwnika");
                }else if(heroLife <= 0){
                    System.out.println("\n\n\n*Game Over -Przegrales zostales zabity-*");
                    System.exit(0);
                }
            }
        }
        return heroLife;
    }

        public void FightLion(){

        System.out.println("*--Pedzi na ciebie wlasnie olbrzymi lew, a decyzje ktore podejmujesz dzieja sie w ulamku sekund--*");
        System.out.println("Strzelaj szybko bo skonczy Ci sie czas");
        System.out.println("Lew zaczyna biec, odliczanie rozpoczete...");
        System.out.print("(1) Strzelaj!!!\n\n");

        Thread countdownThread = new Thread(() -> {
            try {
                for (int i = 15; i >= 0; i--) {
                    System.out.println("Czas do smierci: " + i + "s");
                    Thread.sleep(1000);
                }
                System.out.println("Czas uplynal!");
                System.out.println("Ostre pazury wbijaja sie w twoja klatke piersiowa i jeszcze przez chwile czujesz jak lew rozrywa twoje wnetrznosci zywcem, a z twojej tentnicy szyjnej sika krew.\n\n*Game Over -Zabil Cie lew-*");
                countdownFinished = true;
                System.exit(0);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        countdownThread.start();

        while (!countdownFinished) {
            int input = in.nextInt();
            if (input == 1) {
                count++;
                if (count >= 5) {
                    System.out.println("Ostatni pocisk przeszyl pysk tego przerosnietego kota, potwor lezy, a ty czujesz jak po twojej skroni splywa pot, adrenalina spada diametralnie w dol z kazdym kolejnym oddechem, ale przezyles i to najwazniejsze.");
                    countdownThread.interrupt();
                    return;
                }
            }
        }
    }
}
