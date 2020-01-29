package guru.springfamework.msscbrewery.web.controller;

import guru.springfamework.msscbrewery.services.BeerService;
import guru.springfamework.msscbrewery.web.model.BeerDto;
import guru.springfamework.msscbrewery.web.model.RequestDto;
import guru.springfamework.msscbrewery.web.model.ResponsePdfDto;
import org.apache.catalina.Context;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;


/*
 * 		Created by Edgar Martínez
 * */

@CrossOrigin(origins = "*")
@RequestMapping("/ws")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) throws IOException {
        this.beerService = beerService;
    }
    	String B64 = new String(Files.readAllBytes(Paths.get("test.txt")));

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerId(beerId), HttpStatus.OK);
    }

    @PostMapping({"/efirma"})
    public ResponseEntity<ResponsePdfDto> getPDF(@RequestBody RequestDto requestDto ) {
        ResponsePdfDto dto = new ResponsePdfDto();
        dto.setArchivoFirmado(B64);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}


