package ie.atu.jpaweek7;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo; }

    public Person create(Person p) {
        return repo.save(p); }
    }


