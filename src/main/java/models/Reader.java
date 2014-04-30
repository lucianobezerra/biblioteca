package models;

import java.util.List;
import org.javalite.activejdbc.Model;

public class Reader extends Model{
  public static List<Reader> getBirthdays(int mes){
    return Reader.findBySQL("select id, name, email, phone, birth from readers where extract(month from birth) = ?", mes);
  }
}
