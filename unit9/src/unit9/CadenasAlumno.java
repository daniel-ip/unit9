package unit9;

public class CadenasAlumno {

	public boolean sonIguales(String cadena1, String cadena2){
		//m�todo que compara dos cadenas y te dice si son iguales
		if(cadena1.equals(cadena2)){ 
			return true;
		}else{
			return false;
		}
	}
	
	public boolean esMayor(String cadena1, String cadena2){ 
		//m�todo que compara dos cadenas y te indica si la primera de ellas es mayor o no
		if(cadena1.compareTo(cadena2)<0){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean esMenor(String cadena1, String cadena2){
		//m�todo que compara dos cadenas y te indica si la primera de ellas es menor o no
		if(cadena1.compareTo(cadena2)>0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2){
		//m�todo que compara dos cadenas y te dice si son iguales ignorando las may�sculas que pueda haber
		if(cadena1.equalsIgnoreCase(cadena2)){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	public String reemplazaTodos(String cadena, String regla, String cambio){
		//m�todo que reemplaza de la cadena: cadena todos los regla/expresi�n que	hay por cambio
		return cadena.replaceAll(regla, cambio);
	}
	
	
	
	public String reemplazaPrimero(String cadena, String regla, String cambio){
		//m�todo que reemplaza en la cadena: cadena la primera regla/expresi�n que hay por cambio
		return cadena.replaceFirst(regla, cambio);
	}
	
	
	
	public String quitaEspacios(String cadena){
		//m�todo que devuelve un String sin espacios previos/posteriores
		return cadena.replace(" ", "");
	}
	
	
	public String convertirMayusculas(String cadena){
		//m�todo que dado un String te devuelve ese mismo pero en may�sculas
		return cadena.toUpperCase();
	}
	
	
	public long longitudCadena(String cadena){
		//m�todo que te devuelve la longitud de una cadena
		return cadena.length();
	}
	
	
	public boolean empiezaCon(String cadena, String prefijo){
		//m�todo que te indica si la cadena comienza con el prefijo dado
		return cadena.startsWith(prefijo);
	}
	
	
	public boolean acabaEn(String cadena, String sufijo){
		//m�todo que te indica	si la cadena acaba con el sufijo dado
		return cadena.endsWith(sufijo);
	}
	
	
	public long posicionPrimeraCadena(String cadena, String letra){
		//m�todo que te devuelve la posici�n en la que se encuentra una letra/conjunto de letras en un string
		return cadena.indexOf(letra);
	}
	
	
	public String extraerSubstring(String cadena, int posicionInicio){
		//m�todo que te devuelve una parte del string, para ello deber�s de indicarle desde	donde quieres que te devuelva
		return cadena.substring(posicionInicio);
	}
	
	
	public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal){
		//funci�n que te devuelve una parte del string, para ello deber�s de indicarle desde d�nde quieres que te devuelva y hasta d�nde
		return cadena.substring(posicionInicio, posicionFinal);
	}
	
	
	public static void main(String[] args) {
		

	}

}
