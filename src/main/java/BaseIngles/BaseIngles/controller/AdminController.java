/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseIngles.BaseIngles.controller;

import BaseIngles.BaseIngles.entity.Examen;
import BaseIngles.BaseIngles.service.ExamenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jorge
 */
@Controller

@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    private ExamenService es;


   

    @GetMapping("/listall")
    public String add(Model model) {
        List <Examen> examenes=es.findAllExamen();
      model.addAttribute("examenes",examenes);
        return "listarexamenes";
    }
}
