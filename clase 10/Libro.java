public class Libro {
    private string titulo;
    private string autor; 
    private int anioPublicacion;
    private int numeroPaginas;
    private boolean prestado; 

    public Libro(string titulo, string autor, int anioPublicacion, int numeroPaginas){
        this.titulo = titulo; 
        this.autor = autor; 
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
        this. prestado = false; 
        
    }
}