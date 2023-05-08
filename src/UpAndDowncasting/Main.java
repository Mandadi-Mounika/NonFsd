package UpAndDowncasting;

public class Main {
	    public static void main(String[] args) {
	        Animal animal = new Cat(); // Upcasting
	        
	        animal.makeSound(); 
	        
	        Cat cat = (Cat) animal; // Downcasting
	        
	        cat.scratch(); 
	    }
	
}