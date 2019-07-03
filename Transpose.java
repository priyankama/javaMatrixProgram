import java.io.*;
class Transpose{	
		public static void main(String args[]){
			int i,j;
			int a[][]=new int[3][3];
			Console con=System.console();
			con.printf("enter 9 values to enter in array");
			for(i=0;i<a.length;i++){
				for(j=0;j<a[i].length;j++)
					a[i][j]=Integer.parseInt(con.readLine());
			}
			System.out.println(" MATRIX");
			for(i=0;i<a.length;i++){
				for(j=0;j<a[i].length;j++)
					System.out.print(a[i][j]+ " ");
			System.out.println();
			}
			System.out.println("TRANSPOSE OF  A MATRIX");
			for(i=0;i<a.length;i++){
				for(j=0;j<a[i].length;j++)
					System.out.print(a[j][i]+ " ");
			System.out.println();
			}
		}
}