package ExplicacionesJavaBasics;

public class MatricesConceptoySintaxis {

	public static void main(String[] args) {
	
		/*int[] mi_matriz=new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71; */
		
		int[] mi_matriz= {5,38, -15, 92, 71, 75 , 69, 48, 24, 875, 45, 75 , 35 };
		
		for (int i=0;i<mi_matriz.length;i++) {
			
			System.out.println("Valor de índice " + i + " = " + mi_matriz[i]);
		}
		
	}

}
