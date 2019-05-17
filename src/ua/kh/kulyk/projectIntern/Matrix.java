package ua.kh.kulyk.projectIntern;

public class Matrix {
	static int [][]M;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M= new int [][]{{0,0,1,1,0,1},{0,0,1,1,0,0},{0,0,0,1,0,0}};
		showMatrix(M);
		System.out.print("Max sequance length of '1' = "+(findMaxSeq(M)));	
}
	
	public static int  findMaxSeq(int[][]M){
		int maxSeqRow=0;
		int curSeqRow=0;
		int maxSeq—ol=0;
		int curSeq—ol=0;
		
		//find Max sequance in Rows
		for(int i=0;i<M.length;i++) {
			if(curSeqRow>maxSeqRow) maxSeqRow=curSeqRow;
			curSeqRow=0;
			for(int j=0;j<M[0].length;j++) {
				if(M[i][j]==1) {
					curSeqRow++;
				}
				else {
					if(curSeqRow>maxSeqRow) maxSeqRow=curSeqRow;
					curSeqRow=0;
				}
			}
			
		}
		//find Max sequance in Columns
		for(int i=0;i<M[0].length;i++) {
			if(curSeq—ol>maxSeq—ol) maxSeq—ol=curSeq—ol;
			curSeq—ol=0;
			for(int j=0;j<M.length;j++) {
				if(M[j][i]==1) {
					curSeq—ol++;
				}
				else {
					if(curSeq—ol>maxSeq—ol) maxSeq—ol=curSeq—ol;
					curSeq—ol=0;
				}
			}
			
		}
		//find Max sequance between both 
		if(maxSeqRow>maxSeq—ol) return maxSeqRow;
		else  return maxSeq—ol;
			
	}
	
	public static void  showMatrix(int [][]M) {
		
		System.out.println("Our matrix:");
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<M[0].length;j++) {
				System.out.print(M[i][j]+" ");
		}
		System.out.print("\n");
	 } 
		
	}
	

}
