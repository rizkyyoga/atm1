package app;

public class Main {

	public static void main(String[] args) {
		Screen screen = new ScreenWelcome();
		while (true) {
			screen = screen.action();
		}
	}
}
