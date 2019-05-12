package ua.com.ushop.service;

import ua.com.ushop.entity.User;

import java.util.List;

/**
 * Created by Solomiya on 29.09.2017.
 */
public interface UserService {
    void save(User user);

    List<User> findAll();
}
