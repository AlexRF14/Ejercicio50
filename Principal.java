public class Principal{
	public static void main(String args[]){
		int n = 0;	
		char c;
		String frase = "No vueles como las aves de corral cuando puedes subir como las águilas";
		System.out.println("Los dos primero caracteres de la cadena son ");
		c = frase.charAt(0);
		System.out.println(c);
		c = frase.charAt(1);
		System.out.println(c);
		c = frase.charAt(4);
		System.out.println("El quinto caracter es " + c);
		c = 0;
              
		int pos = frase.lastIndexOf("puedes");
		System.out.println("prueba se haya en la posición " + pos);
		
		System.out.println(frase.replace("aves de corral" , "gallinas"));
		
		}

}
