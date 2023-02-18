package org.nlt.view;

import java.util.LinkedHashMap;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.nlt.database.DatabaseConnection;
import org.nlt.model.Cities;
import org.nlt.model.Persons;
import org.nlt.model.States;
import org.nlt.model.Users;
import org.nlt.services.CityServices;
import org.nlt.services.PersonServices;
import org.nlt.services.StateServices;

public interface MainInterface {

    public SessionFactory sf = DatabaseConnection.getSessionFactory();
    public Session session = sf.openSession();

    public LoginFrame loginFrame = new LoginFrame();
    public PersonFrame personFrame = new PersonFrame();
    public StateFrame stateFrame = new StateFrame();
    public CityFrame cityFrame = new CityFrame();
   
    public LinkedHashMap<String, Persons> personMap = new LinkedHashMap();
    public LinkedHashMap<String, States> stateMap = new LinkedHashMap();
    public LinkedHashMap<String, Cities> cityMap = new LinkedHashMap();
    
    public Users loginUser = new Users();
    
    public PersonServices personService=new PersonServices();
    public StateServices stateService=new StateServices();
    public CityServices cityService=new CityServices();

    public static void closeDatabaseConnection() {
        if (session != null) {
            session.close();
        }
        if (sf != null) {
            sf.close();
        }
    }
}
