package ui.items;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import models.Author;
import models.Category;
import models.Item;
import models.LoggedUser;
import models.Publisher;
import org.javalite.activejdbc.validation.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;
import util.Funcoes;
import util.Message;

public class FrameItem extends javax.swing.JDialog {

  private JDialog parent;
  DefaultTableModel model;

  public FrameItem(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    //setIcons();
    model = (DefaultTableModel) gridItem.getModel();
    formataGrid(gridItem);
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
    panelGridItem = new javax.swing.JScrollPane();
    gridItem = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    rbCodigo = new javax.swing.JRadioButton();
    rbNome = new javax.swing.JRadioButton();
    jRadioButton1 = new javax.swing.JRadioButton();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    lblCodigo = new javax.swing.JLabel();
    checkActive = new javax.swing.JCheckBox();
    btNovo = new javax.swing.JButton();
    btAlterar = new javax.swing.JButton();
    btSalvar = new javax.swing.JButton();
    btCancelar = new javax.swing.JButton();
    btExcluir = new javax.swing.JButton();
    btSair = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtSubTitle = new javax.swing.JTextField();
    txtTitle = new javax.swing.JTextField();
    txtISBN = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    txtPages = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    cbCategory = new javax.swing.JComboBox();
    jLabel5 = new javax.swing.JLabel();
    txtExisting = new javax.swing.JTextField();
    txtAuthor = new javax.swing.JTextField();
    txtPublisher = new javax.swing.JTextField();
    btFindAuthor = new javax.swing.JButton();
    btFindPublisher = new javax.swing.JButton();
    lblAuthor = new javax.swing.JLabel();
    lblPublisher = new javax.swing.JLabel();
    btFindISBN = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    lblAvailable = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro de Itens");
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
    jPanel2.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 440, 28));

    checkSomenteAtivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkSomenteAtivo.setText(" Ativo");
    checkSomenteAtivo.setContentAreaFilled(false);
    checkSomenteAtivo.setIconTextGap(1);
    jPanel2.add(checkSomenteAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 16, 80, 28));

    btPesquisar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif"))); // NOI18N
    btPesquisar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btPesquisarActionPerformed(evt);
      }
    });
    jPanel2.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 16, 40, 28));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, 640, 50));

    panelGridItem.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    gridItem.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    gridItem.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null}
      },
      new String [] {
        "Cód:", "Título:", "Autor", "Saldo:", "Status:"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
    gridItem.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        gridItemMouseClicked(evt);
      }
    });
    panelGridItem.setViewportView(gridItem);
    gridItem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (gridItem.getColumnModel().getColumnCount() > 0) {
      gridItem.getColumnModel().getColumn(0).setResizable(false);
      gridItem.getColumnModel().getColumn(0).setPreferredWidth(60);
      gridItem.getColumnModel().getColumn(1).setResizable(false);
      gridItem.getColumnModel().getColumn(1).setPreferredWidth(300);
      gridItem.getColumnModel().getColumn(2).setResizable(false);
      gridItem.getColumnModel().getColumn(2).setPreferredWidth(200);
      gridItem.getColumnModel().getColumn(3).setResizable(false);
      gridItem.getColumnModel().getColumn(4).setResizable(false);
    }

    jPanel1.add(panelGridItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 225));

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
    rbNome.setText("Título");
    rbNome.setActionCommand("title");
    jPanel3.add(rbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 20, 120, -1));

    bgOrdem.add(jRadioButton1);
    jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jRadioButton1.setText("Autor");
    jRadioButton1.setActionCommand("autor_id");
    jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 120, -1));

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 640, 50));

    jTabbedPane1.addTab("Listagem", jPanel1);

    jPanel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Cód:");
    jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 80, 22));

    jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("ISBN:");
    jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 22));

    lblCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    lblCodigo.setText(" ");
    jPanel4.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, 40, 22));

    checkActive.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    checkActive.setText("Ativo");
    checkActive.setEnabled(false);
    jPanel4.add(checkActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 225, 70, 28));

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
    btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
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
    jLabel3.setText("Título:");
    jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 80, 22));

    jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("SubTítulo:");
    jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 22));

    txtSubTitle.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtSubTitle.setEnabled(false);
    jPanel4.add(txtSubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 450, 28));

    txtTitle.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtTitle.setEnabled(false);
    jPanel4.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 85, 450, 28));

    txtISBN.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtISBN.setEnabled(false);
    jPanel4.add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 180, 28));

    jLabel7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel7.setText("Páginas:");
    jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 80, 28));

    txtPages.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtPages.setEnabled(false);
    jPanel4.add(txtPages, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 225, 60, 28));

    jLabel8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("Autor:");
    jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 80, 28));

    jLabel9.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel9.setText("Editora:");
    jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 28));

    jLabel10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel10.setText("Tipo:");
    jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, 22));

    cbCategory.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    cbCategory.setEnabled(false);
    jPanel4.add(cbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 180, 28));

    jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel5.setText("Exemplares:");
    jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 225, -1, 28));

    txtExisting.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtExisting.setEnabled(false);
    jPanel4.add(txtExisting, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 225, 60, 28));

    txtAuthor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtAuthor.setEnabled(false);
    jPanel4.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 155, 60, 28));

    txtPublisher.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    txtPublisher.setEnabled(false);
    jPanel4.add(txtPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, 28));

    btFindAuthor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btFindAuthor.setEnabled(false);
    btFindAuthor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btFindAuthorActionPerformed(evt);
      }
    });
    jPanel4.add(btFindAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 155, 30, 28));

    btFindPublisher.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btFindPublisher.setToolTipText("Pesquisar");
    btFindPublisher.setEnabled(false);
    btFindPublisher.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btFindPublisherActionPerformed(evt);
      }
    });
    jPanel4.add(btFindPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 30, 28));

    lblAuthor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jPanel4.add(lblAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 155, 340, 28));

    lblPublisher.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jPanel4.add(lblPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 340, 28));

    btFindISBN.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btFindISBN.setEnabled(false);
    btFindISBN.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btFindISBNActionPerformed(evt);
      }
    });
    jPanel4.add(btFindISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 30));

    jLabel6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("Saldo:");
    jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 225, 50, 28));

    lblAvailable.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    lblAvailable.setText(" ");
    jPanel4.add(lblAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 225, 30, 28));

    jTabbedPane1.addTab("Cadastro", jPanel4);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 360));

    setSize(new java.awt.Dimension(659, 390));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    preencheGrid(txtPesquisa.getText().toUpperCase(), checkSomenteAtivo.isSelected(), bgOrdem.getSelection().getActionCommand());
  }//GEN-LAST:event_btPesquisarActionPerformed

  private void gridItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridItemMouseClicked
    if (evt.getClickCount() == 2) {
      preencheForm(model.getValueAt(gridItem.getSelectedRow(), 0).toString());
    }
  }//GEN-LAST:event_gridItemMouseClicked

  private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    preparaNovo();
  }//GEN-LAST:event_btNovoActionPerformed

  private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
    preparaAlterar();
  }//GEN-LAST:event_btAlterarActionPerformed

  private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    preparaSalvar(lblCodigo.getText(),
            txtISBN.getText().toUpperCase(),
            cbCategory.getSelectedItem().toString(),
            txtTitle.getText().toUpperCase(),
            txtSubTitle.getText().toUpperCase(),
            txtAuthor.getText(),
            txtPublisher.getText(),
            Integer.valueOf(txtPages.getText()),
            Integer.valueOf(txtExisting.getText()),
            new Date(),
            checkActive.isSelected());
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

  private void btFindISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindISBNActionPerformed
    try {
      buscaItem(txtISBN.getText());
    } catch (IOException | JSONException ex) {
      Funcoes.erro(ex.getLocalizedMessage());
    }
  }//GEN-LAST:event_btFindISBNActionPerformed

  private void btFindAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindAuthorActionPerformed
    FrameFindAuthor frameFindAuthor = new FrameFindAuthor(this, true);
    frameFindAuthor.setVisible(true);
  }//GEN-LAST:event_btFindAuthorActionPerformed

  private void btFindPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindPublisherActionPerformed
    FrameFindPublisher frameFindPublisher = new FrameFindPublisher(this, true);
    frameFindPublisher.setVisible(true);
  }//GEN-LAST:event_btFindPublisherActionPerformed

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER)
      btPesquisar.doClick();
  }//GEN-LAST:event_txtPesquisaKeyPressed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        FrameItem dialog = new FrameItem(new javax.swing.JFrame(), true);
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

  public void setIdAuthor(String id) {
    this.txtAuthor.setText(id);
  }

  public void setNameAuthor(String name) {
    this.lblAuthor.setText(name);
  }

  public void setIdPublisher(String id) {
    this.txtPublisher.setText(id);
  }

  public void setNamePublisher(String name) {
    this.lblPublisher.setText(name);
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup bgOrdem;
  private javax.swing.JButton btAlterar;
  private javax.swing.JButton btCancelar;
  private javax.swing.JButton btExcluir;
  private javax.swing.JButton btFindAuthor;
  private javax.swing.JButton btFindISBN;
  private javax.swing.JButton btFindPublisher;
  private javax.swing.JButton btNovo;
  private javax.swing.JButton btPesquisar;
  private javax.swing.JButton btSair;
  private javax.swing.JButton btSalvar;
  private javax.swing.JComboBox cbCategory;
  private javax.swing.JCheckBox checkActive;
  private javax.swing.JCheckBox checkSomenteAtivo;
  private javax.swing.JTable gridItem;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
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
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel lblAuthor;
  private javax.swing.JLabel lblAvailable;
  private javax.swing.JLabel lblCodigo;
  private javax.swing.JLabel lblPublisher;
  private javax.swing.JScrollPane panelGridItem;
  private javax.swing.JRadioButton rbCodigo;
  private javax.swing.JRadioButton rbNome;
  private javax.swing.JTextField txtAuthor;
  private javax.swing.JTextField txtExisting;
  private javax.swing.JTextField txtISBN;
  private javax.swing.JTextField txtPages;
  private javax.swing.JTextField txtPesquisa;
  private javax.swing.JTextField txtPublisher;
  private javax.swing.JTextField txtSubTitle;
  private javax.swing.JTextField txtTitle;
  // End of variables declaration//GEN-END:variables

  private void preencheGrid(String title, boolean onlyActive, String ordem) {
    Funcoes.removeLinha(model);
    String active = onlyActive ? " and active" : "";
    List<Item> items = Item.find("title like '%" + title + "%'" + active).orderBy(ordem);
    for (Item item : items) {
      Author author = item.parent(Author.class);
      model.addRow(new Object[]{String.format("%04d", item.getId()), item.getString("title"), author.getString("name"), item.getInteger("available"), Funcoes.getStatus(item.getBoolean("active"))});
    }
    gridItem.setModel(model);

  }

  private void preencheForm(String id) {
    Item item = Item.findById(Integer.valueOf(id));

    if (item != null) {
      Category category   = item.parent(Category.class);
      Author     author   = item.parent(Author.class);
      Publisher publisher = item.parent(Publisher.class);
      fillComboCategory();
      lblCodigo.setText(String.format("%03d", item.getId()));
      txtISBN.setText(item.getString("isbn"));
      cbCategory.setSelectedItem(category.getString("description"));
      txtTitle.setText(item.getString("title"));
      txtSubTitle.setText(item.getString("subtitle"));
      txtAuthor.setText(author.getString("id"));
      lblAuthor.setText(author.getString("name"));
      txtPublisher.setText(publisher.getString("id"));
      lblPublisher.setText(publisher.getString("name"));
      txtPages.setText(item.getString("pages"));
      txtExisting.setText(item.getString("existing"));
      lblAvailable.setText(item.getString("available"));
      checkActive.setSelected(item.getBoolean("active"));
      jTabbedPane1.setSelectedIndex(1);
      trataComponentes("preencherGrid");
    }
  }

  private void trataComponentes(String acao) {
    switch (acao) {
      case "preencherGrid": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar, btFindAuthor, btFindISBN, btFindPublisher);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.desabilitaCombo(cbCategory);
        Funcoes.desabilitaCheck(checkActive);
        txtISBN.requestFocus();
        break;
      }
      case "preparaNovo": {
        Funcoes.limpaLabel(lblCodigo, lblAuthor, lblPublisher, lblAvailable);
        Funcoes.habilitaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.limpaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.habilitaCombo(cbCategory);
        fillComboCategory();
        Funcoes.habilitaBotoes(btSalvar, btCancelar, btFindAuthor, btFindISBN, btFindPublisher);
        Funcoes.habilitaCheck(checkActive);
        Funcoes.limpaCheck(checkActive);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        txtISBN.requestFocus();
        break;
      }
      case "preparaCancelar": {
        Funcoes.limpaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.desabilitaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.limpaLabel(lblCodigo, lblAuthor, lblAvailable, lblPublisher);
        Funcoes.limpaCheck(checkActive);
        Funcoes.desabilitaCheck(checkActive);
        Funcoes.limpaCombo(cbCategory);
        Funcoes.desabilitaCombo(cbCategory);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar, btFindAuthor, btFindISBN, btFindPublisher);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        jTabbedPane1.setSelectedIndex(0);
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaSalvar": {
        Funcoes.desabilitaBotoes(btSalvar, btCancelar, btFindAuthor, btFindISBN, btFindPublisher);
        Funcoes.habilitaBotoes(btNovo, btExcluir, btAlterar);
        Funcoes.desabilitaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.desabilitaCombo(cbCategory);
        Funcoes.desabilitaCheck(checkActive);
        jTabbedPane1.setSelectedIndex(0);
        btPesquisar.doClick();
        txtPesquisa.requestFocusInWindow();
        break;
      }
      case "preparaAlterar": {
        Funcoes.habilitaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.habilitaCombo(cbCategory);
        Funcoes.habilitaBotoes(btSalvar, btCancelar, btFindAuthor, btFindISBN, btFindPublisher);
        Funcoes.habilitaCheck(checkActive);
        Funcoes.desabilitaBotoes(btNovo, btExcluir, btAlterar);
        txtISBN.requestFocus();
        break;
      }
      case "preparaExcluir": {
        Funcoes.limpaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.desabilitaEdits(txtISBN, txtTitle, txtSubTitle, txtAuthor, txtPublisher, txtPages, txtExisting);
        Funcoes.limpaLabel(lblCodigo, lblAuthor, lblAvailable, lblPublisher);
        Funcoes.limpaCheck(checkActive);
        Funcoes.desabilitaCheck(checkActive);
        Funcoes.limpaCombo(cbCategory);
        Funcoes.desabilitaCombo(cbCategory);
        Funcoes.desabilitaBotoes(btSalvar, btCancelar, btFindAuthor, btFindISBN, btFindPublisher);
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
    Item item = Item.findById(Integer.valueOf(id));
    try{
      item.delete();
      trataComponentes("preparaExcluir");
    }catch(Exception e){
      Message.information(this, e.getLocalizedMessage());
    }
  }

  private void fillComboCategory() {
    cbCategory.removeAllItems();
    List<Category> categories = Category.findAll();
    for (Category category : categories) {
      cbCategory.addItem(category.getString("description"));
    }
  }

  private void preparaSalvar(String id, String isbn, String nameCategory, String title, String subTitle, String idAuthor, String idPublisher, Integer pages, Integer existing, Date date, boolean active) {
    Item item = new Item();
    Integer idOperador = LoggedUser.getInstance().getId();
    Category category = Category.findFirst("description = ?", nameCategory);
    try{
      item.set(
              "id",           id,
              "isbn",         isbn,
              "type_id",      category.getInteger("id"),
              "title",        title,
              "subtitle",     subTitle,
              "author_id",    idAuthor,
              "publisher_id", idPublisher,
              "user_id",      idOperador,
              "pages",        pages,
              "existing",     existing,
              "available",    existing,
              "active",       active
      );
      if(item.saveIt()){
        trataComponentes("preparaSalvar");
        lblCodigo.setText(String.format("%04d", item.getInteger("id")));
        JOptionPane.showMessageDialog(this, "Categoria Gravada com Sucesso!");
      }
    }catch(ValidationException e){
      Message.validation(this, item.errors());
    }catch(Exception e){
      Message.exception(this, "Erro: ", e.getLocalizedMessage());
    }
  }

  private void buscaItem(String isbn) throws MalformedURLException, IOException, UnsupportedEncodingException, JSONException {
    JSONObject result = getBook(isbn);
    if (result != null) {
      System.out.println(result);
      Author author       = Author.findFirst("name = ?",    result.getJSONArray("authors").getString(0).toUpperCase());
      Publisher publisher = Publisher.findFirst("name = ?", result.getString("publisher"));
      if (publisher != null) {
        txtPublisher.setText(publisher.getId().toString());
        lblPublisher.setText(publisher.getString("name"));
      } else {
        Funcoes.informacao("Editora não Cadastrada");
      }
      if (author != null) {
        txtAuthor.setText(author.getId().toString());
        lblAuthor.setText(author.getString("name"));
      } else {
        Funcoes.informacao("Autor não Cadastrado");
      }
      txtTitle.setText(result.getString("title"));
      txtPages.setText(String.valueOf(result.getInt("pageCount")));
      txtSubTitle.requestFocusInWindow();
    } else {
      Funcoes.informacao("Nenhum Item foi Localizado!");
    }
  }

  private void formataGrid(JTable gridItem) {
    gridItem.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
    gridItem.setFont(new Font("Arial", Font.PLAIN, 12));
    Funcoes.alinhaColunas(gridItem, 0, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridItem, 3, SwingConstants.CENTER);
    Funcoes.alinhaColunas(gridItem, 4, SwingConstants.CENTER);
  }

  private JSONObject getBook(String isbn) throws UnsupportedEncodingException, MalformedURLException, IOException, JSONException {
    String s = "https://www.googleapis.com/books/v1/volumes?q=isbn:";
    s += URLEncoder.encode(isbn, "UTF-8");
    URL url = new URL(s);

    Scanner scan = new Scanner(url.openStream());
    String str = new String();
    while (scan.hasNext()) {
      str += scan.nextLine();
    }
    scan.close();

    JSONObject obj = new JSONObject(str);
    if (obj.getInt("totalItems") <= 0) {
      return null;
    }

    JSONObject result = obj.getJSONArray("items").getJSONObject(0).getJSONObject("volumeInfo");
    return result;
  }

  private void setIcons() {
    btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btFindPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btFindISBN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btFindAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtrar.gif")));
    btNovo.setIcon(     new javax.swing.ImageIcon(getClass().getResource("/images/new.png")));
    btAlterar.setIcon(  new javax.swing.ImageIcon(getClass().getResource("/images/edit.png")));
    btSalvar.setIcon(   new javax.swing.ImageIcon(getClass().getResource("/images/save.png")));
    btCancelar.setIcon( new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png")));
    btExcluir.setIcon(  new javax.swing.ImageIcon(getClass().getResource("/images/delete.png")));
    btSair.setIcon(     new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
  }
}
