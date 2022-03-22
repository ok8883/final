package net.edupoll.kr.task;

import java.text.SimpleDateFormat;

public class SimpleTask {
	
	public void printLog() {
		
		System.out.println("task executed...");
	}
	
	public void printAnything() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		String time = sdf.format(System.currentTimeMillis());
		System.out.println(time+ "task executed...");
	}
	
}
