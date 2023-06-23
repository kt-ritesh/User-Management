package com.ritesh.UserManagement.repository;

import com.ritesh.UserManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    List<User> allUser;

    public List<User> allUsers(){
        return allUser;
    }

}
