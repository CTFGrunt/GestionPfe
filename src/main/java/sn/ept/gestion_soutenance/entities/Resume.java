/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 *
 * @author ssidibe
 */
@Entity
public class Resume implements Serializable {

    @EmbeddedId
    private ResumePk resumePK;

    @Column(length = 5000)
    private String resume;

    @ManyToOne
    @MapsId("idMemoire")
    private Memoire memoire;

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Memoire getMemoire() {
        return memoire;
    }

    public void setMemoire(Memoire memoire) {
        this.memoire = memoire;
    }

    public ResumePk getResumePK() {
        return resumePK;
    }

    public void setResumePK(ResumePk resumePK) {
        this.resumePK = resumePK;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.resumePK);
        hash = 37 * hash + Objects.hashCode(this.resume);
        hash = 37 * hash + Objects.hashCode(this.memoire);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Resume other = (Resume) obj;
        if (!Objects.equals(this.resume, other.resume)) {
            return false;
        }
        if (!Objects.equals(this.resumePK, other.resumePK)) {
            return false;
        }
        return Objects.equals(this.memoire, other.memoire);
    }

    

   

}
