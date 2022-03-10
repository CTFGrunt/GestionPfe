package sn.ept.gestion_soutenance.dao;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Personne;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class PersonneDaoImpl implements IPersonneDAO{

    EntityManager em = DbConfig.getInstance().getEm();

    @Override
    public List<Personne> listPersonnes() {

        Query q = em.createNamedQuery("Personne.findAll");
        return (List<Personne>) q.getResultList();
    }

    @Override
    public void savePersonne(Personne personne) {
        em.persist(personne);
    }
}
