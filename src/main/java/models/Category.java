package models;

import org.javalite.activejdbc.annotations.Table;
import org.javalite.activejdbc.Model;

@Table(value="types")
public class Category extends Model{

  @Override
  public String toString() {
    return this.getString("description");
  }
  
}
