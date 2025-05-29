package it.eneaminelli.boardgame.units.attacks.melee;

import it.eneaminelli.boardgame.units.attacks.AttackBehavior;

/**
 * Concrete implementation of {@link AttackBehavior} that defines
 * the behavior for melee attacks.
 *
 */
public class MeleeAttack implements AttackBehavior {

    /**
     * Executes a melee attack, outputting the amount of damage dealt.
     *
     * @param damage the amount of damage to inflict with the melee attack
     */
    @Override
    public void performAttack(int damage) {
        System.out.println("Attacked melee for " + damage + " damage.");
    }
}
