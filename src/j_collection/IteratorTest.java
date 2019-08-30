package j_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
	public static void main(String[] args) {
		//Iterator 단방향 이동만 가능
		// Enumeration는 컬렉션이 나오기전에 사용되던 Iterator의 구버전 이라고 생각하면 된다.
		
		List<String> list = new ArrayList<String>();
		//1. list에 "123"추가
		list.add("123");
		//2. list에 "456"추가
		list.add("456");
		//3. list에 "789"추가
		list.add("789");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//ListIterator
		// Iterator의 단방향을 보완하기 위해서 나왔다.
		// List에서만 사용할수 있다.
		ListIterator<String> li = list.listIterator();
		li.hasNext();
		System.out.println(li.next());
		li.hasPrevious();
		System.out.println(li.previous());
		
		
	}
}
