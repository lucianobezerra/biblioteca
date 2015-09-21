package ui.loans;

import java.awt.Font;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Item;
import models.Loan;
import models.LoggedUser;
import models.Reader;
import org.javalite.activejdbc.validation.ValidationException;
import util.Funcoes;
import util.Message;

public class FrameLoan extends javax.swing.JDialog {

  DefaultTableModel model;

  public FrameLoan(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    //setIcon();
    model = (DefaultTableModel) gridLoan.getModel();
    formataGrid(gridLoan);
    preencheGrid();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgOrdem = new javax.swing.ButtonGroup();
    jPanel5 = new javax.swing.JPanel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    lblCodigo = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    txtItem = new javax.swing.JTextField();
    txtReader = new javax.swing.JTextField();
    lblReader = new javax.swing.JLabel();
    lblItem = new javax.swing.JLabel();
    btFindReader = new javax.swing.JButton();
    btFindItem = new javax.swing.JButton();
    txtPrevision = new javax.swing.JFormattedTextField();
    try{
      javax.swing.text.MaskFormatter devolution = new javax.swing.text.MaskFormatter("##/##/####");
      txtPrevision = new javax.swing.JFormattedTextField(devolution);
    }
    catch (ParseException e){
    }
    jScrollPane1 = new javax.swing.JScrollPane();
    gridLoan = new javax.swing.JTable();
    pnActions = new javax.swing.JPanel();
    btNovo = new javax.swing.JButton();
    btAlterar = new javax.swing.JButton();
    btSalvar = new javax.swing.JButton();
    btCancelar = new javax.swing.JButton();
    btExcluir = new javax.swing.JButton();
    btSair = new javax.swing.JButton();
    lblMediaType = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Movimentação de Empréstimos");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel5.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel10.setText("Cód:");
    jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 80, 28));

    jLabel11.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel11.setText("Usuário:");
    jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 28));

    lblCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    lblCodigo.setText(" ");
    jPanel5.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, 40, 28));

    jLabel12.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel12.setText("Item:");
    jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 80, 28));

    jLabel13.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel13.setText("Entrega:");
    jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 28));

    txtItem.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtItem.setEnabled(false);
    txtItem.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtItemFocusLost(evt);
      }
    });
    jPanel5.add(txtItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 85, 40, 28));

    txtReader.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtReader.setEnabled(false);
    txtReader.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtReaderFocusLost(evt);
      }
    });
    jPanel5.add(txtReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 40, 28));

    lblReader.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    lblReader.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    lblReader.setText(" ");
    jPanel5.add(lblReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 430, 22));

    lblItem.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    lblItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    lblItem.setText(" ");
    jPanel5.add(lblItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 85, 430, 22));

    btFindReader.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btFindReader.setEnabled(false);
    btFindReader.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btFindReaderActionPerformed(evt);
      }
    });
    jPanel5.add(btFindReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, 28));

    btFindItem.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btFindItem.setToolTipText("");
    btFindItem.setEnabled(false);
    btFindItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btFindItemActionPerformed(evt);
      }
    });
    jPanel5.add(btFindItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, -1, 28));

    txtPrevision.setEnabled(false);
    txtPrevision.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel5.add(txtPrevision, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, 28));

    jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.foreground")));
    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

    gridLoan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
    gridLoan.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridLoanMouseClicked(evt);
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

    jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, 640, 165));

    pnActions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btNovo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
    btNovo.setText("Novo");
    btNovo.setToolTipText("Novo Registro");
    btNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btNovoActionPerformed(evt);
      }
    });
    pnActions.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 28));

    btAlterar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
    btAlterar.setText("Alterar");
    btAlterar.setToolTipText("Alterar Registro");
    btAlterar.setEnabled(false);
    btAlterar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btAlterarActionPerformed(evt);
      }
    });
    pnActions.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 100, 28));

    btSalvar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
    btSalvar.setText("Salvar");
    btSalvar.setToolTipText("Salvar Registro");
    btSalvar.setEnabled(false);
    btSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSalvarActionPerformed(evt);
      }
    });
    pnActions.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 0, 100, 28));

    btCancelar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
    btCancelar.setText("Cancelar");
    btCancelar.setToolTipText("Cancelar Edição");
    btCancelar.setEnabled(false);
    btCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btCancelarActionPerformed(evt);
      }
    });
    pnActions.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 100, 28));

    btExcluir.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
    btExcluir.setText("Excluir");
    btExcluir.setToolTipText("Excluir Registro");
    btExcluir.setEnabled(false);
    btExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btExcluirActionPerformed(evt);
      }
    });
    pnActions.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 0, 100, 28));

    btSair.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
    btSair.setText("Sair");
    btSair.setToolTipText("Sair");
    btSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSairActionPerformed(evt);
      }
    });
    pnActions.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 0, 100, 28));

    jPanel5.add(pnActions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 640, 31));

    lblMediaType.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel5.add(lblMediaType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 430, 22));

    getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

    setSize(new java.awt.Dimension(650, 380));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    preparaNovo();
  }//GEN-LAST:event_btNovoActionPerformed

  private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
    preparaAlterar(lblCodigo.getText());
  }//GEN-LAST:event_btAlterarActionPerformed

  private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    try {
      Integer id = lblCodigo.getText() == null ? null : Integer.valueOf(lblCodigo.getText());
      Integer reader = Integer.valueOf(txtReader.getText());
      Integer item = Integer.valueOf(txtItem.getText());
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      java.sql.Date dev = new java.sql.Date(sdf.parse(txtPrevision.getText()).getTime());
      preparaSalvar(id, reader, item, dev);
    } catch (ParseException ex) {
      Logger.getLogger(FrameLoan.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btSalvarActionPerformed

  private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    preparaCancelar();
  }//GEN-LAST:event_btCancelarActionPerformed

  private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
    preparaExcluir(lblCodigo.getText());
  }//GEN-LAST:event_btExcluirActionPerformed

  private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
    this.dispose();
  }//GEN-LAST:event_btSairActionPerformed

  private void btFindReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindReaderActionPerformed
    FrameFindReader frameFindReader = new FrameFindReader(this, true);
    frameFindReader.setVisible(true);
  }//GEN-LAST:event_btFindReaderActionPerformed

  private void btFindItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindItemActionPerformed
    FrameFindItem frameFindItem = new FrameFindItem(this, true);
    frameFindItem.setVisible(true);
  }//GEN-LAST:event_btFindItemActionPerformed

  private void gridLoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridLoanMouseClicked
    if (evt.getClickCount() == 2) {
      preencheForm(model.getValueAt(gridLoan.getSelectedRow(), 0).toString());
    }
  }//GEN-LAST:event_gridLoanMouseClicked

  private void txtReaderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReaderFocusLost
    if (!txtReader.getText().equals("")) {
      findReader(txtReader.getText());
    }
  }//GEN-LAST:event_txtReaderFocusLost

  private void txtItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemFocusLost
    if (!txtItem.getText().equals("")) {
      findItem(txtItem.getText());
    }
  }//GEN-LAST:event_txtItemFocusLost

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameLoan dialog = new FrameLoan(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton btAlterar;
  private javax.swing.JButton btCancelar;
  private javax.swing.JButton btExcluir;
  private javax.swing.JButton btFindItem;
  private javax.swing.JButton btFindReader;
  private javax.swing.JButton btNovo;
  private javax.swing.JButton btSair;
  private javax.swing.JButton btSalvar;
  private javax.swing.JTable gridLoan;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblCodigo;
  private javax.swing.JLabel lblItem;
  private javax.swing.JLabel lblMediaType;
  private javax.swing.JLabel lblReader;
  private javax.swing.JPanel pnActions;
  private javax.swing.JTextField txtItem;
  private javax.swing.JFormattedTextField txtPrevision;
  private javax.swing.JTextField txtReader;
  // End of variables declaration//GEN-END:variables

  private void preencheForm(String id) {
    Loan loan = Loan.findById(id);
    Reader reader = loan.parent(Reader.class);
    Item item = loan.parent(Item.class);

    if (loan != null) {
      lblCodigo.setText(String.format("%04d", loan.getId()));
      txtReader.setText(String.format("%04d", reader.getInteger("id")));
      lblReader.setText(reader.getString("name"));
      txtItem.setText(String.format("%04d", item.getInteger("id")));
      lblItem.setText(item.getString("title"));
      txtPrevision.setText(Funcoes.dataString(loan.getDate("prevision")));
      Funcoes.habilitaBotoes(btAlterar, btExcluir);
    }
  }

  private void trataComponentes(String acao) {
    switch (acao) {
      case "preparaNovo": {
        Funcoes.habilitaEdits(txtReader, txtItem, txtPrevision);
        Funcoes.limpaEdits(txtReader, txtItem, txtPrevision);
        Funcoes.limpaLabel(lblCodigo, lblReader, lblItem, lblMediaType);
        Funcoes.habilitaBotoes(btSalvar, btCancelar, btFindReader, btFindItem);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        txtPrevision.setText(Funcoes.somaDias(10));
        txtReader.requestFocus();
        break;
      }
      case "preparaCancelar": {
        Funcoes.limpaEdits(txtReader, txtItem, txtPrevision);
        Funcoes.desabilitaEdits(txtReader, txtItem, txtPrevision);
        Funcoes.limpaLabel(lblCodigo, lblReader, lblItem, lblMediaType);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar, btFindReader, btFindItem);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        preencheGrid();
        btNovo.requestFocusInWindow();
        break;
      }
      case "preparaSalvar": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar, btFindReader, btFindItem);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtReader, txtItem, txtPrevision);
        btNovo.requestFocusInWindow();
        break;
      }
      case "preparaAlterar": {
        Funcoes.habilitaEdits(txtReader, txtItem, txtPrevision);
        txtReader.requestFocus();
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        break;
      }
      case "preparaExcluir": {
        Funcoes.limpaEdits(txtReader, txtItem, txtPrevision);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.desabilitaEdits(txtReader, txtItem, txtPrevision);
        Funcoes.desabilitaBotoes(btAlterar, btCancelar, btExcluir, btSalvar);
        Funcoes.limpaLabel(lblCodigo, lblReader, lblItem, lblMediaType);
        preencheGrid();
        break;
      }
    }
  }

  private void preparaNovo() {
    trataComponentes("preparaNovo");
  }

  private void preparaCancelar() {
    trataComponentes("preparaCancelar");
  }

  private void preparaAlterar(String id) {
    preencheForm(id);
    trataComponentes("preparaAlterar");
  }

  private void preparaExcluir(String id) {
    if (id != null) {
      Loan loan = Loan.findById(Integer.valueOf(id));
      try {
        loan.delete();
        trataComponentes("preparaExcluir");
      } catch (Exception e) {
        Message.information(this, e.getLocalizedMessage());
      }
    }else{
      Message.error(this, "Nenhum registro selecionado");
    }
  }

  private void preparaSalvar(Integer id, Integer reader_id, Integer item_id, Date devolution) {
    Loan loan = new Loan();
    try {
      Item item = Item.findById(item_id);
      Integer user = LoggedUser.getInstance().getId();
      loan.set("id", id, "reader_id", reader_id, "item_id", item_id, "prevision", devolution, "user_id", user);

      if (checkAvailable(id, item)) {
        if (loan.saveIt()) {
          lblCodigo.setText(String.format("%05d", loan.getId()));
          if (id == null) {
            item.set("available", item.getInteger("available") - 1);
            item.save();
          }
          preencheGrid();
          trataComponentes("preparaSalvar");
        }
      } else {
        Funcoes.informacao("Item sem saldo disponível, favor verificar.");
        btCancelar.requestFocusInWindow();
      }
    } catch (ValidationException e) {
      Message.validation(this, loan.errors());
    } catch (NumberFormatException e) {
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }

  void setIdReader(String id) {
    txtReader.setText(id);
  }

  void setNameReader(String name) {
    lblReader.setText(name);
  }

  void setIdItem(String id) {
    txtItem.setText(id);
  }

  void setNameItem(String title) {
    lblItem.setText(title);
  }

  void setTypeItem(String type) {
    lblMediaType.setText(type);
  }

  private void preencheGrid() {
    Funcoes.removeLinha(model);
    List<Loan> loans = Loan.find("devolution is null");
    for (Loan loan : loans) {
      Reader reader = loan.parent(Reader.class);
      Item item = loan.parent(Item.class);
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

  private void findReader(String idReader) {
    Reader reader = Reader.findById(Integer.valueOf(idReader));
    lblReader.setText(reader.getString("name"));
  }

  private void findItem(String idItem) {
    Item item = Item.findById(Integer.valueOf(idItem));
    lblItem.setText(item.getString("title"));
  }

  private void setIcon() {
    btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png")));
    btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png")));
    btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png")));
    btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png")));
    btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png")));
    btFindItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btFindReader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
  }

  private boolean checkAvailable(Integer id, Item item) {
    boolean result;
    if (id == null) {
      result = item.getInteger("available") > 0;
    } else {
      result = true;
    }
    return result;
  }
}
