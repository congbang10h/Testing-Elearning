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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * QuestionTypeDict generated by hbm2java
 */
@Entity
@Table(name = "question_type_dict", catalog = "test")
public class QuestionTypeDict implements java.io.Serializable {

	private Integer questionTypeId;
	private String questionTypeCode;
	private String questionTypeDesc;
	private Set<Question> questions = new HashSet<Question>(0);

	public QuestionTypeDict() {
	}

	public QuestionTypeDict(String questionTypeCode, String questionTypeDesc) {
		this.questionTypeCode = questionTypeCode;
		this.questionTypeDesc = questionTypeDesc;
	}

	public QuestionTypeDict(String questionTypeCode, String questionTypeDesc, Set<Question> questions) {
		this.questionTypeCode = questionTypeCode;
		this.questionTypeDesc = questionTypeDesc;
		this.questions = questions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_type_id", unique = true, nullable = false)
	public Integer getQuestionTypeId() {
		return this.questionTypeId;
	}

	public void setQuestionTypeId(Integer questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	@Column(name = "question_type_code", nullable = false, length = 20)
	public String getQuestionTypeCode() {
		return this.questionTypeCode;
	}

	public void setQuestionTypeCode(String questionTypeCode) {
		this.questionTypeCode = questionTypeCode;
	}

	@Column(name = "question_type_desc", nullable = false, length = 65535)
	public String getQuestionTypeDesc() {
		return this.questionTypeDesc;
	}

	public void setQuestionTypeDesc(String questionTypeDesc) {
		this.questionTypeDesc = questionTypeDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionTypeDict")
	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

}
