package cricketplayermanagementsystem;

public class Cricket {
	int runs;
	String Player;

	static String team = "India";

	public static void main(String[] args) {
		System.out.println("Welcome Team India");
		System.out.println("**** Object1 ****");
		Cricket p1 = new Cricket();
		p1.runs = 1001;
		p1.Player = "Abhishek";

		System.out.println("Cricket PlayerName:" + p1.Player);
		System.out.println("Runs:" + p1.runs);

		System.out.println("**** Object2 ****");
		Cricket p2 = new Cricket();
		p2.runs = 1000;
		p2.Player = "Shreyas";

		System.out.println("Cricket Playername:" + p2.Player);
		System.out.println("Runs:" + p2.runs);

	}

}
