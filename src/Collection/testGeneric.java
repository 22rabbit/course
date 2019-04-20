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
		Course cr1 = new Course("1","java基础");
		Course cr2 = new Course("2","C语言");
		b.add(4);
		courses.add(cr1);
		courses.add(cr2);
		
		
	}
	
	
	public void testChild() {
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "计算机原理";
		courses.add(ccr);
		
		
	}
	
	public void testBasic() {
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		System.out.println("基本类型要用包装类作为输出"+b.get(0));
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
