public class PlayerNoChance extends Hero{
    boolean noChance;
    public PlayerNoChance(String name, int hp, int damage, boolean indiansLove, boolean white, boolean noChance, int firearmDamage, int money, int carriagesNum) {
        super(name, hp, damage, indiansLove, white, firearmDamage, money, carriagesNum);
        this.noChance = noChance;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("########----Cichy glos w glowie mowi Ci ze to moze byc ktotka przygoda----#########");
    }
}
