import java.util.UUID;

public class UserServiceImpl implements IUserMgt {
    @Override
    public User createUser(String name, String phone) {
        String id = UUID.randomUUID().toString(); // generate ID unik
        return new User(id, name, phone); // panggil konstruktor 3 argumen
    }
}
