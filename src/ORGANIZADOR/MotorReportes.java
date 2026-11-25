package ORGANIZADOR;

import SUPERclases.Exportable;

import java.util.ArrayList;
import java.util.List;

public class MotorReportes {
    private List<Exportable> exportadores = new ArrayList<>();

    public void agregarExportador(Exportable exportador){
        exportadores.add(exportador);
    }

    public void exportarTodos(String contenidoReporte){
        for (Exportable e : exportadores) {
            System.out.println("------------------------");
            e.exportar(contenidoReporte);
        }
    }
}
