package star;

public class star2 {

	public static void main(String[] args) {
		int size = 5;
		int floor = 1;
		
		while(floor(size, floor)) {
			
			int star = 0;
			while (star(floor, star)) {
				System.out.print("*");
				star++;
			}
			
			System.out.println();
			floor ++;
	
		}
		

	}

	private static boolean star(int floor, int star) {
		return star < floor;
	}

	private static boolean floor(int size, int floor) {
		return floor <= size;
	}

}
