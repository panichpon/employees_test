package com.zyntelligent.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
	@RequestMapping(value = "/errors", method = RequestMethod.GET)
    public ModelAndView renderErrorPage(HttpServletRequest request) {
         
        ModelAndView errorPage = new ModelAndView("errorPage");
        String errorMsg = "";
        int httpErrorCode = getErrorCode(request);
 
        switch (httpErrorCode) {
            case 400: {
                //errorMsg = "Http Error Code: 400. Bad Request";
            	errorMsg = "Bad Request";
                break;
            }
            case 401: {
                //errorMsg = "Http Error Code: 401. Unauthorized";
            	errorMsg = "Unauthorized";
                break;
            }
            case 404: {
                //errorMsg = "Http Error Code: 404. Resource not found";
            	errorMsg = "Resource not found";
                break;
            }
            case 500: {
                //errorMsg = "Http Error Code: 500. Internal Server Error";
            	errorMsg = "Internal Server Error";
                break;
            }
        }
        errorPage.addObject("code", httpErrorCode);
        errorPage.addObject("errorMsg", errorMsg);
        return errorPage;
    }
     
    private int getErrorCode(HttpServletRequest request) {
        return (Integer) request.getAttribute("javax.servlet.error.status_code");
    }
}
