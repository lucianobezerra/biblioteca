package ui.publishers;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.LoggedUser;
import models.Publisher;
import org.javalite.activejdbc.validation.ValidationException;
import util.Funcoes;
import util.Message;

public class FramePublisher extends javax.swing.JDialog {

  Publisher publisher = null;

  DefaultTableModel model;

  public FramePublisher(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    setIcons();
    model = (DefaultTableModel) gridPublisher.getModel();
    formataGrid(gridPublisher);
    jTabbedPane1.setSelectedIndex(0);
    txtPesquisa.requestFocus();

  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgOpcao = new javax.swing.ButtonGroup();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jScrollPane3 = new javax.swing.JScrollPane();
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    btPesquisar = new javax.swing.JButton();
    checkSomenteAtivo = new javax.swing.JCheckBox();
    txtPesquisa = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    gridPublisher = new javax.swing.JTable();
    jPanel5 = new javax.swing.JPanel();
    rbCodigo = new javax.swing.JRadioButton();
    rbNome = new javax.swing.JRadioButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    lblCodigo = new javax.swing.JLabel();
    txtNome = new javax.swing.JTextField();
    txtEmail = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    checkAtivo = new javax.swing.JCheckBox();
    btNovo = new javax.swing.JButton();
    btAlterar = new javax.swing.JButton();
    btSalvar = new javax.swing.JButton();
    btCancelar = new javax.swing.JButton();
    btExcluir = new javax.swing.JButton();
    btSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro de Editoras");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTabbedPane1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jScrollPane3.setWheelScrollingEnabled(false);

    jPanel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
    jPanel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btPesquisar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btPesquisar.setText("Pesquisar");
    btPesquisar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btPesquisarActionPerformed(evt);
      }
    });
    jPanel2.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 16, 120, 30));

    checkSomenteAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkSomenteAtivo.setText(" Ativo");
    checkSomenteAtivo.setContentAreaFilled(false);
    checkSomenteAtivo.setIconTextGap(1);
    jPanel2.add(checkSomenteAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 16, 90, 30));

    txtPesquisa.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel2.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 340, 30));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 640, 60));

    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jScrollPane1.setHorizontalScrollBar(null);

    gridPublisher.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    gridPublisher.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null}
      },
      new String [] {
        "Cód", "Nome", "Email", "Status"
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
    gridPublisher.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridPublisherMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(gridPublisher);
    gridPublisher.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridPublisher.getColumnModel().getColumnCount() > 0) {
      gridPublisher.getColumnModel().getColumn(0).setResizable(false);
      gridPublisher.getColumnModel().getColumn(0).setPreferredWidth(10);
      gridPublisher.getColumnModel().getColumn(1).setResizable(false);
      gridPublisher.getColumnModel().getColumn(1).setPreferredWidth(180);
      gridPublisher.getColumnModel().getColumn(2).setResizable(false);
      gridPublisher.getColumnModel().getColumn(2).setPreferredWidth(180);
      gridPublisher.getColumnModel().getColumn(3).setResizable(false);
      gridPublisher.getColumnModel().getColumn(3).setPreferredWidth(30);
    }

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 190));

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
    jPanel5.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    bgOpcao.add(rbCodigo);
    rbCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    rbCodigo.setSelected(true);
    rbCodigo.setText("Código");
    rbCodigo.setActionCommand("id");
    rbCodigo.setName("id"); // NOI18N
    jPanel5.add(rbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 120, 26));

    bgOpcao.add(rbNome);
    rbNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    rbNome.setText("Nome");
    rbNome.setActionCommand("name");
    rbNome.setName("name"); // NOI18N
    jPanel5.add(rbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 16, 120, 26));

    jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 640, 50));

    jScrollPane3.setViewportView(jPanel1);

    jTabbedPane1.addTab("Listagem", jScrollPane3);

    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Cód:");
    jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 60, 28));

    jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Nome:");
    jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 60, 28));

    jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("Email:");
    jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, 60, 28));

    lblCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lblCodigo.setText("  ");
    jPanel3.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 12, 90, 28));

    txtNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtNome.setEnabled(false);
    jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 340, 28));

    txtEmail.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtEmail.setEnabled(false);
    jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 340, 28));

    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 600, 40));

    checkAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkAtivo.setText("Ativo");
    checkAtivo.setEnabled(false);
    jPanel3.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 70, 28));

    btNovo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btNovo.setText("Novo");
    btNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btNovoActionPerformed(evt);
      }
    });
    jPanel3.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 270, 100, 28));

    btAlterar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btAlterar.setText("Alterar");
    btAlterar.setEnabled(false);
    btAlterar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btAlterarActionPerformed(evt);
      }
    });
    jPanel3.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 100, 28));

    btSalvar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btSalvar.setText("Salvar");
    btSalvar.setEnabled(false);
    btSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSalvarActionPerformed(evt);
      }
    });
    jPanel3.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 270, 100, 28));

    btCancelar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btCancelar.setText("Cancelar");
    btCancelar.setEnabled(false);
    btCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btCancelarActionPerformed(evt);
      }
    });
    jPanel3.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 100, 28));

    btExcluir.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btExcluir.setText("Excluir");
    btExcluir.setEnabled(false);
    btExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btExcluirActionPerformed(evt);
      }
    });
    jPanel3.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 270, 100, 28));

    btSair.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btSair.setText("Sair");
    btSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSairActionPerformed(evt);
      }
    });
    jPanel3.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 100, 28));

    jScrollPane2.setViewportView(jPanel3);

    jTabbedPane1.addTab("Cadastro", jScrollPane2);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

    setSize(new java.awt.Dimension(666, 378));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    preencheGrid(txtPesquisa.getText().toUpperCase(), checkSomenteAtivo.isSelected(), bgOpcao.getSelection().getActionCommand());
  }//GEN-LAST:event_btPesquisarActionPerformed

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btPesquisar.doClick();
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

  private void gridPublisherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridPublisherMouseClicked
    if (evt.getClickCount() == 2) {
      preencheForm(model.getValueAt(gridPublisher.getSelectedRow(), 0).toString());
    }
  }//GEN-LAST:event_gridPublisherMouseClicked

  private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
    this.dispose();
  }//GEN-LAST:event_btSairActionPerformed

  private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    preparaNovo();
  }//GEN-LAST:event_btNovoActionPerformed

  private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    preparaCancelar();
  }//GEN-LAST:event_btCancelarActionPerformed

  private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    preparaSalvar(lblCodigo.getText(), txtNome.getText().toUpperCase(), txtEmail.getText().toLowerCase(), checkAtivo.isSelected());
  }//GEN-LAST:event_btSalvarActionPerformed

  private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
    preparaAlterar();
  }//GEN-LAST:event_btAlterarActionPerformed

  private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
    preparaExcluir(lblCodigo.getText());
  }//GEN-LAST:event_btExcluirActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FramePublisher dialog = new FramePublisher(new javax.swing.JFrame(), true);
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
  private javax.swing.ButtonGroup bgOpcao;
  private javax.swing.JButton btAlterar;
  private javax.swing.JButton btCancelar;
  private javax.swing.JButton btExcluir;
  private javax.swing.JButton btNovo;
  private javax.swing.JButton btPesquisar;
  private javax.swing.JButton btSair;
  private javax.swing.JButton btSalvar;
  private javax.swing.JCheckBox checkAtivo;
  private javax.swing.JCheckBox checkSomenteAtivo;
  private javax.swing.JTable gridPublisher;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel lblCodigo;
  private javax.swing.JRadioButton rbCodigo;
  private javax.swing.JRadioButton rbNome;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtNome;
  private javax.swing.JTextField txtPesquisa;
  // End of variables declaration//GEN-END:variables

  private void preencheGrid(String name, boolean onlyActive, String order) {
    Funcoes.removeLinha(model);
    String active = onlyActive ? " and active" : "";
    List<Publisher> publishers = Publisher.find("name like '%"+ name + "%'"+ active);
    for (Publisher pub : publishers) {
      model.addRow(new Object[]{String.format("%03d", pub.getInteger("id")), pub.getString("name"), pub.getString("email"), Funcoes.getStatus(pub.getBoolean("active"))});
    }
    gridPublisher.setModel(model);
  }

  private void preencheForm(String id) {
    publisher = Publisher.findById(Integer.parseInt(id));
    if (publisher != null) {
      lblCodigo.setText(String.format("%03d", publisher.getId()));
      txtNome.setText(publisher.getString("name"));
      txtEmail.setText(publisher.getString("email"));
      checkAtivo.setSelected(publisher.getBoolean("active"));
      jTabbedPane1.setSelectedIndex(1);
      trataComponentes("preencherGrid");
    }
  }

  private void preparaNovo() {
    trataComponentes("preparaNovo");
  }

  private void preparaCancelar() {
    trataComponentes("preparaCancelar");
  }

  private void preparaSalvar(String id, String name, String email, boolean active) {
    try{
      Integer user = LoggedUser.getInstance().getId();
      publisher.set("id", id, "name", name, "email", email, "active", active, "user_id", user);
      if(publisher.saveIt()){
        trataComponentes("preparaSalvar");
        lblCodigo.setText(String.format("%04d", publisher.getInteger("id")));
        JOptionPane.showMessageDialog(this, "Editora Gravada com Sucesso!");
      }
    }catch(ValidationException e){
        Message.validation(this, publisher.errors());
      }catch(Exception e){
        Message.exception(this, "Erro: ", e.getLocalizedMessage());
      }
  }

  private void preparaAlterar() {
    trataComponentes("preparaAlterar");
  }

  private void preparaExcluir(String id) {
    publisher = Publisher.findById(Integer.valueOf(id));
    try{
      publisher.delete();
      trataComponentes("preparaExcluir");
    }catch(Exception e){
      System.out.println(e.getLocalizedMessage());
    }
    
  }

  private void trataComponentes(String acao) {
    switch (acao) {
      case "preencherGrid": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtEmail, txtNome);
        Funcoes.desabilitaCheck(checkAtivo);
        break;
      }
      case "preparaNovo": {
        Funcoes.habilitaEdits(txtNome, txtEmail);
        Funcoes.limpaEdits(txtNome, txtEmail);
        Funcoes.limpaLabel(lblCodigo);
        txtNome.requestFocus();
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        txtNome.requestFocus();
        break;
      }
      case "preparaCancelar": {
        Funcoes.habilitaEdits(txtNome, txtEmail);
        Funcoes.limpaEdits(txtNome, txtEmail);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.limpaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtNome, txtEmail);
        jTabbedPane1.setSelectedIndex(0);
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaSalvar": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtNome, txtEmail);
        Funcoes.desabilitaCheck(checkAtivo);
        jTabbedPane1.setSelectedIndex(0);
        btPesquisar.doClick();
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaAlterar": {
        Funcoes.habilitaEdits(txtNome, txtEmail);
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        txtNome.requestFocus();
        break;
      }
      case "preparaExcluir": {
        Funcoes.limpaEdits(txtNome, txtEmail);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.desabilitaEdits(txtNome, txtEmail);
        Funcoes.desabilitaBotoes(btAlterar, btCancelar, btExcluir, btSalvar);
        jTabbedPane1.setSelectedIndex(0);
        btPesquisar.doClick();
        break;
      }
    }
  }

  private void formataGrid(JTable gridPublisher) {
    gridPublisher.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridPublisher.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridPublisher, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridPublisher, 3, SwingConstants.CENTER);
  }

  private void setIcons() {
    btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btNovo.setIcon(     new javax.swing.ImageIcon(getClass().getResource("/images/new.png")));
    btAlterar.setIcon(  new javax.swing.ImageIcon(getClass().getResource("/images/edit.png")));
    btSalvar.setIcon(   new javax.swing.ImageIcon(getClass().getResource("/images/save.png")));
    btCancelar.setIcon( new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png")));
    btExcluir.setIcon(  new javax.swing.ImageIcon(getClass().getResource("/images/delete.png")));
    btSair.setIcon(     new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
  }
}
