package Day09.Ex06_EventListener;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void OnClick() {
		System.out.println("메시지 버튼 클릭!!");
	}

}
