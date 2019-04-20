package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionSort {
	List<String> stringList = new ArrayList<String>();
	List<Integer>integerList = new ArrayList<Integer>();
	
	public void testSort1() {
		Integer a ;
		Random random = new Random();
		for(int i =0;i<5;i++) {
			do {
				a = random.nextInt(10);
			}while(integerList.contains(a));
			integerList.add(a);
		}
		System.out.println("-----------����ǰ-----------------------");
		for(Integer b:integerList) {
			System.out.println("Ԫ���У�"+b);
		}
		Collections.sort(integerList);
		for(Integer b:integerList) {
			System.out.println("Ԫ���У�"+b);
		}
	}
	
	public String randomString(int k) {
		String a = "";
		Random random = new Random();
		for(int i =0;i<k;i++) {
			a= a+(char)Math.abs(random.nextInt(26)%26+97);
		}
		return a;
		
	}
	
	
	public void testSort3() {
		Random random = new Random();
		String s = new String();
		for(int i = 0;i<5;i++) {
			int s_long= s.length();
			Integer k = random.nextInt(10);
			s_long=k;
			do{
				s = randomString(s_long);
			}while(stringList.contains(s));
			stringList.add(s);
		
		}
		System.out.println("--------����ǰ---------");
		for(String a :stringList) {
			System.out.println("�ַ����У�"+a);
		}
		Collections.sort(stringList);
		System.out.println("---------�����---------------");
		for(String a :stringList) {
			System.out.println("�ַ��������"+a);
		}
	}
	
	
//	public void testSort4() {
//		List<Student> studentList = new ArrayList<Student>();
//		Random random = new Random();
//		Student s1;
//		for(int i = 0;i<3;i++) {
//			do {
//				s1= new Student(random.nextInt(100),"lucy");
//					
//			}while(studentList.contains(s1));
//			studentList.add(s1);
//		}
//		
//		System.out.println("--------����ǰ----------");
//		for(Student s:studentList) {
//			System.out.println("ѧ����"+s.ID+":"+s.name);
//		}
//		Collections.sort(studentList);
//		System.out.println("----------�����----------");
//		for(Student s:studentList) {
//			System.out.println("������ѧ����"+s.ID+":"+s.name);
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionSort cs = new CollectionSort();
		cs.testSort1();
		cs.testSort3();
		

	}

}
