package home.Springboot.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the CLNT database table.
 *
 */
@Entity
@Table(name="CLNT")
public class Clnt implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(unique=true, nullable=false, precision=19)
    private long systemclientid;

    @Column(length=255)
    private String accoununum;

    @Column(length=255)
    private String companyname;

    @Column(length=255)
    private String id;

    @Column(length=255)
    private String itin;

    @Column(length=255)
    private String lastupdatedby;

    @Temporal(TemporalType.DATE)
    private Date lastupdatedts;

    @Column(length=255)
    private String plannum;

    @Temporal(TemporalType.DATE)
    private Date setupts;

    @Column(length=255)
    private String status;

    @Column(precision=19)
    private java.math.BigDecimal systemclient;

    @Column(length=255)
    private String timezone;

    @Temporal(TemporalType.DATE)
    private Date updatedts;

    //bi-directional one-to-one association to ClntIdentification
    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="SYSTEMCLIENTID", nullable=false, insertable=false, updatable=false)
    private ClntIdentification clntIdentification;

    public Clnt() {
    }

    public long getSystemclientid() {
        return this.systemclientid;
    }

    public void setSystemclientid(long systemclientid) {
        this.systemclientid = systemclientid;
    }

    public String getAccoununum() {
        return this.accoununum;
    }

    public void setAccoununum(String accoununum) {
        this.accoununum = accoununum;
    }

    public String getCompanyname() {
        return this.companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItin() {
        return this.itin;
    }

    public void setItin(String itin) {
        this.itin = itin;
    }

    public String getLastupdatedby() {
        return this.lastupdatedby;
    }

    public void setLastupdatedby(String lastupdatedby) {
        this.lastupdatedby = lastupdatedby;
    }

    public Date getLastupdatedts() {
        return this.lastupdatedts;
    }

    public void setLastupdatedts(Date lastupdatedts) {
        this.lastupdatedts = lastupdatedts;
    }

    public String getPlannum() {
        return this.plannum;
    }

    public void setPlannum(String plannum) {
        this.plannum = plannum;
    }

    public Date getSetupts() {
        return this.setupts;
    }

    public void setSetupts(Date setupts) {
        this.setupts = setupts;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.math.BigDecimal getSystemclient() {
        return this.systemclient;
    }

    public void setSystemclient(java.math.BigDecimal systemclient) {
        this.systemclient = systemclient;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Date getUpdatedts() {
        return this.updatedts;
    }

    public void setUpdatedts(Date updatedts) {
        this.updatedts = updatedts;
    }

    public ClntIdentification getClntIdentification() {
        return clntIdentification;
    }

    @Override
    public String toString() {
        return "Clnt{" +
                "systemclientid=" + systemclientid +
                ", accoununum='" + accoununum + '\'' +
                ", companyname='" + companyname + '\'' +
                ", id='" + id + '\'' +
                ", itin='" + itin + '\'' +
                ", lastupdatedby='" + lastupdatedby + '\'' +
                ", lastupdatedts=" + lastupdatedts +
                ", plannum='" + plannum + '\'' +
                ", setupts=" + setupts +
                ", status='" + status + '\'' +
                ", systemclient=" + systemclient +
                ", timezone='" + timezone + '\'' +
                ", updatedts=" + updatedts +
                ", clntIdentification=" + clntIdentification +
                '}';
    }
}