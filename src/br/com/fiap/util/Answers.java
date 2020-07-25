package br.com.fiap.util;

/** 
* Classe Enumeradora de mensagens padr�o que o Robo deve responder
*/
public class Answers {

	private String nameMovie = "{x}";
	private String movieTime = "{x}";

	/** 
	* M�todo de Get na vari�vel nameMovie
	*@return retorna o nome do filme
	*/
	public String getNameMovie() {
		return nameMovie;
	}

	/** 
	* M�todo de Set na vari�vel nameMovie
	* @param nameMovie nome do filme
	*/
	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}
	
	/** 
	* M�todo de Get na vari�vel movieTime
	* @return retorna o horario do filme
	*/
	public String getMovieTime() {
		return movieTime;
	}
	/** 
	* M�todo de Set na vari�vel movieTime
	* @param movieTime hora do filme
	*/
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

}
