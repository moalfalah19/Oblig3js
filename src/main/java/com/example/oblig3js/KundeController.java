package com.example.oblig3js;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KundeController {
    @Autowired
    private KundeRepository rep;
    private final List<Kunde> alleKunder = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Kunde innKunde){
        rep.lagreKunde(innKunde);
    }

    @GetMapping("/hentAlle")
    public List<Kunde> hentAlle(){
        return rep.hentAlleKunder();
    }

    @GetMapping("/nullstil")
    public void nullstil() {
        rep.SlettAlleBillettene();

    }
}
