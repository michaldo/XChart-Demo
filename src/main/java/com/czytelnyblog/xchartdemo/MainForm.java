package com.czytelnyblog.xchartdemo;

import com.xeiam.xchart.Chart;
import com.xeiam.xchart.QuickChart;
import com.xeiam.xchart.SwingWrapper;
import com.xeiam.xchart.XChartPanel;
import javax.swing.JPanel;


public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDrawInternal = new javax.swing.JButton();
        btnDrawExternal = new javax.swing.JButton();
        pnlChartArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDrawInternal.setText("Draw below");
        btnDrawInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawInternalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrawInternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 453, -1));

        btnDrawExternal.setText("Draw in external window");
        btnDrawExternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawExternalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrawExternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 453, -1));

        pnlChartArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlChartArea.setLayout(new javax.swing.BoxLayout(pnlChartArea, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(pnlChartArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 453, 246));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDrawExternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawExternalActionPerformed
        double[] xData = new double[]{0.0, 1.0, 2.0};
        double[] yData = new double[]{2.0, 1.0, 0.0};

        // Create Chart
        Chart chart = QuickChart.getChart("Sample External Chart", "X", "Y", "y(x)", xData, yData);
        
        //display in external window
        new SwingWrapper(chart).displayChart();
    }//GEN-LAST:event_btnDrawExternalActionPerformed

    private void btnDrawInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawInternalActionPerformed
        double[] xData = new double[]{0.0, 1.0, 2.0};
        double[] yData = new double[]{1.0, 1.0, 2.0};

        // Create Chart
        Chart chart = QuickChart.getChart("Sample Internal Chart", "X", "Y", "y(x)", xData, yData);
        
        JPanel pnlChart = new XChartPanel(chart);
        
        //to avoid adding multiply charts to the same panel
        this.pnlChartArea.removeAll();        
        
        this.pnlChartArea.add(pnlChart);
        pnlChartArea.validate();
    }//GEN-LAST:event_btnDrawInternalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrawExternal;
    private javax.swing.JButton btnDrawInternal;
    private javax.swing.JPanel pnlChartArea;
    // End of variables declaration//GEN-END:variables
}
