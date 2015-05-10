package domain;


import org.apache.log4j.Logger;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by ZuoYun on 5/10/15. Time: 9:43 PM Information:
 */
@Entity
public class User implements Serializable {

  final static Logger logger = Logger.getLogger(User.class);

  @Id
  @GeneratedValue
  public Integer id;


  @Column(nullable = true)
  public String user;
  @Column(nullable = true)
  public String password;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
