package util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author luciano
 */
public class Formatacao {

  public static String formatar(String valor, String mascara) {

    String dado = "";
    // remove caracteres nao numericos
    for (int i = 0; i < valor.length(); i++) {
      char c = valor.charAt(i);
      if (Character.isDigit(c)) {
        dado += c;
      }
    }

    int indMascara = mascara.length();
    int indCampo = dado.length();

    for (; indCampo > 0 && indMascara > 0;) {
      if (mascara.charAt(--indMascara) == '#') {
        indCampo--;
      }
    }

    String saida = "";
    for (; indMascara < mascara.length(); indMascara++) {
      saida += ((mascara.charAt(indMascara) == '#') ? dado.charAt(indCampo++) : mascara.charAt(indMascara));
    }
    return saida;
  }

  public static String formatarCpf(String cpf) {
    while (cpf.length() < 11) {
      cpf = "0" + cpf;
    }
    return formatar(cpf, "###.###.###-##");
  }

  public static String formatarCnpj(String cnpj) {
    while (cnpj.length() < 14) {
      cnpj = "0" + cnpj;
    }
    return formatar(cnpj, "##.###.###/####-##");
  }
  
  public static String formatarData(Date data) throws ParseException{
    SimpleDateFormat in  = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
    return out.format(in.parse(data.toString()));
  }
}
