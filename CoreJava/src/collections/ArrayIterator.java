package collections;

import java.util.Iterator;

class Irt<E> {
Object o[];
int capacity=10;
Irt(){
	o=new Object[capacity];
}
//non-static Inner class/member class
public class ArrayIterator<E> implements Iterator<E>{
	public E next(){
		return null;
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
}
Iterator iterator(){
	return new ArrayIterator();
}
}
