package home.Springboot.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the CLNT database table.
 * 
 */
@Entity
@NamedQuery(name="Clnt.findAll", query="SELECT c FROM Clnt c")
public class Clnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long systemclientid;

	private String accoununum;

	private String companyname;

	private String id;

	private String itin;

	private String lastupdatedby;

	@Temporal(TemporalType.DATE)
	private Date lastupdatedts;

	private String plannum;

	@Temporal(TemporalType.DATE)
	private Date setupts;

	private String status;

	private String timezone;

	@Temporal(TemporalType.DATE)
	private Date updatedts;

	//bi-directional one-to-one association to ClntIdentification
	@OneToOne
	@JoinColumn(name="SYSTEMCLIENTID")
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
		return this.clntIdentification;
	}

	public void setClntIdentification(ClntIdentification clntIdentification) {
		this.clntIdentification = clntIdentification;
	}

}