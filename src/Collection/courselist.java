package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class courselist {
	public List courseToSelect;
	
	public courselist() {
		this.courseToSelect = new ArrayList();
		
	}
	public void courseAdd(){
		Course i1 = new Course("1","���ݽṹ");
		Course i2 =new Course("2","���ݿ�");
		Course i3 = new Course("2","���ݿ�");
		
		courseToSelect.add(i1);
		courseToSelect.add(0,i2);
		courseToSelect.add(i3);
		
		Course n = (Course)courseToSelect.get(0);
		Course m = (Course)courseToSelect.get(1);
		Course o = (Course)courseToSelect.get(2);
		
		System.out.println("��ѡ��һ�ڿ�Ϊ��"+n.id +":"+n.name);
		System.out.println("��ѡ�ڶ��ڿ�Ϊ��"+m.id +":"+m.name);
		System.out.println("��ѡ�����ڿ�Ϊ��"+o.id +":"+o.name);
		
		Course[] course = {new Course("3","�Զ�����ԭ��"),new Course("4","�������Ӽ���")};
		courseToSelect.addAll(Arrays.asList(course));
		Course i4 = (Course)courseToSelect.get(3);
		Course i5 =(Course)courseToSelect.get(4);
		System.out.println("��������ſγ̣�"+i4.id+":"+i4.name+";"+i5.id+":"+i5.name);
		Course[] course2 = {new Course("5","�ִ���������"),new Course("6","�˶�����ϵͳ")};
		courseToSelect.addAll(Arrays.asList(course2));
	}
//		
		public void testGet(){
			int size = courseToSelect.size();
			System.out.println("�����±�ѡ�γ̣�");
			for(int i = 0;i<size;i++) {
				Course cr = (Course)courseToSelect.get(i);
				System.out.println("�γ̣�"+cr.id+cr.name);
			}
		}
		
		public void testiterator() {
			Iterator it = courseToSelect.iterator();
			System.out.println("�����±�ѡ�γ̣�(ͨ������������)");
			while(it.hasNext()) {
				Course p =(Course)it.next();
				System.out.println("�γ̣�"+p.id+p.name);
			}
			
		}
		
		public void testModify() {
			courseToSelect.set(4, new Course("7","ë��"));
			
		}
		
		public void testDelete() {
//			Course cr = (Course)courseToSelect.get(4);
			System.out.println("ɾ��4��5��Ҳ���ǵ�5�͵�6λ���ϵĿγ̣�");
			Course[] courses = {(Course)courseToSelect.get(4),(Course)courseToSelect.get(5)};
			courseToSelect.removeAll(Arrays.asList(courses));
			System.out.println("�ɹ�ɾ���γ�");
			testForEach();
			
		}
		
//		for each
		
		public void testForEach() {
			System.out.println("��ѡ�γ̣���ͨ��foreach��");
			for(Object obj:courseToSelect) {
				Course cr = (Course)obj;
				System.out.println("�γ̣�"+cr.id+cr.name);
			}
		}


		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		courselist a = new courselist();
		a.courseAdd();
		a.testGet();
		a.testiterator();
		a.testForEach();
		a.testModify();
		a.testForEach();
		a.testDelete();
	}

}
