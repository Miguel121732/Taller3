package Principal;
import Concatenar.PuntoTres;
import string.PuntoDos;



public class principal {
	
	public static void main (String[] args) {
	
		System.out.println("Punto Dos");
		PuntoDos pd = new PuntoDos();
		pd.objetos();
		
       System.out.println("\nPunto Tres");
       PuntoTres pt = new PuntoTres();
       pt.concatenar();
       
	}

}
