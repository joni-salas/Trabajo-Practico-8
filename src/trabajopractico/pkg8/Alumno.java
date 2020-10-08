
package trabajopractico.pkg8;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    Set<Materia> materia = new HashSet<>();

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void agregarMateria(Materia m){
        if(materia.add(m))
            System.out.println("Materia agregada: "+ m.getNombreM());
            
        else{
            System.out.println("Solo puede inscribirse una ves a la materia "+ m.getNombreM());
        }
        
    }
    public int cantidadMaterias(){
        return materia.size();
    }
    
}
