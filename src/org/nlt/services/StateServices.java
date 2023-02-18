package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.nlt.model.States;
import org.nlt.view.MainInterface;
import static org.nlt.view.MainInterface.session;
import static org.nlt.view.MainInterface.stateMap;


public class StateServices implements MainInterface
{
    public void setStateMap()
    {
        stateMap.clear();
        session.beginTransaction();
        Query query = session.createQuery("from States where status=1");
        List <States> stateList = query.list();
        session.getTransaction().commit();
        
        for(States state:stateList)
        {
            stateMap.put(state.getName(), state);
        }

    }
        public void addState(States state)
    {
        session.beginTransaction();
        session.save(state);
        session.getTransaction().commit();
    }
        public void updateState(States state)
    {
        session.beginTransaction();
        session.update(state);
        session.getTransaction().commit();
    }
        public void deleteState(States state)
    {
        session.beginTransaction();
        session.delete(state);
        session.getTransaction().commit();
    }
}

