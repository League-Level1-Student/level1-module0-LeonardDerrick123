package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot GuT7 = new Robot();
	public void run() {
		GuT7.setSpeed(100);
		for (int i = 0; i < 10; i++) {
			flatRoof();
		}
	}
public void flatRoof() {
	
	GuT7.setX(50);
	GuT7.penDown();
	GuT7.move(100);
	GuT7.turn(90);
	GuT7.move(30);
	GuT7.turn(90);
	GuT7.move(100);
	GuT7.turn(-90);
	GuT7.setPenColor(Color.GREEN);
	GuT7.move(20);
	GuT7.turn(90);
}

}







