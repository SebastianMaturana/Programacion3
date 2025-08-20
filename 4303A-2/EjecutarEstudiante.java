public class EjecutarEstudiante {
    public static void main(String[] args) {
        // creacion de objetos Estudiante
        Estudiantes objEst1 = new Estudiantes(768, "Byron", "Ingenieria");
        Estudiantes objEst2 = new Estudiantes(456, "juan", "Ingenieria");
 
        Estudiantes[] e = new Estudiantes[3];
        e[0] = objEst1;
        e[1] = objEst2;
        e[2] = new Estudiantes(123, "Ana", "Ingenieria");
 
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}