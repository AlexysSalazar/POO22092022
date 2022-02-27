/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

/**
 *
 * @author win10-94
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

//metodos
    public void pag(int pagina){
    System.out.println("Van en la pagina: "+ pagina + "del libro "+this.titulo);
}
    public void Nuevo(){
    System.out.println("El libro "+this.titulo+ " Es nuevo");
}

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
}



