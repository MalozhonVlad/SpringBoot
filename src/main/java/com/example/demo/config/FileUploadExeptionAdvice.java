package com.example.demo.config;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * тут ми обрабативаем ошибки в данном контроллере если обьем файла будет больше 5MB (которие
 * указани в application.properties)
 *
 *Если ми не хотим обрабативать ошибки(Exeption) в нашем контролере(HomeController) то ми можем их обработать тут
 * в ControllerAdvice !!!
 */
@ControllerAdvice
public class FileUploadExeptionAdvice {

    /**
     * специальная аннотация @ExceptionHandler внутри которой ми пишем какую ощибку ми обрабативаем
     * в даном случае (MaxUploadSizeExceededException.class) !!!
     * @param model
     * @return
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String handleMaxSizeExeption(Model model){
        model.addAttribute("message", "File to large for us!(Maximum 5MB)");
        return "image";
    }

}
