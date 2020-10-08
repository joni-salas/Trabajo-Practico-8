
package trabajopractico.pkg8;


public class Colegio {


    public static void main(String[] args) {
        Materia ingles = new Materia(1, "Ingles 1",1);
        Materia matematica = new Materia(2, "Matematica",1);
        Materia laboratorio = new Materia(3, "Laboratorio 1",1);
        Materia laboratorioprueba = new Materia(3, "Laboratorio ",1);
        
        Alumno martin = new Alumno(1001,"Martin", "López");
        Alumno brenda = new Alumno(1002,"Brenda", "Martínez");
        
        martin.agregarMateria(ingles);
        martin.agregarMateria(matematica);
        martin.agregarMateria(laboratorio);
        
        brenda.agregarMateria(ingles);
        brenda.agregarMateria(matematica);
        brenda.agregarMateria(laboratorio);
        brenda.agregarMateria(laboratorio);
        
        System.out.println("Martin cursa "+martin.cantidadMaterias()+" materias.");  
        System.out.println("Brenda cursa "+brenda.cantidadMaterias()+" materias.");
        
        // test sobre como sobreescribir metodo equals y hascode.
        System.out.println(laboratorio.equals(laboratorioprueba));
        
        //brenda cursa 3 materias por mas que la inscriba 2 veces en la misma materia por que utilizo HashSet que no acepta dos objetos iguales.
    }
    
}
