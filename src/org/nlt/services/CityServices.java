package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.nlt.model.Cities;
import org.nlt.model.States;
import org.nlt.view.MainInterface;


public class CityServices implements MainInterface
{
    public void setCityMap()
    {
        cityMap.clear();
        session.beginTransaction();
        Query query = session.createQuery("from Cities where status=1");
        List <Cities> cityList = query.list();
        session.getTransaction().commit();
        
        for(Cities city: cityList)
        {
            cityMap.put(city.getName(), city);
        }

    }
        public void addCity(Cities city)
    {
        session.beginTransaction();
        session.save(city);
        session.getTransaction().commit();
    }
        public void updateCity(Cities city)
    {
        session.beginTransaction();
        session.update(city);
        session.getTransaction().commit();
    }
        public void deleteCity(Cities city)
    {
        session.beginTransaction();
        session.delete(city);
        session.getTransaction().commit();
    }
        
        public List<Cities> getCityList(String stateName)
        {
            session.beginTransaction();
            States state=stateMap.get(stateName);
            Query query=session.createQuery("from Cities where status=1 and state_id="+state.getId());
            List <Cities> cityList=query.list();
            session.getTransaction().commit();
            
            return cityList;
        }
       
}

