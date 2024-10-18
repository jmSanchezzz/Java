package airplaneActivity;
class Airplane {
	private Seat[][] firstClass;
	private Seat[][] economyClass;
	public Airplane() {
		firstClass = new Seat[5][2];
		economyClass = new Seat[10][4];
		initializeSeats(firstClass, 2);
		initializeSeats(economyClass, 4);
	}
	private void initializeSeats(Seat seats[][], int col) {

	    for (int i = 0; i < seats.length; i++) {
	        for (int j = 0; j < col; j++) {
	            if (j == 0 || j == col - 1) { 
	                seats[i][j] = new Seat(i + 1, j + 1, "Window");
	            } else {
	                seats[i][j] = new Seat(i + 1, j + 1, "Aisle");
	            }
	        }
	    }
	}
	public String addPassengers(String classType, int numPassengers, String preference) {
		Seat[][] seats = (classType.equals("F")) ? firstClass : economyClass;
		String pref = (preference.equalsIgnoreCase("W")) ? "Window" : "Aisle";
		String seatAssignment = "Assigned seats: ";
		char letter = 'A';
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[0].length && numPassengers > 0; j++) {
				if(pref.equalsIgnoreCase(seats[i][j].getPreference())) {
				if (seats[i][j].isAvailable()) {
					seats[i][j].assignPassenger();
					seatAssignment = seatAssignment + seats[i][j].getRow() + letter + " ";
					numPassengers--;
				}
				}
				letter++;
			}
			letter = 'A';
		}
		return seatAssignment;
	}
	public String showSeating() {
		String seats = "First Class:";
		seats += "\n" + printSeats(firstClass);
		seats += "\n" + "Economy Class:";
		seats += "\n" + printSeats(economyClass);
		return seats;
	}
	private String printSeats(Seat seats[][]) {
		String seat = "";
		char letter = 'A';
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[0].length; j++) {
				seat = seat + seats[i][j].getRow() + " " + letter
						+ ((seats[i][j].isAvailable()) ? " Available" : " Assigned") + " ";
				letter++;
			}
			seat += "\n";
			letter = 'A';
		}
		return seat;
	}
}