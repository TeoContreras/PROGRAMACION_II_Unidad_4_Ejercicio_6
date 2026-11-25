package SUBclases;

import SUPERclases.Exportable;

public class ExportadorPDF implements Exportable {

    @Override
    public void exportar(String contenidoReporte) {
        System.out.println("%PDF-1.4");
        System.out.println("[Página 1]");
        System.out.println("Texto: " + contenidoReporte);
        System.out.println("%%EOF");
    }
}
