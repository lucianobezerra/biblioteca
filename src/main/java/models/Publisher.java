package models;

import org.javalite.activejdbc.Model;

public class Publisher extends Model{

  @Override
  public String toString() {
    return this.getString("name");
  }
  
}
