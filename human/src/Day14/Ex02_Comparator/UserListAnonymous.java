package Day14.Ex02_Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class UserListAnonymous {

	public UserListAnonymous() {
		
		List<User> userList = new LinkedList<>();
		
		User u1 = new User("abc", "김휴먼", 10);
		User u2 = new User("acb", "이휴먼", 20);
		User u3 = new User("bac", "박휴먼", 30);
		User u4 = new User("bca", "최휴먼", 20);
		User u5 = new User("cab", "정휴먼", 30);
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		
		// 익명객체로 Comparator 인터페이스의 정렬기능 구현하기
		Collections.sort( userList, new Comparator<User>() {	
			@Override
			public int compare(User o1, User o2) {
				int gap = o1.id.compareTo(o2.id);
				return gap;
				
		}
	});
		
		for (User user : userList) {
			System.out.println("id : " + user.id);
		}
	}

}
