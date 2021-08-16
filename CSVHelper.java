package MarketPriceHandler;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper {

    public static List<SharePriceData> SHAREDATA_LIST = new ArrayList<>();

    public static void loadDataFromCSV(String fileName) throws IOException, CsvValidationException {

        CSVReader reader = new CSVReader(new FileReader(fileName));
        String[] row;

        while ((row = reader.readNext()) != null) {
            for (int i = 0; i < row.length; i++) {
                String information = row[i];
                dataProcessor(information);
            }

        }
    }
    private static void dataProcessor(String dataInformation) {
        String[] data = dataInformation.split(",");

        String ID = data[0];
        String currency = data[1];
        String price1 = data[2];
        String price2 = data[3];
        String date = data[4];

        SharePriceData sharePriceData = new SharePriceData(Integer.parseInt(ID), currency, Float.parseFloat(price1), Float.parseFloat(price2), date);

        SHAREDATA_LIST.add(sharePriceData);

    }
    public static void showingInformationToTheCustomer() {

        int aux = 0;

        List<SharePriceData> auxList = SHAREDATA_LIST;

        for(int i = 0; i < auxList.size(); i++){
            if(auxList.get(i).getID() > aux){
                aux = auxList.get(i).getID();
            }
        }
        for (SharePriceData e : auxList){
            if (e.getID() == aux){
                System.out.println(e.toString());
            }
        }
    }
    public static void commission(){

        List<SharePriceData> auxList = SHAREDATA_LIST;

        for(SharePriceData e : auxList){
            Assert.assertTrue(e.getPrice1()< e.getPrice2());
            float total1 = (float) (e.getPrice1() - (e.getPrice1() * 0.1));
            float total2 = (float) (e.getPrice2() + (e.getPrice2() * 0.1));
            e.setPrice1(total1);
            e.setPrice2(total2);
        }

    }
}
