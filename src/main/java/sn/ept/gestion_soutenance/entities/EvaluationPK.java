/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author ssidibe
 */
@Embeddable
public class EvaluationPK implements Serializable{
    
    private Long idMemoire;
    
    private Long idEvaluateur;
    
    private Short idElementCompetence;

    public Long getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(Long idMemoire) {
        this.idMemoire = idMemoire;
    }

    public Long getIdEvaluateur() {
        return idEvaluateur;
    }

    public void setIdEvaluateur(Long idEvaluateur) {
        this.idEvaluateur = idEvaluateur;
    }

    public Short getIdElementCompetence() {
        return idElementCompetence;
    }

    public void setIdElementCompetence(Short idElementCompetence) {
        this.idElementCompetence = idElementCompetence;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.idMemoire);
        hash = 31 * hash + Objects.hashCode(this.idEvaluateur);
        hash = 31 * hash + Objects.hashCode(this.idElementCompetence);
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
        final EvaluationPK other = (EvaluationPK) obj;
        if (!Objects.equals(this.idMemoire, other.idMemoire)) {
            return false;
        }
        if (!Objects.equals(this.idEvaluateur, other.idEvaluateur)) {
            return false;
        }
        return Objects.equals(this.idElementCompetence, other.idElementCompetence);
    }
    
    
    
}
