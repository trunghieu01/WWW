package com.example.ex4;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

@WebServlet(name = "MultiFilesUploadServlet", value = "/upload-servlet")
@MultipartConfig(
        location = "D:\\java-workspace/www/Lap1_2",
        fileSizeThreshold = 1024,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50
)
public class MultiFilesUploadServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try {
           Part part = request.getPart("file1");
           part.write(getFileName(part));
       }catch (Exception e){
           request.setAttribute("message", "Error");
       }
        request.setAttribute("message", "Successfull");
       request.getRequestDispatcher("result.jsp").forward(request,response);
    }

    private String getFileName(Part part){
        String content  = part.getHeader("content-disposition");
        if (!content.contains("filename="))
            return null;
        return content.substring(content.indexOf("filename=")+10, content.length()-1);
    }

}


