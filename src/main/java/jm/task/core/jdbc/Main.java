package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Petr", "Ivanov", (byte) 20);
        userService.saveUser("Ivan", "Petrov", (byte) 25);
        userService.saveUser("Zlata", "Umnova", (byte) 31);
        userService.saveUser("Polina", "Martinson", (byte) 38);
        userService.removeUserById(1);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();
    }
}
