import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private Set<Materia> materiasAprobadas;

    public Alumno(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = (materiasAprobadas != null) ? materiasAprobadas : new HashSet<>();
    }

    public boolean puedeCursarla(Materia materia) {
        return materia.getMateriasCorrelativas()
                .stream()
                .allMatch(materiasAprobadas::contains);
    }

    public boolean puedeCursarTodas(Set<Materia> materias) {
        return materias.stream().allMatch(this::puedeCursarla);
    }
}