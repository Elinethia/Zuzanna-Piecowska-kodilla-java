package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {

        userList.add(new ForumUser(1,"Thomas", 'M', LocalDate.of(1901,7, 14), 3));
        userList.add(new ForumUser(2, "Arthur", 'M',LocalDate.of(1903, 3, 22), 19));
        userList.add(new ForumUser(3, "Finn",'M', LocalDate.of(1921, 11,  19), 16));
        userList.add(new ForumUser(4, "Grace", 'F', LocalDate.of(1907, 2, 5), 7));
        userList.add(new ForumUser(5, "Polly", 'F', LocalDate.of(1887, 8, 28), 6));

    }

    public List<ForumUser> getUserList() {

        return new ArrayList<>(userList);
    }
}

