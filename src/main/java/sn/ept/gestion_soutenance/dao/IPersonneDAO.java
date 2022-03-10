package sn.ept.gestion_soutenance.dao;

import sn.ept.gestion_soutenance.entities.Personne;

import java.util.List;

public interface IPersonneDAO {
    public List<Personne> listPersonnes();

    public void savePersonne(Personne personne);

}

