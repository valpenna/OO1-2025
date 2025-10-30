package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
//	“Retorna la fecha de inicio del rango”

	public LocalDate getTo() {
		return this.to;
	}
//	“Retorna la fecha de fin del rango”

	public int sizeInDays() {
		int dias = (int) ChronoUnit.DAYS.between(from, to);
		return dias;
	}
//	“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”

	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(to);
	}
//	“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.

	public boolean overlaps(DateLapse anotherDateLapse) {
		return !(
		        this.getTo().isBefore(anotherDateLapse.getFrom()) ||
		        anotherDateLapse.getTo().isBefore(this.getFrom())
		    );
	}
//  Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro


}
