package hello.person.controller;

import hello.person.domain.Person;
import hello.person.dto.response.PersonResponse;
import hello.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public ResponseEntity<PersonResponse.GetPersonResponse> getPerson() {
        PersonResponse.GetPersonResponse response = personService.findPerson();
        return ResponseEntity.ok(response);
    }

}
