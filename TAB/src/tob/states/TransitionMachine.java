package tob.states;

import java.util.Timer;
import java.util.TimerTask;

import tob.model.Configuration;
import tob.model.TransitionTimerTask;

public class TransitionMachine
{
    private State current_state;
//    TransitionTimerTask timerTask;
    Timer tobTimer;
//    private long timeForaState;
    Configuration config;
    
    public TransitionMachine()
    {
        current_state = new Idle();
        tobTimer = new Timer("TOB Timer");
        //timerTask = new TransitionTimerTask(this);
        config = Configuration.getConfigurationInstance();
    }
    public void set_state(State s)
    {
        current_state = s;
    }
    public void transition(int inputValue)
    {
        current_state.transition(this, inputValue);
    }
    
    public TimerTask getTimerTask() {
    	
    	return new TransitionTimerTask(this);
			
    }
//	public long getTimeForaState() {
//		return timeForaState;
//	}
//	public void setTimeForaState(long timeForaState) {
//		this.timeForaState = timeForaState;
//	}
}