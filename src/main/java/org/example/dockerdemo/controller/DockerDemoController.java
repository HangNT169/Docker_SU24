package org.example.dockerdemo.controller;

import org.example.dockerdemo.entity.DemoEntity;
import org.example.dockerdemo.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {

    final
    DemoRepo demoRepo;

    public DockerDemoController(DemoRepo demoRepo) {
        this.demoRepo = demoRepo;
    }

    @GetMapping("/demo")
    public String demoMethod() {
        return "Docker testing ...";
    }

    @PostMapping(path = "/add")
    public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity entity) {

        DemoEntity resultEntity = demoRepo.save(entity);
        return new ResponseEntity<>(resultEntity, HttpStatus.OK);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<DemoEntity>> getAll() {

        List<DemoEntity> demoEntityList = demoRepo.findAll();
        return new ResponseEntity<>(demoEntityList, HttpStatus.OK);
    }

}
