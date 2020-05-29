import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testJsonPath {
    public static void main(String[] args) {

        String filter1 = "$..billingId";
        String filter2 = "$.data[?(@.msisdn!='79011873749')]..contractNum";
        String filter3 = "$.data..[?(@.tariffs.frontName=='Мой онлайн')]..slug";
        Object read = JsonPath.parse(getJsonStr()).read(filter1);
        System.out.println(read);


    }

    public static String getJsonStr (){
        return "{\n" +
                "  \"meta\": {\n" +
                "    \"status\": \"OK\",\n" +
                "    \"message\": null\n" +
                "  },\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"billingId\": \"13489\",\n" +
                "      \"name\": \"Интернет на полуострове\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": null,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Больше никаких непредвиденных расходов – безлимитный интернет на полуострове. Бесплатно подключить услугу можно в любое время – честная абонентская плата 300 рублей списывается только в дни, когда пользуетесь интернетом на полуострове.\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/crimea-unlim\",\n" +
                "      \"categoryId\": \"catYanao40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"crimea-unlim\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"13361\",\n" +
                "      \"name\": \"Безлимит на Tele2\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 5.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 5.00,\n" +
                "      \"slogan\": \"Безлимитные звонки на Tele2 домашнего региона\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/unlimited-within-tele2\",\n" +
                "      \"categoryId\": \"catMsk80001\",\n" +
                "      \"category\": \"Звонки и сообщения\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"unlimited-within-tele2\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"11741\",\n" +
                "      \"name\": \"Безлимитный интернет за границей\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0.0,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Больше никаких непредвиденных расходов – безлимитный интернет в поездках по миру. Бесплатно подключить услугу можно в любое время – честная абонентская плата 350 рублей списывается только в дни, когда пользуетесь интернетом за границей. \",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/internet-unlim-abroad\",\n" +
                "      \"categoryId\": \"catMskTravelDiscounts\",\n" +
                "      \"category\": \"Скидки в поездках\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": \"На тарифе «Премиум» услуга бесплатна.\\r\\nНа тарифе «Мой онлайн+» доступен один день бесплатного пользования услугой в месяц.\\n\\nСтраны и Территории\\n\\nАнтарктида (Вилья-лас-Эстрельяс)\\n\\nЕвропа\\n\\nАвстрия, Акротири и Декелия, Албания, Андорра, Беларусь, Бельгия, Болгария, Босния и Герцеговина, Ватикан, Великобритания, Венгрия, Германия, Греция, Грузия, Дания, Джерси и Гернси, Ирландия, Исландия, Испания, Италия, Кипр, Латвия, Литва, Лихтенштейн, Люксембург, Майо́тта, Македония, Мальта, Молдова, Мэн остров, Нидерланды, Норвегия, Польша, Португалия, Реюньон, Румыния, Сан-Марино, Сербия, Словакия, Словения, Украина, Фарерские острова, Финляндия, Франция, Хорватия, Черногория, Чехия, Швейцария, Швеция, Эстония.\\n\\nАзия\\n\\nАзербайджан, Армения, Афганистан, Бахрейн, Восточный Тимор, Вьетнам, Гонконг, Израиль, Индонезия, Иран, Казахстан, Камбоджа, Катар, Киргизия, Китай, Кувейт, Лаос, Макао, Малайзия, Монголия, Мьянма, Непал, ОАЭ, Оман, Палестина, Саудовская Аравия, Сингапур, Таджикистан, Таиланд, Тайвань, Турция, Узбекистан, Филиппины, Шри-Ланка, Южная Корея, Япония. \\n\\nСеверная и Южная Америка\\n\\nАнгилья, Антигуа и Барбуда, Аргентина, Аруба, Барбадос, Бермудские острова, Бразилия, Британские Виргинские острова, Гайана, Гаити, Гватемала, Гондурас, Гренада, Гренландия, Доминика остров, Доминиканская Республика, Каймановы острова, Канада, Колумбия, Коста-Рика, Куба, Никарагуа, Мексика, Монтсеррат, Панама, Парагвай, Перу, Пуэрто-Рико, Сальвадор, Сент-Винсент и Гренадины, Сент-Китс и Невис острова, Сент-Люсия остров, США, Теркс и Кайкос острова, Уругвай, Чили, Эквадор, Ямайка.\\n\\nАфрика, Австралия и Океания\\n\\nАвстралия, Алжир, Габон, Гамбия, Гана, Демократическая Республика Конго, Египет, Замбия, Западная Сахара, Кот-д`Ивуар, Марокко, Мозамбик, Нигерия, Новая Зеландия, Судан, Сьерра-Леоне,, Танзания, Тунис, Уганда, Фиджи, Эсватини, ЮАР.\\r\\n\",\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"internet-unlim-abroad\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"629\",\n" +
                "      \"name\": \"Запрет уведомлений услуги Информер\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"\",\n" +
                "      \"url\": \"\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"4\",\n" +
                "      \"name\": \"Мобильный интернет\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": false,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"\",\n" +
                "      \"url\": \"\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"10042\",\n" +
                "      \"name\": \"Живой баланс\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 2.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Баланс счета на экране мобильного телефона в режиме реального времени\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/live-balance\",\n" +
                "      \"categoryId\": \"catYanao60005\",\n" +
                "      \"category\": \"Действия с номером\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"live-balance\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"3491\",\n" +
                "      \"name\": \"Кто звонил\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0.50,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Сообщит о пропущенных вызовах\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/who-called\",\n" +
                "      \"categoryId\": \"catMsk60002\",\n" +
                "      \"category\": \"Управление звонками\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"who-called\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"851\",\n" +
                "      \"name\": \"Мелодия для себя\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Установите любимую музыку вместо гудков при всех исходящих вызовах.\",\n" +
                "      \"url\": \"http://gudok.tele2.ru/info/melodyforme\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"2619\",\n" +
                "      \"name\": \"Интернет за рубежом\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 100.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 100.00,\n" +
                "      \"slogan\": \"В странах СНГ, Европы, Азии и Африки\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/internet-cis-europe\",\n" +
                "      \"categoryId\": \"catYarTravelDiscounts\",\n" +
                "      \"category\": \"Скидки в поездках\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"internet-cis-europe\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"30\",\n" +
                "      \"name\": \"Голосовая почта\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Соберет сообщения, если до вас не дозвонились\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/voice-mail\",\n" +
                "      \"categoryId\": \"catMsk60002\",\n" +
                "      \"category\": \"Управление звонками\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"voice-mail\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"2001\",\n" +
                "      \"name\": \"Черный список\",\n" +
                "      \"type\": \"blacklist\",\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 2.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Заблокируйте нежелательные звонки или SMS\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/black-list\",\n" +
                "      \"categoryId\": \"catMsk60003\",\n" +
                "      \"category\": \"Безопасность\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"params\": [\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"00000001\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"00000002\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"00000003\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"000002\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"00000222\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"0sdfsdfsdf\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"4353555555\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"1234567890\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"12345678901\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"3453ssss\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"71110000000\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"cbcbbbb\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"ddgdgggg\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"erterte\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"ghjgh\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"ghjgjjjjjj\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"iopiopio\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"rh2dx\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"sdf44s\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"bnmb4444\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"dfgdg4435\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"sdfe4534d\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"sdfsfff\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"sds222\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"ssdf444\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"ssdfsffff\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"test\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"tyutyufff\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"uiouio\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"xcvvvvv\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"xxvxvxv33\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"number\",\n" +
                "          \"value\": \"zczczcccccc\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"black-list\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"110\",\n" +
                "      \"name\": \"Конференц-связь\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Общение нескольких человек одновременно\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/conference-call\",\n" +
                "      \"categoryId\": \"catMsk60002\",\n" +
                "      \"category\": \"Управление звонками\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"conference-call\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"972\",\n" +
                "      \"name\": \"Я на связи\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Дайте знать, что вы снова на связи\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/on-air\",\n" +
                "      \"categoryId\": \"catMsk60002\",\n" +
                "      \"category\": \"Управление звонками\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"on-air\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"1140\",\n" +
                "      \"name\": \"Запрет денежных переводов\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Запрет перевода денежных средств с мобильного счета за оплату различных товаров и услуг со счета Tele2. Распространяется на Tele2 кошелек, Виртуальную карту Tele2 MasterCard и Денежные переводы.  Не распространяется на \\\"Запрет мобильного перевода\\\"\",\n" +
                "      \"url\": \"https://market.tele2.ru/\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"221\",\n" +
                "      \"name\": \"Запрет получения \\\"Пополни мой счет\\\"\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"CONNECTED\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"canDisconnect\": true,\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {},\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Запрет на получение сообщений с просьбой пополнить счет от абонентов сети Tele2. Услуга предоставляется бесплатно.\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/recharge-my-account\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"214\",\n" +
                "      \"name\": \"Гудок\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 3.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Замените обычные длинные гудки на любимые мелодии\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/gudok\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"gudok\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"1173\",\n" +
                "      \"name\": \"Запрет доступа в интернет\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Запрет доступа в Интернет с мобильного телефона.\",\n" +
                "      \"url\": \"\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"1193\",\n" +
                "      \"name\": \"Добавить трафик\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 120.00,\n" +
                "      \"slogan\": \"Дополнительный 1 ГБ на 30 дней\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/addtraffic-1gb\",\n" +
                "      \"categoryId\": \"catMsk40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"addtraffic-1gb\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"1420\",\n" +
                "      \"name\": \"Добавить трафик (сутки)\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 12.00,\n" +
                "      \"slogan\": \"\",\n" +
                "      \"url\": \"\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"2618\",\n" +
                "      \"name\": \"Разговоры без границ\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 5.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 5.00,\n" +
                "      \"slogan\": \"Принимайте столько звонков, сколько нужно\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/talk-without-borders\",\n" +
                "      \"categoryId\": \"catYarTravelDiscounts\",\n" +
                "      \"category\": \"Скидки в поездках\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"talk-without-borders\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"3007\",\n" +
                "      \"name\": \"Добавить трафик\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": false\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 200.00,\n" +
                "      \"slogan\": \"Дополнительные 3 ГБ на 30 дней\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/addtraffic-3gb\",\n" +
                "      \"categoryId\": \"catMsk40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"addtraffic-3gb\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"4949\",\n" +
                "      \"name\": \"Легкий интернет на полуострове\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 6.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 36.00,\n" +
                "      \"slogan\": \"2,5 рубля за 1 МБ интернет-трафика в Крыму\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/crimea-like-at-home\",\n" +
                "      \"categoryId\": \"catYar40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"crimea-like-at-home\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"6533\",\n" +
                "      \"name\": \"Плюс мессенджеры\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 2.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 2.00,\n" +
                "      \"slogan\": \"Безлимитный доступ к WhatsApp, Viber и ТамТам всего за 2 рубля в день\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/messengers-plus-old\",\n" +
                "      \"categoryId\": \"catMsk40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"messengers-plus-old\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"7758\",\n" +
                "      \"name\": \"Плюс навигация\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 2.50,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 2.50,\n" +
                "      \"slogan\": \"Безлимитный доступ к картам и навигатору\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/plus-navigation\",\n" +
                "      \"categoryId\": \"catYar40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"plus-navigation\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"9109\",\n" +
                "      \"name\": \"Дополнительный 1 ГБ\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": null,\n" +
                "        \"period\": \"month\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Автоматическое продление доступа в интернет после исчерпания пакета по Вашей услуге, включающей интернет-трафик. Оплачивается в момент активации - 1 Гб за 110 руб. Предоставляется 5 пакетов в месяц\",\n" +
                "      \"url\": \"\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"9641\",\n" +
                "      \"name\": \"300 SMS\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 150.00,\n" +
                "        \"period\": \"month\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Пакет SMS за абонентскую плату\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/300-sms\",\n" +
                "      \"categoryId\": \"catMsk80001\",\n" +
                "      \"category\": \"Звонки и сообщения\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"300-sms\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"9644\",\n" +
                "      \"name\": \"100 SMS\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 70.00,\n" +
                "        \"period\": \"month\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Пакет SMS за абонентскую плату\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/100-sms\",\n" +
                "      \"categoryId\": \"catMsk80001\",\n" +
                "      \"category\": \"Звонки и сообщения\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"100-sms\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"11057\",\n" +
                "      \"name\": \"Простая география\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 2.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 30.00,\n" +
                "      \"slogan\": \"Выгодные звонки за рубеж\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/easy-geo\",\n" +
                "      \"categoryId\": \"catMsk80001\",\n" +
                "      \"category\": \"Звонки и сообщения\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"easy-geo\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"11178\",\n" +
                "      \"name\": \"Безопасный режим\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 6.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Комплексная защита телефона от WEB-подписок, вирусов в интернете, SMS-спама и SMS-рекламы\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/safe-mode\",\n" +
                "      \"categoryId\": \"catYanao60003\",\n" +
                "      \"category\": \"Безопасность\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"safe-mode\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"11226\",\n" +
                "      \"name\": \"Мои знакомства\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 2.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 2.00,\n" +
                "      \"slogan\": \"Безлимитный доступ к сервисам знакомств\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/my-datings\",\n" +
                "      \"categoryId\": \"catYar40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"my-datings\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"13630\",\n" +
                "      \"name\": \"Пакет 1 ГБ\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 6.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"url\": \"https://msk.tele2.ru/option/package-1gb\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"package-1gb\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"13635\",\n" +
                "      \"name\": \"1 ГБ\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 120.00,\n" +
                "        \"period\": \"month\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"url\": \"https://msk.tele2.ru/option/1-gb\",\n" +
                "      \"categoryId\": \"catMsk40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"1-gb\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"13636\",\n" +
                "      \"name\": \"3 ГБ\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 200.00,\n" +
                "        \"period\": \"month\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"url\": \"https://msk.tele2.ru/option/3-gb\",\n" +
                "      \"categoryId\": \"catMsk40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"3-gb\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"13640\",\n" +
                "      \"name\": \"День в сети\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 20.0,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Платите за интернет только в дни его фактического использования\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/day-in-internet\",\n" +
                "      \"categoryId\": \"catMsk40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"day-in-internet\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"13645\",\n" +
                "      \"name\": \"Интернет с телефона\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 6.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 6.00,\n" +
                "      \"slogan\": \"Интернет на каждый день\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/internet-phone\",\n" +
                "      \"categoryId\": \"catMsk40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"internet-phone\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"13672\",\n" +
                "      \"name\": \"20 SMS по России\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 1.02,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 30.00,\n" +
                "      \"url\": \"https://msk.tele2.ru/option/add-20-sms\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"add-20-sms\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"15632\",\n" +
                "      \"name\": \"Второй номер\",\n" +
                "      \"type\": \"virtual_number\",\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 50.00,\n" +
                "        \"period\": \"month\"\n" +
                "      },\n" +
                "      \"changePrice\": 50.00,\n" +
                "      \"slogan\": \"Второй номер на вашей SIM-карте для входящих звонков и SMS\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/second-number\",\n" +
                "      \"categoryId\": \"catMsk60005\",\n" +
                "      \"category\": \"Действия с номером\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"second-number\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"18064\",\n" +
                "      \"name\": \"Месяц интернета в путешествиях\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 1500.00,\n" +
                "      \"slogan\": \"Делитесь с друзьями и близкими впечатлениями в своих поездках по миру. Путешествуйте без забот!\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/internet-month-travel\",\n" +
                "      \"categoryId\": \"catYarTravelDiscounts\",\n" +
                "      \"category\": \"Скидки в поездках\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"internet-month-travel\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"18671\",\n" +
                "      \"name\": \"Ежедневные награды в играх\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 5.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Подключите услугу и получите доступ к развлекательному контенту – ежедневной награде в онлайн-игре «Мир кораблей» в виде одного контейнера «Испытай удачу».\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/daily-award\",\n" +
                "      \"categoryId\": \"catYarGames\",\n" +
                "      \"category\": \"Игры\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"daily-award\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"18672\",\n" +
                "      \"name\": \"Награды в играх каждый месяц\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 120.00,\n" +
                "        \"period\": \"month\"\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Подключите услугу и получите доступ к развлекательному контенту – ежемесячной награде в онлайн-игре «Мир кораблей» в виде премиум-эсминца V уровня в аренду на 30 дней.\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/monthly-award\",\n" +
                "      \"categoryId\": \"catYarGames\",\n" +
                "      \"category\": \"Игры\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": true,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"ACTIVATE_DATE_CUSTOM_PERIOD_PREPAID\",\n" +
                "      \"slug\": \"monthly-award\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"2687\",\n" +
                "      \"name\": \"Интернет за рубежом\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 300.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 300.00,\n" +
                "      \"slogan\": \"В остальных странах\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/internet-abroad\",\n" +
                "      \"categoryId\": \"catYarTravelDiscounts\",\n" +
                "      \"category\": \"Скидки в поездках\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"internet-abroad\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"112\",\n" +
                "      \"name\": \"Антиопределитель номера\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 3.10,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 3.10,\n" +
                "      \"slogan\": \"Скроет ваш номер при звонках\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/clir\",\n" +
                "      \"categoryId\": \"catYar60003\",\n" +
                "      \"category\": \"Безопасность\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"clir\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"1232\",\n" +
                "      \"name\": \"Определитель умышленно скрытых номеров\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 6.00,\n" +
                "        \"period\": \"day\"\n" +
                "      },\n" +
                "      \"changePrice\": 100.00,\n" +
                "      \"slogan\": \"Узнайте номер того, кто вам звонит, даже если он специально скрыт\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/anti-clir\",\n" +
                "      \"categoryId\": \"catYar60003\",\n" +
                "      \"category\": \"Безопасность\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"anti-clir\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"1071\",\n" +
                "      \"name\": \"Запрет мобильного перевода\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": true\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 0.00,\n" +
                "      \"slogan\": \"Запрет на использование услуги \\\"Мобильный перевод\\\". Услуга предоставляется бесплатно.\",\n" +
                "      \"url\": \"\",\n" +
                "      \"categoryId\": null,\n" +
                "      \"category\": \"Прочее\",\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"billingId\": \"3643\",\n" +
                "      \"name\": \"Добавить трафик\",\n" +
                "      \"type\": null,\n" +
                "      \"status\": \"AVAILABLE\",\n" +
                "      \"disconnectionAvailabilityStatus\": {\n" +
                "        \"disconnectOrdered\": false\n" +
                "      },\n" +
                "      \"connectionAvailabilityStatus\": {\n" +
                "        \"canConnect\": false\n" +
                "      },\n" +
                "      \"abonentFee\": {\n" +
                "        \"amount\": 0,\n" +
                "        \"period\": null\n" +
                "      },\n" +
                "      \"changePrice\": 250.00,\n" +
                "      \"slogan\": \"Дополнительные 5 ГБ на 30 дней\",\n" +
                "      \"url\": \"https://msk.tele2.ru/option/addtraffic-5gb\",\n" +
                "      \"categoryId\": \"catMsk40006\",\n" +
                "      \"category\": \"Интернет\",\n" +
                "      \"categoryPriority\": 0,\n" +
                "      \"migrated\": false,\n" +
                "      \"descriptionMigrated\": null,\n" +
                "      \"mobileDescription\": null,\n" +
                "      \"popupInfoTextDisconnection\": null,\n" +
                "      \"popupInfoTextConnection\": null,\n" +
                "      \"abonentFeeAtConnection\": false,\n" +
                "      \"redirectLink\": null,\n" +
                "      \"showConnectButton\": true,\n" +
                "      \"showDisconnectButton\": true,\n" +
                "      \"currentPeriodAbonentFee\": null,\n" +
                "      \"abonentFeeChargeType\": \"OTHER_CHARGE_METHOD\",\n" +
                "      \"slug\": \"addtraffic-5gb\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}

