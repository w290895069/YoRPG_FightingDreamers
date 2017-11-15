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

//The Bastion is a walking tank, clad in heavy armor.
//High HP, High DEF, low ATK.
//"Specialize" increases DEF and lowers ATK.

public class Bastion extends Protagonist {
    
    public Bastion(String s){
        name = s; //takes name input
		HP = 110;
		atk = 40;
		def = 110;
		attackRating = 0.4;
    }
    
    public void specialize() {
		atk /= 2;
		def *= 2;
	}
	
	public void normalize() {
		atk = 40;
		def = 110;
	}
    
	public String about() {
		return "The Bastion is a walking tank, clad in heavy armor. High HP, High DEF, low ATK. Specialize increases DEF and lowers ATK.";
	}
}