package ui.readers;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.City;
import models.LoggedUser;
import models.Reader;
import models.State;
import org.javalite.activejdbc.validation.ValidationException;
import util.Funcoes;
import util.Message;

public class FrameReader extends javax.swing.JDialog {

  Reader reader = null;

  DefaultTableModel model;

  public FrameReader(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    setIcons();
    model = (DefaultTableModel) gridReader.getModel();
    formataGrid(gridReader);
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
    panelGridReader = new javax.swing.JScrollPane();
    gridReader = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    rbCodigo = new javax.swing.JRadioButton();
    rbNome = new javax.swing.JRadioButton();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    lblCodigo = new javax.swing.JLabel();
    checkAtivo = new javax.swing.JCheckBox();
    btNovo = new javax.swing.JButton();
    btAlterar = new javax.swing.JButton();
    btSalvar = new javax.swing.JButton();
    btCancelar = new javax.swing.JButton();
    btExcluir = new javax.swing.JButton();
    btSair = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    txtNeighborhood = new javax.swing.JTextField();
    txtAddress = new javax.swing.JTextField();
    txtName = new javax.swing.JTextField();
    txtBirth = new javax.swing.JFormattedTextField();
    try{
      javax.swing.text.MaskFormatter birth = new javax.swing.text.MaskFormatter("##/##/####");
      txtBirth = new javax.swing.JFormattedTextField(birth);
    }
    catch (ParseException e){
    }
    txtPhone = new javax.swing.JFormattedTextField();
    jLabel7 = new javax.swing.JLabel();
    txtEmail = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    cbState = new javax.swing.JComboBox();
    jLabel9 = new javax.swing.JLabel();
    cbCity = new javax.swing.JComboBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro do Usuário");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTabbedPane1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jPanel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtPesquisa.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });
    jPanel2.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 440, 28));

    checkSomenteAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkSomenteAtivo.setText("Somente Ativo");
    checkSomenteAtivo.setContentAreaFilled(false);
    checkSomenteAtivo.setIconTextGap(1);
    jPanel2.add(checkSomenteAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 16, 120, 28));

    btPesquisar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif"))); // NOI18N
    btPesquisar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btPesquisarActionPerformed(evt);
      }
    });
    jPanel2.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 16, 40, 28));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, 640, 50));

    gridReader.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null}
      },
      new String [] {
        "Cód:", "Nome:", "Telefone", "Status"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
    gridReader.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridReaderMouseClicked(evt);
      }
    });
    panelGridReader.setViewportView(gridReader);
    gridReader.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridReader.getColumnModel().getColumnCount() > 0) {
      gridReader.getColumnModel().getColumn(0).setResizable(false);
      gridReader.getColumnModel().getColumn(0).setPreferredWidth(60);
      gridReader.getColumnModel().getColumn(1).setResizable(false);
      gridReader.getColumnModel().getColumn(1).setPreferredWidth(300);
      gridReader.getColumnModel().getColumn(2).setResizable(false);
      gridReader.getColumnModel().getColumn(2).setPreferredWidth(100);
      gridReader.getColumnModel().getColumn(3).setResizable(false);
      gridReader.getColumnModel().getColumn(3).setPreferredWidth(60);
    }

    jPanel1.add(panelGridReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 225));

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    bgOrdem.add(rbCodigo);
    rbCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    rbCodigo.setSelected(true);
    rbCodigo.setText("Código");
    rbCodigo.setActionCommand("id");
    jPanel3.add(rbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

    bgOrdem.add(rbNome);
    rbNome.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    rbNome.setText("Nome");
    rbNome.setActionCommand("name");
    jPanel3.add(rbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 20, 120, -1));

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 640, 50));

    jTabbedPane1.addTab("Listagem", jPanel1);

    jPanel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Cód:");
    jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 80, 28));

    jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Nome:");
    jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 28));

    lblCodigo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    lblCodigo.setText(" ");
    jPanel4.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, 40, 22));

    checkAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkAtivo.setText("Ativo");
    checkAtivo.setEnabled(false);
    jPanel4.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 225, 70, 28));

    btNovo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
    btNovo.setText("Novo");
    btNovo.setToolTipText("Novo Registro");
    btNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btNovoActionPerformed(evt);
      }
    });
    jPanel4.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 288, 100, 30));

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
    jPanel4.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 288, 100, 30));

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
    jPanel4.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 288, 100, 30));

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
    jPanel4.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 288, 100, 30));

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
    jPanel4.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 288, 100, 30));

    btSair.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
    btSair.setText("Sair");
    btSair.setToolTipText("Sair");
    btSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSairActionPerformed(evt);
      }
    });
    jPanel4.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 288, 100, 30));

    jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Endereço:");
    jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 80, 28));

    jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("Bairro:");
    jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 28));

    jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel5.setText("Fone:");
    jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 80, 28));

    jLabel6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("Nascimento:");
    jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 80, 28));

    txtNeighborhood.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtNeighborhood.setEnabled(false);
    jPanel4.add(txtNeighborhood, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 250, 28));

    txtAddress.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtAddress.setEnabled(false);
    jPanel4.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 85, 450, 28));

    txtName.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtName.setEnabled(false);
    jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 450, 28));

    txtBirth.setEnabled(false);
    txtBirth.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jPanel4.add(txtBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 225, 80, 28));

    try {
      txtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    txtPhone.setEnabled(false);
    txtPhone.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jPanel4.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 100, 28));

    jLabel7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel7.setText("Email:");
    jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 28));

    txtEmail.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtEmail.setEnabled(false);
    jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 450, 28));

    jLabel8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("Estado:");
    jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 80, 28));

    cbState.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    cbState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Selecione  -->", "Acre", "Alagoas", "Amazonas", "Amapá", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Minas Gerais", "Mato Grosso do Sul", "Mato Grosso", "Pará", "Paraíba", "Pernambuco", "Piauí", "Paraná", "Rio de Janeiro", "Rio Grande do Norte", "Rondônia", "Roraima", "Rio Grande do Sul", "Santa Catarina", "Sergipe", "São Paulo", "Tocantins " }));
    cbState.setEnabled(false);
    cbState.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cbStateItemStateChanged(evt);
      }
    });
    jPanel4.add(cbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 155, 130, 28));

    jLabel9.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel9.setText("Cidade:");
    jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 155, 70, 28));

    cbCity.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    cbCity.setEnabled(false);
    jPanel4.add(cbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 155, 210, 28));

    jTabbedPane1.addTab("Cadastro", jPanel4);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 360));

    setSize(new java.awt.Dimension(659, 390));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    fillGrid(txtPesquisa.getText().toUpperCase(), checkSomenteAtivo.isSelected(), bgOrdem.getSelection().getActionCommand());
  }//GEN-LAST:event_btPesquisarActionPerformed

  private void gridReaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridReaderMouseClicked
    if (evt.getClickCount() == 2) {
      fillForm(model.getValueAt(gridReader.getSelectedRow(), 0).toString());
    }
  }//GEN-LAST:event_gridReaderMouseClicked

  private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    preparaNovo();
  }//GEN-LAST:event_btNovoActionPerformed

  private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
    preparaAlterar();
  }//GEN-LAST:event_btAlterarActionPerformed

  private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    Integer idReader = lblCodigo.getText() == null ? null : Integer.valueOf(lblCodigo.getText());
    saveIt( idReader, 
            txtName.getText().toUpperCase(), 
            txtAddress.getText().toUpperCase(), 
            txtNeighborhood.getText().toUpperCase(), 
            txtPhone.getText(), 
            cbState.getSelectedItem().toString(),
            cbCity.getSelectedItem().toString(),
            txtEmail.getText().toLowerCase(), 
            txtBirth.getText(), 
            checkAtivo.isSelected());
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

  private void cbStateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStateItemStateChanged
    if (cbState.getItemCount() > 0) {
      fillComboCity(cbState.getSelectedIndex());
    }
  }//GEN-LAST:event_cbStateItemStateChanged

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
      btPesquisar.doClick();
  }//GEN-LAST:event_txtPesquisaKeyPressed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameReader dialog = new FrameReader(new javax.swing.JFrame(), true);
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
  private javax.swing.JComboBox cbCity;
  private javax.swing.JComboBox cbState;
  private javax.swing.JCheckBox checkAtivo;
  private javax.swing.JCheckBox checkSomenteAtivo;
  private javax.swing.JTable gridReader;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel lblCodigo;
  private javax.swing.JScrollPane panelGridReader;
  private javax.swing.JRadioButton rbCodigo;
  private javax.swing.JRadioButton rbNome;
  private javax.swing.JTextField txtAddress;
  private javax.swing.JFormattedTextField txtBirth;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtNeighborhood;
  private javax.swing.JTextField txtPesquisa;
  private javax.swing.JFormattedTextField txtPhone;
  // End of variables declaration//GEN-END:variables

  private void fillGrid(String name, boolean onlyActive, String ordem) {
    String active = onlyActive ? " and active" : "";
    Funcoes.removeLinha(model);
    List<Reader> readers = Reader.find("name like '%" + name + "%'" + active).orderBy(ordem);
    for (Reader r : readers) {
      model.addRow(new Object[]{String.format("%04d", r.getId()), r.getString("name"), r.getString("phone"), Funcoes.getStatus(r.getBoolean("active"))});
    }
    gridReader.setModel(model);

  }

  private void fillForm(String id) {
    reader = Reader.findById(id);
    City  city   = reader.parent(City.class);
    State state  = city.parent(State.class);
    if (reader != null) {
      preparaForm("habilita");
      lblCodigo.setText(String.format("%03d", reader.getId()));
      txtName.setText(reader.getString("name"));
      txtAddress.setText(reader.getString("address"));
      txtNeighborhood.setText(reader.getString("neighborhood"));
      txtPhone.setText(reader.getString("phone"));
      txtEmail.setText(reader.getString("email"));
      cbState.setSelectedItem(state.getString("name"));
      fillComboCity(cbState.getSelectedIndex());
      cbCity.setSelectedItem(city.getString("name"));
      txtBirth.setText(Funcoes.dataString(reader.getDate("birth")));
      checkAtivo.setSelected(reader.getBoolean("active"));
      jTabbedPane1.setSelectedIndex(1);
      preparaForm("desabilita");
    }
  }

  private void trataComponentes(String acao) {
    switch (acao) {
      case "preencherGrid": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone, txtEmail);
        Funcoes.desabilitaCheck(checkAtivo);
        Funcoes.desabilitaCombo(cbCity, cbState);
        break;
      }
      case "preparaNovo": {
        Funcoes.habilitaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone, txtEmail);
        Funcoes.limpaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone, txtEmail);
        Funcoes.habilitaCombo(cbState, cbCity);
        fillComboCity(cbState.getSelectedIndex());
        Funcoes.limpaLabel(lblCodigo);
        txtName.requestFocus();
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        break;
      }
      case "preparaCancelar": {
        Funcoes.limpaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone, txtEmail);
        Funcoes.desabilitaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone, txtEmail);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.limpaCheck(checkAtivo);
        Funcoes.desabilitaCheck(checkAtivo);
        Funcoes.limpaCombo(cbState, cbCity);
        Funcoes.desabilitaCombo(cbState, cbCity);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        jTabbedPane1.setSelectedIndex(0);
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaSalvar": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone, txtEmail);
        Funcoes.desabilitaCombo(cbState, cbCity);
        Funcoes.desabilitaCheck(checkAtivo);
        jTabbedPane1.setSelectedIndex(0);
        btPesquisar.doClick();
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaAlterar": {
        Funcoes.habilitaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone, txtEmail);
        Funcoes.habilitaCombo(cbState, cbCity);
        txtName.requestFocus();
        Funcoes.habilitaBotoes(btSalvar, btCancelar);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        break;
      }
      case "preparaExcluir": {
        Funcoes.limpaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone, txtEmail);
        Funcoes.limpaLabel(lblCodigo);
        Funcoes.desabilitaEdits(txtName, txtAddress, txtNeighborhood, txtBirth, txtPhone);
        Funcoes.desabilitaBotoes(btAlterar, btCancelar, btExcluir, btSalvar);
        Funcoes.limpaCombo(cbState, cbCity);
        Funcoes.desabilitaCombo(cbState, cbCity);
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
    reader = Reader.findById(id);
    try{
      reader.delete();
      trataComponentes("preparaExcluir");
    }catch(Exception e){
      System.out.println(e.getLocalizedMessage());
    }
  }

  private void saveIt(Integer id, String name, String address, String neighborhood, String phone, String nameState, String nameCity, String email, String birth, boolean active) {
    try{
      State state = State.findFirst("name = ?", nameState);
      City  city  = City.findFirst("name = ? and state_id = ?", nameCity, state.getInteger("id"));
      Integer  user  = LoggedUser.getInstance().getId();
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      java.sql.Date jsd = new java.sql.Date(sdf.parse(birth).getTime());
      reader = new Reader();
      reader.set("id", id,
              "name", name, 
              "address", address,
              "neighborhood", neighborhood,
              "phone", phone,
              "state_id", state.getInteger("id"),
              "city_id", city.getInteger("id"),
              "email", email,
              "birth", jsd,
              "active", active,
              "user_id", user);
      if(reader.saveIt()){
        lblCodigo.setText(String.format("%04d", reader.getInteger("id")));
        JOptionPane.showMessageDialog(this, "Usuário Gravado com Sucesso!");
        trataComponentes("preparaSalvar");
      }
    }catch(ValidationException e){
      Message.validation(this, reader.errors());
    }catch(Exception e){
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }

  private void fillComboCity(Integer id) {
    cbCity.removeAllItems();
    State state = State.findById(id);
    if(state != null){
    List<City> cities = state.getAll(City.class);
      for (City city : cities) {
        cbCity.addItem(city.getString("name"));
      }
      cbCity.setSelectedIndex(0);
    }
  }

  private void formataGrid(JTable gridReader) {
    gridReader.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridReader.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridReader, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridReader, 3, SwingConstants.CENTER);
  }

  private void preparaForm(String opcao) {
    switch(opcao){
      case "habilita":{
        Funcoes.habilitaEdits(txtAddress, txtBirth, txtEmail, txtName, txtNeighborhood, txtPhone);
        Funcoes.habilitaCombo(cbState, cbCity);
        Funcoes.habilitaCheck(checkAtivo);
        Funcoes.habilitaBotoes(btAlterar, btCancelar, btExcluir, btNovo, btSalvar);
      }
      case "desabilita":{
        Funcoes.desabilitaEdits(txtAddress, txtBirth, txtEmail, txtName, txtNeighborhood, txtPhone);
        Funcoes.desabilitaCombo(cbState, cbCity);
        Funcoes.desabilitaCheck(checkAtivo);
        Funcoes.desabilitaBotoes(btCancelar, btSalvar);
      }
    }
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
