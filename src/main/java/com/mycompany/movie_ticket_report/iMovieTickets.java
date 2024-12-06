/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.movie_ticket_report;

/**
 *
 * @author RC_Student_lab
 */
public interface iMovieTickets {
    int TotalMovieSales(int[]movieTicketSales);
    String TopMovie(String[] movies, int[] totalSales);
}
