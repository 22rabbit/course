package Collection;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	public Map<String,Student> student;
	
	public MapTest() {
		this.student = new HashMap<String,Student>();
		
	}
	
	public void test() {
		Scanner in = new Scanner(System.in);
		int i = 0; 
		while(i<2) {
			System.out.println("������ѧ��ID��");
			String id = in.next();
			Student st = student.get(id);
			if(st == null) {
				System.out.println("��������");
				String name = in.next();
				Student newone = new Student(id,name);
				student.put(id,newone);
				System.out.println("�ɹ����ѧ��"+newone.name);
				i++;
			}else {
				System.out.println("��ѧ���Ѵ���");
				continue;
			}
		}
	}
	
	public void KeySet() {
		Set<String> keyset = student.keySet();
		System.out.println("����"+student.size()+"��ѧ��");
		for(String k:keyset) {
			Student st = student.get(k);
			if(st!=null) {
				System.out.println("ѧ������Ϊ"+st.ID+st.name);
			}
			
		}
	}
	
	public void removetest() {
		
		Scanner in  = new Scanner(System.in);
		while(true) {
			System.out.println("����Ҫɾ��ѧ����ID��");
			String id = in.next();
			Student st = student.get(id);
			if(st==null) {
				System.out.println("��ѧ��������");
				continue;
			}else {
				student.remove(id);
				System.out.println("�ɹ�ɾ��ѧ��"+st.name);
				break;
			}
			
		}
	}
	
	public void entrytest() {
		Set<Entry<String,Student>> entrySet = student.entrySet();
		for(Entry<String,Student> entry:entrySet) {
			System.out.println("ȡ�ü�ֵ:"+entry.getKey());
			System.out.println("ȡ������"+entry.getValue().name);			
		}
	}
	
	public void testModify() {
		System.out.println("������Ҫ�޸�ѧ����ID:");
		while(true) {
			Scanner in = new Scanner(System.in);
			String id = in.next();
			Student st = student.get(id);
			if(st == null) {
				System.out.println("��ѧ�������ڣ����������롣");
				continue;
			}
			System.out.println("�������޸ĺ��ѧ��������");
			String name = in.next();
			Student newone = new Student(id,name);
			student.put(id,newone);
			System.out.println("�ɹ��޸�ѧ��Ϊ��"+newone.ID+newone.name);
			break;
		}
		}
	
	public void testContains() {
		System.out.println("������ѧ��ID��");
		Scanner in = new Scanner(System.in);
		String id = in.next();
		System.out.println("�ж�ѧ��"+student.get(id).name+"�Ƿ���ڣ�"+student.containsKey(id));
		if(student.containsKey(id)) {
			System.out.println("��ѧ������Ϊ��"+student.get(id).name);
		}
		System.out.println("������ѧ��������");
		String name = in.next();
		if(student.containsValue(new Student(null,name)))
			System.out.println("��ѧ����������");			
		else
			System.out.println("��ѧ������������");
		
		
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mp = new MapTest();
		mp.test();
		mp.KeySet();
		mp.testModify();
		mp.removetest();
		mp.entrytest();
		mp.testContains();
		
		

	}

}
