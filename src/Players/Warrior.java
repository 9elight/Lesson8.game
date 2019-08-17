package Players;

import Boss.Boss;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {

        heroes[1].setDamage(heroes[1].getDamage()+boss.getDamage());
    }
}
