package sn.ept.gestion_soutenance.dao;

import sn.ept.gestion_soutenance.entities.Resume;

import java.util.List;

public interface IResumeDAO {

    public List<Resume> listResumes();

    public void addResume(Resume resume);

}
