package tob.states;


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
			wrapper.set_state(new RestExtra());
			//wrapper.tobTimer.schedule(wrapper.getTimerTask(), wrapper.config.getRestExtraTime());
			System.out.println("Timeout from SessionExtra");
			new SessionExtra().getUserInputForRestorSessionExtra(wrapper);
			System.out.println("   to RestExtra state");
		}
	}
}
