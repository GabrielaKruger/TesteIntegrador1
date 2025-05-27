package utils;

import util.Formato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataUtils {

    public static String DataAtual() {
        return LocalDate.now().format(Formato.diaMesAno);
    }

    public static String DataAtualMesAno() {
        return LocalDate.now().format(Formato.mesAno);
    }

    public static String DataPosterior(int dias) {
        return LocalDate.now().plusDays(dias).format(Formato.diaMesAno);
    }

    public static String DataRetroativo(int dias) {
        return LocalDate.now().minusDays(dias).format(Formato.diaMesAno);
    }

    public static String DataMesAnoAtual() { return LocalDate.now().format(Formato.mesAno); }

    public static String getPrimeiroDiaDoMesAtual() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate primeiroDiaDoMes = dataAtual.withDayOfMonth(1);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return primeiroDiaDoMes.format(formato);
    }

    public static String getUltimoDiaDoMesAtual() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate primeiroDiaDoMes = dataAtual.withDayOfMonth(30);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return primeiroDiaDoMes.format(formato);
    }

    //ex: "Jan", "Fev", "Mar"
    public static String getMesAtualAbreviado() {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM", new Locale("pt", "BR"));
        return dataAtual.format(formatter);
    }

}
