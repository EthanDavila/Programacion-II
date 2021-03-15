/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ni.edu.uni.programacion.views.panels.PnlMoneda;

/**
 *
 * @author personal
 */
public class PnlMonedaController implements ActionListener{
    private final PnlMoneda pnlMoneda;

    public PnlMonedaController(PnlMoneda pnlMoneda) {
        this.pnlMoneda = pnlMoneda;
        initComponent();
    }
    
    private void initComponent() {
        pnlMoneda.getBtnConvertir().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Convertir")) {
            double n1, n2;
            n1 = Double.parseDouble(pnlMoneda.getNo1().getText());
	    n2 = Double.parseDouble(pnlMoneda.getNo2().getText());

	    pnlMoneda.getNo1().setText(String.valueOf(ConvertirD(n2 , n1)));
	    pnlMoneda.getNo2().setText(String.valueOf(ConvertirC(n1, n2)));
        }
    }
    
    private double ConvertirD(double a, double b){
	    return a = b * 34.79;
    }
    
    private double ConvertirC(double a, double b){
	    return a = b / 34.79;
    }
}
