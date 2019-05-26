
public class RotateMatrixInPlace {
	public static void main(String[] args){
		int[][] input_matrix = { {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}};
			
		if(input_matrix.length > 0 && input_matrix[0].length == input_matrix.length){
			int[][] output_matrix = rotateMatrixInPlace(input_matrix);
			printMatrix(output_matrix);
		} else {
			System.out.println("Input matrix is not NxN");
			printMatrix(input_matrix);
		}	
	}
	
	public static int[][] rotateMatrixInPlace(int[][] matrix){
		//Calculate N
		int N = matrix.length;
		System.out.println("N: " + N);
		
		for (int x = 0; x < N / 2; x++) 
        { 
            // Consider elements in group of 4 in  
            // current square 
            for (int y = x; y < N-x-1; y++) 
            { 
                // store current cell in temp variable 
                int temp = matrix[x][y]; 
       
                // move values from right to top 
                matrix[x][y] = matrix[y][N-1-x]; 
       
                // move values from bottom to right 
                matrix[y][N-1-x] = matrix[N-1-x][N-1-y]; 
       
                // move values from left to bottom 
                matrix[N-1-x][N-1-y] = matrix[N-1-y][x]; 
       
                // assign temp to left 
                matrix[N-1-y][x] = temp; 
            } 
        }
		
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix){
		int i_len = matrix.length;
		int j_len = matrix[0].length;
		
		for(int i = 0; i < i_len; i++){
			for(int j = 0; j < j_len; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}