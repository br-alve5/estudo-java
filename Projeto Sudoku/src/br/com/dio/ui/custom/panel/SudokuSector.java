package br.com.dio.ui.custom.panel;

import br.com.dio.ui.custom.input.NumberText;
import static java.awt.Color.black;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SudokuSector extends JPanel{

    public SudokuSector(final List<NumberText> textFields){
        var dimension = new Dimension(170, 170);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setBorder(new LineBorder(black, 2, true));
        this.setVisible(true);
        textFields.forEach(this::add);
    }
}
