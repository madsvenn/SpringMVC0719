package com.huayu.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

@Controller
@RequestMapping("asdasd")
public class FileController {

    @RequestMapping("/upload")
    public String uploadFile(String name ,
                             @RequestParam("file")MultipartFile file){
        System.out.println("name:"+name);
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getSize());

        String filename = file.getName();
        try {
            file.transferTo(new File("G:\\download\\"+ filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
