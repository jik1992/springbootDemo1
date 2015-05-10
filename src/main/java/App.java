import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import repository.IUserRepository;
import repository.impl.UserRepository;

/**
 * Created by ZuoYun on 5/10/15. Time: 8:34 PM Information:
 */
@RestController
@EnableAutoConfiguration
public class App {

  final static Logger logger = Logger.getLogger(App.class);

  @Resource
  JdbcTemplate template;

  @Autowired
//  IUserRepository userRepository;

  @RequestMapping(value = "/")
  @ResponseBody
  public Object index() {
    template.queryForList("show tables;");
    return "hello world";
  }


  public static void main(String[] args) {
    SpringApplication.run(App.class);
  }
}
