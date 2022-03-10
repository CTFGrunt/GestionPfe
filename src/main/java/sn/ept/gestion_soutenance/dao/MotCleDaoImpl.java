package sn.ept.gestion_soutenance.dao;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.MotCle;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class MotCleDaoImpl implements IMotCleDAO{

    @Override
    public List<MotCle> listMotCles() {

        EntityManager em = DbConfig.getInstance().getEm();
        Query q = em.createNamedQuery("Evaluation.findAll");
        return q.getResultList();

    }

    @Override
    public void addMotCle(MotCle mot){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
