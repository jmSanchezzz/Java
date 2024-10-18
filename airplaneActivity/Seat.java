package airplaneActivity;

class Seat {
	private int row;
	private int col;
	private String preference;
	private boolean available;

	public Seat(int row, int col, String preference) {
		this.row = row;
		this.col = col;
		this.preference = preference;
		this.available = true;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public String getPreference() {
		return preference;
	}

	public boolean isAvailable() {
		return available;
	}

	public void assignPassenger() {
		available = false;
	}
}