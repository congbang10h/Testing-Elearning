package model;
// Generated Jan 26, 2018 10:48:47 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TopicAccessMode generated by hbm2java
 */
@Entity
@Table(name = "topic_access_mode", catalog = "test")
public class TopicAccessMode implements java.io.Serializable {

	private Integer topicAccessModeId;
	private Previledge previledge;
	private Topic topic;
	private User userByAccessorId;
	private User userByGrantorId;
	private Date topicAccessModeGrantedDate;
	private Date topicAccessModeValidStartdate;
	private Date topicAccessModeValidEnddate;
	private Date topicAccessModeValidStarttime;
	private Date topicAccessModeValidEndtime;
	private boolean topicAccessModeIsDisabled;
	private String topicAccessModeDesc;

	public TopicAccessMode() {
	}

	public TopicAccessMode(Date topicAccessModeGrantedDate, Date topicAccessModeValidStartdate,
			Date topicAccessModeValidStarttime, boolean topicAccessModeIsDisabled) {
		this.topicAccessModeGrantedDate = topicAccessModeGrantedDate;
		this.topicAccessModeValidStartdate = topicAccessModeValidStartdate;
		this.topicAccessModeValidStarttime = topicAccessModeValidStarttime;
		this.topicAccessModeIsDisabled = topicAccessModeIsDisabled;
	}

	public TopicAccessMode(Previledge previledge, Topic topic, User userByAccessorId, User userByGrantorId,
			Date topicAccessModeGrantedDate, Date topicAccessModeValidStartdate, Date topicAccessModeValidEnddate,
			Date topicAccessModeValidStarttime, Date topicAccessModeValidEndtime, boolean topicAccessModeIsDisabled,
			String topicAccessModeDesc) {
		this.previledge = previledge;
		this.topic = topic;
		this.userByAccessorId = userByAccessorId;
		this.userByGrantorId = userByGrantorId;
		this.topicAccessModeGrantedDate = topicAccessModeGrantedDate;
		this.topicAccessModeValidStartdate = topicAccessModeValidStartdate;
		this.topicAccessModeValidEnddate = topicAccessModeValidEnddate;
		this.topicAccessModeValidStarttime = topicAccessModeValidStarttime;
		this.topicAccessModeValidEndtime = topicAccessModeValidEndtime;
		this.topicAccessModeIsDisabled = topicAccessModeIsDisabled;
		this.topicAccessModeDesc = topicAccessModeDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "topic_access_mode_id", unique = true, nullable = false)
	public Integer getTopicAccessModeId() {
		return this.topicAccessModeId;
	}

	public void setTopicAccessModeId(Integer topicAccessModeId) {
		this.topicAccessModeId = topicAccessModeId;
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
	@JoinColumn(name = "topic_id")
	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
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
	@Column(name = "topic_access_mode_granted_date", nullable = false, length = 10)
	public Date getTopicAccessModeGrantedDate() {
		return this.topicAccessModeGrantedDate;
	}

	public void setTopicAccessModeGrantedDate(Date topicAccessModeGrantedDate) {
		this.topicAccessModeGrantedDate = topicAccessModeGrantedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "topic_access_mode_valid_startdate", nullable = false, length = 10)
	public Date getTopicAccessModeValidStartdate() {
		return this.topicAccessModeValidStartdate;
	}

	public void setTopicAccessModeValidStartdate(Date topicAccessModeValidStartdate) {
		this.topicAccessModeValidStartdate = topicAccessModeValidStartdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "topic_access_mode_valid_enddate", length = 10)
	public Date getTopicAccessModeValidEnddate() {
		return this.topicAccessModeValidEnddate;
	}

	public void setTopicAccessModeValidEnddate(Date topicAccessModeValidEnddate) {
		this.topicAccessModeValidEnddate = topicAccessModeValidEnddate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "topic_access_mode_valid_starttime", nullable = false, length = 8)
	public Date getTopicAccessModeValidStarttime() {
		return this.topicAccessModeValidStarttime;
	}

	public void setTopicAccessModeValidStarttime(Date topicAccessModeValidStarttime) {
		this.topicAccessModeValidStarttime = topicAccessModeValidStarttime;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "topic_access_mode_valid_endtime", length = 8)
	public Date getTopicAccessModeValidEndtime() {
		return this.topicAccessModeValidEndtime;
	}

	public void setTopicAccessModeValidEndtime(Date topicAccessModeValidEndtime) {
		this.topicAccessModeValidEndtime = topicAccessModeValidEndtime;
	}

	@Column(name = "topic_access_mode_is_disabled", nullable = false)
	public boolean isTopicAccessModeIsDisabled() {
		return this.topicAccessModeIsDisabled;
	}

	public void setTopicAccessModeIsDisabled(boolean topicAccessModeIsDisabled) {
		this.topicAccessModeIsDisabled = topicAccessModeIsDisabled;
	}

	@Column(name = "topic_access_mode_desc", length = 65535)
	public String getTopicAccessModeDesc() {
		return this.topicAccessModeDesc;
	}

	public void setTopicAccessModeDesc(String topicAccessModeDesc) {
		this.topicAccessModeDesc = topicAccessModeDesc;
	}

}