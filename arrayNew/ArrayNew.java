package arrayNew;

public class ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] values = new int[20];//slow way//
		//final int SIZE = 12;//
		//int[] values = {SIZE}; //best way//
		/*for each loop is designed to change entire array into based on specific array elements /n
		 if you care about the actual order and want to edit just on element of th earray just use a for loop. */
	/* this is a working code
	int[]values = {1,1,1,3,5,6,7,};
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[3]);
		for (int  i : values)
		{
			System.out.println(i);	}*/
		int[]numbers = {1,3,2,5,8,4,9,3,7,2,6,5,2};
		kingOfTheHill(numbers);
		String[]nurseryrhyme = {"mary", "had", "a ", "little", "lamb"};
		String[] newArray = clone(nurseryrhyme);
		
	}
	public static String[]clone(String[]original){
		String[] arrayclone = new String[original.length];
		for (int i =0; i < original.length;	i++ ) {
			arrayclone[i] = original[i];
		}
		return arrayclone;
	}
		
		public static void kingOfTheHill(int[] vals) {
			for (int i = 1; i <vals.length; i++) {
				if (vals[i] > vals [i-1] && vals[i]> vals[i+1]) {
					System.out.println(vals[i]);
				}
			}
			
		}
}
	