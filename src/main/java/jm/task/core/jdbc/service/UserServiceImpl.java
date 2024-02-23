package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl UDJDBCI = new UserDaoJDBCImpl();

    public UserServiceImpl() throws SQLException, ClassNotFoundException {
    }

    public void createUsersTable() throws SQLException {
        UDJDBCI.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        UDJDBCI.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        UDJDBCI.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        UDJDBCI.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {

        return UDJDBCI.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        UDJDBCI.cleanUsersTable();
    }
}
