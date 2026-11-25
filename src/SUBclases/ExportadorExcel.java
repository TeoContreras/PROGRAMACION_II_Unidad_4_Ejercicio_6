package SUBclases;

import SUPERclases.Exportable;

public class ExportadorExcel implements Exportable {

    @Override
    public void exportar(String contenidoReporte) {
        System.out.println("Hoja1");
        System.out.println("A1: Reporte financiero");
        System.out.println("B1: " + contenidoReporte);
    }
}
