package com.website.course.services;

import com.website.course.entities.User;
import com.website.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component
/*
* @Component registra a classe como um componente do Spring e permite
* a injeção de dependência automática dessa classe dentro de outras
* */
@Service
/*
* O @Service tem a mesma função que o @Component. No entanto, o @Service deixa
* de uma maneira mais semântica dentro do Spring Boot, deixando-o mais específico
* */
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User findById(Long id) {
    Optional<User> opt = userRepository.findById(id);

    /*
    * o metodo findById retorna um Optional<T>, em que T e o tipo da entidade que voce
    * espera o retorno
    * */
    return opt.get(); // o metod get() retorna em a entidade em si;
  }
}
