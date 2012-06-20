package tob.model;


 public class Configuration {
	
	 private static final Configuration configurationInstance = new Configuration();
	 
	private Configuration() {
	}
	
	public static Configuration getConfigurationInstance() {
		return configurationInstance;
	}
	
	private int sessionTime =5000;
	private int restTime =2500;
	private int snoozeTime = 3000;
	private int restExtraTime = 3000;
	

	public int getSessionTime() {
		return sessionTime;
	}
	public void setSessionTime(int sessionTime) {
		this.sessionTime = sessionTime;
	}
	public int getRestTime() {
		return restTime;
	}
	public void setRestTime(int restTime) {
		this.restTime = restTime;
	}
	public int getSnoozeTime() {
		return snoozeTime;
	}
	public void setSnoozeTime(int snoozeTime) {
		this.snoozeTime = snoozeTime;
	}

	public int getRestExtraTime() {
		return restExtraTime;
	}

	public void setRestExtraTime(int restExtraTime) {
		this.restExtraTime = restExtraTime;
	}
}
