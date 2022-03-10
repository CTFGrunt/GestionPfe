package sn.ept.gestion_soutenance.services.personne;

import sn.ept.gestion_soutenance.entities.Personne;

import java.util.List;

public interface IPersonneService {
    public List<Personne> listPersonnes();

    public void savePersonne(Personne personne);
}
