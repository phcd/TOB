package tob.states;

class Session implements State {
	public void transition(TransitionMachine wrapper, int inputValue) {
		if (inputValue == 2) {

			wrapper.set_state(new Idle());
			System.out.println("   to idle state");
		}
		if (inputValue == 3) {

			wrapper.set_state(new Rest());
			System.out.println("   to rest state");
		}

		if (inputValue == 255) {
			SessionExtra localSEObject = new SessionExtra();
			wrapper.set_state(localSEObject);
			localSEObject.getUserInputForRestorSessionExtra(wrapper);
			System.out.println("from Session state");
		}
	}

}
