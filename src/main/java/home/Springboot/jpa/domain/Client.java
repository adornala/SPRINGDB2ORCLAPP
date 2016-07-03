/*
package home.Springboot.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


*/
/**
 * The persistent class for the CLNT database table.
 * 
 *//*

@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
@Table(name="CLNT")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLNT_SYSTEMCLIENTID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SYSTEMCLIENTID")
	private Integer systemclientid;
	
	@Column(name="ACCOUNUNUM")
	private String accoununum;

	@Column(name="COMPANYNAME")
	private String companyname;
	
	@Column(name="ID")
	private String id;
	
	@Column(name="ITIN")
	private String itin;
	
	@Column(name="LASTUPDATEDBY")
	private String lastupdatedby;
	
	@Column(name="LASTUPDATEDTS")
	@Temporal(TemporalType.DATE)
	private Date lastupdatedts;
	
	@Column(name="PLANNUM")
	private String plannum;
	
	@Column(name="SETUPTS")
	@Temporal(TemporalType.DATE)
	private Date setupts;
	
	@Column(name="STATUS")
	private String status;

	@Column(name="TIMEZONE")
	private String timezone;
	
	@Column(name="UPDATEDTS")
	@Temporal(TemporalType.DATE)
	private Date updatedts;

	public Client() {
	}

	public long getSystemclientid() {
		return this.systemclientid;
	}

	public void setSystemclientid(Integer systemclientid) {
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

	@Override
	public String toString() {
		return "Client [systemclientid=" + systemclientid + ", accoununum=" + accoununum + ", companyname="
				+ companyname + ", id=" + id + ", itin=" + itin + ", lastupdatedby=" + lastupdatedby
				+ ", lastupdatedts=" + lastupdatedts + ", plannum=" + plannum + ", setupts=" + setupts + ", status="
				+ status + ", timezone=" + timezone + ", updatedts=" + updatedts + "]";
	}
	
	
}*/
