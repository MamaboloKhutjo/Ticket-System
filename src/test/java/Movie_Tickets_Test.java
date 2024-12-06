/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.movie_ticket_report.MovieTickets;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class Movie_Tickets_Test {
    
    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        int[] sales = {3000, 1500, 1700};
        MovieTickets movieTickets = new MovieTickets();
        int result = movieTickets.TotalMovieSales(sales);
       
        int expectedTotalSales = 3000 + 1500 + 1700; // Expected total sales
        assertEquals(expectedTotalSales, result);
    }
    
    @Test
    public void TopMovieSales_returnsTopMovie() {
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6800}; 

        MovieTickets movieTickets = new MovieTickets();
        String result = movieTickets.TopMovie(movies, totalSales);

        String expectedTopMovie = "Oppenheimer";
        assertEquals(expectedTopMovie, result, "The top movie should be Oppenheimer.");
    }
}
