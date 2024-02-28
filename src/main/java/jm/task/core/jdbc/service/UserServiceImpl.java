package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao UserDaoHibernateImpl = new UserDaoHibernateImpl();
    public UserServiceImpl() throws SQLException, ClassNotFoundException {
    }

    public void createUsersTable() throws SQLException {
        UserDaoHibernateImpl.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        UserDaoHibernateImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        UserDaoHibernateImpl.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        UserDaoHibernateImpl.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {

        return UserDaoHibernateImpl.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        UserDaoHibernateImpl.cleanUsersTable();
    }
}
