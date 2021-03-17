/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import ni.edu.uni.programacion.views.panels.PnlMoneda;

/**
 *
 * @author personal
 */
public class PnlMonedaController implements ActionListener{

	private PnlMoneda pnlMoneda;
	private final String Monedas[] = new String[]{"C$", "$"};
	private DefaultComboBoxModel FromCmbModel;
	private DefaultComboBoxModel ToCmbModel;
	
	public PnlMonedaController(PnlMoneda pnlMoneda){
		this.pnlMoneda = pnlMoneda;
		initComponent();
	}
	
	public void initComponent(){
		FromCmbModel = new DefaultComboBoxModel(Monedas);
		ToCmbModel = new DefaultComboBoxModel(Monedas);
		
		pnlMoneda.getBtnConvertir().addActionListener(this);
		pnlMoneda.getBtnNuevo().addActionListener(this);
		
		pnlMoneda.getFromCmb().setModel(FromCmbModel);
		pnlMoneda.getToCmb().setModel(ToCmbModel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equalsIgnoreCase("Convertir")){
			int cmbFromIndex = pnlMoneda.getFromCmb().getSelectedIndex();
			int cmbToIndex = pnlMoneda.getToCmb().getSelectedIndex();
			double Valor = Double.parseDouble(pnlMoneda.getValor().getText());
			pnlMoneda.getLblResultado().setText("Resultado: " + ConvertidorMoneda(Valor, cmbFromIndex, cmbToIndex));
		}
		
		if(e.getActionCommand().equalsIgnoreCase("Nuevo")){
			pnlMoneda.getValor().setText("");
		}
	}
	
	private double ConvertidorMoneda(double Valor, int From, int To){
		switch(From){
		
			case 0:
				switch(To){
					case 0:
						return Valor;                        
					case 1:
						return CordobasToDolares(Valor);
				}
			case 1:
				switch(To){
					case 0:
						return DolaresToCordobas(Valor);
					case 1:
						return Valor;
				}
		}
		return Valor;
	}
	
	private double CordobasToDolares(double Valor){
		return (Valor / (double)34.80);
	}
	
	private double DolaresToCordobas(double Valor){
		return (Valor * (double)34.80);
	}
}