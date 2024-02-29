package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());

		
		System.out.println(new JSONMessageCreator().getMessage());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msg= creator.getMessage();
		System.out.println(msg);
	}
}
