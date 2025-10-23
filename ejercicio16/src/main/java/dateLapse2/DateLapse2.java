package dateLapse2;

import java.time.LocalDate;

public class DateLapse2 {
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
//	“Retorna la fecha de inicio del rango”

	public LocalDate getTo() {
		return this.from.plusDays(sizeInDays);
	}
//	“Retorna la fecha de fin del rango”

	public int sizeInDays() {
		return this.sizeInDays;
	}
//	“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”

	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(from.plusDays(sizeInDays));
	}
//	“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.



}
