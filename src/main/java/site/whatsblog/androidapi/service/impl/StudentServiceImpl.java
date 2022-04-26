package site.whatsblog.androidapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.whatsblog.androidapi.mapper.StudentMapper;
import site.whatsblog.androidapi.pojo.Student;
import site.whatsblog.androidapi.service.StudentService;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/4/25 16:30</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public Student selectStudent(String studentId) {
        return studentMapper.selectStudent(studentId);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudent(String studentId) {
        return studentMapper.deleteStudent(studentId);
    }

    @Override
    public List<Student> findStudents() {
        return studentMapper.findStudents();
    }
}
