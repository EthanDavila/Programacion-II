/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views.panels;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author personal
 */
public class PnlTemperatura extends javax.swing.JPanel {

	/**
	 * Creates new form PnlTemp
	 */
	public PnlTemperatura() {
		initComponents();
	}
	
	public JTextField getNo1() {
		return No1;
	}

	public void setNo1(JTextField No1) {
		this.No1 = No1;
	}

	public JTextField getNo2() {
		return No2;
	}

	public void setNo2(JTextField No2) {
		this.No2 = No2;
	}

	public JButton getBtnConvertir() {
		return btnConvertir;
	}

	public void setBtnConvertir(JButton btnConvertir) {
		this.btnConvertir = btnConvertir;
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                java.awt.GridBagConstraints gridBagConstraints;

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                No1 = new javax.swing.JTextField();
                No2 = new javax.swing.JTextField();
                jPanel2 = new javax.swing.JPanel();
                btnConvertir = new javax.swing.JButton();

                setLayout(new java.awt.BorderLayout());

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setLayout(new java.awt.GridBagLayout());

                jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));
                jLabel1.setText("ºF: ");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(17, 66, 0, 0);
                jPanel1.add(jLabel1, gridBagConstraints);

                jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2.setText("ºC: ");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(39, 67, 0, 0);
                jPanel1.add(jLabel2, gridBagConstraints);

                jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(0, 0, 0));
                jLabel3.setText("Convertidor de Temperatura");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(26, 12, 0, 105);
                jPanel1.add(jLabel3, gridBagConstraints);

                No1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                No1.setForeground(new java.awt.Color(0, 0, 0));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.gridheight = 2;
                gridBagConstraints.ipadx = 100;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(36, 17, 0, 0);
                jPanel1.add(No1, gridBagConstraints);

                No2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                No2.setForeground(new java.awt.Color(0, 0, 0));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.gridheight = 2;
                gridBagConstraints.ipadx = 100;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(14, 18, 69, 0);
                jPanel1.add(No2, gridBagConstraints);

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                btnConvertir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                btnConvertir.setForeground(new java.awt.Color(0, 0, 0));
                btnConvertir.setText("Convertir");
                jPanel2.add(btnConvertir);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 4;
                jPanel1.add(jPanel2, gridBagConstraints);

                add(jPanel1, java.awt.BorderLayout.CENTER);
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField No1;
        private javax.swing.JTextField No2;
        private javax.swing.JButton btnConvertir;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        // End of variables declaration//GEN-END:variables
}
