package game;

import Boss.Boss;
import Players.*;

public class RpgGame {

    public static void startGame() {
        Boss boss = new Boss(550, 35);
        Hero[] heroes = getHeroesArray();
        while (!isFinished(heroes, boss)) {
            round(heroes, boss);
        }

    }

    private static void round(Hero[] heroes, Boss boss) {
        heroesUseSuperPower(heroes, boss);
        showStatistics(heroes, boss);

        BossHit(heroes, boss);
        heroesHit(heroes, boss);


    }

    private static boolean isFinished(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!!");
            return true;
        }
        boolean allHeroesDied = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDied = false;
                break;
            }
        }
        if (allHeroesDied) {
            System.out.println("Boss Won!!");
        }

        return allHeroesDied;

    }

    private static Hero[] getHeroesArray() {

        Hero[] heroes = {
                new Magical(100, 15),
                new Warrior(130, 15),
                new Medical(100, 0),
                new Berserk(130, 15)};

        return heroes;
    }


    private static void BossHit(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
        }
    }

    private static void heroesHit(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }
    }

    private static void showStatistics(Hero[] heroes, Boss boss) {
        System.out.println("_________Здоровье______________");
        System.out.println("Boss health " + boss.getHealth());
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Health " + heroes[i].getClass().getSimpleName() + " = " + heroes[i].getHealth());
        }
        System.out.println("__________Урон_____________");
        for (int i = 0; i < heroes.length; i++) {

            System.out.println("Урон " + heroes[i].getClass().getSimpleName() + " = " + heroes[i].getDamage());
        }
        System.out.println("_______________________");
    }

    private static void heroesUseSuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].useSuperPower(heroes, boss);

            }
        }
    }


}


