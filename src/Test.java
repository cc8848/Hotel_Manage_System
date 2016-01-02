import com.dao.UserDAO;
import com.dao.impl.OrderDAOImpl;
import com.dao.impl.RoomDAOImpl;
import com.dao.impl.UserDAOImpl;
import com.model.Order;
import com.model.Room;
import com.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Created by stiles on 15/12/16.
 */

public class Test {
    public static void main(String[] args){
        try {
            Configuration cfg = new Configuration().configure();
            SessionFactory sessionFactory = cfg.buildSessionFactory();

            UserDAOImpl userDAO = new UserDAOImpl();
            userDAO.setSessionFactory(sessionFactory);
            RoomDAOImpl roomDAO = new RoomDAOImpl();
            roomDAO.setSessionFactory(sessionFactory);
            OrderDAOImpl orderDAO = new OrderDAOImpl();
            orderDAO.setSessionFactory(sessionFactory);

            Date date = new Date();
            System.out.println(date.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
