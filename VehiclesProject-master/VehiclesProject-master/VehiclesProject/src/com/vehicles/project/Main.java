package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner userInputCar = new Scanner (System.in);
		
		System.out.println("Enter plate car");
		String plate = userInputCar.nextLine();
		
		System.out.println("Enter brand car");
		String brand = userInputCar.nextLine();

		System.out.println("Enter color car");
		String color = userInputCar.nextLine();
		
		
		Car myCar = new Car(plate,brand,color);
		
		try {
			
		System.out.println("Enter brand of front wheels");
		String front_wheels = userInputCar.nextLine();
		
		System.out.println("Enter diameter of front wheels");
		double front_diameter = userInputCar.nextDouble();
	
		List<Wheel> frontWheelsUser = new ArrayList<Wheel>();
		frontWheelsUser.add(new Wheel(front_wheels,front_diameter));
		
		
		
		System.out.println("Enter brand of back wheels");
		String back_wheels = userInputCar.nextLine();
		
		System.out.println("Enter diameter of back wheels");
		double back_diameter = userInputCar.nextDouble();
		
		List<Wheel> backWheelsUser = new ArrayList<Wheel>();
		backWheelsUser.add(new Wheel(back_wheels,back_diameter));
		
		myCar.addWheels(frontWheelsUser, backWheelsUser);
		
		
		}catch (Exception e){
		 
		}
		
		
	}
		
}





//List<Wheel> nl = new ArrayList<>();		
//nl.add(userWheel);
//Wheel userWheel = new Wheel(wheels,diameter);
