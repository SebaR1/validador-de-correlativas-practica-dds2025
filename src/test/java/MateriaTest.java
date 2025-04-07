import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    public void puedeCursarLaMateria() {
        Materia materiaCorrelativa1 = new Materia(null);
        Alumno alumno = new Alumno(Set.of(materiaCorrelativa1));
        Materia materia = new Materia(Set.of(materiaCorrelativa1));

        assertTrue(alumno.puedeCursarla(materia));
    }

    @Test
    public void puedeCursarTodasLasMaterias() {
        Materia materiaCorrelativa1 = new Materia(null);
        Materia materiaCorrelativa2 = new Materia(null);
        Materia materiaCorrelativa3 = new Materia(null);
        Alumno alumno = new Alumno(Set.of(materiaCorrelativa1, materiaCorrelativa2, materiaCorrelativa3));
        Materia materia1 = new Materia(Set.of(materiaCorrelativa1, materiaCorrelativa2));
        Materia materia2 = new Materia(Set.of(materiaCorrelativa3));

        assertTrue(alumno.puedeCursarTodas(Set.of(materia1, materia2)));
    }
}
