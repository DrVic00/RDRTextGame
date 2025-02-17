import java.util.Scanner;

public class Player extends Hero{
    int beauty;
    int huntskill;
    Scanner in = new Scanner(System.in);
    public Player(String name, int hp, int damage, boolean indiansLove, boolean white, int firearmDamage, int money, int beauty, int huntskill, int carriagesNum) {
        super(name, hp, damage, indiansLove, white, firearmDamage, money, carriagesNum);
        this.beauty = beauty;
        this.huntskill = huntskill;

    }

    @Override
    public void showInfo(){
        super.showInfo();
    }

    public int getHP(){
        return hp;
    }

    public int getFirearmDamage(){
        return firearmDamage;
    }

    public int getMoney(){
        return money;
    }

    public void setHP(int hp){
        this.hp = hp;
    }

    public void setMoney(int money){
        this.money = money;
    }
}
