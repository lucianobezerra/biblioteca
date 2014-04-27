package models;

public class LoggedUser {

  private Integer id;
  private String username;
  private String name;
  private Boolean admin;

  public static Boolean isLogged() {
    return LoggedUserHolder.instance != null;
  }
  
  public static LoggedUser getInstance(){
    return LoggedUserHolder.instance;
  }
  
  public boolean canChangeMultiplePassword(){
    if(isLogged()){
      return isAdmin();
    }
    return false;
  }
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean isAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  private static class LoggedUserHolder {

    private final static LoggedUser instance = new LoggedUser();
  }
}
