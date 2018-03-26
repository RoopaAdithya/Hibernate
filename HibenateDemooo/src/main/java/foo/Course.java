package foo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Course {

	@Id
	private int cid;
	private String cnmae;
	private int duration;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCnmae() {
		return cnmae;
	}
	public void setCnmae(String cnmae) {
		this.cnmae = cnmae;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course() {
		super();
	}
	
	
	
}
