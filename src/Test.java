import com.dao.UserDAO;
import com.dao.impl.RoomDAOImpl;
import com.dao.impl.UserDAOImpl;
import com.model.Room;
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

            UserDAOImpl userDAO = new UserDAOImpl();
            userDAO.setSessionFactory(sessionFactory);
            RoomDAOImpl roomDAO = new RoomDAOImpl();
            roomDAO.setSessionFactory(sessionFactory);

            Room room = roomDAO.find("8a9fa01e51e8a0100151e8a172770001");
            System.out.println("8a9fa01e51e8a0100151e8a1724f0000".length());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
