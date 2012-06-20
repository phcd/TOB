package test;

import java.util.Scanner;

class TransitionMachine {
	private State m_current_state;

	public TransitionMachine() {
		m_current_state = new Idle();
	}

	public void set_state(State s) {
		m_current_state = s;
	}

	public void transition(int inputValue) {
		m_current_state.transition(this, inputValue);
	}
}

interface State {
	void transition(TransitionMachine wrapper, int inputValue);
}

class Rest implements State {
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 1) {

			wrapper.set_state(new Session());
			System.out.println("   to session state");
		}
		if (inputValue == 2) {

			wrapper.set_state(new Idle());
			System.out.println("   to idle state");
		}
		if (inputValue == 255) {
			// start the timer for end of rest/ start of session
			// Change state to rest
			wrapper.set_state(new Rest());
			System.out.println("   to rest state");
		}
	}
}

class Idle implements State {
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 1) {

			wrapper.set_state(new Session());
			System.out
					.println("*************************************** to session state");
		}
	}
}

class Session implements State {
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 3) {

			wrapper.set_state(new Idle());
			System.out.println("   to idle state");
		}
		if (inputValue == 2) {

			wrapper.set_state(new Rest());
			System.out.println("   to rest state");
		}

		if (inputValue == 255) {
			// start the timer for rest
			// Change state to rest
			wrapper.set_state(new Rest());
			System.out.println("   to rest state");
		}
	}
}

public class StateDemo {
	public static void main(String[] args) {
		TransitionMachine machine = new TransitionMachine();
		// get_line();

		while (true) {
			Scanner line = new Scanner(System.in);
			String s = line.nextLine();
			machine.transition(Integer.parseInt(s));
		}

	}
}