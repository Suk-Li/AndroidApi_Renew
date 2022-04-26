package site.whatsblog.androidapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/4/26 13:46</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
@RestController
public class UploadController {

    @Value("${file.upload.path}")
    private String filePath;
    @Value("${file.upload.uriPath}")
    private String fileUriPath;

    /**
     * 上传图片
     *
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> uploadImages(@RequestParam(value = "file") MultipartFile file) {
        HashMap<String, Object> map = new HashMap<>();
        if (file.isEmpty()) {
            map.put("code", 404);
            map.put("result", null);
        } else {
            map.put("code", 200);
            // 文件名
            String fileName = file.getOriginalFilename();
            // 后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            // 新文件名
            fileName = UUID.randomUUID() + suffixName;
            File dest = new File(filePath + fileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //本地目录和生成的文件名拼接，这一段存入数据库
            String filename = fileUriPath + fileName;
            map.put("result", filename);
        }
        return map;
    }
}
