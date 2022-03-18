package SoulCodeAcademy.ReservasHotel.Services;

import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoulCodeAcademy.ReservasHotel.Models.Reserva;
import SoulCodeAcademy.ReservasHotel.Repositories.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	ReservaRepository reservaRepository;
	
	public int calcularDias(String nome) {
		Optional<Reserva> reserva = reservaRepository.findBynomeReserva(nome);
		return Period.between(reserva.get().getDataCheckin(), reserva.get().getDataCheckout()).getDays();
	}
}
