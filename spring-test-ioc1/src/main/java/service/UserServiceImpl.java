package service;

import dao.UserDao;
import dao.UserDaoImpl;
import dao.UserMysqlDaoImpl;
import dao.UserOracleDaoImpl;

public class UserServiceImpl implements UserService{

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
