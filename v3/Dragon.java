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

//The Dragon is a scaled beast that breathes flame - but, in this game, he's more bite than bark.
//Low HP, Low DEF, High ATK.

public class Dragon extends Monster {
	
	public Dragon () { //constructor
		name = "Ye olde dragon";
		HP = 80;
		atk = randRange(60, 100);
		def = 10;
		attackRating = 1;
	}
    
	public String about() {
		return "The Dragon is a scaled beast that breathes flame - but, in this game, he's more bite than bark. Low HP, Low DEF, High ATK.";
	}
}