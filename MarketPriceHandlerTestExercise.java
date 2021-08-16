package MarketPriceHandler;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;

public class MarketPriceHandlerTestExercise {

    public static void main(String args[]) throws CsvValidationException, IOException {

        CSVHelper.loadDataFromCSV("C:\\Users\\mgomez\\Desktop\\a.csv");
        CSVHelper.showingInformationToTheCustomer();
        CSVHelper.commission();

    }

}
