package dome;

public class VedioGame extends Item{
	private int numberOfPlayers;

	public VedioGame(String title, int playingTime, boolean gotit,
			String coment,int number) {
		super(title, playingTime, gotit, coment);
		this.numberOfPlayers = number;
	}

	@Override
	public void print() {
		System.out.print("VedioGame:");
		super.print();
		System.out.print("numberOfPlayers:" + numberOfPlayers);
	}


}
