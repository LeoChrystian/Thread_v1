package view;

import controller.Thread1;

public class Principal {

	public static void main(String[] args) {
		
		for (int IdThread = 0; IdThread < 5; IdThread++) {
			Thread ThreadID = new Thread1();
			ThreadID.start();
		}
	}
}
