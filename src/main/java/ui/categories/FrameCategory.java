package ui.categories;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Category;
import models.LoggedUser;
import org.javalite.activejdbc.validation.ValidationException;
import util.Funcoes;
import util.Message;

public class FrameCategory extends javax.swing.JDialog {
  List<Category> categories;
  DefaultTableModel model;

  public FrameCategory(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    setIcons();
    model = (DefaultTableModel) gridCategory.getModel();
    formataGrid(gridCategory);
    jTabbedPane1.setSelectedIndex(0);
    txtPesquisa.requestFocus();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgOrdem = new javax.swing.ButtonGroup();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    txtPesquisa = new javax.swing.JTextField();
    checkSomenteAtivo = new javax.swing.JCheckBox();
    btPesquisar = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    gridCategory = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    rbCodigo = new javax.swing.JRadioButton();
    rbNome = new javax.swing.JRadioButton();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    lblCodigo = new javax.swing.JLabel();
    txtDescription = new javax.swing.JTextField();
    checkAtivo = new javax.swing.JCheckBox();
    btNovo = new javax.swing.JButton();
    btAlterar = new javax.swing.JButton();
    btSalvar = new javax.swing.JButton();
    btCancelar = new javax.swing.JButton();
    btExcluir = new javax.swing.JButton();
    btSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro do Autor");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTabbedPane1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jPanel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
    jPanel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtPesquisa.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel2.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 280, 28));

    checkSomenteAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkSomenteAtivo.setText(" Ativo");
    checkSomenteAtivo.setContentAreaFilled(false);
    checkSomenteAtivo.setIconTextGap(1);
    jPanel2.add(checkSomenteAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 16, 80, 28));

    btPesquisar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btPesquisar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btPesquisarActionPerformed(evt);
      }
    });
    jPanel2.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 16, 40, 28));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 460, 50));

    gridCategory.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null}
      },
      new String [] {
        "Cód:", "Nome:", "Status:"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
    gridCategory.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridCategoryMouseClicked(evt);
      }
    });
    jScrollPane2.setViewportView(gridCategory);
    gridCategory.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridCategory.getColumnModel().getColumnCount() > 0) {
      gridCategory.getColumnModel().getColumn(0).setResizable(false);
      gridCategory.getColumnModel().getColumn(0).setPreferredWidth(60);
      gridCategory.getColumnModel().getColumn(1).setResizable(false);
      gridCategory.getColumnModel().getColumn(1).setPreferredWidth(330);
      gridCategory.getColumnModel().getColumn(2).setResizable(false);
      gridCategory.getColumnModel().getColumn(2).setPreferredWidth(60);
    }

    jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 180));

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
    jPanel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    bgOrdem.add(rbCodigo);
    rbCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    rbCodigo.setSelected(true);
    rbCodigo.setText("Código");
    rbCodigo.setActionCommand("id");
    jPanel3.add(rbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

    bgOrdem.add(rbNome);
    rbNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    rbNome.setText("Descrição");
    rbNome.setActionCommand("description");
    rbNome.setName("description"); // NOI18N
    jPanel3.add(rbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 20, 120, -1));

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 460, 50));

    jTabbedPane1.addTab("Listagem", jPanel1);

    jPanel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Cód:");
    jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 28));

    jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Nome:");
    jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 28));

    lblCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    lblCodigo.setText(" ");
    jPanel4.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, 28));

    txtDescription.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtDescription.setEnabled(false);
    jPanel4.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 160, 28));

    checkAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkAtivo.setText("Ativo");
    checkAtivo.setEnabled(false);
    jPanel4.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, 28));

    btNovo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btNovo.setToolTipText("Novo Registro");
    btNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btNovoActionPerformed(evt);
      }
    });
    jPanel4.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 240, 50, 30));

    btAlterar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btAlterar.setToolTipText("Alterar Registro");
    btAlterar.setEnabled(false);
    btAlterar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btAlterarActionPerformed(evt);
      }
    });
    jPanel4.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 240, 50, 30));

    btSalvar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btSalvar.setToolTipText("Salvar Registro");
    btSalvar.setEnabled(false);
    btSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSalvarActionPerformed(evt);
      }
    });
    jPanel4.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 50, 30));

    btCancelar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btCancelar.setToolTipText("Cancelar Edição");
    btCancelar.setEnabled(false);
    btCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btCancelarActionPerformed(evt);
      }
    });
    jPanel4.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 240, 50, 30));

    btExcluir.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btExcluir.setToolTipText("Excluir Registro");
    btExcluir.setEnabled(false);
    btExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btExcluirActionPerformed(evt);
      }
    });
    jPanel4.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 50, 30));

    btSair.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btSair.setToolTipText("Sair");
    btSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSairActionPerformed(evt);
      }
    });
    jPanel4.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 50, 30));

    jTabbedPane1.addTab("Cadastro", jPanel4);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 320));

    setSize(new java.awt.Dimension(481, 349));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    preencheGrid(txtPesquisa.getText().toUpperCase(), checkSomenteAtivo.isSelected(), bgOrdem.getSelection().getActionCommand());
  }//GEN-LAST:event_btPesquisarActionPerformed

  private void gridCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridCategoryMouseClicked
    if(evt.getClickCount() == 2){
      preencheForm(model.getValueAt(gridCategory.getSelectedRow(), 0).toString());
    }
  }//GEN-LAST:event_gridCategoryMouseClicked

  private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    preparaNovo();
  }//GEN-LAST:event_btNovoActionPerformed

  private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
    preparaAlterar();
  }//GEN-LAST:event_btAlterarActionPerformed

  private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    preparaSalvar(lblCodigo.getText(), txtDescription.getText().toUpperCase(), checkAtivo.isSelected());
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

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
      btPesquisar.doClick();
  }//GEN-LAST:event_txtPesquisaKeyPressed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameCategory dialog = new FrameCategory(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton btNovo;
  private javax.swing.JButton btPesquisar;
  private javax.swing.JButton btSair;
  private javax.swing.JButton btSalvar;
  private javax.swing.JCheckBox checkAtivo;
  private javax.swing.JCheckBox checkSomenteAtivo;
  private javax.swing.JTable gridCategory;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel lblCodigo;
  private javax.swing.JRadioButton rbCodigo;
  private javax.swing.JRadioButton rbNome;
  private javax.swing.JTextField txtDescription;
  private javax.swing.JTextField txtPesquisa;
  // End of variables declaration//GEN-END:variables

  private void preencheGrid(String name, boolean onlyActive, String ordem) {
    Funcoes.removeLinha(model);
    String active = onlyActive ? " and active" : "";
    categories = Category.find("description like '%" + name + "%'" + active).orderBy(ordem);
    
    for (Category category : categories) {
      model.addRow(new Object[]{String.format("%03d", category.getId()), category.getString("description"), Funcoes.getStatus(category.getBoolean("active"))});
    }
    gridCategory.setModel(model);
  }

  private void preencheForm(String id) {
    Category category = Category.findById(Integer.valueOf(id));
    
    if(category != null){
      lblCodigo.setText(String.format("%03d", category.getId()));
      txtDescription.setText(category.getString("description"));
      checkAtivo.setSelected(category.getBoolean("active"));
      jTabbedPane1.setSelectedIndex(1);
      trataComponentes("preencherGrid");
    }
  }
  
  private void trataComponentes(String acao) {
    switch (acao) {
      case "preencherGrid": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtDescription);
        Funcoes.desabilitaCheck(checkAtivo);
        break;
      }
      case "preparaNovo": {
        Funcoes.habilitaEdits(txtDescription);
        Funcoes.limpaEdits(txtDescription);
        Funcoes.limpaLabel(lblCodigo);
        txtDescription.requestFocus();
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        break;
      }
      case "preparaCancelar": {
        Funcoes.habilitaEdits(txtDescription);
        Funcoes.limpaEdits(txtDescription);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.limpaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtDescription);
        jTabbedPane1.setSelectedIndex(0);
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaSalvar": {
        //  Funcoes.limpaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtDescription);
        Funcoes.desabilitaCheck(checkAtivo);
        jTabbedPane1.setSelectedIndex(0);
        btPesquisar.doClick();
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaAlterar": {
        Funcoes.habilitaEdits(txtDescription);
        txtDescription.requestFocus();
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        break;
      }
      case "preparaExcluir": {
        Funcoes.limpaEdits(txtDescription);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.desabilitaEdits(txtDescription);
        Funcoes.desabilitaBotoes(btAlterar, btCancelar, btExcluir, btSalvar);
        jTabbedPane1.setSelectedIndex(0);
        btPesquisar.doClick();
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
  
  private void preparaAlterar() {
    trataComponentes("preparaAlterar");
  }
  
  private void preparaExcluir(String id) {
    Category category = Category.findById(id);
    try{
      category.delete();
      trataComponentes("preparaExcluir");
    }catch(Exception e){
      Message.information(this, e.getLocalizedMessage());
    }
  }
  
  private void preparaSalvar(String id, String description, boolean active) {
    Integer user = LoggedUser.getInstance().getId();
    
    Category category = new Category();
    try{
      category.set("id", id, "description", description, "active", active, "user_id", user);
      if(category.saveIt()){
        trataComponentes("preparaSalvar");
        lblCodigo.setText(String.format("%03d", category.getInteger("id")));
        JOptionPane.showMessageDialog(this, "Categoria Gravada com Sucesso!");
      }
    }catch(ValidationException e){
      Message.validation(this, category.errors());
    }catch(Exception e){
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }

  private void formataGrid(JTable gridCategory) {
    gridCategory.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridCategory.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridCategory, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridCategory, 2, SwingConstants.CENTER);
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
