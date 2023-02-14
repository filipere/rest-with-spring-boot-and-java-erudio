package br.com.erudio.comtroller;

import br.com.erudio.model.Person;
import br.com.erudio.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping()
    public List<Person> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable(value = "id") String id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Person create(@RequestBody Person person) throws Exception {
        return service.create(person);
    }

    @PutMapping
    public Person update(@RequestBody Person person) throws Exception {
        return service.update(person);
    }

    @DeleteMapping("/{id}")
    public void update(@PathVariable String id) throws Exception {
        service.delete(id);
    }
}