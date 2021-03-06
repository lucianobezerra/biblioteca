package ui.items;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Author;
import util.Funcoes;

public class FrameFindAuthor extends javax.swing.JDialog {

  private final JDialog parent;

  DefaultTableModel model;

  public FrameFindAuthor(javax.swing.JDialog parent, boolean modal) {
    super(parent, modal);
    initComponents();
    setIcons();
    formataGrid(gridAuthor);
    model = (DefaultTableModel) gridAuthor.getModel();
    this.parent = parent;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgAuthors = new javax.swing.ButtonGroup();
    jScrollPane1 = new javax.swing.JScrollPane();
    gridAuthor = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jPanel2 = new javax.swing.JPanel();
    btFind = new javax.swing.JButton();
    txtPesquisa = new javax.swing.JTextField();
    checkActive = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Localizar Autor");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    gridAuthor.setModel(new javax.swing.table.DefaultTableModel(
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
    gridAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridAuthorMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(gridAuthor);
    gridAuthor.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridAuthor.getColumnModel().getColumnCount() > 0) {
      gridAuthor.getColumnModel().getColumn(0).setResizable(false);
      gridAuthor.getColumnModel().getColumn(0).setPreferredWidth(25);
      gridAuthor.getColumnModel().getColumn(1).setResizable(false);
      gridAuthor.getColumnModel().getColumn(1).setPreferredWidth(300);
      gridAuthor.getColumnModel().getColumn(2).setResizable(false);
      gridAuthor.getColumnModel().getColumn(2).setPreferredWidth(50);
    }

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 200));

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 12))); // NOI18N
    jPanel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    bgAuthors.add(jRadioButton1);
    jRadioButton1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jRadioButton1.setSelected(true);
    jRadioButton1.setText("Código");
    jRadioButton1.setActionCommand("id");
    jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 100, 28));

    bgAuthors.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jRadioButton2.setText("Nome");
    jRadioButton2.setActionCommand("name");
    jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 15, 110, 28));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 470, 50));

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 12))); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btFind.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif"))); // NOI18N
    btFind.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btFindActionPerformed(evt);
      }
    });
    jPanel2.add(btFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 15, 50, 28));

    txtPesquisa.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel2.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 270, 28));

    checkActive.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkActive.setText("Ativo");
    jPanel2.add(checkActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 15, 80, 28));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 470, 50));

    setSize(new java.awt.Dimension(485, 331));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
    preencheGrid(txtPesquisa.getText().toUpperCase(), checkActive.isSelected(), bgAuthors.getSelection().getActionCommand());
  }//GEN-LAST:event_btFindActionPerformed

  private void gridAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridAuthorMouseClicked
    if (evt.getClickCount() == 2) {
      devolve(gridAuthor.getSelectedRow());
    }
  }//GEN-LAST:event_gridAuthorMouseClicked

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
      java.util.logging.Logger.getLogger(FrameFindAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrameFindAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrameFindAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrameFindAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameFindAuthor dialog = new FrameFindAuthor(new javax.swing.JDialog(), true);
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
  private javax.swing.ButtonGroup bgAuthors;
  private javax.swing.JButton btFind;
  private javax.swing.JCheckBox checkActive;
  private javax.swing.JTable gridAuthor;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtPesquisa;
  // End of variables declaration//GEN-END:variables

  private void preencheGrid(String name, Boolean onlyActive, String order) {
    Funcoes.removeLinha(model);
    String active = onlyActive ? " and active": "";
    List<Author> authors = Author.find("name like '%" + name + "%'" + active).orderBy(order);
    for (Author author : authors) {
      String status = author.getBoolean("active") ? "Ativo" : "Inativo";
      model.addRow(new Object[]{String.format("%04d", author.getId()), author.getString("name"), status});
    }
    gridAuthor.setModel(model);

  }

  private void devolve(int linha) {
    FrameItem f = (FrameItem) this.parent;
    f.setIdAuthor(model.getValueAt(linha, 0).toString());
    f.setNameAuthor(model.getValueAt(linha, 1).toString());
    this.dispose();
  }

  private void formataGrid(JTable gridAuthor) {
    gridAuthor.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridAuthor.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridAuthor, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridAuthor, 2, SwingConstants.CENTER);
  }

  private void setIcons() {
    btFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
  }
}
