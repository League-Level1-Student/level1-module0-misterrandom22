package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot hal = new Robot();
	public void run() {
		
Random random1 = new Random();
		for (int i=0; i<9; i++) {
			int random2 = random1.nextInt(3);
			if(random2 == 0) {
				house("tall");
			}
			else if(random2 == 1) {
				house("medium");
			}
			else if(random2 == 2) {
				house("short");
			}

		}

		
		
	}
	public void house(String height) {
		
		int h = 0;
		int r = 0;
		int r2 = 0;
		if(height.equalsIgnoreCase("tall")){
			h=250;
			r=90;
			r2=0;
		}
		if(height.equalsIgnoreCase("medium")){
			h=120;
			r=45;
			r2=90;
		
		}
		if(height.equalsIgnoreCase("short")){
			h=60;
			r=45;
			r2=90;
		}
		
		hal.hide();
		hal.penDown();
		hal.setRandomPenColor();
		hal.setSpeed(100);
		hal.move(h);
		hal.turn(r);
		hal.move(15);
		hal.turn(r2);
		hal.move(15);
		hal.turn(r);
		hal.move(h);
		hal.turn(-90);
		hal.setPenColor(100, 255, 100);
		hal.move(10);
		hal.turn(-90);
		//havent finished processing string height 
		
	}
}
