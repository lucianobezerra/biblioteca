package ui.users;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.User;
import org.javalite.activejdbc.validation.ValidationException;
import util.Criptografia;
import util.Funcoes;
import util.Message;

public class FrameUser extends javax.swing.JDialog {

  DefaultTableModel model;

  public FrameUser(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();

    model = (DefaultTableModel) gridUsers.getModel();
    formataGrid(gridUsers);
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        checkSomenteAtivo = new javax.swing.JCheckBox();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridUsers = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        rbCodigo = new javax.swing.JRadioButton();
        rbNome = new javax.swing.JRadioButton();
        rbLogin = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        checkOrdem = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        checkAtivo = new javax.swing.JCheckBox();
        txtSenha = new javax.swing.JPasswordField();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Operadores");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jScrollPane3.setWheelScrollingEnabled(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btPesquisar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 16, 120, 30));

        checkSomenteAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        checkSomenteAtivo.setText(" Somente Ativo");
        checkSomenteAtivo.setContentAreaFilled(false);
        checkSomenteAtivo.setIconTextGap(1);
        jPanel2.add(checkSomenteAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 16, 130, 30));

        txtPesquisa.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });
        jPanel2.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 16, 350, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 640, 60));

        gridUsers.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        gridUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Cód", "Login", "Nome", "Email", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        gridUsers.setColumnSelectionAllowed(true);
        gridUsers.getTableHeader().setReorderingAllowed(false);
        gridUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridUsers);
        gridUsers.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (gridUsers.getColumnModel().getColumnCount() > 0) {
            gridUsers.getColumnModel().getColumn(0).setResizable(false);
            gridUsers.getColumnModel().getColumn(0).setPreferredWidth(10);
            gridUsers.getColumnModel().getColumn(1).setResizable(false);
            gridUsers.getColumnModel().getColumn(1).setPreferredWidth(60);
            gridUsers.getColumnModel().getColumn(2).setResizable(false);
            gridUsers.getColumnModel().getColumn(2).setPreferredWidth(120);
            gridUsers.getColumnModel().getColumn(3).setResizable(false);
            gridUsers.getColumnModel().getColumn(3).setPreferredWidth(175);
            gridUsers.getColumnModel().getColumn(4).setResizable(false);
            gridUsers.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 190));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgOpcao.add(rbCodigo);
        rbCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbCodigo.setText("Código");
        rbCodigo.setActionCommand("id");
        rbCodigo.setName("id"); // NOI18N
        jPanel5.add(rbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 16, 100, 26));

        bgOpcao.add(rbNome);
        rbNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbNome.setText("Nome");
        rbNome.setActionCommand("name");
        rbNome.setName("name"); // NOI18N
        jPanel5.add(rbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 16, 100, 26));

        bgOpcao.add(rbLogin);
        rbLogin.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        rbLogin.setText("Login");
        rbLogin.setActionCommand("username");
        rbLogin.setName("username"); // NOI18N
        jPanel5.add(rbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 16, 100, 26));

        bgOpcao.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Data");
        jRadioButton1.setActionCommand("created_at");
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 100, -1));

        checkOrdem.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        checkOrdem.setText("Inverter");
        jPanel5.add(checkOrdem, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 16, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 640, 50));

        jScrollPane3.setViewportView(jPanel1);

        jTabbedPane1.addTab("Listagem", jScrollPane3);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cód:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 60, 28));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Login:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 28));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nome:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 28));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 28));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Senha:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 60, 28));

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("  ");
        jPanel3.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, 50, 28));

        txtLogin.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLogin.setEnabled(false);
        jPanel3.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 28));

        txtNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNome.setEnabled(false);
        jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 340, 28));

        txtEmail.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtEmail.setEnabled(false);
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 340, 28));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 600, 40));

        checkAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        checkAtivo.setText("Ativo");
        checkAtivo.setEnabled(false);
        jPanel3.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, 28));

        txtSenha.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSenha.setEnabled(false);
        jPanel3.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 190, 28));

        btNovo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel3.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 270, 100, 28));

        btAlterar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        jPanel3.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 100, 28));

        btSalvar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 270, 100, 28));

        btCancelar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 100, 28));

        btExcluir.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 270, 100, 28));

        jButton7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton7.setText("Sair");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 270, 100, 28));

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Cadastro", jScrollPane2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

        setSize(new java.awt.Dimension(661, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    preencheGrid(txtPesquisa.getText().toUpperCase(), checkSomenteAtivo.isSelected(), bgOpcao.getSelection().getActionCommand(), checkOrdem.isSelected());
  }//GEN-LAST:event_btPesquisarActionPerformed

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btPesquisar.doClick();
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

  private void gridUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridUsersMouseClicked
    if (evt.getClickCount() == 2) {
      preencheForm(model.getValueAt(gridUsers.getSelectedRow(), 0).toString());
    }
  }//GEN-LAST:event_gridUsersMouseClicked

  private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    this.dispose();
  }//GEN-LAST:event_jButton7ActionPerformed

  private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    preparaNovo();
  }//GEN-LAST:event_btNovoActionPerformed

  private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    preparaCancelar();
  }//GEN-LAST:event_btCancelarActionPerformed

  private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    saveIt(Integer.valueOf(lblCodigo.getText()));
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
        FrameUser dialog = new FrameUser(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JCheckBox checkOrdem;
    private javax.swing.JCheckBox checkSomenteAtivo;
    private javax.swing.JTable gridUsers;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbLogin;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

  private void preencheGrid(String name, boolean onlyActive, String order, boolean checkOrder) {
    Funcoes.removeLinha(model);
    String sql = "select * from users \nwhere upper(name) like '%" + name +"%'\n";
           sql += onlyActive ? " and active\n" : "";
           sql += "order by " + order + " ";
           sql += checkOrder ? "DESC\n" : "ASC\n";
    List<User> users = User.findBySQL(sql);
    for (User user : users) {
      model.addRow(new Object[]{String.format("%04d", user.getId()), user.getString("username"), user.getString("name"), user.getString("email"), Funcoes.getStatus(user.getBoolean("active"))});
    }
    gridUsers.setModel(model);

  }

  private void preencheForm(String id) {
    User user = User.findById(Integer.parseInt(id));
    if (user != null) {
      lblCodigo.setText(String.format("%03d", user.getId()));
      txtLogin.setText(user.getString("username"));
      txtNome.setText(user.getString("name"));
      txtEmail.setText(user.getString("email"));
      txtSenha.setText(user.getString("password"));
      checkAtivo.setSelected(user.getBoolean("active"));
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


  private void preparaAlterar() {
    trataComponentes("preparaAlterar");
  }

  private void preparaExcluir(String id) {
    User user = User.findById(id);
    try{
      if(user.delete()){
        trataComponentes("preparaExcluir");
      }
    }catch(Exception e){
      System.out.println(e.getLocalizedMessage());
    }
  }

  private void trataComponentes(String acao) {
    switch (acao) {
      case "preencherGrid": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtEmail, txtLogin, txtNome, txtSenha);
        Funcoes.desabilitaCheck(checkAtivo);
        break;
      }
      case "preparaNovo": {
        Funcoes.habilitaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.limpaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.limpaLabel(lblCodigo);
        txtLogin.requestFocus();
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        txtLogin.requestFocus();
        break;
      }
      case "preparaCancelar": {
        Funcoes.habilitaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.limpaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.limpaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        jTabbedPane1.setSelectedIndex(0);
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaSalvar": {
        //  Funcoes.limpaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.desabilitaCheck(checkAtivo);
        jTabbedPane1.setSelectedIndex(0);
        btPesquisar.doClick();
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaAlterar": {
        Funcoes.habilitaEdits(txtLogin, txtNome, txtEmail);
        txtLogin.requestFocus();
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        txtLogin.requestFocus();
        break;
      }
      case "preparaExcluir": {
        Funcoes.limpaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.desabilitaEdits(txtLogin, txtNome, txtEmail, txtSenha);
        Funcoes.desabilitaBotoes(btAlterar, btCancelar, btExcluir, btSalvar);
        jTabbedPane1.setSelectedIndex(0);
        btPesquisar.doClick();
        break;
      }
    }
  }

  private void formataGrid(JTable gridOperador) {
    gridOperador.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridOperador.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridOperador, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridOperador, 4, SwingConstants.CENTER);
  }

  private void saveIt(Integer id) {
    String password;
    User user;
    
    if(id == null){
      user = new User();
      password = Criptografia.criptografar(String.valueOf(txtSenha.getPassword()).toLowerCase());
    } else {
      user = User.findById(id);
      password = String.valueOf(txtSenha.getPassword()).toLowerCase();
    }
    try{
      user.set("id",         id);
      user.set("username",   txtLogin.getText().toLowerCase());
      user.set("password",   password);
      user.set("name",       txtNome.getText().toUpperCase());
      user.set("email",      txtEmail.getText().toLowerCase());
      user.setBoolean("active",     checkAtivo.isSelected());
      if(user.saveIt()){
        Message.confirmation(this, "Operador Gravado com Sucesso!");
        lblCodigo.setText(String.format("%03d", user.getInteger("id")));
        trataComponentes("preparaSalvar");
      }
    }catch(ValidationException e){
      Message.validation(this, user.errors());
    }catch(Exception e){
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }
}
