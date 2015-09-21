package ui.readers;

import java.awt.Font;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Reader;
import util.Email;
import util.Funcoes;

public class FrameFindBirth extends javax.swing.JDialog {

  DefaultTableModel model;

  public FrameFindBirth(java.awt.Frame parent, boolean modal) {
    initComponents();
    setIcons();
    formataGrid(gridBirth);
    model = (DefaultTableModel) gridBirth.getModel();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgAuthors = new javax.swing.ButtonGroup();
    jScrollPane1 = new javax.swing.JScrollPane();
    gridBirth = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    comboMes = new javax.swing.JComboBox();
    btEmail = new javax.swing.JButton();
    btExit = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Localizar Autor");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.foreground")));
    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    gridBirth.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    gridBirth.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    gridBirth.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null}
      },
      new String [] {
        "Cód", "Usuário", "Email", "Telefone", "Aniv"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(gridBirth);
    gridBirth.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridBirth.getColumnModel().getColumnCount() > 0) {
      gridBirth.getColumnModel().getColumn(0).setResizable(false);
      gridBirth.getColumnModel().getColumn(0).setPreferredWidth(10);
      gridBirth.getColumnModel().getColumn(1).setResizable(false);
      gridBirth.getColumnModel().getColumn(1).setPreferredWidth(180);
      gridBirth.getColumnModel().getColumn(2).setResizable(false);
      gridBirth.getColumnModel().getColumn(2).setPreferredWidth(180);
      gridBirth.getColumnModel().getColumn(3).setResizable(false);
      gridBirth.getColumnModel().getColumn(3).setPreferredWidth(40);
      gridBirth.getColumnModel().getColumn(4).setResizable(false);
      gridBirth.getColumnModel().getColumn(4).setPreferredWidth(25);
    }

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 275));

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções de Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 12))); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Escolha um Mês:");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 100, 30));

    comboMes.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    comboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " --- Selecione um Mês ---", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
    comboMes.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        comboMesItemStateChanged(evt);
      }
    });
    jPanel1.add(comboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 18, 200, 30));

    btEmail.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    btEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
    btEmail.setText("Email");
    btEmail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btEmailActionPerformed(evt);
      }
    });
    jPanel1.add(btEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 18, 90, 30));

    btExit.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
    btExit.setText("Sair");
    btExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btExitActionPerformed(evt);
      }
    });
    jPanel1.add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 18, 90, 30));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 650, 60));

    setSize(new java.awt.Dimension(662, 370));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
    this.dispose();
  }//GEN-LAST:event_btExitActionPerformed

  private void btEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmailActionPerformed
    preparaEmail(gridBirth.getSelectedRow());
  }//GEN-LAST:event_btEmailActionPerformed

  private void comboMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMesItemStateChanged
    preencheGrid(comboMes.getSelectedIndex());
  }//GEN-LAST:event_comboMesItemStateChanged

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
      java.util.logging.Logger.getLogger(FrameFindBirth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrameFindBirth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrameFindBirth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrameFindBirth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameFindBirth dialog = new FrameFindBirth(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton btExit;
  private javax.swing.JComboBox comboMes;
  private javax.swing.JTable gridBirth;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables

  private void preencheGrid(int mes) {
    Funcoes.removeLinha(model);
    List<Reader> readers = Reader.where("month(birth) = ?", mes).orderBy("day(birth)"); // .getBirthdays(mes);
    for (Reader reader : readers) {
      String birth = Funcoes.dataString(reader.getDate("birth"));
      model.addRow(new Object[]{
        String.format("%03d",reader.getInteger("id")), reader.getString("name"), reader.getString("email"), reader.getString("phone"), birth
      });
    }
    gridBirth.setModel(model);
  }

  private void formataGrid(JTable gridLoan) {
    gridLoan.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 11));
    gridLoan.setFont(new Font("Arial", Font.PLAIN, 11));
    Funcoes.alinhaColunas(gridLoan, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridLoan, 4, SwingConstants.CENTER);
  }

  private void preparaEmail(int linha){
    String reader_id = model.getValueAt(linha, 0).toString();
    Reader reader = Reader.findById(Integer.valueOf(reader_id));
    String to = reader.getString("name") + "<" + reader.getString("email") + ">";
    String nome = reader.getString("name");
    String mensagem = "";
    mensagem += "Prezado(a) Companheiro(a) " + nome + "\n\n";
    mensagem += "Neste dia especial, nós que fazemos o corpo do Grupo Espírita Chico Xavier vimos ";
    mensagem += "lhe desejar que as bênçãos de Nosso Senhor Jesus Cristo sejam derramadas sobre você ";
    mensagem += "e toda sua família, hoje e sempre!\n\n";
    mensagem += "Feliz Aniversário!\n\n";
    mensagem += "Cordialmente,\n\n";
    mensagem += "Grupo Espírita Chico Xavier\n\n";
    Email email = new Email();
    email.sendHotMail(to, "FELIZ ANIVERSÁRIO", mensagem);
  }

  private void setIcons() {
    btEmail.setIcon(  new javax.swing.ImageIcon(getClass().getResource("/images/email.png")));
    btExit.setIcon(   new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
  }

}
