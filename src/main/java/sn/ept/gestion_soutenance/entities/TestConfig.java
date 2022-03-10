/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import sn.ept.gestion_soutenance.config.DbConfig;

/**
 *
 * @author ssidibe
 */
public class TestConfig {

    public static void main(String[] args) {
        EntityManager em = DbConfig.getInstance().getEm();

        Personne p1 = new Personne("BALDE", "Aissatou", "baissatou@ept.sn");

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(p1);

        tx.commit();
        em.close();
       
    }

}
