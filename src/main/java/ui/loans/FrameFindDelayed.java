package ui.loans;

import java.awt.Font;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Category;
import models.Item;
import models.Loan;
import models.Reader;
import util.Email;
import util.Funcoes;

public class FrameFindDelayed extends javax.swing.JDialog {

  DefaultTableModel model;

  public FrameFindDelayed(java.awt.Frame parent, boolean modal) {
    initComponents();
    setIcons();
    formataGrid(gridLoan);
    model = (DefaultTableModel) gridLoan.getModel();
    preencheGrid();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgAuthors = new javax.swing.ButtonGroup();
    jScrollPane1 = new javax.swing.JScrollPane();
    gridLoan = new javax.swing.JTable();
    btEmail = new javax.swing.JButton();
    btSair = new javax.swing.JButton();
    lblStatus = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Empréstimos Atrasados");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.foreground")));
    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    gridLoan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    gridLoan.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    gridLoan.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null}
      },
      new String [] {
        "Cód", "Usuário", "Título", "Categoria", "Retorno", "Atraso"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(gridLoan);
    gridLoan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridLoan.getColumnModel().getColumnCount() > 0) {
      gridLoan.getColumnModel().getColumn(0).setResizable(false);
      gridLoan.getColumnModel().getColumn(0).setPreferredWidth(10);
      gridLoan.getColumnModel().getColumn(1).setResizable(false);
      gridLoan.getColumnModel().getColumn(1).setPreferredWidth(120);
      gridLoan.getColumnModel().getColumn(2).setResizable(false);
      gridLoan.getColumnModel().getColumn(2).setPreferredWidth(120);
      gridLoan.getColumnModel().getColumn(3).setResizable(false);
      gridLoan.getColumnModel().getColumn(3).setPreferredWidth(40);
      gridLoan.getColumnModel().getColumn(4).setPreferredWidth(25);
      gridLoan.getColumnModel().getColumn(5).setResizable(false);
      gridLoan.getColumnModel().getColumn(5).setPreferredWidth(15);
    }

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 300));

    btEmail.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btEmail.setText("Email");
    btEmail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btEmailActionPerformed(evt);
      }
    });
    getContentPane().add(btEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 305, 120, 28));

    btSair.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btSair.setText("Sair");
    btSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSairActionPerformed(evt);
      }
    });
    getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 305, 120, 28));

    lblStatus.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    lblStatus.setForeground(new java.awt.Color(21, 63, 210));
    getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 305, 340, 25));

    setSize(new java.awt.Dimension(662, 370));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
    this.dispose();
  }//GEN-LAST:event_btSairActionPerformed

  private void btEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmailActionPerformed
    lblStatus.setText("Aguarde, preparando envio de email ....");
    preparaEmail(gridLoan.getSelectedRow());
  }//GEN-LAST:event_btEmailActionPerformed

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
      java.util.logging.Logger.getLogger(FrameFindDelayed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrameFindDelayed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrameFindDelayed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrameFindDelayed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameFindDelayed dialog = new FrameFindDelayed(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton btEmail;
  private javax.swing.JButton btSair;
  private javax.swing.JTable gridLoan;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblStatus;
  // End of variables declaration//GEN-END:variables

  private void setIcons() {
    btEmail.setIcon(  new javax.swing.ImageIcon(getClass().getResource("/images/email.png")));
    btSair.setIcon(   new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
  }

  private void preencheGrid() {
    Funcoes.removeLinha(model);
    List<Loan> loans = Loan.getLoaneds();
    for (Loan loan : loans) {
      Reader reader     = loan.parent(Reader.class);
      Item item         = loan.parent(Item.class);
      Category category = item.parent(Category.class);
      Object[] rowData = new Object[]{String.format("%04d", loan.getId()), reader.getString("name"), item.getString("title"), category.getString("description"), Funcoes.dataString(loan.getDate("prevision")), Funcoes.difData(loan.getDate("prevision"))};
      model.addRow(rowData);
    }
    gridLoan.setModel(model);
  }

  private void formataGrid(JTable gridLoan) {
    gridLoan.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 11));
    gridLoan.setFont(new Font("Arial", Font.PLAIN, 11));
    Funcoes.alinhaColunas(gridLoan, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridLoan, 4, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridLoan, 5, SwingConstants.CENTER);
  }

  private void preparaEmail(int linha){
    String loan_id = model.getValueAt(linha, 0).toString();
    Loan loan     = Loan.findById(Integer.valueOf(loan_id));
    Reader reader = loan.parent(Reader.class);
    Item    item  = loan.parent(Item.class);
    Category cat  = item.parent(Category.class);
    if (reader.getString("email") != null) {
      String to   = reader.getString("name") + "<" + reader.getString("email") + ">";
      String nome = reader.getString("name");
      int dias    = Funcoes.difData(loan.getDate("prevision"));
      String nameItem = item.getString("title");
      String tipo = cat.getString("description");
      String data = Funcoes.dataString(loan.getDate("created_at"));
      String previ = Funcoes.dataString(loan.getDate("prevision"));
      String mensagem = "";
      mensagem += "Prezado(a) Sr(a) " + nome + "\n\n";
      mensagem += "Verificamos em nossos registros que o " + tipo + ": " + nameItem + " que o(a) Sr(a) levou em ";
      mensagem += data + " até este momento não foi devolvido. A data inicial prevista para devolução era " + previ + ", ";
      mensagem += "somando portanto " + dias + " dias de atraso.\n\n";
      mensagem += "Solicitamos gentilmente que seja feita a devolução.\n\n";
      mensagem += "Cordialmente,\n\n";
      mensagem += "Grupo Espírita Chico Xavier\n\n";
      lblStatus.setText("Aguarde, preparando envio...");

      Email email = new Email();
      email.sendHotMail(to, "DEVOLUÇÃO ATRASADA", mensagem);
      lblStatus.setText("Envio Concluido.");
    } else {
      Funcoes.erro("Email do Usuário não cadastrado");
    }
  }

}
