package tob.states;



public class SessionExtra implements State {

	@Override
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 2) {

			wrapper.set_state(new Idle());
			System.out.println("   to idle state");
		}
		if (inputValue == 3) {

			wrapper.set_state(new Rest());
			wrapper.tobTimer.schedule(wrapper.getTimerTask(), wrapper.config.getRestTime());
			System.out.println("   to rest state");
		}
		
		if(inputValue ==4) {
			wrapper.tobTimer.schedule(wrapper.getTimerTask(), wrapper.config.getSnoozeTime());
			System.out.println("Snoozing... ");
		}

		if (inputValue == 255) {
			System.out.println("Timeout from SessionExtra");
			getUserInputForRestorSessionExtra(wrapper);
			
		}
	}
	
	public void getUserInputForRestorSessionExtra(TransitionMachine wrapper) {
		//user input
		System.out.println("Do you wanna 3.) take rest or 2.) end phase or 4.) Snooze");
		
		StateDemo.getUserInput(wrapper);
		
	}

}
