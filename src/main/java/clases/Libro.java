package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Libro implements Comparable<Libro>, Comparator<Libro> {

	
	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;

	public Libro() {

	}

	/**
	 * @param titulo
	 * @param isbn
	 * @param genero
	 * @param autor
	 * @param paginas
	 */
	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + ", ISBN: " + isbn + ", género: " + genero + ", autor: " + autor + ", páginas: "
				+ paginas;

	}

	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean equals(Object o) {
		boolean igual = false;

		if (this == o) {
			igual = true;
		} else {
			Libro a = (Libro) o;
			if (this.isbn.equalsIgnoreCase(a.isbn)) {
				igual = true;
			}
		}
		return igual;
	}

	@Override
	public int compareTo(Libro o) {
		return this.titulo.compareTo(o.titulo);
	}

	public int compare(Libro o, Libro a) {

		return o.getPaginas() - a.getPaginas();
	}


	public static int size(String catalogo) {
		
		return 0;
	}

	public static ArrayList<Libro> readObject1() {
		// TODO Auto-generated method stub
		return null;
	}


	public static int size1(String catalogo) {

		return 0;
	}

	public static ArrayList<Libro> readObject() {
		// TODO Auto-generated method stub
		return null;
	}



	}

