package util;

import java.awt.Font;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.joda.time.*;

/**
 * @author luciano
 */
public class Funcoes {

  public static void formatFontGrid(JTable grid, Font font) {
    grid.setFont(font);
  }

  public static void formatFontHeader(JTable grid, Font font) {
    grid.getTableHeader().setFont(font);
  }

  public static void alinhaColunas(JTable grid, int column, int align) {
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    renderer.setHorizontalAlignment(align);
    grid.getColumnModel().getColumn(column).setCellRenderer(renderer);
  }

  public static boolean removeLinha(DefaultTableModel model) {
    int linha = model.getRowCount();
    for (int i = linha - 1; i >= 0; --i) {
      model.removeRow(i);
    }
    return false;
  }

  public static boolean checaForm(JTextField... edits) {
    for (JTextField edit : edits) {
      if (edit.getText().equals("")) {
        informacao("Preencha todos os campos");
        return false;
      }
    }
    return true;
  }

  public static String getStatus(Boolean status) {
    return status ? "ATIVO" : "INATIVO";
  }

  public static void informacao(String msg) {
    JOptionPane.showMessageDialog(null, msg, "Atenção", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void erro(String msg) {
    JOptionPane.showMessageDialog(null, msg, "Atenção", JOptionPane.ERROR_MESSAGE);
  }

  public static void cuidado(String msg) {
    JOptionPane.showMessageDialog(null, msg, "Atenção", JOptionPane.WARNING_MESSAGE);
  }

  public static void limpaLabel(JLabel... label) {
    for (JLabel label1 : label) {
      label1.setText(null);
    }
  }

  public static void habilitaCombo(JComboBox... combos) {
    for (JComboBox combo : combos) {
      combo.setEnabled(true);
    }
  }

  public static void desabilitaCombo(JComboBox... combos) {
    for (JComboBox combo : combos) {
      combo.setEnabled(false);
    }
  }

  public static void limpaCombo(JComboBox... combos) {
    for (JComboBox combo : combos) {
      combo.removeAllItems();
    }
  }

  public static void habilitaCheck(JCheckBox... checks) {
    for (JCheckBox check : checks) {
      check.setEnabled(true);
    }
  }

  public static void desabilitaCheck(JCheckBox... checks) {
    for (JCheckBox check : checks) {
      check.setEnabled(false);
    }
  }

  public static void limpaCheck(JCheckBox... checks) {
    for (JCheckBox check : checks) {
      check.setSelected(false);
    }
  }

  public static void habilitaBotoes(JButton... botoes) {
    for (JButton botao : botoes) {
      botao.setEnabled(true);
    }
  }

  public static void desabilitaBotoes(JButton... botoes) {
    for (JButton botao : botoes) {
      botao.setEnabled(false);
    }
  }

  public static void limpaEdits(JTextField... edits) {
    for (JTextField edit : edits) {
      edit.setText(null);
    }
  }

  public static void habilitaEdits(JTextField... edits) {
    for (JTextField edit : edits) {
      edit.setEnabled(true);
    }
  }

  public static void desabilitaEdits(JTextField... edits) {
    for (JTextField edit : edits) {
      edit.setEnabled(false);
    }
  }

  public static java.sql.Date formataData(String data) throws Exception {
    if (data == null || data.equals("")) {
      return null;
    }
    java.sql.Date date = null;
    try {
      DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      date = new java.sql.Date(((java.util.Date) formatter.parse(data)).getTime());
    } catch (ParseException e) {
      erro(e.getLocalizedMessage());
    }
    return date;
  }

  public static String somaDias(int dias) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DATE, dias);
    return sdf.format(calendar.getTime());
  }

  public static java.sql.Date formataDataBanco(String data) throws Exception {
    if (data == null || data.equals("")) {
      return null;
    }
    java.sql.Date date = null;
    try {
      DateFormat formatter = new SimpleDateFormat("yyyy-MM-yyyy");
      date = new java.sql.Date(((java.util.Date) formatter.parse(data)).getTime());
    } catch (ParseException e) {
      erro(e.getLocalizedMessage());
    }
    return date;
  }

  /**
   * Transforma uma data no Formato aaaa-mm-dd para dd/mm/aaaa
   *
   * @param data formato aaaa-mm-dd
   * @return String no formato dd/mm/aaaa
   */
  public static String dataString(java.util.Date data) {
    String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(data);
    return dataFormatada;
  }

  public static int difData(Date dataPrevista) {
    DateTime data = new DateTime(dataPrevista);
    DateTime hoje = new DateTime();
    return Days.daysBetween(data, hoje).getDays();
  }

  public static String preencheCom(String linha_a_preencher, String letra, int tamanho, int direcao) {
    if (linha_a_preencher == null || linha_a_preencher.trim() == "") {
      linha_a_preencher = "";
    }
    while (linha_a_preencher.contains(" ")) {
      linha_a_preencher = linha_a_preencher.replaceAll(" ", " ").trim();
    }

    linha_a_preencher = linha_a_preencher.replaceAll("[./-]", "");
    StringBuffer sb = new StringBuffer(linha_a_preencher);
    if (direcao == 1) { //a Esquerda
      for (int i = sb.length(); i < tamanho; i++) {
        sb.insert(0, letra);
      }

    } else if (direcao == 2) {//a Direita
      for (int i = sb.length(); i < tamanho; i++) {
        sb.append(letra);
      }
    }

    return sb.toString();

  }

}
