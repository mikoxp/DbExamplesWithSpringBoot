package moles.db.examples.controllers;

import com.google.common.collect.Lists;
import moles.db.examples.entities.FunctionRunner;
import moles.db.examples.repositories.FunctionRunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/fun")
public class FunctionRestController {

    @Autowired
    private FunctionRunnerRepository runnerRepository;

    @GetMapping("")
    public List<FunctionRunner> whatsDefault(){
        Iterable<FunctionRunner> all = runnerRepository.findAll();
       return Lists.newArrayList(all);
    }

    @GetMapping("/add/{a}/{b}")
    public int addiction(@PathVariable(name = "a")int a,@PathVariable(name = "b")int b){
        return runnerRepository.runAddition(a,b);
    }
}
