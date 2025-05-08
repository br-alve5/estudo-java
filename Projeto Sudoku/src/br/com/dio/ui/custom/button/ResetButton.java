package br.com.dio.ui.custom.button;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ResetButton extends JButton{
    public ResetButton(final ActionListener actionListener){
        this.setText("Concluir");
        this.addActionListener(actionListener);
    }
}
