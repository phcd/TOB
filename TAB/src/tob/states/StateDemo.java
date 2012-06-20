package tob.states;

import java.util.Scanner;

public class StateDemo {
	public static void main(String[] args) {
		TransitionMachine machine = new TransitionMachine();
		while (true) { //TODO remove after testing state transition
		getUserInput(machine);
		}

	}

	public static void getUserInput(TransitionMachine machine) {
		
			Scanner line = new Scanner(System.in);
			String s = line.nextLine();
			machine.transition(Integer.parseInt(s));
		
	}
}