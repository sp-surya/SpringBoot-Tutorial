package com.dailycodebuffer.Springboot.tutorial.Contoller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Springboot.tutorial.Entity.Department;
import com.dailycodebuffer.Springboot.tutorial.Error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.Service.DepartmentService;

import ch.qos.logback.classic.Logger;
import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/saveDepartment")  // http://localhost:8080/saveDepartment
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("Add Department Function");
		return departmentService.saveDepartment(department);
	}

	
	@GetMapping("/getDepartment") //http://localhost:8080/getDepartment
	public List<Department> fetchDepartmentList(){
		LOGGER.info("Get Department Function");
		return departmentService.fetchDepartmentList();
	}
	
	
	@GetMapping("/getDepartmentById/{id}")  //http://localhost:8080/getDepartmentById/id
	public Department fetchDepartmentById( @PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
		
		return departmentService.fetchDepartmentById(departmentId);
	}
	

     @DeleteMapping("/deleteDepartmentById/{id}")  // //http://localhost:8080/deleteDepartmentById/id
	    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
	        departmentService.deleteDepartmentById(departmentId);
	        return "Department deleted Successfully!!";
	    }
     
     
//     @PutMapping("/updateDepartmentById/{id}")
//     public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department) {
//    	 return departmentService.updateDepartmentById(departmentId,department);
//    	 
//     }
     
     @PutMapping("/updateDepartment/{id}")  //http://localhost:8080/updateDepartment/id
     public Department updateDepartment(@PathVariable("id") Long departmentId,
                                        @RequestBody Department department) {
         return departmentService.updateDepartment(departmentId,department);
     }
     
     
     @GetMapping("/getDepartmentByName/{name}")  //http://localhost:8080/getDepartmentByName/name
     public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
    	 return departmentService.fetchDepartmentByName(departmentName);
     }
	
	
	

	
	
}
