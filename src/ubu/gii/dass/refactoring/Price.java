package ubu.gii.dass.refactoring;

abstract class Price {
	abstract int getPriceCode();

	abstract double getCharge(int daysRented);
	
	abstract int getFrequentRenterPoints(int daysRented);
}
