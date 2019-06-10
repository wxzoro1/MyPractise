package cd;

public class Game extends Item {
	private int numOfplayers;
	
	public Game(String title, int playingTime, boolean gotIt, String comment , int numOfplayers) {
		super(title, playingTime, gotIt, comment);
		this.numOfplayers = numOfplayers;
	}

	@Override
	public void print() {
		System.out.println("Game");
		super.print();
	}

	public static void main(String[] args) {

	}
}
