package org.hello;

import java.util.Scanner;

/**
 * This class is created for demonstration purposes
*/
public class HelloWorld{
	
	/** Main method uses <strong>Scanner</strong> and console for to interact with users
	*/
	public static void main(String[] args){
		try{
			System.out.println("program code");
			var sc = new Scanner(System.in);
			var enter = sc.nextInt();
			sc.close();
			var helloWorld = new HelloWorld();
			if (enter == 1) throw helloWorld.new BasketException("BasketException");
			else throw helloWorld.new OrderException("OrderException");
		}catch(BasketException | OrderException e){
			System.out.println(e.getMessage());
		}
		System.out.println("next program code");
	}
	
	class BasketException extends Exception{
		BasketException(String message){
			super(message);
		}
	}
	
	class OrderException extends Exception{
		OrderException(String message){
			super(message);
		}
	}
		
}