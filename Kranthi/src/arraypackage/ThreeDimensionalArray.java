package arraypackage;

public class ThreeDimensionalArray {


	 

		public static void main(String[] args) {
			int arr[][][]=new int[3][3][3];
			arr[0][0][0]=10;
			arr[0][1][0]=20;
			arr[1][0][1]=30;
			arr[1][1][1]=40;
			
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<arr.length;k++) {
			System.out.println("The Value at Array Index "+i+" "+j+" "+k+" is : " +arr[i][j][k]);
		}
	}
		}

	}}


