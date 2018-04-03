import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	
public static void main(String[] args) {
	Robot boi = new Robot();
	boi.setSpeed(7);
	boi.move(100);
	boi.setPenWidth(7);
	boi.penDown();
	boi.turn(90);
	for(int i=0;i<180;i++) {
		boi.move(2);
		boi.turn(2);
}
	boi.penUp();
	boi.move(200);
	
}
}