/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.challenge;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;



/**
 *
 * @author masashi
 */
public class Fortune extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String luckList[] = {"大吉", "中吉", "小吉", "吉", "半吉", "末小吉", "凶", " 小凶", "半凶", "末凶", "大凶" };
        
        Random rand = new Random();
        
        Integer index = rand.nextInt(luckList.length);
        
       if(index == 0){
            out.print("あなたの今日の運勢は・・・ 大吉 です!");
        }else if(index == 1){
            out.print("あなたの今日の運勢は・・・ 中吉 です!");
        }else if(index == 2){
            out.print("あなたの今日の運勢は・・・ 小吉 です!");
        }else if(index == 3){
            out.print("あなたの今日の運勢は・・・ 吉 です!");
        }else if(index == 4){
            out.print("あなたの今日の運勢は・・・ 半吉 です!");
        }else if(index == 5){
            out.print("あなたの今日の運勢は・・・ 半小吉 です!");
        }else if(index == 6){
            out.print("あなたの今日の運勢は・・・ 凶 です!");
        }else if(index == 7){
            out.print("あなたの今日の運勢は・・・ 小凶 です!");
        }else if(index == 8){
            out.print("あなたの今日の運勢は・・・ 半凶 です!");
        }else if(index == 9){
            out.print("あなたの今日の運勢は・・・ 末凶 です!");
        }else{
            out.print("あなたの今日の運勢は・・・ 大凶 です!");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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

