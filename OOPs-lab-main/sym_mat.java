import java.util.*;
class matrix{
	Scanner obj = new Scanner(System.in);
	int mat[][];
	int i,j,r,c,flag=1;
	void read(){
		mat = new int [3][3];
		System.out.println("\n\t Enter the row and column of a matrix : ");
		System.out.print("\t Row : ");
		r = obj.nextInt();
		System.out.print("\t Column : ");
		c = obj.nextInt();
		System.out.println("\n\t Enter the elements of the matrix : ");
		for (i=0;i<r;i++){
			for(j=0;j<c;j++){
				mat[i][j] = obj.nextInt();
			}
		}
	
		for (i=0;i<r;i++){
			for(j=0;j<i;j++){
				if(mat[i][j]!=mat[j][i]){
					System.out.println("Given matrix is not a Symmetric matrix");
					flag=0;
					break;
				}
			}
		}
		if (flag==0){
			for (i=0;i<r;i++){
				for (j=0;j<c;j++){
					System.out.print("\t"+mat[i][j]);				
				}
				System.out.println("");
			}
		}
		System.out.println(" is a Symmetric matrix ");
	}
}
class sym_mat{
	public static void main(String[] args) {
		matrix m = new matrix();
		m.read();
	}
}