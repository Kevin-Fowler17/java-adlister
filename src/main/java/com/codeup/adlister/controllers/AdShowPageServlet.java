package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.AdShowPageServlet", urlPatterns = "/ads/showad")
public class AdShowPageServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Ad ad = DaoFactory.getAdsDao().findByAdId(request.getParameter("id"));
        User user = DaoFactory.getUsersDao().findByUserId(request.getParameter("uid"));

//        System.out.println(ad.getId());
//        System.out.println(ad.getTitle());
//        System.out.println(ad.getDescription());
//        System.out.println(ad.getUserId());

//        System.out.println(user.getId());
//        System.out.println(user.getUsername());
//        System.out.println(user.getEmail());
//        System.out.println(user.getPassword());

        request.getSession().setAttribute("viewAd", ad);
        request.getSession().setAttribute("userAd", user);

        request.getRequestDispatcher("/WEB-INF/ads/showAd.jsp").forward(request, response);
    }

}
