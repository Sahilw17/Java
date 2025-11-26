//Build an abstract class MediaPlayer with functions play(), pause(), stop(). Implement it for AudioPlayer and VideoPlayer.

import java.util.Scanner;

abstract class MediaPlayer
{
	abstract void play();
	abstract void pause();
	abstract void stop();
}

class AudioPlayer extends MediaPlayer
{
	void play(){
		System.out.println("The Song is Started..");
	}
	
	void pause(){
		System.out.println("The Song is paused!!");
	}
	
	void stop(){
		System.out.println("You stoped the Song!");
	}
}

class VideoPlayer extends MediaPlayer
{
		void play(){
		System.out.println("The Video is Started..");
	}
	
	void pause(){
		System.out.println("The Video is paused!!");
	}
	
	void stop(){
		System.out.println("You Video the Song!");
	}
}

class AbstractQ1
{
	public static void main(String[] args) 
	{
	//	System.out.println("Hello World!");
		AudioPlayer ap=new AudioPlayer();
		VideoPlayer vp=new VideoPlayer();
		
		ap.play();
		ap.pause();
		ap.stop();
		
		vp.play();
		vp.pause();
		vp.stop();
			
	}
}
