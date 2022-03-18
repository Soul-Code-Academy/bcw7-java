package SoulCodeAcademy.ReservasHotel;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import SoulCodeAcademy.ReservasHotel.Models.Reserva;
import SoulCodeAcademy.ReservasHotel.Repositories.ReservaRepository;
import SoulCodeAcademy.ReservasHotel.Services.ReservaService;

@RunWith(SpringRunner.class)
public class ReservaServiceTeste {
	
	@TestConfiguration
	static class ReservaServiceTesteConfig{
		
		@Bean
		public ReservaService reservaService() {
			return new ReservaService();
		}
	}
	
	@Autowired
	ReservaService reservaService;
	
	@MockBean
	ReservaRepository reservaRepository;
	
	@Test
	public void reservaTesteServiceCalcularDias(){
		String nome = "Alana";
		Integer dias = reservaService.calcularDias(nome);	
		Assertions.assertEquals(dias, 10);
	}
	
	@Before
	public void setup() {
		LocalDate checkIn = LocalDate.parse("2022-06-05");
		LocalDate checkOut = LocalDate.parse("2022-06-15");
		Reserva reserva = new Reserva("1", "Alana", checkIn, checkOut, 2);
	    Mockito.when(reservaRepository.findBynomeReserva(reserva.getNomeReserva()))
	    .thenReturn(java.util.Optional.of(reserva));
		
	}
}
