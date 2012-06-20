package tob.states;

public class RestExtra implements State {

	@Override
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 1) {

			wrapper.set_state(new Session());
			System.out.println("   to session state");
		}
		if (inputValue == 2) {

			wrapper.set_state(new Idle());
			System.out.println("   to idle state");
		}

	}

}
