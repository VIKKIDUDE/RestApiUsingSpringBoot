package com.springtest.springtest.services;

import java.util.List;

import com.springtest.springtest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public boolean deleteCourse(long courseId);

}
