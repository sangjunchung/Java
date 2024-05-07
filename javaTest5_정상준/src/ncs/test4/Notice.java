package ncs.test4;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Notice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int no;
	private String title;
	private Date date;
	private String writer;
	private String content;

	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public Date getDate() {
		return date;
	}

	public String getWriter() {
		return writer;
	}

	public String getContent() {
		return content;
	}

	public Notice() {

	}

	public Notice(int no, String title, Calendar date, String writer, String content) {
		this.no = no;
		this.title = title;
		this.date = date.getTime();
		this.writer = writer;
		this.content = content;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formatDate = sdf.format(date);

		return no + " " + title + " " + formatDate + " " + writer + " " + content;
	}
}
