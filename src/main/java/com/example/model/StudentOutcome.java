// default package
// Generated Jan 26, 2018 7:38:22 PM by Hibernate Tools 4.3.5.Final

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

/**
 * StudentOutcome generated by hbm2java
 */
@Entity
@Table(name = "student_outcome", catalog = "test")
public class StudentOutcome implements java.io.Serializable {

	private Integer soId;
	private StudentOutcomeVersion studentOutcomeVersion;
	private String soCode;
	private String soDescVn;
	private String soDescEn;
	private Set<PerformanceIndicatorVersion> performanceIndicatorVersions = new HashSet<PerformanceIndicatorVersion>(0);
	private Set<SoComment> soComments = new HashSet<SoComment>(0);
	private Set<CoSoMap> coSoMaps = new HashSet<CoSoMap>(0);
	private Set<PeoSoMap> peoSoMaps = new HashSet<PeoSoMap>(0);

	public StudentOutcome() {
	}

	public StudentOutcome(String soCode, String soDescVn, String soDescEn) {
		this.soCode = soCode;
		this.soDescVn = soDescVn;
		this.soDescEn = soDescEn;
	}

	public StudentOutcome(StudentOutcomeVersion studentOutcomeVersion, String soCode, String soDescVn, String soDescEn,
			Set<PerformanceIndicatorVersion> performanceIndicatorVersions, Set<SoComment> soComments,
			Set<CoSoMap> coSoMaps, Set<PeoSoMap> peoSoMaps) {
		this.studentOutcomeVersion = studentOutcomeVersion;
		this.soCode = soCode;
		this.soDescVn = soDescVn;
		this.soDescEn = soDescEn;
		this.performanceIndicatorVersions = performanceIndicatorVersions;
		this.soComments = soComments;
		this.coSoMaps = coSoMaps;
		this.peoSoMaps = peoSoMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "so_id", unique = true, nullable = false)
	public Integer getSoId() {
		return this.soId;
	}

	public void setSoId(Integer soId) {
		this.soId = soId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_outcome_version_id")
	public StudentOutcomeVersion getStudentOutcomeVersion() {
		return this.studentOutcomeVersion;
	}

	public void setStudentOutcomeVersion(StudentOutcomeVersion studentOutcomeVersion) {
		this.studentOutcomeVersion = studentOutcomeVersion;
	}

	@Column(name = "so_code", nullable = false, length = 2)
	public String getSoCode() {
		return this.soCode;
	}

	public void setSoCode(String soCode) {
		this.soCode = soCode;
	}

	@Column(name = "so_desc_vn", nullable = false, length = 65535)
	public String getSoDescVn() {
		return this.soDescVn;
	}

	public void setSoDescVn(String soDescVn) {
		this.soDescVn = soDescVn;
	}

	@Column(name = "so_desc_en", nullable = false, length = 65535)
	public String getSoDescEn() {
		return this.soDescEn;
	}

	public void setSoDescEn(String soDescEn) {
		this.soDescEn = soDescEn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcome")
	public Set<PerformanceIndicatorVersion> getPerformanceIndicatorVersions() {
		return this.performanceIndicatorVersions;
	}

	public void setPerformanceIndicatorVersions(Set<PerformanceIndicatorVersion> performanceIndicatorVersions) {
		this.performanceIndicatorVersions = performanceIndicatorVersions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcome")
	public Set<SoComment> getSoComments() {
		return this.soComments;
	}

	public void setSoComments(Set<SoComment> soComments) {
		this.soComments = soComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcome")
	public Set<CoSoMap> getCoSoMaps() {
		return this.coSoMaps;
	}

	public void setCoSoMaps(Set<CoSoMap> coSoMaps) {
		this.coSoMaps = coSoMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcome")
	public Set<PeoSoMap> getPeoSoMaps() {
		return this.peoSoMaps;
	}

	public void setPeoSoMaps(Set<PeoSoMap> peoSoMaps) {
		this.peoSoMaps = peoSoMaps;
	}

}
