/*
If an element in MxN matrix is 0, its entire row and column are set to 0
*/
public class ZeroMatrix {
	public static void main(String[] args){
		int[][] input_matrix = { {0, 2, 3, 4}, 
                      {5, 6, 7, 8}, 
                      {9, 10, 11, 12},
					{13, 14, 15, 0} }; 
		
		printMatrix(input_matrix);
		printMatrix(zeroMatrix(input_matrix));
	}
	
	public static int[][] zeroMatrix(int[][] matrix){
		if(matrix.length == 0){
			return matrix;
		}
		
		//Create rows and columns arrays to track 0s
		int[] rows = new int[matrix.length];
		int[] columns = new int[matrix[0].length];
		
		//Find which row and column has 0s
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					rows[i] = -1;
					columns[j] = -1;
				}
			}
		}
		
		//Mark the entire row with  1 zero as 0s
		for(int i = 0; i < rows.length; i++){
			if(rows[i] == -1){
				for(int k = 0; k < rows.length; k++){
					matrix[i][k] = 0;
				}
			}
		}
		
		//Mark the column with 0s as 0
		for(int i = 0; i < columns.length; i++){
			if(columns[i] == -1){
				for(int k = 0; k < columns.length; k++){
					matrix[k][i] = 0;
				}
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