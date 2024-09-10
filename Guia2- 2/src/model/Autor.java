package model;

public  class Autor  {

    private String nombre;
    private String apellido;
    private String mail;
    private String genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor(String nombre, String apellido, String mail, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.genero = genero;
    }

    public void mostrar (){
        System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido + " \nMail: " + this.mail + " \nGenero: " + this.genero);
    }
}

