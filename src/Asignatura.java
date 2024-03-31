package com.mycompany.asignaturas;

public class Asignatura {
    public Integer codigo;
    public String materia;
    public String nombre;
    public String apellido;
    public String dia;
    public String hora;
    public String edificio;
    public Asignatura next;

    public Asignatura(int codigo, String materia, String nombre, String apellido,
                        String dia, String hora, String edificio) {
        this.codigo = codigo;
        this.materia = materia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.hora = hora;
        this.edificio = edificio;
        next=null;
    }

    public Asignatura getNext(){
        return this.next;
    }

    public void setNext(Asignatura subject){
        next=subject;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

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

    public String docente() {
        return nombre + " " + apellido;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void allInfo() {
        System.out.println(codigo + " / " + materia + " / " + this.docente() + " / "
                + dia + " " + hora + " / Edificio: " + edificio);
    }
}

