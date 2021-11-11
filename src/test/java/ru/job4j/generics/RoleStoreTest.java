package ru.job4j.generics;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoleStoreTest {

    @Test
    public void add() {
        Role role = new Role("1");
        RoleStore roleStore = new RoleStore();
        roleStore.add(role);
        assertNotNull(roleStore.findById("1"));
    }

    @Test
    public void replace() {
        Role role = new Role("1");
        RoleStore roleStore = new RoleStore();
        roleStore.add(role);
        assertTrue(roleStore.replace("1", new Role("1")));
    }

    @Test
    public void delete() {
        Role role = new Role("1");
        RoleStore roleStore = new RoleStore();
        roleStore.add(role);
        roleStore.delete("1");
        assertNull(roleStore.findById("1"));
    }

    @Test
    public void findById() {
        Role role = new Role("1");
        RoleStore roleStore = new RoleStore();
        roleStore.add(role);
        assertEquals(roleStore.findById("1"), role);
    }
}