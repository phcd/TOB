package tob.states;

public class RestExtra implements State {

	@Override
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 1) {

			wrapper.set_state(new Session());
			System.out.println("in session state...");
			wrapper.tobTimer.schedule(wrapper.getTimerTask(), wrapper.config.getSessionTime());
		}
		if (inputValue == 2) {

			wrapper.set_state(new Idle());
			System.out.println("in idle state...");
		}

	}

}
