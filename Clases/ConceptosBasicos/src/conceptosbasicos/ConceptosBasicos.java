package conceptosbasicos;

import ico.fes.Automovil;
import ico.fes.Silla;
import java.awt.Color;

public class ConceptosBasicos {
    public static void main(String[] args) {
        System.out.println("Hola de nuevo");
        Silla s1=new Silla();
        System.out.println(s1); // por defecto se invoca toString
        System.out.println(s1.toString());
        
        Automovil miBocho=new Automovil();
        System.out.println(miBocho);
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        Automovil miMustang=new Automovil("Forrd", "Musang", 2010, Color.yellow);
        System.out.println(miMustang);
    
        Automovil miAkura=new Automovil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(miAkura);
    }
    
    
}
