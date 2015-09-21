package gecx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.javalite.activejdbc.Base;
import org.pushingpixels.substance.api.skin.ModerateSkin;
import org.pushingpixels.substance.api.skin.SubstanceTwilightLookAndFeel;
import ui.Login;
import util.Message;

public class App {

  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(new SubstanceTwilightLookAndFeel());
      SubstanceTwilightLookAndFeel.setSkin(new ModerateSkin());
    } catch (UnsupportedLookAndFeelException e) {
      Message.exception(null, "Erro ao aplicar skin", e.getMessage());
    }
    
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        try {
          Properties prop = new Properties();
          prop.load(new FileInputStream("config/database.properties"));
          Base.open("com.mysql.jdbc.Driver", prop.getProperty("uri"), prop.getProperty("username"), prop.getProperty("password"));
        } catch (IOException e) {
          Message.exception(null, "Erro na inicialização", e.getMessage());
        }
        Login login = new Login(null, true);
        login.setVisible(true);
      }
    });
  }

}
