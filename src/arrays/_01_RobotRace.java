package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//2. create an array of 5 robots.
Robot[] bob = new Robot[5];
int winner = 0;
int[] score = new int[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i<5;i++) {	
	bob[i] = new Robot();
	bob[i].setX(175*i+100);
	bob[i].setY(500);
}
Random r = new Random();
while(true) {
for (int i = 0; i<5;i++) {
	bob[i].setSpeed(100);
	for (int e = r.nextInt(40); e>0;e-- ) {
	bob[i].move(2);
bob[i].turn(2);		
score[i] = score[i]+2;


	}
	if (score[i]>=360) {
		winner = i;
		break;
	}
}
if (score[winner]>=360) {
	break;
}
}
bob[winner].setAngle(0);
bob[winner].setSpeed(10);
bob[winner].move(-50);
bob[winner].turn(720);




		//4. make each robot start at the bottom of the screen, side by side, facing up
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party>

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
}

}
