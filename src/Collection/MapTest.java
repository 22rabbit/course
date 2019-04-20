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
			System.out.println("请输入学生ID：");
			String id = in.next();
			Student st = student.get(id);
			if(st == null) {
				System.out.println("输入姓名");
				String name = in.next();
				Student newone = new Student(id,name);
				student.put(id,newone);
				System.out.println("成功添加学生"+newone.name);
				i++;
			}else {
				System.out.println("该学生已存在");
				continue;
			}
		}
	}
	
	public void KeySet() {
		Set<String> keyset = student.keySet();
		System.out.println("共有"+student.size()+"个学生");
		for(String k:keyset) {
			Student st = student.get(k);
			if(st!=null) {
				System.out.println("学生名单为"+st.ID+st.name);
			}
			
		}
	}
	
	public void removetest() {
		
		Scanner in  = new Scanner(System.in);
		while(true) {
			System.out.println("输入要删除学生的ID：");
			String id = in.next();
			Student st = student.get(id);
			if(st==null) {
				System.out.println("该学生不存在");
				continue;
			}else {
				student.remove(id);
				System.out.println("成功删除学生"+st.name);
				break;
			}
			
		}
	}
	
	public void entrytest() {
		Set<Entry<String,Student>> entrySet = student.entrySet();
		for(Entry<String,Student> entry:entrySet) {
			System.out.println("取得键值:"+entry.getKey());
			System.out.println("取得名字"+entry.getValue().name);			
		}
	}
	
	public void testModify() {
		System.out.println("请输入要修改学生的ID:");
		while(true) {
			Scanner in = new Scanner(System.in);
			String id = in.next();
			Student st = student.get(id);
			if(st == null) {
				System.out.println("该学生不存在，请重新输入。");
				continue;
			}
			System.out.println("请输入修改后的学生姓名：");
			String name = in.next();
			Student newone = new Student(id,name);
			student.put(id,newone);
			System.out.println("成功修改学生为："+newone.ID+newone.name);
			break;
		}
		}
	
	public void testContains() {
		System.out.println("请输入学生ID：");
		Scanner in = new Scanner(System.in);
		String id = in.next();
		System.out.println("判断学生"+student.get(id).name+"是否存在？"+student.containsKey(id));
		if(student.containsKey(id)) {
			System.out.println("该学生姓名为："+student.get(id).name);
		}
		System.out.println("请输入学生姓名：");
		String name = in.next();
		if(student.containsValue(new Student(null,name)))
			System.out.println("该学生在名单里");			
		else
			System.out.println("该学生不在名单里");
		
		
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
