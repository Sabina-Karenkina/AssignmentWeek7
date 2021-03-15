package com.example.AssignmentWeek7;

import java.util.ArrayList;

public class UserList {
    private static ArrayList<User> users = new ArrayList<User>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        UserList.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }
 }
