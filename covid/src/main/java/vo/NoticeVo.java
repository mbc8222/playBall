package vo;

public class NoticeVo {

	String rno;
	String serial;
	String id;
	String title;
	String content;
	String time;
	public String getRno() {
		return rno;
	}
	public void setRno(String rno) {
		this.rno = rno;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "NoticeVo [rno=" + rno + ", serial=" + serial + ", id=" + id + ", title=" + title + ", content="
				+ content + ", time=" + time + "]";
	}
	
	
	
	
	
	
}
