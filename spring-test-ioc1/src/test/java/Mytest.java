import dao.UserDaoImpl;
import dao.UserMysqlDaoImpl;
import dao.UserOracleDaoImpl;
import org.junit.Test;
import service.UserService;
import service.UserServiceImpl;

import java.util.Scanner;

public class Mytest {
    @Test
    public void Test(){
        UserService userService = new UserServiceImpl();
//        Scanner sc =new Scanner(System.in);//创建
//        int num =sc.nextInt();//获取键盘输入的日容
        int num = 0;
        if(num == 1) {
            ((UserServiceImpl) userService).setUserDao(new UserMysqlDaoImpl());
        }else if (num == 2) {
            ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        }else{
            ((UserServiceImpl) userService).setUserDao(new UserOracleDaoImpl());
        }
        userService.getUser();
    }
}
