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
public class MotClePK implements Serializable{
   
   private String mot;
   
   
   private ResumePk resumePK;
   

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
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
        hash = 97 * hash + Objects.hashCode(this.mot);
        hash = 97 * hash + Objects.hashCode(this.resumePK);
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
        final MotClePK other = (MotClePK) obj;
        if (!Objects.equals(this.mot, other.mot)) {
            return false;
        }
        return Objects.equals(this.resumePK, other.resumePK);
    }

    
   
    
}
