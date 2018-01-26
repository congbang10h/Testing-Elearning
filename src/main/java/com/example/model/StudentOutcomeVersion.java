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
 * StudentOutcomeVersion generated by hbm2java
 */
@Entity
@Table(name = "student_outcome_version", catalog = "test")
public class StudentOutcomeVersion implements java.io.Serializable {

	private Integer studentOutcomeVersionId;
	private EducationalProgram educationalProgram;
	private String studentOutcomeVersionCode;
	private Date studentOutcomeVersionDate;
	private boolean studentOutcomeVersionIsused;
	private Set<CoSoMapVersion> coSoMapVersions = new HashSet<CoSoMapVersion>(0);
	private Set<StudentOutcome> studentOutcomes = new HashSet<StudentOutcome>(0);
	private Set<PeoSoMapVersion> peoSoMapVersions = new HashSet<PeoSoMapVersion>(0);

	public StudentOutcomeVersion() {
	}

	public StudentOutcomeVersion(String studentOutcomeVersionCode, Date studentOutcomeVersionDate,
			boolean studentOutcomeVersionIsused) {
		this.studentOutcomeVersionCode = studentOutcomeVersionCode;
		this.studentOutcomeVersionDate = studentOutcomeVersionDate;
		this.studentOutcomeVersionIsused = studentOutcomeVersionIsused;
	}

	public StudentOutcomeVersion(EducationalProgram educationalProgram, String studentOutcomeVersionCode,
			Date studentOutcomeVersionDate, boolean studentOutcomeVersionIsused, Set<CoSoMapVersion> coSoMapVersions,
			Set<StudentOutcome> studentOutcomes, Set<PeoSoMapVersion> peoSoMapVersions) {
		this.educationalProgram = educationalProgram;
		this.studentOutcomeVersionCode = studentOutcomeVersionCode;
		this.studentOutcomeVersionDate = studentOutcomeVersionDate;
		this.studentOutcomeVersionIsused = studentOutcomeVersionIsused;
		this.coSoMapVersions = coSoMapVersions;
		this.studentOutcomes = studentOutcomes;
		this.peoSoMapVersions = peoSoMapVersions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "student_outcome_version_id", unique = true, nullable = false)
	public Integer getStudentOutcomeVersionId() {
		return this.studentOutcomeVersionId;
	}

	public void setStudentOutcomeVersionId(Integer studentOutcomeVersionId) {
		this.studentOutcomeVersionId = studentOutcomeVersionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edu_program_id")
	public EducationalProgram getEducationalProgram() {
		return this.educationalProgram;
	}

	public void setEducationalProgram(EducationalProgram educationalProgram) {
		this.educationalProgram = educationalProgram;
	}

	@Column(name = "student_outcome_version_code", nullable = false, length = 10)
	public String getStudentOutcomeVersionCode() {
		return this.studentOutcomeVersionCode;
	}

	public void setStudentOutcomeVersionCode(String studentOutcomeVersionCode) {
		this.studentOutcomeVersionCode = studentOutcomeVersionCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "student_outcome_version_date", nullable = false, length = 10)
	public Date getStudentOutcomeVersionDate() {
		return this.studentOutcomeVersionDate;
	}

	public void setStudentOutcomeVersionDate(Date studentOutcomeVersionDate) {
		this.studentOutcomeVersionDate = studentOutcomeVersionDate;
	}

	@Column(name = "student_outcome_version_isused", nullable = false)
	public boolean isStudentOutcomeVersionIsused() {
		return this.studentOutcomeVersionIsused;
	}

	public void setStudentOutcomeVersionIsused(boolean studentOutcomeVersionIsused) {
		this.studentOutcomeVersionIsused = studentOutcomeVersionIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcomeVersion")
	public Set<CoSoMapVersion> getCoSoMapVersions() {
		return this.coSoMapVersions;
	}

	public void setCoSoMapVersions(Set<CoSoMapVersion> coSoMapVersions) {
		this.coSoMapVersions = coSoMapVersions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcomeVersion")
	public Set<StudentOutcome> getStudentOutcomes() {
		return this.studentOutcomes;
	}

	public void setStudentOutcomes(Set<StudentOutcome> studentOutcomes) {
		this.studentOutcomes = studentOutcomes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcomeVersion")
	public Set<PeoSoMapVersion> getPeoSoMapVersions() {
		return this.peoSoMapVersions;
	}

	public void setPeoSoMapVersions(Set<PeoSoMapVersion> peoSoMapVersions) {
		this.peoSoMapVersions = peoSoMapVersions;
	}

}
