package tob.model;

import java.util.TimerTask;

import tob.states.TransitionMachine;

public class TransitionTimerTask extends TimerTask {

	private TransitionMachine stateMachine;
	
	public TransitionTimerTask(TransitionMachine stateMachine) {
		this.stateMachine = stateMachine;
	}
	
	@Override
	public void run() {
		//TODO change numbers to constants
		stateMachine.transition(255);
		
	}

}
