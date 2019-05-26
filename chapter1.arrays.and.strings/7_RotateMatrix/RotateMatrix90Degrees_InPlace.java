

public class RotateMatrix90Degrees_InPlace {
	public static void main(String... args){
		int[][] input = {
			{1,2,3,4},
				{5,6,7,8},
					{9,10,11,12},
						{13,14,15,16}
		};
		
		printMatrix(input);
		printMatrix(RotateMatrix90Degrees(input));
	}
	
	public static int[][] RotateMatrix90Degrees(int[][] matrix){
		//return input matrix as is if it cannot be rotated
		if(matrix.length == 0 || matrix.length != matrix[0].length)
		{
			return matrix;
		}
		
		// Find number of rows/columns for nxn matrix
		int n = matrix.length;
		
		for(int layer = 0; layer < n/2; layer++){
			//Find first and last layers
			int first = layer; //0
			int last = n - 1 - layer; //3
			
			for(int i = first; i < last; i++){
				int offset = i - first; //0
				int top = matrix[first][i]; //0,0 save top left element
				
				//left -> top
				matrix[first][i] = matrix[last - offset][first];
				
				//bottom - > left
				matrix[last - offset][first] = matrix[last][last - offset];
				
				//right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				
				//top -> right
				matrix[i][last] = top; // right saved to top
			}	
		}
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}