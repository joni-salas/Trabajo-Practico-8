
package trabajopractico.pkg8;


public class Materia {
    private int idMateria;
    private String nombreM;
    private int anio;

    public Materia(int idMateria, String nombreM, int anio) {
        this.idMateria = idMateria;
        this.nombreM = nombreM;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getNombreM() {
        return nombreM;
    }

    public int getAnio() {
        return anio;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public boolean equals(Object o){
        if((o instanceof Materia) && !(o == null)){
            if(idMateria==((Materia)o).idMateria){
                return true; }
            else{
                return false;}
        }
        else{
          return false;  
        }
    }
    
     @Override
    public int hashCode() {
        return idMateria;
    }   
 }
    
    
        
    

