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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "attendance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attendance.findAll", query = "SELECT att FROM Attendance att"),
    @NamedQuery(name = "Attendance.findByAttendanceIDattendance", query = "SELECT att FROM Attendance att WHERE att.attendanceIDattendance = :attendanceIDattendance"),
    @NamedQuery(name = "Attendance.findByWeek1Attendance", query = "SELECT att FROM Attendance att WHERE att.week1Attendance = :week1Attendance"),
    @NamedQuery(name = "Attendance.findByWeek2Attendance", query = "SELECT att FROM Attendance att WHERE att.week2Attendance = :week2Attendance"),
    @NamedQuery(name = "Attendance.findByWeek3Attendance", query = "SELECT att FROM Attendance att WHERE att.week3Attendance = :week3Attendance"),
    @NamedQuery(name = "Attendance.findByWeek4Attendance", query = "SELECT att FROM Attendance att WHERE att.week4Attendance = :week4Attendance"),
    @NamedQuery(name = "Attendance.findByApplicantIDattendance", query = "SELECT att FROM Attendance att WHERE att.applicantIDattendance = :applicantIDattendance")})
public class Attendance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "attendanceID_attendance")
    private Integer attendanceIDattendance;
    @Column(name = "week1_attendance")
    private Short week1Attendance;
    @Column(name = "week2_attendance")
    private Short week2Attendance;
    @Column(name = "week3_attendance")
    private Short week3Attendance;
    @Column(name = "week4_attendance")
    private Short week4Attendance;
    @Column(name = "applicantID_attendance")
    private Integer applicantIDattendance;

    public Attendance() {
    }

    public Attendance(Integer attendanceIDattendance) {
        this.attendanceIDattendance = attendanceIDattendance;
    }

    public Integer getAttendanceIDattendance() {
        return attendanceIDattendance;
    }

    public void setAttendanceIDattendance(Integer attendanceIDattendance) {
        this.attendanceIDattendance = attendanceIDattendance;
    }

    public Short getWeek1Attendance() {
        return week1Attendance;
    }

    public void setWeek1Attendance(Short week1Attendance) {
        this.week1Attendance = week1Attendance;
    }

    public Short getWeek2Attendance() {
        return week2Attendance;
    }

    public void setWeek2Attendance(Short week2Attendance) {
        this.week2Attendance = week2Attendance;
    }

    public Short getWeek3Attendance() {
        return week3Attendance;
    }

    public void setWeek3Attendance(Short week3Attendance) {
        this.week3Attendance = week3Attendance;
    }

    public Short getWeek4Attendance() {
        return week4Attendance;
    }

    public void setWeek4Attendance(Short week4Attendance) {
        this.week4Attendance = week4Attendance;
    }

    public Integer getApplicantIDattendance() {
        return applicantIDattendance;
    }

    public void setApplicantIDattendance(Integer applicantIDattendance) {
        this.applicantIDattendance = applicantIDattendance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (attendanceIDattendance != null ? attendanceIDattendance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Attendance)) {
            return false;
        }
        Attendance other = (Attendance) object;
        if ((this.attendanceIDattendance == null && other.attendanceIDattendance != null) || (this.attendanceIDattendance != null && !this.attendanceIDattendance.equals(other.attendanceIDattendance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.superprogrammer.ecampus.model.Attendance[ attendanceIDattendance=" + attendanceIDattendance + " ]";
    }
    
}
