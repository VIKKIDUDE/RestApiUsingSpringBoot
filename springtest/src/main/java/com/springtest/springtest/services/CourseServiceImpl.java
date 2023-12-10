package com.springtest.springtest.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springtest.springtest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(123,"basic of oops will be covered","core java courses"));
		list.add(new Course(124, "JDBC COnnection will be covered", "advance java"));
		list.add(new Course(125, "front end technology taught", "react basic"));
		
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		
		for(Course course : list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		for(Course corse :list) {
			if(corse.getId() == course.getId()) {
				corse.setDescription(course.getDescription());
				corse.setTitle(course.getTitle());
			}
		}
		
		return course;
	}

	@Override
	public boolean deleteCourse(long courseId) {
		for(Course corse : list) {
			if(corse.getId() == courseId) {
				list.remove(corse);
			}
		}
		return true;
	}

}




















