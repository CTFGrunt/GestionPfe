/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 *
 * @author ssidibe
 */

@Entity
public class MotCle implements Serializable {

    @EmbeddedId
    private MotClePK motClePK;
    
    @ManyToOne
    @MapsId("resumePK")
    private Resume resume;
    
    private Integer numero;

    public MotClePK getMotClePK() {
        return motClePK;
    }

    public void setMotClePK(MotClePK motClePK) {
        this.motClePK = motClePK;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.motClePK);
        hash = 71 * hash + Objects.hashCode(this.resume);
        hash = 71 * hash + Objects.hashCode(this.numero);
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
        final MotCle other = (MotCle) obj;
        if (!Objects.equals(this.motClePK, other.motClePK)) {
            return false;
        }
        if (!Objects.equals(this.resume, other.resume)) {
            return false;
        }
        return Objects.equals(this.numero, other.numero);
    }
    
    

}
