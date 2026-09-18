package mx.edu.utng;
public class RepasoArreglos2 {

	public static void main(String[] args){
		System.out.println("Manejando Arreglos");

		String[][] nombres = new String[7][3];

		nombres[0][0] = "Jonathan Venancio";
		nombres[0][1] = "Aguilar Hernández";
		nombres[0][2] = "18";

		nombres[1][0] = "josé Emmanuel";
		nombres[1][1] = "Arredondo Escalante";
		nombres[1][2] = "22";

		nombres[2][0] = "Yanneli";
		nombres[2][1] = "Sánchez Cárdenas";
		nombres[2][2] = "19";


		for(int i = 0; i <= 2; i ++){
			for(int x = 0; x <= 1; x ++){
				System.out.println(nombres[i][x]);
			}
		}


	}
}
