//   ______ _       _     _   _              ______                                        
//   |  ___(_)     | |   | | (_)             |  _  \                                       
//   | |_   _  __ _| |__ | |_ _ _ __   __ _  | | | |_ __ ___  __ _ _ __ ___   ___ _ __ ___ 
//   |  _| | |/ _` | '_ \| __| | '_ \ / _` | | | | | '__/ _ \/ _` | '_ ` _ \ / _ \ '__/ __|
//   | |   | | (_| | | | | |_| | | | | (_| | | |/ /| | |  __/ (_| | | | | | |  __/ |  \__ \
//   \_|   |_|\__, |_| |_|\__|_|_| |_|\__, | |___/ |_|  \___|\__,_|_| |_| |_|\___|_|  |___/
//             __/ |                   __/ |                                               
//            |___/                   |___/                                                
//Adrian Kloskowski
//APCS1 pd8
//HW30 - Ye Olde Role Playing Game, Improved
//2017-11-10

public class Character {
    protected String name; //name of protagonist defined by constructor
    protected int HP; //health points
    protected int atk; //attack; determines damage dealt
    protected int def; //defense; determines damage taken
    protected double attackRating; //attack modifier
    
    public boolean isAlive() { //returns boolean indicating living or dead
	return HP > 0;
    }
    public int getDefense() { //returns value of def attribute
	return def;
    }
    public String getName() { //returns value of name attribute
	return name;
    }
    public void lowerHP(int i) { //takes an int parameter, decreases life attribute by that amount
	HP -= i;
    }
	
    public int attack(Character smaug) {
	int dmg = (int) (atk*attackRating)-smaug.getDefense();
	if (dmg < 0) {
	    dmg = 0;
	}
	smaug.lowerHP(dmg);
	return dmg;
    }
	
	public String about() {
		return "This is a nondescript character. Wow!";
	}
}
