/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.nlt.model.Persons;
import org.nlt.view.MainInterface;

/**
 *
 * @author Sai-Nish
 */
public class PersonServices implements MainInterface {

    public void setPersonMap() {
        personMap.clear();
        session.beginTransaction();
        Query query = session.createQuery("from Persons where status=1");
        List<Persons> personList = query.list();
        session.getTransaction().commit();

        for (Persons per : personList) {
            personMap.put(per.getPhone(), per);
        }
    }

    public void addPerson(Persons person) {
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
    }

    public void updatePerson(Persons person) {
        session.beginTransaction();
        session.update(person);
        session.getTransaction().commit();
    }

    public void deletePerson(Persons person) {
        session.beginTransaction();
        session.delete(person);
        session.getTransaction().commit();
    }

}
