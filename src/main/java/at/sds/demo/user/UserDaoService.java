package at.sds.demo.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1,"Adam", new Date()));
        users.add(new User(2,"Eve", new Date()));
        users.add(new User(3,"Jack", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId()==null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(Integer id) {
        Optional<User> user = users.stream().filter(x -> x.getId() == id).findFirst();
        return user.isPresent()?user.get():null;
    }
}
