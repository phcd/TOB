package tob.states;

import java.util.Scanner;

/**
 * This is the main class to start the transition of states
 * 
 *   @author Dilip
 *
 */
public class StateDemo {
	public static void main(String[] args) {
		TransitionMachine machine = new TransitionMachine();
		getUserInput(machine);
//		while (true) { //TODO remove after testing state transition
//		
//		}

	}

	public static void getUserInput(TransitionMachine machine) {
			System.out.println("give input");
			Scanner line = new Scanner(System.in);
			String s = line.nextLine();
			machine.transition(Integer.parseInt(s));
		
	}
}