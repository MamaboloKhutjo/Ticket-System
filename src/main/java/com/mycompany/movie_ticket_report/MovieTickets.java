/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movie_ticket_report;

/**
 *
 * @author RC_Student_lab
 */
public class MovieTickets implements iMovieTickets{
    
    // Calculate the total sales for a single movie
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }

    // Determine the top-performing movie based on total sales
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int maxSales = totalSales[0];
        int topMovieIndex = 0;

        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topMovieIndex = i;
            }
        }
        return movies[topMovieIndex] ;
    }
}
