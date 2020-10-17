package collections;

import java.util.Iterator;

class Irt<E> {
Object o[];
int capacity=10;
Irt(){
	o=new Object[capacity];
}
//non-static Inner class/member class
@SuppressWarnings("hiding")
public class ArrayIterator<E> implements Iterator<E>{
	public E next(){
		return null;
		
	}

	@Override
	public boolean hasNext() {

		return false;
	}
}
Iterator<E> iterator(){
	return new ArrayIterator<E>();
}
}
