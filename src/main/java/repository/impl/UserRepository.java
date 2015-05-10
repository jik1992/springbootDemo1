package repository.impl;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import domain.User;
import repository.IUserRepository;

/**
 * Created by ZuoYun on 5/10/15. Time: 9:49 PM Information:
 */
@Component
public class UserRepository implements IUserRepository {
  final static Logger logger = Logger.getLogger(UserRepository.class);


  @Override
  public User  save(User entity) {
    return null;
  }

  @Override
  public <S extends User> Iterable<S> save(Iterable<S> entities) {
    return null;
  }

  @Override
  public User findOne(Integer integer) {
    return null;
  }

  @Override
  public boolean exists(Integer integer) {
    return false;
  }

  @Override
  public Iterable<User> findAll() {
    return null;
  }

  @Override
  public Iterable<User> findAll(Iterable<Integer> integers) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void delete(Integer integer) {

  }

  @Override
  public void delete(User entity) {

  }

  @Override
  public void delete(Iterable<? extends User> entities) {

  }

  @Override
  public void deleteAll() {

  }
}
