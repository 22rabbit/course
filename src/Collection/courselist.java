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
		Course i1 = new Course("1","数据结构");
		Course i2 =new Course("2","数据库");
		Course i3 = new Course("2","数据库");
		
		courseToSelect.add(i1);
		courseToSelect.add(0,i2);
		courseToSelect.add(i3);
		
		Course n = (Course)courseToSelect.get(0);
		Course m = (Course)courseToSelect.get(1);
		Course o = (Course)courseToSelect.get(2);
		
		System.out.println("已选第一节课为："+n.id +":"+n.name);
		System.out.println("已选第二节课为："+m.id +":"+m.name);
		System.out.println("已选第三节课为："+o.id +":"+o.name);
		
		Course[] course = {new Course("3","自动控制原理"),new Course("4","电力电子技术")};
		courseToSelect.addAll(Arrays.asList(course));
		Course i4 = (Course)courseToSelect.get(3);
		Course i5 =(Course)courseToSelect.get(4);
		System.out.println("添加了两门课程："+i4.id+":"+i4.name+";"+i5.id+":"+i5.name);
		Course[] course2 = {new Course("5","现代控制理论"),new Course("6","运动控制系统")};
		courseToSelect.addAll(Arrays.asList(course2));
	}
//		
		public void testGet(){
			int size = courseToSelect.size();
			System.out.println("有以下备选课程：");
			for(int i = 0;i<size;i++) {
				Course cr = (Course)courseToSelect.get(i);
				System.out.println("课程："+cr.id+cr.name);
			}
		}
		
		public void testiterator() {
			Iterator it = courseToSelect.iterator();
			System.out.println("有以下备选课程：(通过迭代器访问)");
			while(it.hasNext()) {
				Course p =(Course)it.next();
				System.out.println("课程："+p.id+p.name);
			}
			
		}
		
		public void testModify() {
			courseToSelect.set(4, new Course("7","毛概"));
			
		}
		
		public void testDelete() {
//			Course cr = (Course)courseToSelect.get(4);
			System.out.println("删除4和5（也就是第5和第6位置上的课程）");
			Course[] courses = {(Course)courseToSelect.get(4),(Course)courseToSelect.get(5)};
			courseToSelect.removeAll(Arrays.asList(courses));
			System.out.println("成功删除课程");
			testForEach();
			
		}
		
//		for each
		
		public void testForEach() {
			System.out.println("可选课程：（通过foreach）");
			for(Object obj:courseToSelect) {
				Course cr = (Course)obj;
				System.out.println("课程："+cr.id+cr.name);
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
