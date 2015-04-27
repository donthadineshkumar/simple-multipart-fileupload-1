package com.fileupload;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/*@WebServlet(urlPatterns={"/upload"})
@MultipartConfig(location="/tmp", fileSizeThreshold=1024*1024,
maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)*/
public class MyFileUploadServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			for(Part part: req.getParts()){
					try {
						part.write("resume");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw e;
					}
				}
			}

	}

