// default package
// Generated Jan 26, 2018 7:38:22 PM by Hibernate Tools 4.3.5.Final

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
 * CourseAccessMode generated by hbm2java
 */
@Entity
@Table(name = "course_access_mode", catalog = "test")
public class CourseAccessMode implements java.io.Serializable {

	private Integer courseAccessModeId;
	private Course course;
	private Previledge previledge;
	private User userByAccessorId;
	private User userByGrantorId;
	private Date courseAccessModeGrantedDate;
	private Date courseAccessModeValidStartdate;
	private Date courseAccessModeValidEnddate;
	private Date courseAccessModeValidStarttime;
	private Date courseAccessModeEndtime;
	private boolean courseAccessModeIsDisabled;
	private String courseAccessModeDesc;
	private Set<CourseComment> courseComments = new HashSet<CourseComment>(0);

	public CourseAccessMode() {
	}

	public CourseAccessMode(Date courseAccessModeGrantedDate, Date courseAccessModeValidStartdate,
			Date courseAccessModeValidStarttime, boolean courseAccessModeIsDisabled) {
		this.courseAccessModeGrantedDate = courseAccessModeGrantedDate;
		this.courseAccessModeValidStartdate = courseAccessModeValidStartdate;
		this.courseAccessModeValidStarttime = courseAccessModeValidStarttime;
		this.courseAccessModeIsDisabled = courseAccessModeIsDisabled;
	}

	public CourseAccessMode(Course course, Previledge previledge, User userByAccessorId, User userByGrantorId,
			Date courseAccessModeGrantedDate, Date courseAccessModeValidStartdate, Date courseAccessModeValidEnddate,
			Date courseAccessModeValidStarttime, Date courseAccessModeEndtime, boolean courseAccessModeIsDisabled,
			String courseAccessModeDesc, Set<CourseComment> courseComments) {
		this.course = course;
		this.previledge = previledge;
		this.userByAccessorId = userByAccessorId;
		this.userByGrantorId = userByGrantorId;
		this.courseAccessModeGrantedDate = courseAccessModeGrantedDate;
		this.courseAccessModeValidStartdate = courseAccessModeValidStartdate;
		this.courseAccessModeValidEnddate = courseAccessModeValidEnddate;
		this.courseAccessModeValidStarttime = courseAccessModeValidStarttime;
		this.courseAccessModeEndtime = courseAccessModeEndtime;
		this.courseAccessModeIsDisabled = courseAccessModeIsDisabled;
		this.courseAccessModeDesc = courseAccessModeDesc;
		this.courseComments = courseComments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_access_mode_id", unique = true, nullable = false)
	public Integer getCourseAccessModeId() {
		return this.courseAccessModeId;
	}

	public void setCourseAccessModeId(Integer courseAccessModeId) {
		this.courseAccessModeId = courseAccessModeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "previledge_id")
	public Previledge getPreviledge() {
		return this.previledge;
	}

	public void setPreviledge(Previledge previledge) {
		this.previledge = previledge;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accessor_id")
	public User getUserByAccessorId() {
		return this.userByAccessorId;
	}

	public void setUserByAccessorId(User userByAccessorId) {
		this.userByAccessorId = userByAccessorId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grantor_id")
	public User getUserByGrantorId() {
		return this.userByGrantorId;
	}

	public void setUserByGrantorId(User userByGrantorId) {
		this.userByGrantorId = userByGrantorId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "course_access_mode_granted_date", nullable = false, length = 10)
	public Date getCourseAccessModeGrantedDate() {
		return this.courseAccessModeGrantedDate;
	}

	public void setCourseAccessModeGrantedDate(Date courseAccessModeGrantedDate) {
		this.courseAccessModeGrantedDate = courseAccessModeGrantedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "course_access_mode_valid_startdate", nullable = false, length = 10)
	public Date getCourseAccessModeValidStartdate() {
		return this.courseAccessModeValidStartdate;
	}

	public void setCourseAccessModeValidStartdate(Date courseAccessModeValidStartdate) {
		this.courseAccessModeValidStartdate = courseAccessModeValidStartdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "course_access_mode_valid_enddate", length = 10)
	public Date getCourseAccessModeValidEnddate() {
		return this.courseAccessModeValidEnddate;
	}

	public void setCourseAccessModeValidEnddate(Date courseAccessModeValidEnddate) {
		this.courseAccessModeValidEnddate = courseAccessModeValidEnddate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "course_access_mode_valid_starttime", nullable = false, length = 8)
	public Date getCourseAccessModeValidStarttime() {
		return this.courseAccessModeValidStarttime;
	}

	public void setCourseAccessModeValidStarttime(Date courseAccessModeValidStarttime) {
		this.courseAccessModeValidStarttime = courseAccessModeValidStarttime;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "course_access_mode_endtime", length = 8)
	public Date getCourseAccessModeEndtime() {
		return this.courseAccessModeEndtime;
	}

	public void setCourseAccessModeEndtime(Date courseAccessModeEndtime) {
		this.courseAccessModeEndtime = courseAccessModeEndtime;
	}

	@Column(name = "course_access_mode_is_disabled", nullable = false)
	public boolean isCourseAccessModeIsDisabled() {
		return this.courseAccessModeIsDisabled;
	}

	public void setCourseAccessModeIsDisabled(boolean courseAccessModeIsDisabled) {
		this.courseAccessModeIsDisabled = courseAccessModeIsDisabled;
	}

	@Column(name = "course_access_mode_desc", length = 65535)
	public String getCourseAccessModeDesc() {
		return this.courseAccessModeDesc;
	}

	public void setCourseAccessModeDesc(String courseAccessModeDesc) {
		this.courseAccessModeDesc = courseAccessModeDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseAccessMode")
	public Set<CourseComment> getCourseComments() {
		return this.courseComments;
	}

	public void setCourseComments(Set<CourseComment> courseComments) {
		this.courseComments = courseComments;
	}

}
