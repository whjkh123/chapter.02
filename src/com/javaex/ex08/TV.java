package com.javaex.ex08;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}

	public TV() {

	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		this.channel = channel;
		if (channel > 255) {
			this.channel = 255;
		} else if (channel < 1) {
			this.channel = 1;
		}
	}

	public void channel(boolean up) {
		if (channel == 255) {
			this.channel = 255;
		} else if (up) {
			this.channel++;
		} else {
			this.channel--;
		}
	}

	public void volume(int volume) {
		this.volume = volume;
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 0;
		}
	}

	public void volume(boolean up) {
		if (volume == 100) {
			this.volume = 100;
		} else if (up) {
			this.volume++;
		} else {
			this.volume--;
		}
	}

	void status() {
		if (power) {
			System.out.println("[전원: on, 채널: " + channel + ", 볼륨: " + volume + "]");
		} else {
			System.out.println("[전원: off, 채널: " + channel + ", 볼륨: " + volume + "]");
		}
	}
}
