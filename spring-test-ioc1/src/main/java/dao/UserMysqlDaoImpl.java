package dao;

public class UserMysqlDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("mysql得到了");
    }
}
