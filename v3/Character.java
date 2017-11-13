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
    String name; //name of protagonist defined by constructor
    int HP; //health points
    int atk; //attack; determines damage dealt
    int def; //defense; determines damage taken
    double attackRating; //attack modifier
    
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
	smaug.lowerHP(dmg);
	return dmg;
    }
}
