package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot hal = new Robot();
	public void run() {
		

		for (int i=0; i<10; i++) {
			house("tall");
			house("medium");
			house("short");
		}

		
		
	}
	public void house(String height) {
		int h = 0;
		if(height.equalsIgnoreCase("tall")){
			h=250;
		}
		if(height.equalsIgnoreCase("medium")){
			h=120;
		}
		if(height.equalsIgnoreCase("short")){
			h=60;
		}
		hal.hide();
		hal.penDown();
		hal.setRandomPenColor();
		hal.setSpeed(100);
		hal.move(h);
		hal.turn(90);
		hal.move(15);
		hal.turn(90);
		hal.move(h);
		hal.turn(-90);
		hal.setPenColor(0, 255, 80);
		hal.move(10);
		hal.turn(-90);
		//havent finished processing string height 
		
	}
}
