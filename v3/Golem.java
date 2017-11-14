//   ______ _       _     _   _              ______                                        
//   |  ___(_)     | |   | | (_)             |  _  \                                       
//   | |_   _  __ _| |__ | |_ _ _ __   __ _  | | | |_ __ ___  __ _ _ __ ___   ___ _ __ ___ 
//   |  _| | |/ _` | '_ \| __| | '_ \ / _` | | | | | '__/ _ \/ _` | '_ ` _ \ / _ \ '__/ __|
//   | |   | | (_| | | | | |_| | | | | (_| | | |/ /| | |  __/ (_| | | | | | |  __/ |  \__ \
//   \_|   |_|\__, |_| |_|\__|_|_| |_|\__, | |___/ |_|  \___|\__,_|_| |_| |_|\___|_|  |___/
//             __/ |                   __/ |                                               
//            |___/                   |___/        
//APCS1 pd8
//HW31 - Ye Olde Role Playing Game, Expanded
//2017-11-13

//The Golem is a hulking construct made of stone -
//but once you pierce its tough exterior, you'll find it's rather frail.
//Low HP, Low ATK, High DEF.

public class Golem extends Monster {
	
	public Golem () { //constructor
		name = "Ye olde golem";
		HP = 80;
		atk = randRange(20, 40);
		def = 35;
		attackRating = 1;
	}
    
	public String about() {
		return "The Golem is a hulking construct made of stone - but once you pierce its tough exterior, you'll find it's rather frail. Low HP, Low ATK, High DEF.";
	}
}