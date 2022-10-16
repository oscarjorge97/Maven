import com.oyataco.model.Persona;

public class Prueba {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setId(1);
        persona.setNombres("Oscar");
        persona.setEdad(25);
        System.out.println(persona.toString());
    }
}
