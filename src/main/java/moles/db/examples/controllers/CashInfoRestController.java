package moles.db.examples.controllers;

import moles.db.examples.repositories.CashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cash/info")
public class CashInfoRestController {

    @Autowired
    private CashRepository cashRepository;

    @RequestMapping("/count")
    public Long countCash(){
        return cashRepository.count();
    }
}
