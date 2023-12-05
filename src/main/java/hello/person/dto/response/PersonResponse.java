package hello.person.dto.response;

import hello.person.domain.Person;

public class PersonResponse {

    public record GetPersonResponse(
            String name,
            int age
    ) {
        public GetPersonResponse(Person person) {
            this(
                    person.getName(),
                    person.getAge()
            );
        }
    }

}
