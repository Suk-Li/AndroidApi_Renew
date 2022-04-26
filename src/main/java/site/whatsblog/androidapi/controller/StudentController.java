package site.whatsblog.androidapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import site.whatsblog.androidapi.pojo.Student;
import site.whatsblog.androidapi.service.StudentService;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/4/25 16:32</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;




    @RequestMapping(value = "/get/{id}")
    public Map<String, Object> getStudent(@PathVariable("id") String id) {
        HashMap<String, Object> map = new HashMap<>();
        Student student = studentService.selectStudent(id);
        if (student != null) {
            map.put("code", 200);
        } else {
            map.put("code", 404);
        }
        map.put("result", student);
        return map;
    }

    @RequestMapping(value = "/delete/{id}")
    public Map<String, Object> deleteStudent(@PathVariable("id") String id) {
        HashMap<String, Object> map = new HashMap<>();
        int i = studentService.deleteStudent(id);
        if (i != 0) {
            map.put("code", 200);
        } else {
            map.put("code", 404);
        }
        map.put("result", i);
        return map;
    }

    @RequestMapping(value = "/update")
    public Map<String, Object> updateStudent(@RequestBody Student student) {
        HashMap<String, Object> map = new HashMap<>();
        int i = studentService.updateStudent(student);
        if (i != 0) {
            map.put("code", 200);
        } else {
            map.put("code", 404);
        }
        map.put("result", i);
        return map;
    }

    @RequestMapping(value = "/insert")
    public Map<String, Object> insertStudent(@RequestBody Student student) {
        HashMap<String, Object> map = new HashMap<>();
        int i = studentService.insertStudent(student);
        if (i != 0) {
            map.put("code", 200);
        } else {
            map.put("code", 404);
        }
        map.put("result", i);
        return map;
    }

    @RequestMapping(value = "/list")    
    public Map<String, Object> findStudents() {
        HashMap<String, Object> map = new HashMap<>();
        List<Student> students = studentService.findStudents();
        if (students != null && students.size() > 0) {
            map.put("code", 200);
        } else {
            map.put("code", 404);
        }
        map.put("result", students);
        return map;
    }



}
