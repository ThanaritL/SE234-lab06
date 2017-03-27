package camt.se234.unittest.dao;

import camt.se234.unittest.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    List<User> users;
    public UserDaoImpl() {
        users = new ArrayList<>();
        users.add(new User("Prayuth","1234","Tu",
                LocalDate.of(1979,2,14),"08612345678"));
        users.add(new User("Tucky","5675","Tuckung",
                LocalDate.of(1999,8,30),"08687654321"));
        users.add(new User("Honey", "aabbcc", "Honey",
                LocalDate.of(2012,11,13), "0000000000"));
        users.add(new User("None", "none", "NoName",
                LocalDate.of(2112,1,1), "9999999999"));
    }

    public List<User> getUsers(){

        return users;
    }

    @Override
    public User findById(long id) {
        return null;
    }
}
