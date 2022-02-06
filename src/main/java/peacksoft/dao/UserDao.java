package peacksoft.dao;

import peacksoft.model.Employee;

public interface UserDao {
    void createTable();
    void saveUser(Employee employee);
}
