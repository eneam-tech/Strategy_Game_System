package it.eneaminelli.boardgame.units.attacks;

/**
 * Strategy interface for defining different types of attack behaviors
 * that units can perform in the board game.
 *
 * This is part of the Strategy Design Pattern and allows different units
 * to use different attack implementations at runtime.
 */
public interface AttackBehavior {

    /**
     * Performs an attack with the given damage value.
     *
     * @param damage the amount of damage to inflict
     */
    void performAttack(int damage);
}
