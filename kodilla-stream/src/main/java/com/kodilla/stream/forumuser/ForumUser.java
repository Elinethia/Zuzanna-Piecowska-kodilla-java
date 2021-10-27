package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int identityNumber;
    private final String username;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int postQuantity;

    public ForumUser(final int identityNumber, final String username, final char sex, final LocalDate birthdayDate, final int postQuantity) {
        this.identityNumber = identityNumber;
        this.username = username;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postQuantity = postQuantity;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return identityNumber == forumUser.identityNumber && sex == forumUser.sex && postQuantity == forumUser.postQuantity && Objects.equals(username, forumUser.username) && Objects.equals(birthdayDate, forumUser.birthdayDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityNumber, username, sex, birthdayDate, postQuantity);
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "identityNumber=" + identityNumber +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
