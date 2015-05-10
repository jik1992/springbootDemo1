package repository;

import org.apache.log4j.Logger;
import org.springframework.data.repository.CrudRepository;

import domain.User;

/**
 * Created by ZuoYun on 5/10/15. Time: 9:46 PM Information:
 */

public interface IUserRepository extends CrudRepository<User,Integer>{

  final static Logger logger = Logger.getLogger(IUserRepository.class);
}
