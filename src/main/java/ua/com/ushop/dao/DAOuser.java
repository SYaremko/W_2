package ua.com.ushop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.ushop.entity.User;

/**
 * Created by Solomiya on 29.09.2017.
 */
public interface DAOuser extends JpaRepository<User,Integer>{
}
