public class Hunt {
    int randomFind;
    int randomHunt;
    boolean hunted;


    public void hunting(Player player, boolean smell) {
        randomFind = (int)Math.round(10 * Math.random());
        if(randomFind <=2){
            System.out.println("Szukales dlugo, jednak nic dzis nie udalo Ci sie upolowac");
        } else if (randomFind <=4) {
            System.out.println("Szukales dlugo, udalo Ci sie znalezc jedynie mala zwierzyne");
            huntShoot(smell);
            if(hunted){
                System.out.println("Zwierzyne zabierasz do miasta tam czesc jej odkrawasz i przyrzadzasz do spozycia. Reszte sprzedasz rzeznikowi");
                System.out.println("----Money increased by 5----");
                player.money += 5;
            }else{
                System.out.println("Wracasz do miasteczka z pustymi rekoma");
            }
        } else if (randomFind <=8) {
            System.out.println("Szukales i znalazles, przed twoimi oczyma jest srednich rozmiarow zwierzyna");
            huntShoot(smell);
            if(hunted){
                System.out.println("Zwierzyne zabierasz do miasta tam czesc jej odkrawasz i przyrzadzasz do spozycia. Reszte sprzedasz rzeznikowi");
                System.out.println("----Money increased by 15----");
                player.money += 15;
            }else{
                System.out.println("Wracasz do miasteczka z pustymi rekoma");
            }
        }else {
            System.out.println("Szukales bardzo dlugo i sie oplacilo przed twoimi oczyma widzisz piekna, okazala, duza zwierzyne");
            huntShoot(smell);
            if(hunted){
                System.out.println("Zwierzyne zabierasz do miasta tam czesc jej odkrawasz i przyrzadzasz do spozycia. Reszte sprzedasz rzeznikowi");
                System.out.println("----Money increased by 30----");
                player.money += 30;
            }else{
                System.out.println("Wracasz do miasteczka z pustymi rekoma");
            }
        }
    }

    public void huntShoot(boolean smell){
        System.out.println("Zaczynasz polowanie...\n\n");
        randomHunt = (int)Math.round(10 * Math.random());
        if(smell){
            if(randomHunt >= 3){
                System.out.println("Udalo Ci sie upolowac to zwierze");
                hunted = true;
            }else{
                System.out.println("Mimo zapachu zwierzyna ucieka, musiala miec bardzo czuly nos");
                hunted = false;
            }
        }else{
            if(randomHunt > 5){
                System.out.println("Udalo Ci sie upolowac to zwierze");
                hunted = true;
            }else{
                System.out.println("Zwierzyna wyczula twoja obecnosc i zaczela uciekac, polowanie nie udane");
                hunted = false;
            }
        }
    }
}
