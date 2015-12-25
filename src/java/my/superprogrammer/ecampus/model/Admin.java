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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByStaffIDadmin", query = "SELECT a FROM Admin a WHERE a.staffIDadmin = :staffIDadmin"),
    @NamedQuery(name = "Admin.findByNameadmin", query = "SELECT a FROM Admin a WHERE a.nameadmin = :nameadmin"),
    @NamedQuery(name = "Admin.findByNricadmin", query = "SELECT a FROM Admin a WHERE a.nricadmin = :nricadmin"),
    @NamedQuery(name = "Admin.findByEmailadmin", query = "SELECT a FROM Admin a WHERE a.emailadmin = :emailadmin"),
    @NamedQuery(name = "Admin.findByPasswordAdmin", query = "SELECT a FROM Admin a WHERE a.passwordAdmin = :passwordAdmin"),
    @NamedQuery(name = "Admin.findByUsernameAdmin", query = "SELECT a FROM Admin a WHERE a.usernameAdmin = :usernameAdmin"),
    @NamedQuery(name = "Admin.findByAcessLeveladmin", query = "SELECT a FROM Admin a WHERE a.acessLeveladmin = :acessLeveladmin")})
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "staffIDadmin")
    private Integer staffIDadmin;
    @Size(max = 45)
    @Column(name = "nameadmin")
    private String nameadmin;
    @Size(max = 12)
    @Column(name = "nricadmin")
    private String nricadmin;
    @Size(max = 45)
    @Column(name = "emailadmin")
    private String emailadmin;
    @Size(max = 12)
    @Column(name = "password_admin")
    private String passwordAdmin;
    @Size(max = 45)
    @Column(name = "username_admin")
    private String usernameAdmin;
    @Size(max = 15)
    @Column(name = "acessLevel_admin")
    private String acessLeveladmin;

    public Admin() {
    }

    public Admin(Integer staffIDadmin) {
        this.staffIDadmin = staffIDadmin;
    }

    public Integer getStaffIDadmin() {
        return staffIDadmin;
    }

    public void setStaffIDadmin(Integer staffIDadmin) {
        this.staffIDadmin = staffIDadmin;
    }

    public String getNameadmin() {
        return nameadmin;
    }

    public void setNameadmin(String nameadmin) {
        this.nameadmin = nameadmin;
    }

    public String getNricadmin() {
        return nricadmin;
    }

    public void setNricadmin(String nricadmin) {
        this.nricadmin = nricadmin;
    }

    public String getEmailadmin() {
        return emailadmin;
    }

    public void setEmailadmin(String emailadmin) {
        this.emailadmin = emailadmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }

    public String getUsernameAdmin() {
        return usernameAdmin;
    }

    public void setUsernameAdmin(String usernameAdmin) {
        this.usernameAdmin = usernameAdmin;
    }

    public String getAcessLeveladmin() {
        return acessLeveladmin;
    }

    public void setAcessLeveladmin(String acessLeveladmin) {
        this.acessLeveladmin = acessLeveladmin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffIDadmin != null ? staffIDadmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.staffIDadmin == null && other.staffIDadmin != null) || (this.staffIDadmin != null && !this.staffIDadmin.equals(other.staffIDadmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.superprogrammer.ecampus.model.Admin[ staffIDadmin=" + staffIDadmin + " ]";
    }
    
}
