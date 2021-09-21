package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.

	public static void main(String[] args) {
		Robot one = new Robot(200, 600);
		Robot two = new Robot(400, 600);
		Robot three = new Robot(600, 600);
		Robot four = new Robot(800, 600);
		Robot five = new Robot(1000, 600);

		Random speed = new Random();

		one.setSpeed(speed.nextInt(10));
		two.setSpeed(speed.nextInt(10));
		three.setSpeed(speed.nextInt(10));
		four.setSpeed(speed.nextInt(10));
		five.setSpeed(speed.nextInt(10));

		Random move = new Random();

		Thread r1 = new Thread(() -> {
			while (one.getY() > 100) {
				one.move(move.nextInt(100));
				System.out.println(one.getY());
			}
		});
//		Thread r2 = new Thread(()->{
//			while(two.getY()>100) {
//				two.move(move.nextInt());
//			}
//		});
//		Thread r3 = new Thread(()->{
//			while(three.getY()>100) {
//				three.move(move.nextInt());
//			}
//			});
//		Thread r4 = new Thread(()->{
//			while(four.getY()>100) {
//				four.move(move.nextInt());
//			}
//			});
//		Thread r5 = new Thread(()->{
//			while(five.getY()>100) {
//				five.move(move.nextInt());
//			}
//			});

		r1.start();
//		r2.start();
//		r3.start();
//		r4.start();
//		r5.start();
	}
}
