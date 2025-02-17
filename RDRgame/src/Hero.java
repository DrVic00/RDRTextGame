public abstract class Hero {
    String name;
    int hp;
    int damage;
    boolean indiansLove;
    boolean white;
    int firearmDamage;
    int money;
    int carriagesNum;

    public Hero(String name, int hp, int damage, boolean indiansLove, boolean white, int firearmDamage, int money, int carriagesNum) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.indiansLove = indiansLove;
        this.white = white;
        this.firearmDamage = firearmDamage;
        this.money = money;
        this.carriagesNum = carriagesNum;
    }

    public void showInfo() {
        System.out.println("\nMy name is: " + name);
        System.out.println("Some character details: ");
        System.out.println("HP: " + hp);
        System.out.println("Fist damage: " + damage);
        System.out.println("Firearm damage: " + firearmDamage);
        if (indiansLove) {
            System.out.println("Indiani mnie lubia");
        } else {
            System.out.println("Indianie mnie nie lubia");
        }
        if (white) {
            System.out.println("Stroze prawa nie sa do mnie uprzedzeni :)");
        } else {
            System.out.println("Stroze prawa sa do mnie uprzedzeni :(");
        }
    }

    public void roomShowInfo() {
        System.out.println("My name is: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Fist damage: " + damage);
        System.out.println("Firearm damage: " + firearmDamage);
        System.out.println("Money i have: " + money);
        if (indiansLove) {
            System.out.println("Indiani mnie lubia");
        } else {
            System.out.println("Indianie mnie nie lubia");
        }
        if (white) {
            System.out.println("Stroze prawa nie sa do mnie uprzedzeni :)");
        } else {
            System.out.println("Stroze prawa sa do mnie uprzedzeni :(");
        }
    }
}
