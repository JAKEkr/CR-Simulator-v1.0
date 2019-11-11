package Model;

public class LectureVO {
	public String openUniv = null; //��������
	public String major = null; //�����а�����
	public String courseNum = null; //�м���ȣ
	public String classNum = null; //�й�
	public String className = null; //�������
	public String completion = null; //�̼�����
	public int grade; //�г�
	public int score; //����
	public String time = null; // ���� �� ���ǽð�
	public String classRoom = null; //���ǽ�
	public String professor = null; //����
	
	public LectureVO() {
		
	}
	
	public LectureVO(String openUniv,String major,String courseNum,String classNum, String className, String completion,String grade,String score,String time, String classRoom, String professor) {
		this.openUniv = openUniv;
		this.major = major;
		this.courseNum = courseNum;
		this.classNum = classNum;
		this.className = className;
		this.completion = completion;
		this.grade = Integer.parseInt(grade);
		this.score = Integer.parseInt(score);
		this.time = time;
		this.classRoom = classRoom;
		this.professor = professor;
	}
}
