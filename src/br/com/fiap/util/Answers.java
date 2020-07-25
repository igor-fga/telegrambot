package br.com.fiap.util;

/** 
* Classe Enumeradora de mensagens padrão que o Robo deve responder
*/
public class Answers {

	private String nameMovie = "{x}";
	private String movieTime = "{x}";

	/** 
	* Método de Get na variável nameMovie
	*@return retorna o nome do filme
	*/
	public String getNameMovie() {
		return nameMovie;
	}

	/** 
	* Método de Set na variável nameMovie
	* @param nameMovie nome do filme
	*/
	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}
	
	/** 
	* Método de Get na variável movieTime
	* @return retorna o horario do filme
	*/
	public String getMovieTime() {
		return movieTime;
	}
	/** 
	* Método de Set na variável movieTime
	* @param movieTime hora do filme
	*/
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

}
