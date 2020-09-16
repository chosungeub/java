package exam01_default;

public interface RemoteControl {
	//인터페이스의 상수
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}
