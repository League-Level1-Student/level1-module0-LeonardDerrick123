package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot GuT7 = new Robot();
	public void run() {
		GuT7.setX(50);
		GuT7.setSpeed(100);
		for (int i = 0; i < 3; i++) {
			flatRoof("small",Color.MAGENTA);
		flatRoof("medium",Color.CYAN);
		flatRoof("large",Color.YELLOW);
		}
	}

	public void flatRoof(String height,Color c ) {
	int h = 60;

	if (height.equals("small")) {
		h = 60;
	}
	if (height.equals("medium")) {
		h = 120;
	}
	if (height.equals("large")) {
		h = 250;
	}
	GuT7.penDown();
	GuT7.move(h);
	GuT7.turn(90);
	GuT7.move(30);
	GuT7.turn(90);
	GuT7.move(h);
	GuT7.turn(-90);
	GuT7.setPenColor(Color.GREEN);
	GuT7.move(20);
	GuT7.turn(-90);
GuT7.setPenColor(Color.BLACK);

	
	
	
	
	
	}
public void PointyRoof(String height,Color c) {
	int h = 60;
	if (height.equals("small")) {
		h = 60;
	}
	if (height.equals("medium")) {
		h = 120;
	}
	if (height.equals("large")) {
		h = 250;
	}
	
	GuT7.penDown();
	GuT7.move(h);
	GuT7.turn(45);
	
yyYYYYYYYT7.move(30);
	GuT7.turn(90);
	GuT7.move(h);
	GuT7.turn(-90);
	GuT7.setPenColor(Color.GREEN);
	GuT7.move(20);
	GuT7.turn(-90);
}
}







