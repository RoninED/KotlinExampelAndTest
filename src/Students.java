
import com.jayway.jsonpath.JsonPath;
import org.omg.CORBA.Any;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

/*
Смотреть тесты в:

- Раздел 4 - 1 вопрос

- Раздел 5:
    тест 1 - 2 вопроса
    тест 2 - 2 вопроса

- Раздел 6 - 1 вопрос

- Итоговый тест
 */

public class Students {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текущий курс: ");
        double x = sc.nextDouble();
        System.out.print("Введите сумму: ");
        double y = sc.nextDouble();
        double z = x * y;
        double i = Math.round(z* 100.0) / 100.0;
        System.out.print("Сумма в валюте: " + i  + " $");
    }
}