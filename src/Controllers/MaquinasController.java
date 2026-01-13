package Controllers;

import Models.Maquina;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MaquinasController {
    // METODO que ordene un listado de maquinas
    // Por su subred y luego por el nombre
    // si ambas son iguales se consideras maquinas
    // y se descartan
    
    public Set<Maquina> ordenarPorSubred(List<Maquina> maquinas) {
        Set<Maquina> treeMaquinas = new TreeSet<>();
        for (Maquina maquina : maquinas) {
            treeMaquinas.add(maquina);
        }
        return treeMaquinas;
    }

}
