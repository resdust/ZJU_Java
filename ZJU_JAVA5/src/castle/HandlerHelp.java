package castle;

public class HandlerHelp extends Handler{
	public HandlerHelp(Game game) {
		super(game);
	}

	@Override
	public void doCmd(String work) {
		System.out.println("��·������������������У�"+game.showHelp());
		System.out.println("�磺\tgo east");
	}

}
