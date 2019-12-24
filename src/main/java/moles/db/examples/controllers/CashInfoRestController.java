package moles.db.examples.controllers;

import moles.db.examples.dto.CashDto;
import moles.db.examples.repositories.CashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/cash/info")
public class CashInfoRestController {

    @Autowired
    private CashRepository cashRepository;

    @GetMapping("/count")
    public Long countCash() {
        return cashRepository.count();
    }

    @GetMapping("/all")
    public List<CashDto> all() {
        CashDto cashDto = new CashDto();
        return StreamSupport.stream(cashRepository.findAll().spliterator(), true).map(el -> cashDto.toDto(el)).collect(Collectors.toList());
    }
}
