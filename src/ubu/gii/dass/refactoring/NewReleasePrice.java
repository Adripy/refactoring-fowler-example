package ubu.gii.dass.refactoring;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	double getCharge(int daysRented) {
		return daysRented * 3;
	}

	int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1) 
		{
			return 2;
		}
		else 
		{
			return 1;
		}
	}

}
