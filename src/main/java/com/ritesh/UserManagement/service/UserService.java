package com.ritesh.UserManagement.service;

import com.ritesh.UserManagement.model.User;
import com.ritesh.UserManagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
     UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.allUsers();
    }

    public User getUserById(Integer id) {
        List<User> userList = getAllUsers();
        for(User user : userList){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String addNewUser(User user) {
        List<User> userList = getAllUsers();
        userList.add(user);
        return "New user added Successfully";
    }

    public String updateUserById(Integer id, User user) {
        List<User> userList = getAllUsers();

        for(User user1 : userList){
            if(user1.getUserId().equals(id)){
                user1.setUserId(user.getUserId());
                user1.setName(user.getName());
                user1.setUserName(user.getUserName());
                user1.setAddress(user.getAddress());
                user1.setPhoneNumber(user.getPhoneNumber());

                return "User updated Successfully";
            }
        }
        return "User id no found !!!!";
    }

    public String deleteUserById(Integer id) {
        List<User> userList = getAllUsers();
        for(User user : userList){
            if(user.getUserId().equals(id)){
                userList.remove(user);
                return "User deleted Successfully";
            }
        }
        return "User not found";
    }
}
