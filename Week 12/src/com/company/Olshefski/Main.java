package com.company.Olshefski;

import java.util.ArrayList;
import java.util.List;

class Assortment<T>{
	//T stands for type
	//T in line 6 must match T in line 10
	//T accepts any input as value
	T value;

	public void show(){
		System.out.println("Im within the show method");

		//Checks to see if T's match
		System.out.println(value.getClass());
		System.out.println(value);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}


}



public class Main {

    public static void main(String[] args) {
	    Assortment<String> bools = new Assortment<>();
	    bools.value = "Test";
	    bools.show();

    }
}
