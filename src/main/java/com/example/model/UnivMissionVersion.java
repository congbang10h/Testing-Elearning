package model;
// Generated Jan 26, 2018 10:48:47 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UnivMissionVersion generated by hbm2java
 */
@Entity
@Table(name = "univ_mission_version", catalog = "test")
public class UnivMissionVersion implements java.io.Serializable {

	private Integer univMissionVersionId;
	private University university;
	private String univMissionVersionCode;
	private Date univMissionVersionDate;
	private boolean univMissionVersionIsused;
	private Set<UnivMission> univMissions = new HashSet<UnivMission>(0);
	private Set<PeoMissionMapVersion> peoMissionMapVersions = new HashSet<PeoMissionMapVersion>(0);

	public UnivMissionVersion() {
	}

	public UnivMissionVersion(String univMissionVersionCode, Date univMissionVersionDate,
			boolean univMissionVersionIsused) {
		this.univMissionVersionCode = univMissionVersionCode;
		this.univMissionVersionDate = univMissionVersionDate;
		this.univMissionVersionIsused = univMissionVersionIsused;
	}

	public UnivMissionVersion(University university, String univMissionVersionCode, Date univMissionVersionDate,
			boolean univMissionVersionIsused, Set<UnivMission> univMissions,
			Set<PeoMissionMapVersion> peoMissionMapVersions) {
		this.university = university;
		this.univMissionVersionCode = univMissionVersionCode;
		this.univMissionVersionDate = univMissionVersionDate;
		this.univMissionVersionIsused = univMissionVersionIsused;
		this.univMissions = univMissions;
		this.peoMissionMapVersions = peoMissionMapVersions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "univ_mission_version_id", unique = true, nullable = false)
	public Integer getUnivMissionVersionId() {
		return this.univMissionVersionId;
	}

	public void setUnivMissionVersionId(Integer univMissionVersionId) {
		this.univMissionVersionId = univMissionVersionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "univ_id")
	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Column(name = "univ_mission_version_code", nullable = false, length = 10)
	public String getUnivMissionVersionCode() {
		return this.univMissionVersionCode;
	}

	public void setUnivMissionVersionCode(String univMissionVersionCode) {
		this.univMissionVersionCode = univMissionVersionCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "univ_mission_version_date", nullable = false, length = 10)
	public Date getUnivMissionVersionDate() {
		return this.univMissionVersionDate;
	}

	public void setUnivMissionVersionDate(Date univMissionVersionDate) {
		this.univMissionVersionDate = univMissionVersionDate;
	}

	@Column(name = "univ_mission_version_isused", nullable = false)
	public boolean isUnivMissionVersionIsused() {
		return this.univMissionVersionIsused;
	}

	public void setUnivMissionVersionIsused(boolean univMissionVersionIsused) {
		this.univMissionVersionIsused = univMissionVersionIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "univMissionVersion")
	public Set<UnivMission> getUnivMissions() {
		return this.univMissions;
	}

	public void setUnivMissions(Set<UnivMission> univMissions) {
		this.univMissions = univMissions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "univMissionVersion")
	public Set<PeoMissionMapVersion> getPeoMissionMapVersions() {
		return this.peoMissionMapVersions;
	}

	public void setPeoMissionMapVersions(Set<PeoMissionMapVersion> peoMissionMapVersions) {
		this.peoMissionMapVersions = peoMissionMapVersions;
	}

}