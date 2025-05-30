package it.eneaminelli.boardgame.units;

import it.eneaminelli.boardgame.units.attacks.ranged.RangedAttack;

/**
 * A concrete implementation of {@link BaseUnit} that represents a ranged combat unit.
 * This unit is hardcoded to use {@link RangedAttack} as its attack behavior.
 */
public class RangedUnit extends BaseUnit {

    /**
     * Constructs a RangedUnit with a {@link RangedAttack} behavior.
     * This ensures that all instances of RangedUnit will use ranged attacks.
     */
    public RangedUnit() {
        super(new RangedAttack());
        setUnitName("Ranged Unit");
    }

    /**
     * Main method to test the RangedUnit behavior.
     * Creates a RangedUnit and performs a sample attack with 50 damage.
     *
     */
    public static void main(String[] args) {

    }

}
