package Players;

import Boss.Boss;

import java.util.Random;

public class Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {

        Random r = new Random();
        int randomCrit = r.nextInt(2) + 2;
        heroes[3].setDamage(getDamage() * randomCrit);
    }
}
