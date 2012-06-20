package tob.states;

class Idle implements State {
	public void transition(TransitionMachine wrapper, int inputValue) {
		System.out.println("Before "+System.currentTimeMillis());
    	
		if (inputValue == 1) {
			wrapper.tobTimer.schedule(wrapper.getTimerTask(), wrapper.config.getSessionTime());
			wrapper.set_state(new Session());
			System.out.println("to session state");
		}
	}
}
