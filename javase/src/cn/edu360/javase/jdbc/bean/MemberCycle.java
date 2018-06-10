package cn.edu360.javase.jdbc.bean;

/**
 * CREATE TABLE `member_cycle` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `currentId` int(10) NOT NULL,
  `currentIdweight` int(10) NOT NULL,
  `nextUserId` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
 * @author Liu Ming
 * @createdTime 2018年6月6日 上午12:39:57
 */
public class MemberCycle {
	
	private int id;
	private int currentId;
	private int currentIdweight;
	private int nextUserId;
	
	
	public MemberCycle() {
		super();
	}
	
	
	public MemberCycle(int id, int currentId, int currentIdweight, int nextUserId) {
		super();
		this.id = id;
		this.currentId = currentId;
		this.currentIdweight = currentIdweight;
		this.nextUserId = nextUserId;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCurrentId() {
		return currentId;
	}
	public void setCurrentId(int currentId) {
		this.currentId = currentId;
	}
	public int getCurrentIdweight() {
		return currentIdweight;
	}
	public void setCurrentIdweight(int currentIdweight) {
		this.currentIdweight = currentIdweight;
	}
	public int getNextUserId() {
		return nextUserId;
	}
	public void setNextUserId(int nextUserId) {
		this.nextUserId = nextUserId;
	}
	@Override
	public String toString() {
		return "MemberCycle [id=" + id + ", currentId=" + currentId + ", currentIdweight=" + currentIdweight
				+ ", nextUserId=" + nextUserId + "]";
	}
	
	
	
}
