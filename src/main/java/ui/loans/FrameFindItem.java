package ui.loans;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Category;
import models.Item;
import util.Funcoes;

public class FrameFindItem extends javax.swing.JDialog {

  private final JDialog parent;
  DefaultTableModel model;

  public FrameFindItem(javax.swing.JDialog parent, boolean modal) {
    super(parent, modal);
    initComponents();
    //setIcon();
    model = (DefaultTableModel) gridItem.getModel();
    formataGrid(gridItem);
    this.parent = parent;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgReaders = new javax.swing.ButtonGroup();
    jScrollPane1 = new javax.swing.JScrollPane();
    gridItem = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jPanel2 = new javax.swing.JPanel();
    btFind = new javax.swing.JButton();
    txtPesquisa = new javax.swing.JTextField();
    btClose = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Localizar Item");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jScrollPane1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

    gridItem.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
    gridItem.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null}
      },
      new String [] {
        "Cód", "Título", "Categoria", "Saldo"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    gridItem.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridItemMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(gridItem);
    gridItem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridItem.getColumnModel().getColumnCount() > 0) {
      gridItem.getColumnModel().getColumn(0).setResizable(false);
      gridItem.getColumnModel().getColumn(0).setPreferredWidth(25);
      gridItem.getColumnModel().getColumn(1).setResizable(false);
      gridItem.getColumnModel().getColumn(1).setPreferredWidth(300);
      gridItem.getColumnModel().getColumn(2).setResizable(false);
      gridItem.getColumnModel().getColumn(2).setPreferredWidth(100);
      gridItem.getColumnModel().getColumn(3).setResizable(false);
      gridItem.getColumnModel().getColumn(3).setPreferredWidth(50);
    }

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 190));

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
    jRadioButton2.setText("Título");
    jRadioButton2.setActionCommand("title");
    jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 15, 110, 28));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 520, 50));

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
    jPanel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btFind.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif"))); // NOI18N
    btFind.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btFindActionPerformed(evt);
      }
    });
    jPanel2.add(btFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 15, 70, 28));

    txtPesquisa.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel2.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 15, 350, 28));

    btClose.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
    btClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btCloseActionPerformed(evt);
      }
    });
    jPanel2.add(btClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 15, 70, 28));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 522, 50));

    setSize(new java.awt.Dimension(534, 331));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
    this.dispose();
  }//GEN-LAST:event_btCloseActionPerformed

  private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
    preencheGrid(txtPesquisa.getText().toUpperCase(), bgReaders.getSelection().getActionCommand());
  }//GEN-LAST:event_btFindActionPerformed

  private void gridItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridItemMouseClicked
    if (evt.getClickCount() == 2) {
      int saldo = Integer.valueOf(model.getValueAt(gridItem.getSelectedRow(), 3).toString());
      if (saldo <= 0) {
        Funcoes.informacao("Item não disponível (saldo = 0)");
        txtPesquisa.requestFocusInWindow();
      } else {
        devolve(gridItem.getSelectedRow());
      }
    }
  }//GEN-LAST:event_gridItemMouseClicked

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btFind.doClick();
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
      java.util.logging.Logger.getLogger(FrameFindItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrameFindItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrameFindItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrameFindItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameFindItem dialog = new FrameFindItem(new javax.swing.JDialog(), true);
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
  private javax.swing.JButton btFind;
  private javax.swing.JTable gridItem;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtPesquisa;
  // End of variables declaration//GEN-END:variables

  private void preencheGrid(String title, String order) {
    Funcoes.removeLinha(model);
    List<Item> items = Item.find("title like '%" + title + "%'").orderBy(order);
    for (Item item : items) {
      Category category = item.parent(Category.class);
      model.addRow(new Object[]{String.format("%03d", item.getId()), item.getString("title"), category.getString("description"), item.getInteger("available")});
    }
    gridItem.setModel(model);
  }

  private void devolve(int linha) {
    FrameLoan f = (FrameLoan) this.parent;
    f.setIdItem(model.getValueAt(linha, 0).toString());
    f.setNameItem(model.getValueAt(linha, 1).toString());
    f.setTypeItem(model.getValueAt(linha, 2).toString());
    this.dispose();
  }

  private void formataGrid(JTable gridItem) {
    gridItem.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridItem.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridItem, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridItem, 3, SwingConstants.CENTER);
  }

  private void setIcon() {
    btFind.setIcon( new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btClose.setIcon(     new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
  }
}
