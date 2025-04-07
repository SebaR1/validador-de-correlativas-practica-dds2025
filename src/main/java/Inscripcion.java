import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materias;
    private Alumno alumnoAInscribirse;

    public Inscripcion(Alumno alumnoAInscribirse, Set<Materia> materias) {
        this.alumnoAInscribirse = alumnoAInscribirse;
        this.materias = (materias != null && !materias.isEmpty()) ? materias : new HashSet<>();
    }

    public boolean aprobada() {
        return materias.stream().allMatch(alumnoAInscribirse::puedeCursarla);
    }
}
