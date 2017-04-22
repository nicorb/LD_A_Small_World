package character.player;

import java.util.ArrayList;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player {

	
	private ArrayList<Image> imgBattle;
	private int attack,defence,speed,power;
	
	public Player(){
		imgBattle=new ArrayList<Image>();
		try {
			imgBattle.add(new Image("img/Char_Battle/ennemy1droitestop.png").getScaledCopy(2));
			imgBattle.add(new Image("img/Char_Battle/ennemy1droitePD.png").getScaledCopy(2));
			imgBattle.add(new Image("img/Char_Battle/ennemy1droitePG.png").getScaledCopy(2));
			imgBattle.add(new Image("img/Char_Battle/ennemy1gauchestop.png").getScaledCopy(2));
			imgBattle.add(new Image("img/Char_Battle/ennemy1gauchePD.png").getScaledCopy(2));
			imgBattle.add(new Image("img/Char_Battle/ennemy1gauchePG.png").getScaledCopy(2));
		} catch (SlickException e) {
			System.out.println("Player images couldn't be loaded");
		}
		
	}
	
	
	public ArrayList<Image> getImgBattle() {
		return imgBattle;
	}

}
