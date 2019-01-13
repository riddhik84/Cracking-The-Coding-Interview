
public class RotateMatrix {
	public static int N = 4;	
	
	public static void main(String[] args){
		int[][] input_matrix = { {1, 2, 3, 4}, 
                      {5, 6, 7, 8}, 
                      {9, 10, 11, 12},
					{13, 14, 15, 16} }; 
		
	    //Check if the matrix is NxN
		System.out.println("input_matrix.length " + input_matrix.length + " input_matrix[0].length " + input_matrix[0].length);
		if (input_matrix.length != 0 && input_matrix.length == input_matrix[0].length){
			int[][] output_matrix = rotateMatrix(input_matrix);
			printMatrix(output_matrix);
		} else {
			System.out.println("Input matrix is not NxN");
			printMatrix(input_matrix);
		}
	}
	
	//Solution where additional matrix is required
	public static int[][] rotateMatrix(int[][] input_matrix){
		//Output matrix
		int[][] output = new int[N][N];
		int index_i = 0;
		int index_j = N - 1;
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				output[i][j] = input_matrix[index_i++][index_j];
			}
			index_i = 0;
			index_j--;
		}
		return output;
	}
	
	public static void printMatrix(int matrix[][]){
		int i_len = matrix.length;
		int j_len = matrix[0].length;
		for(int i = 0; i < i_len; i++){
			for(int j = 0; j < j_len; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}