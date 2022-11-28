package Day09.Ex06_EventListener;

public class ButtonEx {

	public static void main(String[] args) {

		Button btn = new Button();

		btn.setOnClickListener(new CallListener());
		btn.touch();

		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
