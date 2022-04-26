package site.whatsblog.androidapi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/4/25 16:21</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer stuId;
    private String stuName;
    private String phoneNumber;
    private String stuImage;
}
