package castle;

public class Handler {
	protected Game game;
	public Handler(Game game) {
		this.game = game;
	}
	public void doCmd(String work) {}
	public boolean isBye() {return false;}
}
