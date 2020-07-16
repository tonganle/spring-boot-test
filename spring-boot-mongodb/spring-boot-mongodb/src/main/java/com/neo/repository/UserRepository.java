package com.neo.repository;

import com.neo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by summer on 2017/5/5.
 */
public interface UserRepository {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public long updateUser(User user);

    public void deleteUserById(Long id);

}
