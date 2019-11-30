package com.example.demo.controller;

import com.example.demo.domain.Image;
import com.example.demo.repo.ImageRepo;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/image")
public class ImageController {

    private ImageRepo imageRepo;

    public ImageController(ImageRepo imageRepo) {
        this.imageRepo = imageRepo;
    }


    @GetMapping
    public String getFormToLoadImage(Model model){
        model.addAttribute("message","Maximum 5MB");
        return "image";
    }


    @PostMapping
    public String loadImage(@RequestParam("description") String description,
                            @RequestParam("file") MultipartFile file) throws IOException {
        Byte[] bArray = new Byte[file.getBytes().length];
        int i = 0;
        for (byte b : file.getBytes()){ bArray[i++] = b; }
        imageRepo.save(new Image(description,bArray));
    return "redirect:/image";
    }


    // Stateless - HTTP
    // 1) user -> login/password
    // 2) server -> read data -> if success
    // 3) server -> client COOKIE
    // 4) client -> request
    // 5) request -> COOKIE
    @GetMapping("/{id}")
    public void renderImage(@PathVariable("id") String id, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        Image image = imageRepo.findById(Long.valueOf(id)).get();

        byte[] bArray = new byte[image.getImage().length];
        int i = 0;
        for (byte b : image.getImage()){
            bArray[i++] = b;
        }
        InputStream is = new ByteArrayInputStream(bArray);
        IOUtils.copy(is,response.getOutputStream());
    }

}
