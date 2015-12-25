/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.superprogrammer.ecampus.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "programme")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programme.findAll", query = "SELECT p FROM Programme p"),
    @NamedQuery(name = "Programme.findByProgCodeIDprogramme", query = "SELECT p FROM Programme p WHERE p.progCodeIDprogramme = :progCodeIDprogramme"),
    @NamedQuery(name = "Programme.findByProgNameprogramme", query = "SELECT p FROM Programme p WHERE p.progNameprogramme = :progNameprogramme"),
    @NamedQuery(name = "Programme.findByProgDurationprogramme", query = "SELECT p FROM Programme p WHERE p.progDurationprogramme = :progDurationprogramme"),
    @NamedQuery(name = "Programme.findByStatusProgramme", query = "SELECT p FROM Programme p WHERE p.statusProgramme = :statusProgramme")})
public class Programme implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "progCodeID_programme")
    private Integer progCodeIDprogramme;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "progName_programme")
    private String progNameprogramme;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "progDuration_programme")
    private String progDurationprogramme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status_programme")
    private int statusProgramme;

    public Programme() {
    }

    public Programme(Integer progCodeIDprogramme) {
        this.progCodeIDprogramme = progCodeIDprogramme;
    }

    public Programme(Integer progCodeIDprogramme, String progNameprogramme, String progDurationprogramme, int statusProgramme) {
        this.progCodeIDprogramme = progCodeIDprogramme;
        this.progNameprogramme = progNameprogramme;
        this.progDurationprogramme = progDurationprogramme;
        this.statusProgramme = statusProgramme;
    }

    public Integer getProgCodeIDprogramme() {
        return progCodeIDprogramme;
    }

    public void setProgCodeIDprogramme(Integer progCodeIDprogramme) {
        this.progCodeIDprogramme = progCodeIDprogramme;
    }

    public String getProgNameprogramme() {
        return progNameprogramme;
    }

    public void setProgNameprogramme(String progNameprogramme) {
        this.progNameprogramme = progNameprogramme;
    }

    public String getProgDurationprogramme() {
        return progDurationprogramme;
    }

    public void setProgDurationprogramme(String progDurationprogramme) {
        this.progDurationprogramme = progDurationprogramme;
    }

    public int getStatusProgramme() {
        return statusProgramme;
    }

    public void setStatusProgramme(int statusProgramme) {
        this.statusProgramme = statusProgramme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (progCodeIDprogramme != null ? progCodeIDprogramme.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programme)) {
            return false;
        }
        Programme other = (Programme) object;
        if ((this.progCodeIDprogramme == null && other.progCodeIDprogramme != null) || (this.progCodeIDprogramme != null && !this.progCodeIDprogramme.equals(other.progCodeIDprogramme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.superprogrammer.ecampus.model.Programme[ progCodeIDprogramme=" + progCodeIDprogramme + " ]";
    }
    
}
