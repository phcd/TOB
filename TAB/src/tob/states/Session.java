package tob.states;

class Session implements State {
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 2) {

			wrapper.set_state(new Idle());
			System.out.println("in idle state..");
		}
		if (inputValue == 3) {

			wrapper.set_state(new Rest());
			System.out.println("in rest state..");
		}

		if (inputValue == 255) {
			SessionExtra localSEObject = new SessionExtra();
			System.out.println("in SessionExtra state");
			wrapper.set_state(localSEObject);
			localSEObject.getUserInputForSessionExtra(wrapper);
			
		}
	}

}
