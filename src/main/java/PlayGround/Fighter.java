package PlayGround;

import java.util.Objects;

public class Fighter {
    private final int MAX_HEALTH = 100;

    private int health;

    private String name;

    protected int strength;

//    private String weaponName;
//    private int weaponDamage;

//    private Weapon currentWeapon;

    public Fighter() {
        this.name = "Unknown fighter";
        health = MAX_HEALTH;
        strength = 10;
    }

    public Fighter(String name) {
        this.name = name;
        health = 100;
        strength = 10;
    }

    public Fighter(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String toFileString(){
        return String.format("%s,%d,%d", name, health, strength);
    }

    //method looks weird when we expect fighter objects, but this special method is really useful to make
    // a bunch of fighters from a string: called a builder method
    public static Fighter fromFileString(String fileString){
        //file format is name,health,strength
        String [] pieces = fileString.split(","); //just like split in JS
        Fighter fighter = new Fighter(pieces[0]);
        fighter.setHealth(Integer.parseInt(pieces[1]));
        fighter.setStrength(Integer.parseInt(pieces[2]));
        return fighter;
    }

    //defining equals to use in the collections lecture
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //this compares memory addresses
        if (o == null || getClass() != o.getClass()) return false; //this compares the classes/data types
        Fighter fighter = (Fighter) o; //has to convert/cast the object parameter to an actual fighter
        return name.equals(fighter.name); //this compares the name strings
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // the fighter this is called on hits the otherFighter
    public void hit(Fighter otherFighter) {
        //  + currentWeapon.getDamage())
        int otherHealth = otherFighter.getHealth();
//        otherHealth -= (strength + currentWeapon.getDamage());
        otherHealth -= strength;
        otherFighter.setHealth(otherHealth);
    }

    public void taunt() {
        System.out.println("Your mama wears combat boots!");
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", strength=" + strength +
//                ", currentWeapon=" + currentWeapon +
                '}';
    }
    // accessors
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
//    public Weapon getCurrentWeapon() {
//        return currentWeapon;
//    }
//    public void setCurrentWeapon(Weapon currentWeapon) {
//        this.currentWeapon = currentWeapon;
//    }
}
