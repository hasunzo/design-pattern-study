package chapter6.remote;

public class Stereo {
    Integer volume;

    public void on() {
        System.out.println("오디오 전원이 켜졌습니다.");
    }

    public void off() {
        System.out.println("오디오 전원이 꺼졌습니다.");
    }

    public void setCD() {
        System.out.println("CD를 재생합니다.");
    }

    public void setDvd() {
        System.out.println("Dvd를 재생합니다.");
    }

    public void setRadio() {
        System.out.println("라디오를 재생합니다.");
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
        System.out.println("볼륨을 설정합니다. 현재 볼륨: " + volume);
    }
}
