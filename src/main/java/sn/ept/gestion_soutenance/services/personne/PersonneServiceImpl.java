package sn.ept.gestion_soutenance.services.personne;

import sn.ept.gestion_soutenance.dao.IPersonneDAO;
import sn.ept.gestion_soutenance.dao.PersonneDaoImpl;
import sn.ept.gestion_soutenance.entities.Personne;

import java.util.List;

public class PersonneServiceImpl implements IPersonneService{

    private IPersonneDAO personneDAO = new PersonneDaoImpl();

    public IPersonneDAO getPersonneDAO() {
        return personneDAO;
    }

    @Override
    public List<Personne> listPersonnes() {
        return personneDAO.listPersonnes();
    }

    @Override
    public void savePersonne(Personne personne) {
        personneDAO.savePersonne(personne);
    }
}
