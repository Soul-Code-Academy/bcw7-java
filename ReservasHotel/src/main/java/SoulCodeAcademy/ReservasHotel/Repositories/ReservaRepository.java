package SoulCodeAcademy.ReservasHotel.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import SoulCodeAcademy.ReservasHotel.Models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva,String>{
	
	Optional<Reserva> findBynomeReserva(String nome);
}
