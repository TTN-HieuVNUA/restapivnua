package convertHtmlToObject;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RawScheduleDetail extends RawSchedule implements Comparable<RawScheduleDetail>{
private int id;
	
	private Timestamp time;

	private String startTimeToEnd;

	private List<RawStudent> rawStudentList = new ArrayList<RawStudent>();

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}



	public String getStartTimeToEnd() {
		return startTimeToEnd;
	}

	public void setStartTimeToEnd(String startTimeToEnd) {
		this.startTimeToEnd = startTimeToEnd;
	}

	public List<RawStudent> getRawStudentList() {
		return rawStudentList;
	}



	@Override
	public int compareTo(RawScheduleDetail o) {
		
		return getTime().compareTo(o.getTime());
	}

}
