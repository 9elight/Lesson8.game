package Players;

import Boss.Boss;

public class Magical extends Hero {
    public Magical(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length;i++){
            if (heroes[i] != heroes[1]){
            heroes[i].setDamage(15);
            heroes[i].setDamage(heroes[i].getDamage() + 10);}
        }
    }
}
