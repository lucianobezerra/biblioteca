package ui.items;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Item;
import models.Loan;
import models.Reader;
import org.javalite.activejdbc.validation.ValidationException;
import util.Funcoes;
import util.Message;

public class FrameDevolution extends javax.swing.JDialog {

  DefaultTableModel model;

  public FrameDevolution(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();

    model = (DefaultTableModel) gridLoan.getModel();
    preencheGrid();
    formataGrid(gridLoan);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgOrdem = new javax.swing.ButtonGroup();
    jPanel5 = new javax.swing.JPanel();
    btDevolver = new javax.swing.JButton();
    btDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devolution.png")));
    btSair = new javax.swing.JButton();
    btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
    jScrollPane1 = new javax.swing.JScrollPane();
    gridLoan = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    txtDevolution = new javax.swing.JFormattedTextField();
    try{
      javax.swing.text.MaskFormatter devolution = new javax.swing.text.MaskFormatter("##/##/####");
      txtDevolution = new javax.swing.JFormattedTextField(devolution);
    }
    catch (ParseException e){
    }

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Movimentação de Itens");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel5.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btDevolver.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    btDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devolution.png"))); // NOI18N
    btDevolver.setText("Devolver");
    btDevolver.setToolTipText("Salvar Registro");
    btDevolver.setEnabled(false);
    btDevolver.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btDevolverActionPerformed(evt);
      }
    });
    jPanel5.add(btDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 288, 100, 30));

    btSair.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
    btSair.setText("Sair");
    btSair.setToolTipText("Sair");
    btSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSairActionPerformed(evt);
      }
    });
    jPanel5.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 288, 100, 30));

    jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    gridLoan.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    gridLoan.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null}
      },
      new String [] {
        "Cód", "Usuário", "Título", "Retorno"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
    gridLoan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    gridLoan.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridLoanMouseClicked(evt);
      }
    });
    gridLoan.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        gridLoanKeyReleased(evt);
      }
    });
    jScrollPane1.setViewportView(gridLoan);
    gridLoan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridLoan.getColumnModel().getColumnCount() > 0) {
      gridLoan.getColumnModel().getColumn(0).setResizable(false);
      gridLoan.getColumnModel().getColumn(0).setPreferredWidth(30);
      gridLoan.getColumnModel().getColumn(1).setResizable(false);
      gridLoan.getColumnModel().getColumn(1).setPreferredWidth(230);
      gridLoan.getColumnModel().getColumn(2).setResizable(false);
      gridLoan.getColumnModel().getColumn(2).setPreferredWidth(230);
      gridLoan.getColumnModel().getColumn(3).setResizable(false);
      gridLoan.getColumnModel().getColumn(3).setPreferredWidth(70);
    }

    jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 280));

    jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Data:");
    jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 290, 40, 28));

    txtDevolution.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtDevolution.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel5.add(txtDevolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 288, 90, 28));

    getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

    setSize(new java.awt.Dimension(653, 354));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
    this.dispose();
  }//GEN-LAST:event_btSairActionPerformed

  private void btDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDevolverActionPerformed
    Loan loan = Loan.findById(gridLoan.getModel().getValueAt(gridLoan.getSelectedRow(), 0).toString());
    preparaSalvar(loan, txtDevolution.getText());
  }//GEN-LAST:event_btDevolverActionPerformed

  private void gridLoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridLoanMouseClicked
    if (gridLoan.getSelectedRow() >= 0) {
      txtDevolution.setText(gridLoan.getModel().getValueAt(gridLoan.getSelectedRow(), 3).toString());
      btDevolver.setEnabled(true);
    }
  }//GEN-LAST:event_gridLoanMouseClicked

  private void gridLoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gridLoanKeyReleased
    if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
      txtDevolution.setText(gridLoan.getModel().getValueAt(gridLoan.getSelectedRow(), 3).toString());
      btDevolver.setEnabled(true);
    }
  }//GEN-LAST:event_gridLoanKeyReleased

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameDevolution dialog = new FrameDevolution(new javax.swing.JFrame(), true);
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
  private javax.swing.ButtonGroup bgOrdem;
  private javax.swing.JButton btDevolver;
  private javax.swing.JButton btSair;
  private javax.swing.JTable gridLoan;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JFormattedTextField txtDevolution;
  // End of variables declaration//GEN-END:variables

  private void preparaSalvar(Loan loan, String devolution) {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      java.sql.Date data = new java.sql.Date(sdf.parse(devolution).getTime());
      loan.set("devolution", data);
      if (loan.saveIt()) {
        Item item = loan.parent(Item.class);
        item.set("available", item.getInteger("available") + 1);
        item.saveIt();
        btDevolver.setEnabled(false);
        preencheGrid();
      }
    } catch (ValidationException e) {
      Message.validation(this, loan.errors());
    } catch (ParseException e) {
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }

  private void preencheGrid() {
    Funcoes.removeLinha(model);
    List<Loan> loans = Loan.find("devolution is null");

    for (Loan loan : loans) {
      Reader reader = loan.parent(Reader.class);
      Item item     = loan.parent(Item.class);
      model.addRow(new Object[]{String.format("%04d", loan.getId()), reader.getString("name"), item.getString("title"), Funcoes.dataString(loan.getDate("prevision"))});
    }
    gridLoan.setModel(model);
  }

  private void formataGrid(JTable gridLoan) {
    gridLoan.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridLoan.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridLoan, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridLoan, 3, SwingConstants.CENTER);
  }

}
