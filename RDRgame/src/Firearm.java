public class Firearm extends Weapon{
    int condition;

    public Firearm(String name, int damage, int condition) {
        super(name, damage);
        this.condition = condition;
    }

    public void setFirearmDamage(Player player){
        player.firearmDamage = damage;
    }
}
