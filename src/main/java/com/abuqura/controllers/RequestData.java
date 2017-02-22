/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abuqura.controllers;

import com.abuqura.entities.jacksonBeans.JsonRootBean;
import com.abuqura.utilities.Utilties;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abuqura
 */
public class RequestData extends HttpServlet {

    final String currentDateFormat = "MM/dd/yyyy";
    final String newDateFormat = "yyyy-MM-dd";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
        try {

            PrintWriter out = response.getWriter();
            String city = request.getParameter("city");
            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");

            //Date format
            SimpleDateFormat sdf = new SimpleDateFormat(currentDateFormat);
            Date start = sdf.parse(startDate);
            Date end = sdf.parse(endDate);
            sdf.applyPattern(newDateFormat);
            startDate = sdf.format(start);
            endDate = sdf.format(end);
            //Json API
            String url = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationCity=#CITY#&minTripStartDate=:#STARTDATE#&maxTripStartDate=:#ENDDATE#";
            //Add city, start and end date
            url = Utilties.prepareURL(url, city, startDate, endDate);
            //Call json API
            String result = Utilties.httpGetData(url);
            // parse json using jackson library
            ObjectMapper mapper = new ObjectMapper();
            JsonRootBean jsonHotelInfo = mapper.readValue(result, JsonRootBean.class);
            request.setAttribute("jsonRootBean", jsonHotelInfo);
            String nextJSP = "/hotels.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request, response);

        } catch (Exception e) {
            String nextJSP = "/error.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            try {
                dispatcher.forward(request, response);
            } catch (Exception ex) {
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
