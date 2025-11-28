import java.time.LocalDate;

public class persona {
    
    private String nombre;
    private String apellidos;
    private int anyoNacimiento;
    
    public persona(String nombre, String apellidos, int anyoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anyoNacimiento = anyoNacimiento;
    }
    
    public int getEdad() {
        return LocalDate.now().getYear() - anyoNacimiento;
    }
    
    public void setAnyoNacimiento(int anyoNacimiento) {
        if (anyoNacimiento > LocalDate.now().getYear()) {
            System.out.println("Error: Anyo futuro.");
            return;
        }
        this.anyoNacimiento = anyoNacimiento;
    }

    @Override
    public String toString() {
        return "Persona: " + nombre + " " + apellidos + ", " + getEdad() + " anyos.";
    }

    public String presentacionCreativa() {
        int edad = getEdad();
        String apodo = generarApodo();
        String perfil;
        if (edad < 18) {
            perfil = "Soñador en crecimiento 🎒";
        } else if (edad < 30) {
            perfil = "Explorador curioso ✨";
        } else if (edad < 60) {
            perfil = "Profesional con historias 💼";
        } else {
            perfil = "Sabio con anécdotas 🦉";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("+-------------------------------+\n");
        sb.append("|  Presentacion Creativa       |\n");
        sb.append("+-------------------------------+\n");
        sb.append("Nombre: ").append(nombre).append(" ").append(apellidos).append("\n");
        sb.append("Apodo: ").append(apodo).append("\n");
        sb.append("Edad: ").append(edad).append(" años\n");
        sb.append("Perfil: ").append(perfil).append("\n");
        sb.append("Mensaje: ").append(fraseSegunEdad(edad)).append("\n");
        sb.append("+-------------------------------+");
        return sb.toString();
    }

    public void mostrarPresentacionCreativa() {
        System.out.println(presentacionCreativa());
    }

    private String generarApodo() {
        String base = nombre != null && nombre.length() >= 3 ? nombre.substring(0,3).toLowerCase() : (nombre == null ? "amigo" : nombre.toLowerCase());
        int numero = (int) (Math.random() * 90) + 10;
        return base + numero;
    }

    private String fraseSegunEdad(int edad) {
        if (edad < 18) return "Nunca dejes que te digan que no puedes aprender algo nuevo.";
        if (edad < 30) return "Crea, experimenta y fallarás hacia el éxito.";
        if (edad < 60) return "Cada día trae una leccion diferente; aprovecha la experiencia.";
        return "Comparte tus historias: alguien las necesitara.";
    }
}