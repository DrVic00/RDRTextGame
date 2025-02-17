public class SadieAdler {
    Fight fight = new Fight();
    public void quote(){
        System.out.println("\uD835\uDE15\uD835\uDE30\uD835\uDE23\uD835\uDE30\uD835\uDE25\uD835\uDE3A'\uD835\uDE34 \uD835\uDE35\uD835\uDE22\uD835\uDE2C\uD835\uDE2A\uD835\uDE2F\uD835\uDE28 \uD835\uDE2F\uD835\uDE30\uD835\uDE35\uD835\uDE29\uD835\uDE2A\uD835\uDE2F\uD835\uDE28 \uD835\uDE27\uD835\uDE33\uD835\uDE30\uD835\uDE2E \uD835\uDE2E\uD835\uDE26 \uD835\uDE26\uD835\uDE37\uD835\uDE26\uD835\uDE33 \uD835\uDE22\uD835\uDE28\uD835\uDE22\uD835\uDE2A\uD835\uDE2F.");
    }

    public void sadieFirstSteps(Player player){
        System.out.println("Wychodzisz wlasnie z saloonu w Rhodes po rozegraniu swietnej parti pokera, Sadie kroczy do swojego konia i juz ma na niego wsiadac, kiedy za nia staje dwoch mezczyzn.\n" +
                "Obraca sie i widzi przegranych w pokera, rzuca im przytyk droczac sie z nimi na temat ich przegranej, lecz Ci mowiac do niej obzydliwe komentarze lapia ja za biodra i zaczynaja sie do niej przystawiac.\n" +
                "Wtedy Sadie sprzedaje kazdemu po policzku i ostrzega zeby sie spieprzali gdzie pieprz rosnie. Ci sa jednak bardzo pewni siebie i zirytowani i zdenerwowani wyciagaja rewolwery grozac Ci chyba ze wypelnisz ich zboczone wole.\n" +
                "Bez wahania wyciagajac rewolwer kopiesz jednego w jaja po czym chowasz sie za najblizsza sciana budynku i wychylasz do strzalu.");
        fight.Fight1(2, 150, player.firearmDamage);
        System.out.println("Pokonujesz jednego i drugiego na finisz strzelajac im jeszcze w krocze. Syczac przez zeby jakimi swiniami nie sa odjezdzasz na koniu w dzika dal. Mowiac sobie ze predko nie zagoscisz w tym chorym miescie,\n" +
                "wiesz ze jest wiele ciekawszych miejsc spogladajac na mape: \n");
    }
}
