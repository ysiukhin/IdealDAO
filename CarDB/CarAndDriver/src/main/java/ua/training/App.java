package ua.training;

import ua.training.model.dao.CarDao;
import ua.training.model.dao.DaoFactory;

public class App {
    public static void main( String[] args )throws Exception {
        DaoFactory factory = DaoFactory.getInstance();
        CarDao dao = factory.createCarDao();

        System.out.println(dao.findAll());
    }
}
