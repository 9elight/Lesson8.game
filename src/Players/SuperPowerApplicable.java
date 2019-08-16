package Players;

import Boss.Boss;

import java.util.function.BooleanSupplier;

public interface SuperPowerApplicable {
    void useSuperPower(Hero[] heroes, Boss boss);
}
