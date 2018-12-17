package com.microsoft.samples;

import com.microsoft.samples.subpackage.Person;
import org.apache.commons.lang3.StringUtils;

/**
 * Hero is the main entity we will be using to something
 *
 * @author Captain America
 */
public class SuperHero extends Person {

    /**
     * The public name of a hero that is common knowledge
     */
    private String heroName;
    private String uniquePower;
    private int health;
    private int defense;

    public final String SOME_PUBLIC_STRING = "So important string value";

    /**
     * <p>This is a simple description of the method. . .
     * <a href="http://www.supermanisthegreatest.com">Superman!</a>
     * </p>
     *
     * @param incomingDamage the amount of incoming damage
     * @return the amount of health hero has after attack
     * @throws IllegalArgumentException if incomingDamage is negative
     * @version 1.2
     * @see <a href="http://www.link_to_jira/HERO-402">HERO-402</a>
     * @since 1.0
     * @deprecated As of version 1.1, use . . . instead
     */
    public int successfullyAttacked(int incomingDamage, String damageType) throws Exception {
        // do things
        if (incomingDamage < 0) {
            throw new IllegalArgumentException("Cannot cause negative damage");
        }
        return 0;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    /**
     * Get capitalized last name. But it's not the end,
     * because of multiline comment
     *
     * @return lastName in uppercase. But it's not the end,
     * because of multiline comment
     */
    @Override
    public String getLastName() {
        return StringUtils.upperCase(super.getLastName());
    }

    public String getUniquePower() {
        return uniquePower;
    }

    public void setUniquePower(String uniquePower) {
        this.uniquePower = uniquePower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
