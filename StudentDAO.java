package com.example.dao;
import com.example.model.Student;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
public class StudentDAO {
    public void insertStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
    }
    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> list = session.createQuery("from Student", Student.class).list();
        session.close();
        return list;
    }
    public Student getStudentById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student s = session.get(Student.class, id);
        session.close();
        return s;
    }
    public void updateStudent(int id, String newName, String newCourse) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, id);
        if (s != null) {
            s.setName(newName);
            s.setCourse(newCourse);
            session.update(s);
        }
        tx.commit();
        session.close();
    }
    public void deleteStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, id);
        if (s != null) {
            session.delete(s);
        }
        tx.commit();
        session.close();
    }
}