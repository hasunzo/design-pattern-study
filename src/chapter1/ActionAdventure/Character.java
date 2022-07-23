package chapter1.ActionAdventure;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {

    }

    public abstract void fight();
    public void attack() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
