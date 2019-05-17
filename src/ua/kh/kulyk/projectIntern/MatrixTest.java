package ua.kh.kulyk.projectIntern;

public class MatrixTest {

	public static void main(String[] args) {
		int [][]Arr=new int [myrandom(10,2)][myrandom(10,2)];
		for(int i=0;i<Arr.length;i++) {
			for(int j=0;j<Arr[0].length;j++) {
				Arr[i][j]=myrandom(2,0);
			}
		}
		Matrix.showMatrix(Arr);
		Matrix.findMaxSeq(Arr);
		System.out.print("Max sequance length of '1' = "+(Matrix.findMaxSeq(Arr)));

	}
	
	public static int myrandom(int h, int l) {
		int a = (int) (Math.random() * h);
		return a;
	}
}
