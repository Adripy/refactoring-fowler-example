package ubu.gii.dass.refactoring;

public class ChildrensPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;

	}

	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
