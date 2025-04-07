import java.util.HashSet;
import java.util.Set;

public class Materia {
    private Set<Materia> materiasCorrelativas;

    public Materia(Set<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = (materiasCorrelativas != null) ? materiasCorrelativas : new HashSet<>();
    }

    public Set<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}
