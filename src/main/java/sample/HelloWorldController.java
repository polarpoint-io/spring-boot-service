package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

  @Autowired
  Environment environment;

  public void getActiveProfiles() {
    for (final String profileName : environment.getActiveProfiles()) {
      System.out.println("Currently active profile - " + profileName);
    }
  }

  @RequestMapping("/")

  public String index() {
    return "Greetings from Spring Boot!";
  }

}
