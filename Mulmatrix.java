import java.io.*;
class Mulmatrix{	
		public static void main(String args[]){
			int i,j;
			int a[][]=new int[3][3];
			int a1[][]=new int[3][3];
			int a2[][]=new int[3][3];
			Console con=System.console();
			con.printf("enter 9 values to enter in array");
			for(i=0;i<a.length;i++){
				for(j=0;j<a[i].length;j++)
					a[i][j]=Integer.parseInt(con.readLine());
			}
			System.out.println(" MATRIX1");
			for(i=0;i<a.length;i++){
				for(j=0;j<a[i].length;j++)
					System.out.print(a[i][j]+ " ");
			System.out.println();
			}
			for(i=0;i<a1.length;i++){
				for(j=0;j<a1[i].length;j++)
					a1[i][j]=Integer.parseInt(con.readLine());
			}
			System.out.println(" MATRIX2");
			for(i=0;i<a1.length;i++){
				for(j=0;j<a1[i].length;j++)
					System.out.print(a1[i][j]+ " ");
			System.out.println();
			}
			System.out.println("MULTIPLY OF  A MATRIX");
			for(i=0;i<a.length;i++){
				int sum=0;
				for(j=0;j<a1[i].length;j++){
					
					sum=sum+a[i][j]*a1[j][i];
					System.out.print(sum+ " ");
				}
			System.out.println();
			}
		}
}