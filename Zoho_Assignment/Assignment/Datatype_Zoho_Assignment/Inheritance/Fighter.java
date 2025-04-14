abstract class Fighter {
    abstract boolean isVulnerable();
    abstract int getDamagePoints(Fighter opponent);
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter opponent) {
        if (opponent.isVulnerable()) {
            return 10;
        }
        return 6;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int getDamagePoints(Fighter opponent) {
        if (spellPrepared) {
            return 12;
        }
        return 3;
    }
}

class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        System.out.println(warrior.toString());
        System.out.println(wizard.toString());

        System.out.println("Warrior is vulnerable: " + warrior.isVulnerable());
        System.out.println("Wizard is vulnerable: " + wizard.isVulnerable());

        wizard.prepareSpell();
        System.out.println("Wizard is vulnerable after preparing spell: " + wizard.isVulnerable());

        System.out.println("Warrior attacks Wizard: " + warrior.getDamagePoints(wizard));
        System.out.println("Wizard attacks Warrior: " + wizard.getDamagePoints(warrior));
    }
}
