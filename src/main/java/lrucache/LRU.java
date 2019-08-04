package lrucache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRU<E> {
	
	int thresHold = 5;
	public LRU(int thresHold){
		this.thresHold = thresHold;
	}
	
	static class LRULinkedList<E> {
		LRUNode<E> head;
		LRUNode<E> tail;
		int size;
		
		static class LRUNode<E>{
			E data;
			LRUNode<E> next;
			LRUNode<E> previous;
			
			public LRUNode(E data){
				this.data = data;
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((data == null) ? 0 : data.hashCode());
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				@SuppressWarnings("unchecked")
				LRUNode<E> other = (LRUNode<E>) obj;
				if (data == null) {
					if (other.data != null)
						return false;
				} else if (!data.equals(other.data))
					return false;
				return true;
			}
			@Override
			public String toString() {
				return data.toString();
			}
		}
		
		public LRUNode<E> add(E data){
			LRUNode<E> node = new LRUNode<E>(data);
			if(null == this.head){
				this.head = node;
				this.tail = node;
			}else{
				LRUNode<E> temp = this.tail;
				temp.next = node;
				node.previous = temp;
				this.tail = node;
			}
			this.size ++;
			return node;
		}
	}
	
	LRULinkedList<E> lst = new LRULinkedList<>();
	Map<E, LRULinkedList.LRUNode<E>> map = new HashMap<>();
	
	
	public LRULinkedList.LRUNode<E> insert(E data)
	{
		LRULinkedList.LRUNode<E> node = map.get(data);
		if(lst.size < thresHold || null != node)
		{
			if(null != node)
			{//already exists in map and linked list
				if(node == lst.head)
				{
					lst.head = node.next;
				}
				else if(node == lst.tail)
				{
					return node;
				}
				else
				{
					node.previous.next = node.next;
					node.next.previous = node.previous;
				}
				lst.size --;
			}
			LRULinkedList.LRUNode<E> temp = lst.add(data);
			map.put(data, temp);
		}
		else if(null == node)
		{
			lst.head = lst.head.next;//removing first element.
			LRULinkedList.LRUNode<E> temp = lst.add(data);
			map.put(data, temp);
		}
		return node;
	}
	
	public void printLRURecords(int size){
		if(null == lst.tail)
			return;
		
		LRULinkedList.LRUNode<E> tail = lst.tail;
		List<E> lst = new ArrayList<>(size);
		while(size-- > 0){
			lst.add(tail.data);
			tail = tail.previous;
		}
		System.out.println(lst);
	}
	
	public void printLRU(){
		printLRURecords(lst.size);
	}
	
	public static void main(String ...args) {
		try{
			LRU<Integer> lru = new LRU<>(5);
			for(int i = 0; i <5; i++){
				lru.insert(i);
			}
			lru.insert(2);
			//lru.insert(0);
			lru.printLRU();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
