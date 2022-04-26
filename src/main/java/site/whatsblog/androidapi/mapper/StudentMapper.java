package site.whatsblog.androidapi.mapper;

import org.apache.ibatis.annotations.Mapper;
import site.whatsblog.androidapi.pojo.Student;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/4/25 16:22</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
@Mapper
public interface StudentMapper {
    /**
     * 插入一条记录
     *
     * @param student 学生信息
     */
    int insertStudent(Student student);

    /**
     * 根据学生id查询学生信息
     *
     * @param studentId 学生id
     * @return 学生信息
     */
    Student selectStudent(String studentId);

    /**
     * 更新学生信息
     *
     * @param student 学生信息
     */
    int updateStudent(Student student);

    /**
     * 根据学生id删除学生信息
     *
     * @param studentId 学生id
     */
    int deleteStudent(String studentId);

    /**
     * 查询所有学生信息
     *
     * @return 学生信息
     */
    List<Student> findStudents();
}
