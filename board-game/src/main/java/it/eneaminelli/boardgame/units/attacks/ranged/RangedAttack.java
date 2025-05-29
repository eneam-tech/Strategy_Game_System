package it.eneaminelli.boardgame.units.attacks.ranged;

import it.eneaminelli.boardgame.units.attacks.AttackBehavior;

public class RangedAttack implements AttackBehavior{
    
    /**
     * Performs a ranged attack with the specified damage value.
     * This method simulates the action by printing a message to the console.
     *
     * @param damage the amount of damage dealt by the attack
     */
    @Override
    public void performAttack(int damage){
        System.out.println("Attacked ranged for " + damage + " damage.");
    }
}
