package sn.ept.gestion_soutenance.services;


import sn.ept.gestion_soutenance.dao.IMotCleDAO;
import sn.ept.gestion_soutenance.dao.MotCleDaoImpl;
import sn.ept.gestion_soutenance.entities.MotCle;

import java.util.List;

public class MotCleServiceImpl implements IMotCleService{

    private IMotCleDAO motCleDAO;

    public MotCleServiceImpl() {
        motCleDAO = new MotCleDaoImpl();
    }

    @Override
    public List<MotCle> listMotCles(){
        return motCleDAO.listMotCles();
    }
}
