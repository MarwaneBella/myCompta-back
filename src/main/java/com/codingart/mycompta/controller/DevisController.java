package com.codingart.mycompta.controller;

import com.codingart.mycompta.model.Devis;
import com.codingart.mycompta.service.DevisService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devis")
@RequiredArgsConstructor
public class DevisController {

    private final DevisService devisService;

    @GetMapping("{id}")
    public ResponseEntity<Devis> getDevisById(@PathVariable Long id){
        return new ResponseEntity<>(devisService.getDevis(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Devis>> getAllDevis(){
        return new ResponseEntity<>(devisService.getAllDevis(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Devis> createDevis(@Valid @RequestBody Devis devis){
        return new ResponseEntity<>(devisService.addDevis(devis), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Devis> updateDevis(@PathVariable Long id, @Valid @RequestBody Devis devis){
        return new ResponseEntity<>(devisService.updateDevis(id,devis), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDevis(@PathVariable Long id){
        devisService.deleteDevis(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }


}
