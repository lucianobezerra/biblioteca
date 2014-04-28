package ui;

import models.LoggedUser;
import ui.authors.FrameAuthor;
import ui.categories.FrameCategory;
import ui.loans.FrameLoan;
import ui.publishers.FramePublisher;
import ui.readers.FrameReader;
import ui.users.FrameUser;

public class Menu extends javax.swing.JFrame {

  public Menu() {
    initComponents();
    jLabel1.setText(LoggedUser.getInstance().getName());
    this.requestFocusInWindow();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jToolBar1 = new javax.swing.JToolBar();
    btUsers = new javax.swing.JButton();
    btUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuarios.png")));
    btItems = new javax.swing.JButton();
    btItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/items.png")));
    btLoans = new javax.swing.JButton();
    btLoans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loans.png")));
    btDevolutions = new javax.swing.JButton();
    btDevolutions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devolution.png")));
    btReports = new javax.swing.JButton();
    btReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reports.gif")));
    btReadme = new javax.swing.JButton();
    btReadme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/readme.png")));
    btAbout = new javax.swing.JButton();
    btAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png")));
    btExit = new javax.swing.JButton();
    btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenuCadastros = new javax.swing.JMenu();
    jMenuOperador = new javax.swing.JMenuItem();
    jSeparator2 = new javax.swing.JPopupMenu.Separator();
    jMenuCategoria = new javax.swing.JMenuItem();
    jMenuEditora = new javax.swing.JMenuItem();
    jMenuAutor = new javax.swing.JMenuItem();
    jMenuUsuario = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    jMenuItem = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();
    menuEmprestimo = new javax.swing.JMenuItem();
    jMenu3 = new javax.swing.JMenu();
    jMenuItem7 = new javax.swing.JMenuItem();
    menuConsultas = new javax.swing.JMenu();
    menuAtrasados = new javax.swing.JMenuItem();
    menuAniversariantes = new javax.swing.JMenuItem();
    jMenu6 = new javax.swing.JMenu();
    jMenuItem9 = new javax.swing.JMenuItem();
    jMenuItem10 = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Biblioteca GECX");
    setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
    setResizable(false);

    jPanel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setText("null");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 420, 22));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 367, 830, 28));

    jToolBar1.setBackground(jPanel1.getBackground());
    jToolBar1.setBorder(null);
    jToolBar1.setRollover(true);

    btUsers.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btUsers.setText("Usuários");
    btUsers.setBorder(null);
    btUsers.setFocusable(false);
    btUsers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btUsers.setMaximumSize(new java.awt.Dimension(100, 55));
    btUsers.setMinimumSize(new java.awt.Dimension(100, 55));
    btUsers.setPreferredSize(new java.awt.Dimension(100, 55));
    btUsers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btUsers.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btUsersActionPerformed(evt);
      }
    });
    jToolBar1.add(btUsers);

    btItems.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btItems.setText("Itens");
    btItems.setBorder(null);
    btItems.setFocusable(false);
    btItems.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btItems.setMaximumSize(new java.awt.Dimension(100, 55));
    btItems.setMinimumSize(new java.awt.Dimension(100, 55));
    btItems.setPreferredSize(new java.awt.Dimension(100, 55));
    btItems.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btItems.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btItemsActionPerformed(evt);
      }
    });
    jToolBar1.add(btItems);

    btLoans.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btLoans.setText("Empréstimo");
    btLoans.setBorder(null);
    btLoans.setFocusable(false);
    btLoans.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btLoans.setMaximumSize(new java.awt.Dimension(100, 55));
    btLoans.setMinimumSize(new java.awt.Dimension(100, 55));
    btLoans.setPreferredSize(new java.awt.Dimension(100, 55));
    btLoans.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btLoans.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btLoansActionPerformed(evt);
      }
    });
    jToolBar1.add(btLoans);

    btDevolutions.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btDevolutions.setText("Devolução");
    btDevolutions.setBorder(null);
    btDevolutions.setFocusable(false);
    btDevolutions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btDevolutions.setMaximumSize(new java.awt.Dimension(100, 55));
    btDevolutions.setMinimumSize(new java.awt.Dimension(100, 55));
    btDevolutions.setPreferredSize(new java.awt.Dimension(100, 55));
    btDevolutions.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btDevolutions.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btDevolutionsActionPerformed(evt);
      }
    });
    jToolBar1.add(btDevolutions);

    btReports.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btReports.setText("Relatórios");
    btReports.setBorder(null);
    btReports.setFocusable(false);
    btReports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btReports.setMaximumSize(new java.awt.Dimension(100, 55));
    btReports.setMinimumSize(new java.awt.Dimension(100, 55));
    btReports.setPreferredSize(new java.awt.Dimension(100, 55));
    btReports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(btReports);

    btReadme.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btReadme.setText("Leiame");
    btReadme.setBorder(null);
    btReadme.setFocusable(false);
    btReadme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btReadme.setMaximumSize(new java.awt.Dimension(100, 55));
    btReadme.setMinimumSize(new java.awt.Dimension(100, 55));
    btReadme.setPreferredSize(new java.awt.Dimension(100, 55));
    btReadme.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(btReadme);

    btAbout.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btAbout.setText("Sobre");
    btAbout.setBorder(null);
    btAbout.setFocusable(false);
    btAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btAbout.setMaximumSize(new java.awt.Dimension(100, 55));
    btAbout.setMinimumSize(new java.awt.Dimension(100, 55));
    btAbout.setPreferredSize(new java.awt.Dimension(100, 55));
    btAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(btAbout);

    btExit.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    btExit.setText("Sair");
    btExit.setBorder(null);
    btExit.setFocusable(false);
    btExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btExit.setMaximumSize(new java.awt.Dimension(100, 55));
    btExit.setMinimumSize(new java.awt.Dimension(100, 55));
    btExit.setPreferredSize(new java.awt.Dimension(100, 55));
    btExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btExitActionPerformed(evt);
      }
    });
    jToolBar1.add(btExit);

    jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    jMenuBar1.setFont(new java.awt.Font("Andale Mono", 0, 18)); // NOI18N

    jMenuCadastros.setMnemonic('T');
    jMenuCadastros.setText("Cadastros");
    jMenuCadastros.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuCadastros.setPreferredSize(new java.awt.Dimension(120, 25));

    jMenuOperador.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuOperador.setText("Operadores");
    jMenuOperador.setPreferredSize(new java.awt.Dimension(140, 25));
    jMenuOperador.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuOperadorActionPerformed(evt);
      }
    });
    jMenuCadastros.add(jMenuOperador);

    jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
    jMenuCadastros.add(jSeparator2);

    jMenuCategoria.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuCategoria.setText("Categorias");
    jMenuCategoria.setPreferredSize(new java.awt.Dimension(140, 25));
    jMenuCategoria.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuCategoriaActionPerformed(evt);
      }
    });
    jMenuCadastros.add(jMenuCategoria);

    jMenuEditora.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuEditora.setText("Editoras");
    jMenuEditora.setPreferredSize(new java.awt.Dimension(140, 25));
    jMenuEditora.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuEditoraActionPerformed(evt);
      }
    });
    jMenuCadastros.add(jMenuEditora);

    jMenuAutor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuAutor.setText("Autores");
    jMenuAutor.setPreferredSize(new java.awt.Dimension(140, 25));
    jMenuAutor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuAutorActionPerformed(evt);
      }
    });
    jMenuCadastros.add(jMenuAutor);

    jMenuUsuario.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuUsuario.setText("Usuários");
    jMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuUsuarioActionPerformed(evt);
      }
    });
    jMenuCadastros.add(jMenuUsuario);

    jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
    jMenuCadastros.add(jSeparator1);

    jMenuItem.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuItem.setText("Items");
    jMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemActionPerformed(evt);
      }
    });
    jMenuCadastros.add(jMenuItem);

    jMenuBar1.add(jMenuCadastros);

    jMenu2.setMnemonic('E');
    jMenu2.setText("Emissão");
    jMenu2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenu2.setPreferredSize(new java.awt.Dimension(120, 25));

    menuEmprestimo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    menuEmprestimo.setMnemonic('A');
    menuEmprestimo.setText("Empréstimo");
    menuEmprestimo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuEmprestimoActionPerformed(evt);
      }
    });
    jMenu2.add(menuEmprestimo);

    jMenuBar1.add(jMenu2);

    jMenu3.setMnemonic('M');
    jMenu3.setText("Configuração");
    jMenu3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenu3.setName("jMenu3"); // NOI18N
    jMenu3.setPreferredSize(new java.awt.Dimension(120, 25));

    jMenuItem7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuItem7.setText("Ambiente");
    jMenu3.add(jMenuItem7);

    jMenuBar1.add(jMenu3);

    menuConsultas.setText("Consultas");
    menuConsultas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    menuConsultas.setPreferredSize(new java.awt.Dimension(120, 25));

    menuAtrasados.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    menuAtrasados.setText("Atrasados");
    menuAtrasados.setPreferredSize(new java.awt.Dimension(120, 23));
    menuAtrasados.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuAtrasadosActionPerformed(evt);
      }
    });
    menuConsultas.add(menuAtrasados);

    menuAniversariantes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    menuAniversariantes.setText("Aniversariantes");
    menuAniversariantes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuAniversariantesActionPerformed(evt);
      }
    });
    menuConsultas.add(menuAniversariantes);

    jMenuBar1.add(menuConsultas);

    jMenu6.setText("Ajuda");
    jMenu6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenu6.setPreferredSize(new java.awt.Dimension(120, 25));

    jMenuItem9.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuItem9.setText("Sobre ...");
    jMenuItem9.setPreferredSize(new java.awt.Dimension(120, 25));
    jMenu6.add(jMenuItem9);

    jMenuItem10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
    jMenuItem10.setLabel("Leiame");
    jMenu6.add(jMenuItem10);

    jMenuBar1.add(jMenu6);

    setJMenuBar(jMenuBar1);

    setSize(new java.awt.Dimension(839, 454));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btExitActionPerformed

  private void jMenuOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOperadorActionPerformed
    FrameUser frameUser = new FrameUser(this, true);
    frameUser.setVisible(true);
  }//GEN-LAST:event_jMenuOperadorActionPerformed

  private void jMenuAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAutorActionPerformed
    FrameAuthor frameAuthor = new FrameAuthor(this, true);
    frameAuthor.setVisible(true);
  }//GEN-LAST:event_jMenuAutorActionPerformed

  private void jMenuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCategoriaActionPerformed
    FrameCategory frameCategory = new FrameCategory(this, true);
    frameCategory.setVisible(true);
  }//GEN-LAST:event_jMenuCategoriaActionPerformed

  private void jMenuEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditoraActionPerformed
    FramePublisher framePublisher = new FramePublisher(this, true);
    framePublisher.setVisible(true);
  }//GEN-LAST:event_jMenuEditoraActionPerformed

  private void jMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioActionPerformed
    FrameReader frameReader = new FrameReader(this, true);
    frameReader.setVisible(true);
  }//GEN-LAST:event_jMenuUsuarioActionPerformed

  private void btUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsersActionPerformed
    jMenuUsuario.doClick();
  }//GEN-LAST:event_btUsersActionPerformed

  private void jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActionPerformed
    //  FrameItem frameItem = new FrameItem(this, true);
    //  frameItem.setVisible(true);
  }//GEN-LAST:event_jMenuItemActionPerformed

  private void btItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btItemsActionPerformed
    jMenuItem.doClick();
  }//GEN-LAST:event_btItemsActionPerformed

  private void menuEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmprestimoActionPerformed
    FrameLoan frameLoan = new FrameLoan(this, true);
    frameLoan.setVisible(true);
  }//GEN-LAST:event_menuEmprestimoActionPerformed

  private void btLoansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoansActionPerformed
    menuEmprestimo.doClick();
  }//GEN-LAST:event_btLoansActionPerformed

  private void btDevolutionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDevolutionsActionPerformed
    //  FrameDevolution frameDevolution = new FrameDevolution(this, true);
    //  frameDevolution.setVisible(true);
  }//GEN-LAST:event_btDevolutionsActionPerformed

  private void menuAtrasadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtrasadosActionPerformed
    //  FrameFindDelayed frameDelayed = new FrameFindDelayed(this, true);
    //  frameDelayed.setVisible(true);
  }//GEN-LAST:event_menuAtrasadosActionPerformed

  private void menuAniversariantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAniversariantesActionPerformed
    //  FrameFindBirth frameFindBirth = new FrameFindBirth(this, true);
    //  frameFindBirth.setVisible(true);
  }//GEN-LAST:event_menuAniversariantesActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.toFront();
        menu.repaint();
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btAbout;
  private javax.swing.JButton btDevolutions;
  private javax.swing.JButton btExit;
  private javax.swing.JButton btItems;
  private javax.swing.JButton btLoans;
  private javax.swing.JButton btReadme;
  private javax.swing.JButton btReports;
  private javax.swing.JButton btUsers;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu6;
  private javax.swing.JMenuItem jMenuAutor;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenu jMenuCadastros;
  private javax.swing.JMenuItem jMenuCategoria;
  private javax.swing.JMenuItem jMenuEditora;
  private javax.swing.JMenuItem jMenuItem;
  private javax.swing.JMenuItem jMenuItem10;
  private javax.swing.JMenuItem jMenuItem7;
  private javax.swing.JMenuItem jMenuItem9;
  private javax.swing.JMenuItem jMenuOperador;
  private javax.swing.JMenuItem jMenuUsuario;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JPopupMenu.Separator jSeparator2;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JMenuItem menuAniversariantes;
  private javax.swing.JMenuItem menuAtrasados;
  private javax.swing.JMenu menuConsultas;
  private javax.swing.JMenuItem menuEmprestimo;
  // End of variables declaration//GEN-END:variables

}
