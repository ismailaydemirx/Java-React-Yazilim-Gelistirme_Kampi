
public class UsersManager {
	
	void register(Users user){
		System.out.println("Yeni �ye eklendi : " + user.getUserName());
	}
	
	void delete(Users user) {
		System.out.println("�ye silindi : " + user.getUserName());
	}

	void update(Users user) {
		System.out.println("�ye g�ncellendi : " + user.getUserName());
	}
	
}
