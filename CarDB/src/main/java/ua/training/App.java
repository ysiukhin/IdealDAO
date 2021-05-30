package ua.training;

import ua.training.model.dao.CarDao;
import ua.training.model.dao.DaoFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        DaoFactory factory = DaoFactory.getInstance();
        CarDao dao = factory.createCarDao();

        System.out.println(dao.findAll());



        /*Connection con =
                DriverManager.
                        getConnection(  "jdbc:"+
                                        "mysql:"+
                                        "//localhost:3306/"+
                                        //"world" ,
                                        "mycardb",
                                "root" ,
                                "root");

        Statement query = con.createStatement();
        //ResultSet rs = query.executeQuery("SELECT * FROM city");
        ResultSet rs = query.executeQuery("SELECT * FROM car");
        while( rs.next()) {
            System.out.println(rs.getString("model"));}*/

/*
#SELECT * FROM manufacturer JOIN shop ON
                        manufacturer.idmanufacturer = shop.idmanufacturer
#SELECT * FROM manufacturer LEFT join shop ON
                        manufacturer.idmanufacturer = shop.idmanufacturer
#SELECT * FROM shop right join manufacturer ON
                        manufacturer.idmanufacturer = shop.idmanufacturer
#SELECT * FROM manufacturer right join shop ON
                        manufacturer.idmanufacturer = shop.idmanufacturer

#SELECT * FROM mycardb.car;
#SELECT * FROM manufacturer JOIN car using (idmanufacturer)
#SELECT * FROM manufacturer LEFT join car using (idmanufacturer)
#SELECT * FROM manufacturer LEFT join car using (idmanufacturer) where manufacture = "BMV"
#SELECT * FROM car right join manufacturer using (idmanufacturer)
#SELECT * FROM manufacturer right join car using (idmanufacturer)

*/
        }
    }

