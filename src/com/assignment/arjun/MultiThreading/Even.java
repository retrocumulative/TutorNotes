package com.assignment.arjun.MultiThreading;

public class Even extends Thread {

	public void run() {
		
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
