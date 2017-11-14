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

//The Vagabond is a resourceful jack-of-all-trades.
//Average attack, average defense, high HP.
//"Specialize" heals HP, but lowers attack until Normalize.

public class Vagabond extends Protagonist {
	
    public Vagabond(String s){
        name = s; //takes name input
		HP = 110;
		atk = 70;
		def = 70;
		attackRating = 0.4;
    }
    
    public void specialize() {
		HP += 25;
		def /= 2;
	}
	
	public void normalize() {
		def = 70;
	}
	
	public String about() {
		return "The Vagabond is a resourceful jack-of-all-trades. Average attack, average defense, high HP. Specialize heals HP, but lowers attack until Normalize.";
	}
	
}
