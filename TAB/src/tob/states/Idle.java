package tob.states;

class Idle implements State {
	public void transition(TransitionMachine wrapper, int inputValue) {
    	
		if (inputValue == 1) {
			wrapper.set_state(new Session());
			System.out.println("in session state....");
			wrapper.tobTimer.schedule(wrapper.getTimerTask(), wrapper.config.getSessionTime());
			
		}
	}
}
