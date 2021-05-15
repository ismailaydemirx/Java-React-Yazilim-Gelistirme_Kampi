
public class UsersManager {
	
	void register(Users user){
		System.out.println("Yeni üye eklendi : " + user.getUserName());
	}
	
	void delete(Users user) {
		System.out.println("Üye silindi : " + user.getUserName());
	}

	void update(Users user) {
		System.out.println("Üye güncellendi : " + user.getUserName());
	}
	
}
