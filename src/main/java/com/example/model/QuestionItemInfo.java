// default package
// Generated Jan 26, 2018 7:38:22 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * QuestionItemInfo generated by hbm2java
 */
@Entity
@Table(name = "question_item_info", catalog = "test")
public class QuestionItemInfo implements java.io.Serializable {

	private Integer questionItemInfoId;
	private QuestionItem questionItem;
	private String questionItemInfoProp;
	private String questionItemInfoValue;
	private String questionItemInfoDesc;

	public QuestionItemInfo() {
	}

	public QuestionItemInfo(String questionItemInfoProp, String questionItemInfoValue) {
		this.questionItemInfoProp = questionItemInfoProp;
		this.questionItemInfoValue = questionItemInfoValue;
	}

	public QuestionItemInfo(QuestionItem questionItem, String questionItemInfoProp, String questionItemInfoValue,
			String questionItemInfoDesc) {
		this.questionItem = questionItem;
		this.questionItemInfoProp = questionItemInfoProp;
		this.questionItemInfoValue = questionItemInfoValue;
		this.questionItemInfoDesc = questionItemInfoDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_item_info_id", unique = true, nullable = false)
	public Integer getQuestionItemInfoId() {
		return this.questionItemInfoId;
	}

	public void setQuestionItemInfoId(Integer questionItemInfoId) {
		this.questionItemInfoId = questionItemInfoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id")
	public QuestionItem getQuestionItem() {
		return this.questionItem;
	}

	public void setQuestionItem(QuestionItem questionItem) {
		this.questionItem = questionItem;
	}

	@Column(name = "question_item_info_prop", nullable = false, length = 10)
	public String getQuestionItemInfoProp() {
		return this.questionItemInfoProp;
	}

	public void setQuestionItemInfoProp(String questionItemInfoProp) {
		this.questionItemInfoProp = questionItemInfoProp;
	}

	@Column(name = "question_item_info_value", nullable = false, length = 65535)
	public String getQuestionItemInfoValue() {
		return this.questionItemInfoValue;
	}

	public void setQuestionItemInfoValue(String questionItemInfoValue) {
		this.questionItemInfoValue = questionItemInfoValue;
	}

	@Column(name = "question_item_info_desc", length = 65535)
	public String getQuestionItemInfoDesc() {
		return this.questionItemInfoDesc;
	}

	public void setQuestionItemInfoDesc(String questionItemInfoDesc) {
		this.questionItemInfoDesc = questionItemInfoDesc;
	}

}
