package star;

public class star2 {

	public static void main(String[] args) {
		int size = 5;
		int floor = 1;
		
		while(floor <= size) {
			
			int star = 0;
			while (star < floor) {
				System.out.print("*");
				star++;
			}
			
			System.out.println();
			floor ++;
	
		}
		

	}

}
