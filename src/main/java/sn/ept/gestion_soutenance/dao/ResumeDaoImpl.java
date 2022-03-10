package sn.ept.gestion_soutenance.dao;


import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Resume;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ResumeDaoImpl implements IResumeDAO{

    @Override
    public List<Resume> listResumes() {

        EntityManager em = DbConfig.getInstance().getEm();
        Query q = em.createNamedQuery("Resume.findAll");
        return q.getResultList();

    }

    @Override
    public void addResume(Resume resume) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
