import ORGANIZADOR.MotorReportes;
import SUBclases.ExportadorExcel;
import SUBclases.ExportadorHTML;
import SUBclases.ExportadorPDF;

public class MAIN {
    public static void main(String[] args) {
        MotorReportes motor = new MotorReportes();
        motor.agregarExportador(new ExportadorPDF());
        motor.agregarExportador(new ExportadorExcel());
        motor.agregarExportador(new ExportadorHTML());

        String reporte = "Balance 2026 | Ingresos: $150000 | Egresos: $90000 | Utilidad: $60000";
        motor.exportarTodos(reporte);
        System.out.println("------------------------");
    }
}
