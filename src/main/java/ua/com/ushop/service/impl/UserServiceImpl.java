package ua.com.ushop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.ushop.dao.DAOuser;
import ua.com.ushop.entity.User;
import ua.com.ushop.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private DAOuser daouser;

    @Override
    public void save(User user) {
    daouser.save(user);
    }

    @Override
    public List<User> findAll() {
        return daouser.findAll();
    }
}
