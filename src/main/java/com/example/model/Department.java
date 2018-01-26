package model;
// Generated Jan 26, 2018 10:48:47 AM by Hibernate Tools 4.3.5.Final

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
 * Department generated by hbm2java
 */
@Entity
@Table(name = "department", catalog = "test")
public class Department implements java.io.Serializable {

	private Integer deptId;
	private Faculty faculty;
	private String deptCode;
	private String deptNameVn;
	private String deptNameEn;
	private Set<DeptCourseMap> deptCourseMaps = new HashSet<DeptCourseMap>(0);

	public Department() {
	}

	public Department(String deptCode, String deptNameVn, String deptNameEn) {
		this.deptCode = deptCode;
		this.deptNameVn = deptNameVn;
		this.deptNameEn = deptNameEn;
	}

	public Department(Faculty faculty, String deptCode, String deptNameVn, String deptNameEn,
			Set<DeptCourseMap> deptCourseMaps) {
		this.faculty = faculty;
		this.deptCode = deptCode;
		this.deptNameVn = deptNameVn;
		this.deptNameEn = deptNameEn;
		this.deptCourseMaps = deptCourseMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "dept_id", unique = true, nullable = false)
	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "faculty_id")
	public Faculty getFaculty() {
		return this.faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Column(name = "dept_code", nullable = false, length = 5)
	public String getDeptCode() {
		return this.deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Column(name = "dept_name_vn", nullable = false, length = 65535)
	public String getDeptNameVn() {
		return this.deptNameVn;
	}

	public void setDeptNameVn(String deptNameVn) {
		this.deptNameVn = deptNameVn;
	}

	@Column(name = "dept_name_en", nullable = false, length = 65535)
	public String getDeptNameEn() {
		return this.deptNameEn;
	}

	public void setDeptNameEn(String deptNameEn) {
		this.deptNameEn = deptNameEn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<DeptCourseMap> getDeptCourseMaps() {
		return this.deptCourseMaps;
	}

	public void setDeptCourseMaps(Set<DeptCourseMap> deptCourseMaps) {
		this.deptCourseMaps = deptCourseMaps;
	}

}