package com.springtest.springtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.springtest.springtest.entities.Course;
import com.springtest.springtest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application";
	}
	
	//get courses list
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourseDetail(@PathVariable String courseId){
		
		return  this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}

	
	@DeleteMapping("/courses/{courseId}")
	public boolean deleteCourse(@PathVariable String courseId) {
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
