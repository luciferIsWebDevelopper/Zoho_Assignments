public class WizardAndWarriors {

    public static void main(String[] args) {
        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);

        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);

        GameMaster gameMaster = new GameMaster();

        System.out.println(gameMaster.describe(character));
        System.out.println(gameMaster.describe(destination));
        System.out.println(gameMaster.describe(TravelMethod.HORSEBACK));
        System.out.println(gameMaster.describe(character, destination, TravelMethod.HORSEBACK));
        System.out.println(gameMaster.describe(character, destination));
    }
}

class Character {
    private String characterClass;
    private int level;
    private int hitPoints;

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}

class Destination {
    private String name;
    private int inhabitants;

    public void setName(String name) {
        this.name = name;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public String getName() {
        return name;
    }

    public int getInhabitants() {
        return inhabitants;
    }
}

enum TravelMethod {
    WALKING, HORSEBACK
}

class GameMaster {

    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() +
               " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " +
               destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod travelMethod) {
        if (travelMethod == TravelMethod.WALKING) {
            return "You're traveling to your destination by walking.";
        } else if (travelMethod == TravelMethod.HORSEBACK) {
            return "You're traveling to your destination on horseback.";
        }
        return "";
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}