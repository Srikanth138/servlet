package lambda;
@FuncationalInterface
interface Line{
	void draw(char ch);
}
public class Parameter {
	public static void main(String[] args) {
		Line l1=(ch)->{
			for(int i=0;i<=10;i++)
				System.out.println(ch);
			System.out.println();
		};
		l1.draw('*');
		l1.draw('&');
		Line l2=(ch)->{
			for(int i=0;i<=10;i++)
				System.out.println(ch);
			System.out.println();
		};
		l2.draw('#');
		l2.draw('$');

	}

}
