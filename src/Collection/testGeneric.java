package Collection;

import java.util.ArrayList;
import java.util.List;

public class testGeneric {
	
	public List<Course> courses;
	public List<Integer> b;
	
	public testGeneric() {
		this.courses = new ArrayList<Course>();
		this.b = new ArrayList<Integer>();

		
	}
	
	public void testAdd() {
		Course cr1 = new Course("1","java����");
		Course cr2 = new Course("2","C����");
		b.add(4);
		courses.add(cr1);
		courses.add(cr2);
		
		
	}
	
	
	public void testChild() {
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "�����ԭ��";
		courses.add(ccr);
		
		
	}
	
	public void testBasic() {
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		System.out.println("��������Ҫ�ð�װ����Ϊ���"+b.get(0));
	}
	public void testShow() {
		
		for(Course cr: courses) {
			System.out.println(cr.id+cr.name);
		}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGeneric m = new testGeneric();
		m.testAdd();
		m.testShow();
		m.testChild();
		m.testShow();
		m.testBasic();

	}

}
