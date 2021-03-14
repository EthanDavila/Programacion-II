/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ni.edu.uni.programacion.views.panels.PnlTemperatura;

/**
 *
 * @author personal
 */
public class PnlTemperaturaController implements ActionListener {
    private final PnlTemperatura pnlTemperatura;

    public PnlTemperaturaController(PnlTemperatura pnlTemperatura) {
        this.pnlTemperatura = pnlTemperatura;
        initComponent();
    }
    
    private void initComponent() {
        pnlTemperatura.getBtnConvertir().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Convertir")) {
            double n1, n2;
            n1 = Double.parseDouble(pnlTemperatura.getNo1().getText());
	    n2 = Double.parseDouble(pnlTemperatura.getNo2().getText());

	    pnlTemperatura.getNo1().setText(String.valueOf(ConvertirC(n1)));
	    pnlTemperatura.getNo2().setText(String.valueOf(ConvertirF(n2)));
        }
    }

    private double ConvertirC(double a) {
	return a = (a - 32) / 1.8;
    }
    
    private double ConvertirF(double b){
	return 	b = (b * 1.8) + 32;
    }
}
