package ru.job4j.generics;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserStoreTest {

    @Test
    public void add() {
        User user = new User("1");
        UserStore userStore = new UserStore();
        userStore.add(user);
        assertNotNull(userStore.findById("1"));
    }

    @Test
    public void replace() {
        User user = new User("1");
        UserStore userStore = new UserStore();
        userStore.add(user);
        assertTrue(userStore.replace("1", new User("1")));
    }

    @Test
    public void delete() {
        User user = new User("1");
        UserStore userStore = new UserStore();
        userStore.add(user);
        userStore.delete("1");
        assertNull(userStore.findById("1"));
    }

    @Test
    public void findById() {
        User user = new User("1");
        UserStore userStore = new UserStore();
        userStore.add(user);
        assertEquals(userStore.findById("1"), user);
    }
}