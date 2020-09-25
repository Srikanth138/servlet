package Looping;

public class LableLoop {

	public static void main(String[] args) {
		int num=1;
		loop1: //labled loop
			while(true){
				int i=1;
				loop2:
					while(true){
						int pr=num*i;
						System.out.println(num+"*"+i+"="+pr);
						i++;
						if(i>10){
							num++;
							if(num>10)
								break loop1;
							else
								continue loop1;
						}
					}
			}
   	}

}
