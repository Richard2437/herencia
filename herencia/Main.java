public class Main {
    public static void main(String[] args) {

        persona p1 = new persona("Luisa", "Asenjo", 1978);
        p1.setAnyoNacimiento(1990);
        System.out.println("P1: " + p1);
        p1.mostrarPresentacionCreativa();

        alumno a1 = new alumno("Juan", "Ugarte", 1985);
        a1.ponGrupo("66", 'M');
        System.out.println("A1: " + a1);
        a1.mostrarPresentacionCreativa();

        Profesor prof1 = new Profesor("Roberto", "Herrera", 1975);
        prof1.setSalarioBase(4200.00);
        System.out.println("Prof1: " + prof1);
        prof1.mostrarPresentacionCreativa();
        
        System.out.println("\n--- Prueba de error ---");
        prof1.setSalarioBase(500.00); 
    }
}