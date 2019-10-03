package org.vincenzo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.vincenzo.models.Soggetto;
import org.vincenzo.models.SoggettoDTO;
import org.vincenzo.services.SoggettoRepository;
import org.vincenzo.services.SoggettoService;

import java.util.Date;

@Controller
public class ControllerSoggetto {

    @Autowired
    SoggettoService soggettoService;

    @ResponseBody
    @RequestMapping("/")
    public String home() {
        String html = "";
        html += " <ul>";
        html += " <li><a href='/nuovo'>nuovo</a></li>";
        html += " <li><a href='/testInsert'>Test Insert</a></li>";
        html += " <li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += " <li><a href='/showFullNameLikeTom'>Show All 'Tom'</a></li>";
        html += " <li><a href='/deleteAllEmployee'>Delete All Employee</a></li>";
        html += "</ul>";
        return html;
    }
    @ResponseBody
    @GetMapping(value = "/nuovo")
    public String addSoggetto(){
        String html = "";
        html += " <form method='POST' action='/insert'>"+
                " <label>Codice</label><input type='text' name='code' />"+
                " <label>Nome</label><input type='text' name='fullname' />"+
                " <label>Data</label><input type='date' name='starterDate' />"+
                " <input type='submit' />"+
                "</form>";
        return html;
    }

    @ResponseBody
    @PostMapping("/insert")
    public String testInsert(@ModelAttribute SoggettoDTO soggettoDTO){

        Soggetto soggetto = soggettoService.save(soggettoDTO);

        return "Inserted: "+soggetto;
    }
}
