package ui.loans;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Reader;
import util.Funcoes;

public class FrameFindReader extends javax.swing.JDialog {

  private final JDialog parent;

  DefaultTableModel model;

  public FrameFindReader(javax.swing.JDialog parent, boolean modal) {
    super(parent, modal);
    initComponents();
    setIcon();
    formataGrid(gridReader);
    model = (DefaultTableModel) gridReader.getModel();
    this.parent = parent;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgReaders = new javax.swing.ButtonGroup();
    jScrollPane1 = new javax.swing.JScrollPane();
    gridReader = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jPanel2 = new javax.swing.JPanel();
    btPesquisar = new javax.swing.JButton();
    txtPesquisa = new javax.swing.JTextField();
    btClose = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Localizar Usuário");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jScrollPane1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

    gridReader.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null}
      },
      new String [] {
        "Cód", "Nome", "Status"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    gridReader.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridReaderMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(gridReader);
    gridReader.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridReader.getColumnModel().getColumnCount() > 0) {
      gridReader.getColumnModel().getColumn(0).setResizable(false);
      gridReader.getColumnModel().getColumn(0).setPreferredWidth(25);
      gridReader.getColumnModel().getColumn(1).setResizable(false);
      gridReader.getColumnModel().getColumn(1).setPreferredWidth(300);
      gridReader.getColumnModel().getColumn(2).setResizable(false);
      gridReader.getColumnModel().getColumn(2).setPreferredWidth(50);
    }

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 200));

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
    jPanel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    bgReaders.add(jRadioButton1);
    jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jRadioButton1.setSelected(true);
    jRadioButton1.setText("Código");
    jRadioButton1.setActionCommand("id");
    jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 100, 28));

    bgReaders.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jRadioButton2.setText("Nome");
    jRadioButton2.setActionCommand("name");
    jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 15, 110, 28));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 470, 50));

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 12))); // NOI18N
    jPanel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btPesquisar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btPesquisar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btPesquisarActionPerformed(evt);
      }
    });
    jPanel2.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 15, 50, 28));

    txtPesquisa.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel2.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 15, 310, 28));

    btClose.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btCloseActionPerformed(evt);
      }
    });
    jPanel2.add(btClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 15, 50, 28));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 470, 50));

    setSize(new java.awt.Dimension(485, 331));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
    this.dispose();
  }//GEN-LAST:event_btCloseActionPerformed

  private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    preencheGrid(txtPesquisa.getText().toUpperCase(), bgReaders.getSelection().getActionCommand());
  }//GEN-LAST:event_btPesquisarActionPerformed

  private void gridReaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridReaderMouseClicked
    if (evt.getClickCount() == 2) {
      devolve(gridReader.getSelectedRow());
    }
  }//GEN-LAST:event_gridReaderMouseClicked

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btPesquisar.doClick();
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

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
      java.util.logging.Logger.getLogger(FrameFindReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrameFindReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrameFindReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrameFindReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameFindReader dialog = new FrameFindReader(new javax.swing.JDialog(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup bgReaders;
  private javax.swing.JButton btClose;
  private javax.swing.JButton btPesquisar;
  private javax.swing.JTable gridReader;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtPesquisa;
  // End of variables declaration//GEN-END:variables

  private void preencheGrid(String name, String order) {
    Funcoes.removeLinha(model);
   List<Reader> readers = Reader.find("name like '%" + name + "%'" + " and active").orderBy(order);
    for (Reader reader : readers) {
      String status = reader.getBoolean("active") ? "Ativo" : "Inativo";
      model.addRow(new Object[]{String.format("%04d", reader.getId()), reader.getString("name"), status});
    }
    gridReader.setModel(model);

  }

  private void devolve(int linha) {
    FrameLoan f = (FrameLoan) this.parent;
    f.setIdReader(model.getValueAt(linha, 0).toString());
    f.setNameReader(model.getValueAt(linha, 1).toString());
    this.dispose();
  }

  private void formataGrid(JTable gridReader) {
    gridReader.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridReader.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridReader, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridReader, 2, SwingConstants.CENTER);
  }

  private void setIcon() {
    btPesquisar.setIcon( new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btClose.setIcon(     new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
  }
}
