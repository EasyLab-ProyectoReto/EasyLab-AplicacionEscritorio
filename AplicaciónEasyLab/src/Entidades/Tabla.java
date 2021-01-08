package Entidades;

import Datos.DATPracticas;
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tabla {

    DATPracticas dao = null;

    public void visualizar_Pdf(JTable tabla,ArrayList<PDF> lis) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Nombre_Practicas");
        dt.addColumn("Descripción");
        dt.addColumn("Archivo_PDF");
        
        ImageIcon icono = null;
        if (get_Image("/IMG/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/IMG/32pdf.png"));
        }

        dao = new DATPracticas();
        PDF vo = new PDF();
        for (int i = 0; i < dao.Listar_PDFs().size(); i++) {
            lis.add(dao.Listar_PDFs().get(i));
        }
        //lis = dao.Listar_PDFs();

        if (lis.size() > 0) {
            for (int i = 0; i < lis.size(); i++) {
                Object fila[] = new Object[3];
                vo = lis.get(i);
                fila[0] = vo.getNombrepdf();
                fila[1] = vo.getDescripcion();
                if (vo.getArchivopdf() != null) {
                    fila[2] = new JButton(icono);
                } else {
                    fila[2] = new JButton("Vacio");
                }
                
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
