package SevenHomeWork;


import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {

public int indexOf(String content, String currencyName)
        return 0;
    }
    try{
        FileWriter writer = new FileWriter("notes.txt", false))
        catch(IOException ex){
            System.out.println(ex.getMessage);
        }

    }
}
