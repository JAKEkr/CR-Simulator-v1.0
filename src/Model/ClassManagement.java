package Model;

import java.util.*;

// �̱��� ����� ���� ClassManagement
public class ClassManagement {
	//��� ������ ���� ��ü�� �����ؾ� �� ��쿡�� ����ٰ� ��ü�� ����� �ְ� ����ϸ� �˴ϴ�.
    //��ü�� �ҷ��ö����� ClassManagement.GetInstance().~~~
	
	private static ClassManagement s_instance;
	private ArrayList<LectureVO> m_interestedList;
	private ArrayList<LectureVO> m_realList;
	
	public static ClassManagement getInstance() {
		if (s_instance == null) s_instance = new ClassManagement();
		return s_instance;
	}
	
	public ArrayList<LectureVO> getInterested(){
		if(m_interestedList == null) m_interestedList = new ArrayList<LectureVO>();
		return m_interestedList;
	}
	
	public ArrayList<LectureVO> getReal(){
		if(m_realList == null) m_realList = new ArrayList<LectureVO>();
		return m_realList;
	}
}
