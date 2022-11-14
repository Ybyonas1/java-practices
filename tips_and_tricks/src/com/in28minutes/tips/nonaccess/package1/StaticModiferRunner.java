package com.in28minutes.tips.nonaccess.package1;

class Player {
	private String name;

	// static variables allow you to share data between multiple instances of the
	// same class
	private static int count = 0;


	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	static public int getCount() {
		return count;
	}

	public String getName() {
		System.out.println(count);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

public class StaticModiferRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Bobby");
		System.out.println(Player.getCount());

		Player player2 = new Player("Billy");
		System.out.println(Player.getCount());

	}

}
