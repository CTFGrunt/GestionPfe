package sn.ept.gestion_soutenance.dao;

import sn.ept.gestion_soutenance.entities.MotCle;

import java.util.List;

public interface IMotCleDAO {

    public List<MotCle> listMotCles();

    public void addMotCle(MotCle motCle);
}
