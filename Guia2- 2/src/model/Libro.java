package model;

public class Libro {
    private String titulo;
    private Double precio;
    private Integer stock;
    private Autor autor;

    public Libro() {

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro(String titulo, Double precio, Integer stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }
    public void mostrar(){
        System.out.println("Titulo: " + titulo + "\nPrecio: " + precio + "\nStock: " + stock + "\nAutor: ");
        this.autor.mostrar();
    }
}
