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
//HW28 - Ye Olde Role Playing Game
//2017-11-08

public class Monster extends Character {
    
	int randRange(int min, int max) { //I honestly don't know why this isn't just a part of Java. I'm so exhausted.
		int range = (max - min) + 1;     
		return (int)(Math.random() * range) + min;
	}
	
	public Monster () { //constructor
		name = "Ye olde monster";
		HP = 150;
		atk = randRange(21,65);
		def = 20;
		attackRating = 1;
	}
}
