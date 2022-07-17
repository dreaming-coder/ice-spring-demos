package com.ice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String upload(@RequestPart(value = "headerImage", required = false) MultipartFile headerImage,
                         @RequestPart(value = "photos", required = false) MultipartFile[] photos) throws IOException {
        String s = "";
        if (null != headerImage && !headerImage.isEmpty()) {
            String originalFilename = headerImage.getOriginalFilename();
            s += originalFilename + "\n";
            headerImage.transferTo(new File("E:/" + originalFilename));
        }
        if (null != photos && photos.length > 0) {
            for (MultipartFile photo : photos) {
                if (!photo.isEmpty()) {
                    String originalFilename = photo.getOriginalFilename();
                    s += originalFilename + "\n";
                    photo.transferTo(new File("E:/" + originalFilename));
                }
            }
        }
        return s;
    }
}
