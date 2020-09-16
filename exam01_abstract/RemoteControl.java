package exam01_abstract;

public interface RemoteControl {
	//인터페이스의 상수
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
