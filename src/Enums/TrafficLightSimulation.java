package Enums;

public class TrafficLightSimulation {
	    enum TrafficLightState {
	        RED, YELLOW, GREEN;
	    }

	    public static void main(String[] args) throws InterruptedException {
	        TrafficLightState currentLightState = TrafficLightState.RED;

	        while (true) {
	            switch (currentLightState) {
	                case RED:
	                    System.out.println("The light is RED. Stop!");
	                    Thread.sleep(5000); 
	                    currentLightState = TrafficLightState.GREEN; 
	                    break;
	                case YELLOW:
	                    System.out.println("The light is YELLOW. Slow down!");
	                    Thread.sleep(2000); 
	                    currentLightState = TrafficLightState.RED; 
	                    break;
	                case GREEN:
	                    System.out.println("The light is GREEN. Go!");
	                    Thread.sleep(5000); 
	                    currentLightState = TrafficLightState.YELLOW; 
	                    break;
	            }
	        }
	    
	}

}
