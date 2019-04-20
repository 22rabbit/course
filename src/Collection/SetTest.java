package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	public List<Course> courseToSelect;
	public Scanner in;
	public Student lucy;
	
	public SetTest() {
		this.courseToSelect = new ArrayList<Course>();
		
	}
	
	public void CourseAdd() {
		Course i1 = new Course("1","数据结构");
		Course i2 = new Course("2","C语言");
		Course[] i34 = {new Course("3","计算机原理"),new Course("4","java基础")};
		
		courseToSelect.add(i1);
		courseToSelect.add(i2);
		courseToSelect.addAll(Arrays.asList(i34));
		
		Course n1 = (Course)courseToSelect.get(0);
		Course n2 = (Course)courseToSelect.get(1);
		Course n3 = (Course)courseToSelect.get(2);
		Course n4 = (Course)courseToSelect.get(3);
		}

	public void CourseShow() {
		System.out.println("使用foreach显示课程");
		for(Course cr :courseToSelect) {
			System.out.println("可选课程有："+cr.id+":"+cr.name);
			
		}
	}
	
	public void CourseSelect() {
		System.out.println("学生选课：");
		
		
	}
	
	public void testListContains() {
		Course cr = courseToSelect.get(0);
		System.out.println("取得课程："+cr.id+":"+cr.name);;
		System.out.println("备选课程中是否包含课程？"+cr.name+":"+courseToSelect.contains(cr));
		Course cr2 = new Course(cr.id,cr.name);
		System.out.println("取得课程"+cr2.id+cr2.name);
		System.out.println("备选课程中是否包含课程？"+cr2.name+":"+courseToSelect.contains(cr2));
		if(courseToSelect.contains(cr)) {
			System.out.println("课程："+cr.name+courseToSelect.indexOf(cr));
		}
	}
	
	public void creat() {
		lucy = new Student("1","lucy");
		Scanner in = new Scanner(System.in);
		
		for(int i = 1;i<4;i++) {
			System.out.println("请输入课程ID:");
			String j = in.next();
			for(Course cr:courseToSelect) {
				if(cr.id.equals(j)) {
					lucy.courses.add(cr);
				}
				
			}
		}
		

	}
//	public void SelectShow(Student lucy) {
//		System.out.println("输出学生所选课程：");
//		for(Course cr : lucy.courses) {
//			System.out.println(cr.id+cr.name);
//			
//		}
//	}

//}
	
	public void testSetContains() {
		System.out.println("请输入学生已选课程名称：");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		Course cr2 =new Course();
		cr2.name = name;
		System.out.println("新创建课程："+cr2.name);
		System.out.println("备选课程中是否含有该课程？"+cr2.name+":"+lucy.courses.contains(cr2));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest test = new SetTest();
		test.CourseAdd();
		test.CourseShow();
		test.testListContains();
//		test.SelectShow(lucy);
		test.creat();
		test.testSetContains();
	
	}
}
		

