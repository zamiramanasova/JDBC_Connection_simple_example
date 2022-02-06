package peacksoft.servise;

import peacksoft.dao.UserDao;
import peacksoft.dao.UserDaoImpl;
import peacksoft.model.Employee;

public class UserServiceImpl implements UserService{

    UserDao userDao = new UserDaoImpl();


    @Override
    public void createTable() {
      userDao.createTable();
    }

    @Override
    public void saveUser(Employee employee) {
        userDao.saveUser(employee);
    }
}
