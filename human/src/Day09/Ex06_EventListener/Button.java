package Day09.Ex06_EventListener;

public class Button {

	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.OnClick();
	}
	
	// 클릭 이벤트 발생 시, 수행 기능을 정의하는 인터페이스 
	interface OnClickListener {
		
		void OnClick();
		
	}
}
