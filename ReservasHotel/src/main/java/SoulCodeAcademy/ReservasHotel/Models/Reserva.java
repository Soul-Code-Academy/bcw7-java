package SoulCodeAcademy.ReservasHotel.Models;

import java.time.LocalDate;

public class Reserva {
	
	private String id;
	private String nomeReserva;
	private LocalDate dataCheckin;
	private LocalDate dataCheckout;
	private Integer quantidadeHospedes;
	
	public Reserva(String id, String nomeReserva, LocalDate dataCheckin, LocalDate dataCheckout,Integer quantidadeHospedes) {
		super();
		this.id = id;
		this.nomeReserva = nomeReserva;
		this.dataCheckin = dataCheckin;
		this.dataCheckout = dataCheckout;
		this.quantidadeHospedes = quantidadeHospedes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeReserva() {
		return nomeReserva;
	}

	public void setNomeReserva(String nomeReserva) {
		this.nomeReserva = nomeReserva;
	}

	public LocalDate getDataCheckin() {
		return dataCheckin;
	}

	public void setDataCheckin(LocalDate dataCheckin) {
		this.dataCheckin = dataCheckin;
	}

	public LocalDate getDataCheckout() {
		return dataCheckout;
	}

	public void setDataCheckout(LocalDate dataCheckout) {
		this.dataCheckout = dataCheckout;
	}

	public Integer getQuantidadeHospedes() {
		return quantidadeHospedes;
	}

	public void setQuantidadeHospedes(Integer quantidadeHospedes) {
		this.quantidadeHospedes = quantidadeHospedes;
	}

	
}
