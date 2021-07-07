package castle;

public class HandlerHelp extends Handler{
	public HandlerHelp(Game game) {
		super(game);
	}

	@Override
	public void doCmd(String work) {
		System.out.println("迷路了吗？你可以做的命令有："+game.showHelp());
		System.out.println("如：\tgo east");
	}

}
