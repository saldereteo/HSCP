package suncoastChapter4;

public class TV {

	
	public TV() {
		
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= MAX_CHANNEL) {
			channel = newChannel;
		}
	}
	
	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= MAX_VOLUME) {
			volumeLevel = newVolumeLevel;
		}
	}
	
	public void channelUp() {
		if (on && channel < MAX_CHANNEL) {
			channel++;
		}
	}
	
	public void channelDown() {
		if (on && channel > 1) {
			channel--;
		}
	}

	public void volumeUp() {
		if (on && volumeLevel < MAX_VOLUME) {
			volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}
	}
	public int getChannel() {
		return channel;
	}
	
	int channel = 1;
	int volumeLevel = 1;
	final int MAX_CHANNEL = 120;
	final int MAX_VOLUME = 7;
	boolean on = false;
}
