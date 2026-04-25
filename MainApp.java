package com.example.main;

import com.example.dao.StudentDAO;
import com.example.model.Student;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.insertStudent(new Student(1, "akarsh", "akarsh@gmail.com", "Java"));
        dao.insertStudent(new Student(2, "punith", "punith@gmail.com", "Python"));
        dao.insertStudent(new Student(3, "Meghana", "meghana@gmail.com", "AI"));

        System.out.println("All Students:");
        List<Student> list = dao.getAllStudents();
        list.forEach(s -> System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse()));

        System.out.println("\nStudent with ID 1:");
        Student s = dao.getStudentById(1);
        System.out.println(s.getName());
        
        dao.updateStudent(1, "hemanth", "Hibernate");
        System.out.println("\nAfter Update:");
        System.out.println(dao.getStudentById(1).getName());

        dao.deleteStudent(2);
        System.out.println("\nAfter Delete (ID 2 removed):");

        dao.getAllStudents().forEach(st ->
                System.out.println(st.getId() + " " + st.getName()));
    }
}