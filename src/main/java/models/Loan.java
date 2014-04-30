package models;

import java.util.List;
import org.javalite.activejdbc.Model;

public class Loan extends Model {

  public static List<Loan> getLoaneds() {
    return Loan.find("devolution is null");
  }
}
