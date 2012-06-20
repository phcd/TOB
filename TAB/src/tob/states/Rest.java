package tob.states;


class Rest implements State {
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 1) {

			wrapper.set_state(new Session());
			System.out.println("in session state...");
		}
		if (inputValue == 2) {

			wrapper.set_state(new Idle());
			System.out.println("in idle state...");
		}
		if (inputValue == 255) {
			wrapper.set_state(new RestExtra());
			//wrapper.tobTimer.schedule(wrapper.getTimerTask(), wrapper.config.getRestExtraTime());
			System.out.println("Timeout from Rest");
			getUserInputForRest(wrapper);
		}
	}
	public void getUserInputForRest(TransitionMachine wrapper) {
		//user input
		System.out.println("Do you wanna 1.) Start Session or 2.) end phase ");
		
		StateDemo.getUserInput(wrapper);
		
	}
}
