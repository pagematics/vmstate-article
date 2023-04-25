package content;

import java.util.Date;

public class CommentTO {
	private int	commentId;
	private String	commentData; 
	private String	entityType;
	private int	entityId;
	private int	userCreated;
	private int	userModified;
	private Date createdTime;
	private Date updatedTime;
	private int	siteId;
	private int	applicationId;
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentData() {
		return commentData;
	}
	public void setCommentData(String commentData) {
		this.commentData = commentData;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public int getEntityId() {
		return entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
	public int getUserCreated() {
		return userCreated;
	}
	public void setUserCreated(int userCreated) {
		this.userCreated = userCreated;
	}
	public int getUserModified() {
		return userModified;
	}
	public void setUserModified(int userModified) {
		this.userModified = userModified;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
}
