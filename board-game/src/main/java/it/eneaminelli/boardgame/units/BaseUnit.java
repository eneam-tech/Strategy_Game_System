package it.eneaminelli.boardgame.units;

import it.eneaminelli.boardgame.board.Cell;
import it.eneaminelli.boardgame.units.attacks.AttackBehavior;

/**
 * Abstract class representing a generic unit in the board game.
 * This class encapsulates basic unit attributes like health, position, 
 * movement, and combat-related values. It uses the Strategy pattern 
 * to delegate attack behavior.
 */
public abstract class BaseUnit {

    /** Current health of the unit */
    private String unitName; 
    
    /** Current health of the unit */
    private int health; 
    
    /** Position of the unit on the board */
    private Cell position;
    
    /** Number of movement points available to the unit */
    private int movementPoints;
    
    /** Defensive capability of the unit */
    private int defenceValue;
    
    /** Offensive capability of the unit */
    private int attackValue;
    
    /** Strategy pattern for attack behavior */
    private AttackBehavior attackBehavior;
    
    /**
     * Constructs a BaseUnit with a specific attack behavior.
     *
     * @param attackBehavior the behavior this unit will use when attacking
     */
    public BaseUnit(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;

    }
    
    public String getUnitName() {
        return unitName;
    }
    
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * Gets the unit's current health.
     *
     * @return the current health value
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets the unit's current position.
     *
     * @return the cell representing the unit's position
     */
    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position){
        this.position = position;
        position.setOccupyingUnit(this);
        position.setIsOccupied(true);
    }

    /**
     * Gets the number of movement points.
     *
     * @return the movement points available
     */
    public int getMovementPoints() {
        return movementPoints;
    }

    /**
     * Gets the defensive value of the unit.
     *
     * @return the defense value
     */
    public int getDefenceValue() {
        return defenceValue;
    }

    /**
     * Executes the unit's attack behavior with the specified attack value.
     *
     * @param attackValue the value of the attack to perform
     */
    public void attack(int attackValue){
        attackBehavior.performAttack(attackValue);
    }

    /**
     * Placeholder method for defend behavior.
     * Intended to be overridden by subclasses if needed.
     */
    public void defend(){};

    /**
     * Placeholder method for movement behavior.
     * Intended to be overridden by subclasses if needed.
     */
    public void move(){};
}
