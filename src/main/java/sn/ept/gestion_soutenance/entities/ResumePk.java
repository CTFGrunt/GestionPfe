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
public class ResumePk implements Serializable{
    
  
    private String codeLangue;
    
    
    private Long idMemoire;

    public String getCodeLangue() {
        return codeLangue;
    }

    public void setCodeLangue(String codeLangue) {
        this.codeLangue = codeLangue;
    }

    public Long getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(Long idMemoire) {
        this.idMemoire = idMemoire;
    }

    @Override
    public int hashCode() {
        int hash = 7; 
        hash = 97 * hash + Objects.hashCode(this.codeLangue);
        hash = 97 * hash + Objects.hashCode(this.idMemoire);
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
        final ResumePk other = (ResumePk) obj;
        if (!Objects.equals(this.codeLangue, other.codeLangue)) {
            return false;
        }
        return Objects.equals(this.idMemoire, other.idMemoire);
    }
    
    
    
}
