package hello.person.service;

import hello.person.domain.Person;
import hello.person.dto.response.PersonResponse;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public PersonResponse.GetPersonResponse findPerson() {
        Person person = new Person("Brown", 20);
        return new PersonResponse.GetPersonResponse(person);
    }

}
