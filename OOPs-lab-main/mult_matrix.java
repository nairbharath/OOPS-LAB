import java.util.*;
class matrix{
	Scanner obj = new Scanner(System.in);
	int[][] mat1;
	int[][] mat2;
	int[][] sum;
	int i,j,r1,c1,r2,c2;
	void read(){
		System.out.println("\n\t Enter the no : of rows and columns of matrix 1 : ");
		System.out.print("\t Row : ");
		r1 = obj.nextInt();
		System.out.print("\t Column : ");
		c1 = obj.nextInt();
		System.out.println("\n\t Enter the no : of rows and columns of matrix 2 : ");
		System.out.print("\t Row : ");
		r2 = obj.nextInt();
		System.out.print("\t Column : ");
		c2 = obj.nextInt();
		mat1 = new int[r1][c1];
		mat2 = new int[r2][c2];
		sum = new int[r1][c1];
		System.out.println("\n\t Enter the elements of matrix 1 : ");
		for (i=0;i<r1;i++){
			for (j=0;j<c1;j++){
				mat1[i][j] = obj.nextInt();
			}
		}
		System.out.println("\n\t Enter the elements of matrix 2 : ");
		for (i=0;i<r2;i++){
			for (j=0;j<c2;j++){
				mat2[i][j] = obj.nextInt();
			}
		}
	}
	void process(){
		if (r1==r2&&c1==c2){
			for (i=0;i<r1;i++){
				for (j=0;j<c2;j++){
					sum[i][j]=mat1[i][j]+mat2[i][j];
				}
			}
		}
		else{
			System.out.println("\n\t Cannot add these two matrices ");
		}
	}
	void display(){
		System.out.println("Matrix 1 : ");
		for (i=0;i<r1;i++){
			for (j=0;j<c1;j++){
				System.out.print("\t"+mat1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix 2 : ");
		for (i=0;i<r2;i++){
			for (j=0;j<c2;j++){
				System.out.print("\t"+mat2[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix after Addition : ");
		for (i=0;i<r1;i++){
			for (j=0;j<c1;j++){
				System.out.print("\t"+sum[i][j]);
			}
			System.out.println();
		}
	}
}
class mult_matrix{
	public static void main(String[] args) {
		matrix m = new matrix();
		m.read();
		m.process();
		m.display();
	}
}