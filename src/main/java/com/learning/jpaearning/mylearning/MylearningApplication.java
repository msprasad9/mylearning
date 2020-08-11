package com.learning.jpaearning.mylearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class MylearningApplication {


	public static void main(String[] args) {
		SpringApplication.run(MylearningApplication.class, args);
		int[] numbers = {98, 11, 55, 50, 20, 40, 60, 80, 90, 2, 50};
		int target = 100;
		HashMap<Integer,Integer> hash = new HashMap<>();
		for(int i = 0; i < numbers.length; i++){

			Integer diff = target - numbers[i];
			if(hash.containsKey(diff)){
				System.out.println("numbers:"+numbers[i]+","+diff);
			}

			hash.put(numbers[i], i);

		}
	}

}