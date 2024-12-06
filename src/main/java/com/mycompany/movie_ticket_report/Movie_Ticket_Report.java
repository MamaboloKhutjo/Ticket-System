/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.movie_ticket_report;

/**
 *
 * @author RC_Student_lab
 */
public class Movie_Ticket_Report{

    public static void main(String[] args) {
         String[] movies = {"Napoleon", "Oppenheimer"};

        int[][] ticketSales = {{3000, 1500, 1700}, {3500, 1200, 1600}};

        int[] totalSales = new int[movies.length];
        
        iMovieTickets tickets = new MovieTickets() ;

        for (int i = 0; i < ticketSales.length; i++) {
            totalSales[i] = tickets.TotalMovieSales(ticketSales[i]);
        }

        
        System.out.println("Movie Ticket Sales Report - 2024");
        System.out.printf("%-15s%-15s%-15s%-15s%n", " ", "Jan", "Feb", "Mar");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-15s", movies[i]);

            for (int j = 0; j < ticketSales[i].length; j++) {
                System.out.printf("%-15d", ticketSales[i][j]);
            }
            System.out.println();
        }


        System.out.println(" ");
        String topMovie = tickets.TopMovie(movies, totalSales);
        System.out.println("Top Performing Movie: " + topMovie);
    }
}
