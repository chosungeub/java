package exam01_final;

import javax.sound.sampled.AudioFileFormat;

public class RemoteControlExameple {

	public static void main(String[] args) {
		
		RemoteControl rc, rc2;
		rc = new Television();
		rc2 = new Audio();
		
		rc.turnOn();
		rc.turnOff();
		rc2.turnOn();
		rc2.turnOff();
		
		rc.setVolume(3);
		rc.setVolume(16);
		rc2.setVolume(-3);
		
	}

}
