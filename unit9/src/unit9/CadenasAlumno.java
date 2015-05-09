package unit9;

public class CadenasAlumno {

	public boolean sonIguales(String cadena1, String cadena2){
		//método que compara dos cadenas y te dice si son iguales
		if(cadena1.equals(cadena2)){ 
			return true;
		}else{
			return false;
		}
	}
	
	public boolean esMayor(String cadena1, String cadena2){ 
		//método que compara dos cadenas y te indica si la primera de ellas es mayor o no
		if(cadena1.compareTo(cadena2)<0){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean esMenor(String cadena1, String cadena2){
		//método que compara dos cadenas y te indica si la primera de ellas es menor o no
		if(cadena1.compareTo(cadena2)>0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2){
		//método que compara dos cadenas y te dice si son iguales ignorando las mayúsculas que pueda haber
		if(cadena1.equalsIgnoreCase(cadena2)){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	public String reemplazaTodos(String cadena, String regla, String cambio){
		//método que reemplaza de la cadena: cadena todos los regla/expresión que	hay por cambio
		return cadena.replaceAll(regla, cambio);
	}
	
	
	
	public String reemplazaPrimero(String cadena, String regla, String cambio){
		//método que reemplaza en la cadena: cadena la primera regla/expresión que hay por cambio
		return cadena.replaceFirst(regla, cambio);
	}
	
	
	
	public String quitaEspacios(String cadena){
		//método que devuelve un String sin espacios previos/posteriores
		return cadena.replace(" ", "");
	}
	
	
	public String convertirMayusculas(String cadena){
		//método que dado un String te devuelve ese mismo pero en mayúsculas
		return cadena.toUpperCase();
	}
	
	
	public long longitudCadena(String cadena){
		//método que te devuelve la longitud de una cadena
		return cadena.length();
	}
	
	
	public boolean empiezaCon(String cadena, String prefijo){
		//método que te indica si la cadena comienza con el prefijo dado
		return cadena.startsWith(prefijo);
	}
	
	
	public boolean acabaEn(String cadena, String sufijo){
		//método que te indica	si la cadena acaba con el sufijo dado
		return cadena.endsWith(sufijo);
	}
	
	
	public long posicionPrimeraCadena(String cadena, String letra){
		//método que te devuelve la posición en la que se encuentra una letra/conjunto de letras en un string
		return cadena.indexOf(letra);
	}
	
	
	public String extraerSubstring(String cadena, int posicionInicio){
		//método que te devuelve una parte del string, para ello deberás de indicarle desde	donde quieres que te devuelva
		return cadena.substring(posicionInicio);
	}
	
	
	public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal){
		//función que te devuelve una parte del string, para ello deberás de indicarle desde dónde quieres que te devuelva y hasta dónde
		return cadena.substring(posicionInicio, posicionFinal);
	}
	
	
	public static void main(String[] args) {
		

	}

}
