import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by stiles on 15/12/16.
 */

public class Test {
    public static void main(String[] args){
        try {
            Configuration cfg = new Configuration().configure();
            SessionFactory sessionFactory = cfg.buildSessionFactory();

            User user = new User();
            user.setPhone("15700082121");
            user.setNickname("doubi");
            user.setRegister(true);
            user.setIDCard("3304240119029402094");
            user.setPassword("hahaha");
            user.setName("蒋锦鹏");
            UserDAOImpl userDAO = new UserDAOImpl();
            userDAO.setSessionFactory(sessionFactory);
            //增
            System.out.println("=======add========");
            userDAO.save(user);
            System.out.println("已增加");
            user = userDAO.findOne("15700082121");
            if (user != null) {
                System.out.println("查询到姓名和密码:"+user.getName()+" "+user.getPassword());
            } else {
                System.out.println("插入失败");
            }
            //查
            System.out.println("======select======");
            System.out.println(user.getPhone()+" "+user.getPassword()+ " " +user.getNickname()+" "+user.getName());
            //改
            System.out.println("======update======");
            user.setPhone("15700082121");
            user.setName("顾思义");
            userDAO.update(user);
            user = userDAO.findOne("15700082121");
            if (user != null) {
                System.out.println("查询到姓名和密码:"+user.getName()+" "+user.getPassword());
            } else {
                System.out.println("更改失败");
            }
            //删
            System.out.println("======delete======");
            userDAO.delete("15700082121");
            user = userDAO.findOne("15700082121");
            if (user == null) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
