package Program;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[10][9];
		
		//calculate multiplication 
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (i+1) * (j+1);
			}
		}
		
		//print matrix
		System.out.println("     1   2   3    4   5   6    7     8     9    ");
		for(int i=0; i < matriz.length; i++) {
			System.out.print((i+1) + " ");
			for(int j=0; j< matriz[i].length; j++) {
				
				if( i ==  j) {
					System.out.print("  |" + matriz[i][j] + "|");
				}
				else if(i == matriz.length - 1 ){
					
					System.out.print(" " + matriz[i][j] + "  ");
				}
				else if(j >1){
					System.out.print(" " + matriz[i][j] + "  ");
				}
				else{
					System.out.print("  " + matriz[i][j] + "  ");
				}
				
			}
			System.out.println();
		}
		
	}

}
