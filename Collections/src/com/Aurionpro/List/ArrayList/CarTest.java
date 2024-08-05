package com.Aurionpro.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import com.Aurionpro.List.Model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();
		Car maximumMileageCar;
		System.out.println("Enter number of cars: ");
		int numberOfCars = scanner.nextInt();
		for (int i = 0; i < numberOfCars; i++) {
			System.out.println("Enter carId: ");
			int carId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter company name: ");
			String companyName = scanner.next();
			System.out.println("Enter price: ");
			int price = scanner.nextInt();
			System.out.println("Enter mileage: ");
			int mileage = scanner.nextInt();

			cars.add(new Car(carId, companyName, price, mileage));
		}

		System.out.println("Car details are: ");
		for (Car car : cars) {
			if(car.getMileage() > maximumMileageCar) {
				maximumMileageCar = car;
			}
			System.out.println(car);
		}
		
		

		ListIterator<Car> carIterator = cars.listIterator();
		while (carIterator.hasNext()) {
			System.out.println(carIterator.next());
		}
		while (carIterator.hasPrevious()) {
			System.out.println(carIterator.previous());
		}
	}
//	public void maximumMileage(int mileage, Object cars) {
//		for (Car car : cars) {
//			System.out.println(car);
//		}
//	}

}
