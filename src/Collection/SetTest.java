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
		Course i1 = new Course("1","���ݽṹ");
		Course i2 = new Course("2","C����");
		Course[] i34 = {new Course("3","�����ԭ��"),new Course("4","java����")};
		
		courseToSelect.add(i1);
		courseToSelect.add(i2);
		courseToSelect.addAll(Arrays.asList(i34));
		
		Course n1 = (Course)courseToSelect.get(0);
		Course n2 = (Course)courseToSelect.get(1);
		Course n3 = (Course)courseToSelect.get(2);
		Course n4 = (Course)courseToSelect.get(3);
		}

	public void CourseShow() {
		System.out.println("ʹ��foreach��ʾ�γ�");
		for(Course cr :courseToSelect) {
			System.out.println("��ѡ�γ��У�"+cr.id+":"+cr.name);
			
		}
	}
	
	public void CourseSelect() {
		System.out.println("ѧ��ѡ�Σ�");
		
		
	}
	
	public void testListContains() {
		Course cr = courseToSelect.get(0);
		System.out.println("ȡ�ÿγ̣�"+cr.id+":"+cr.name);;
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+cr.name+":"+courseToSelect.contains(cr));
		Course cr2 = new Course(cr.id,cr.name);
		System.out.println("ȡ�ÿγ�"+cr2.id+cr2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+cr2.name+":"+courseToSelect.contains(cr2));
		if(courseToSelect.contains(cr)) {
			System.out.println("�γ̣�"+cr.name+courseToSelect.indexOf(cr));
		}
	}
	
	public void creat() {
		lucy = new Student("1","lucy");
		Scanner in = new Scanner(System.in);
		
		for(int i = 1;i<4;i++) {
			System.out.println("������γ�ID:");
			String j = in.next();
			for(Course cr:courseToSelect) {
				if(cr.id.equals(j)) {
					lucy.courses.add(cr);
				}
				
			}
		}
		

	}
//	public void SelectShow(Student lucy) {
//		System.out.println("���ѧ����ѡ�γ̣�");
//		for(Course cr : lucy.courses) {
//			System.out.println(cr.id+cr.name);
//			
//		}
//	}

//}
	
	public void testSetContains() {
		System.out.println("������ѧ����ѡ�γ����ƣ�");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		Course cr2 =new Course();
		cr2.name = name;
		System.out.println("�´����γ̣�"+cr2.name);
		System.out.println("��ѡ�γ����Ƿ��иÿγ̣�"+cr2.name+":"+lucy.courses.contains(cr2));
		
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
		

