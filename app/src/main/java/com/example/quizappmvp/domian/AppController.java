package com.example.quizappmvp.domian;

import com.example.quizappmvp.data.model.CategoryEnum;
import com.example.quizappmvp.data.model.QuestionData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppController {
    static AppController intanse;
    private CategoryEnum categoryEnum;
    private List<QuestionData> list = new ArrayList<>();

    private AppController() {
    }

    ;

    public static AppController getIntanse() {
        if (intanse == null) intanse = new AppController();
        return intanse;
    }

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
        loadQuestion();
    }

    public List<QuestionData> getQuestionByCategory() {
        Collections.shuffle(list);
        return list.subList(0, 10);
    }

    private void loadQuestion() {
        list.clear();
        switch (categoryEnum) {
            case MATEMATIKA:
                // Savol 1
                list.add(new QuestionData("Quyidagi ifodaning ishorasini hisoblang: 3x + 2y - x + 4y",
                        "a) 2x + 6y",
                        "b) 4x + 6y",
                        "c) 2x + 2y",
                        "d) 4x + 2y",
                        "c) 2x + 6y"));

                // Savol 2
                list.add(new QuestionData("5^2 + 3 * 4 - 7 qiymatini toping",
                        "a) 20",
                        "b) 28",
                        "c) 30",
                        "d) 33",
                        "b) 28"));

                // Savol 3
                list.add(new QuestionData("2x + 5 = 11 tenglamani yeching",
                        "a) x = 3",
                        "b) x = 4",
                        "c) x = 6",
                        "d) x = 7",
                        "a) x = 3"));

                // Savol 4
                list.add(new QuestionData("144 ning ildizi qancha?",
                        "a) 10",
                        "b) 12",
                        "c) 14",
                        "d) 16",
                        "b) 12"));

                // Savol 5
                list.add(new QuestionData("6 x 4 hajmli to'g'ri to'rtburchakning maydonini toping",
                        "a) 12",
                        "b) 20",
                        "c) 24",
                        "d) 30",
                        "c) 24"));

                // Savol 6
                list.add(new QuestionData("3(x + 2) = 15 tenglamani yeching",
                        "a) x = 3",
                        "b) x = 4",
                        "c) x = 5",
                        "d) x = 6",
                        "c) x = 5"));

                // Savol 7
                list.add(new QuestionData("80 ning 30% ni toping",
                        "a) 24",
                        "b) 26",
                        "c) 28",
                        "d) 30",
                        "a) 24"));

                // Savol 9
                list.add(new QuestionData("Keyingi sonni toping: 2, 5, 9, 14, ___",
                        "a) 18",
                        "b) 20",
                        "c) 22",
                        "d) 24",
                        "a) 18"));

                // Savol 10
                list.add(new QuestionData("Agar 3x + 2 = 11, x qiymati qancha?",
                        "a) x = 1",
                        "b) x = 3",
                        "c) x = 4",
                        "d) x = 5",
                        "b) x = 3"));

                list.add(new QuestionData("Savol: 3x + 5 = 17 tenglama uchun x qiymati qanday bo'ladi?",
                        "a) 4", "b) 6", "c) 7", "d) 8", "a) 4"));
                list.add(new QuestionData("Savol: To'g'ri to'rtburchakning uzunligi 12 m  va kengligi 5 m bo'lsa, yuzasi qancha m2 bo'ladi?",
                        "a) 17", "b) 60", "c) 30", "d) 24", "b) 60"));
                list.add(new QuestionData("Savol: Aylananaing radiusi 5 m bo'lsa, uning uzunligi qancha  bo'ladi? (π = 3.14 deb hisoblang)",
                        "a) 10π", "b) 15π", "c) 25π", "d) 30π", "a) 10π"));
                list.add(new QuestionData("Savol: 2x + 3 = 11 tenglama uchun x qiymati qanday bo'ladi?",
                        "a) 3", "b) 4", "c) 5", "d) 6", "b) 4"));
                list.add(new QuestionData("Savol: Uchburchakning ikkita tomoni 6 bir va 8 bir bo'lsa, uchburchakning uchinchi tomoni qancha bir bo'ladi?",
                        "a) 8", "b) 9", "c) 10", "d) 12", "c) 10"));
                list.add(new QuestionData("Savol: 64 sonining kvadrat ildizi qanday?",
                        "a) 6", "b) 8", "c) 10", "d) 12", "b) 8"));
                list.add(new QuestionData("Savol: Doira radiusi 10 bir bo'lsa, uning yuzasi qancha bir bo'ladi? (π = 3.14 deb hisoblang)",
                        "a) 314", "b) 628", "c) 100π", "d) 200π", "d) 200π"));
                list.add(new QuestionData("Savol: 125 ning kub ildizi qanday",
                        "a) 25", "b) 5", "c) 15 ", "d) 125", "b) 5"));
                list.add(new QuestionData("Savol: 9 ga 6 qo'shilsa, natija qanday bo'ladi?",
                        "a) 10", "b) 14", "c) 15", " d) 16", "c) 15"));
                list.add(new QuestionData("Savol: 40 ni 25 ga bo'lganda qoldiq qanday?",
                        "a) 15", "b) 20 ", "c) 5", "d) 25", "a) 15"));
                // Savol 1
                list.add(new QuestionData("Quyidagi ifodani oddiy shaklda ifodalang: 3x + 2y - x + 4y",
                        "a) 2x + 6y",
                        "b) 4x + 6y",
                        "c) 2x + 2y",
                        "d) 4x + 2y",
                        "a) 2x + 6y"));

                // Savol 2
                list.add(new QuestionData("5^2 + 3 * 4 - 7 qiymati qanday bo'ladi?",
                        "a) 20",
                        "b) 28",
                        "c) 30",
                        "d) 33",
                        "b) 28"));

                // Savol 3
                list.add(new QuestionData("x ni quyidagi tenglamadan toping: 2x + 5 = 11",
                        "a) x = 3",
                        "b) x = 4",
                        "c) x = 6",
                        "d) x = 7",
                        "a) x = 3"));

                // Savol 4
                list.add(new QuestionData("144 ning ildizsini toping?",
                        "a) 10",
                        "b) 12",
                        "c) 14",
                        "d) 16",
                        "b) 12"));

                // Savol 5
                list.add(new QuestionData("Uzunligi 6 va eni 4 bo'lgan to'g'ri burchakli to'g'ri to'rtburchakning yuzini toping.",
                        "a) 12",
                        "b) 20",
                        "c) 24",
                        "d) 30",
                        "a) 24"));

                // Savol 6
                list.add(new QuestionData("Tenglama: 3(x + 2) = 15 ni yeching.",
                        "a) x = 3",
                        "b) x = 4",
                        "c) x = 5",
                        "d) x = 6",
                        "c) x = 5"));

                // Savol 7
                list.add(new QuestionData("80 ning 30% ni toping?",
                        "a) 24",
                        "b) 26",
                        "c) 28",
                        "d) 30",
                        "a) 24"));

                // Savol 8
                list.add(new QuestionData("Agar mashina soatiga 60 mil o'tsa, 3 soatda qancha masofa bosadi?",
                        "a) 120 mil",
                        "b) 150 mil",
                        "c) 180 mil",
                        "d) 200 mil",
                        "c) 180 mil"));
                list.add(new QuestionData("Kvadratning yuzasi 144 kvadrat birlik. Kvadratning tomon uzunligi qanday?",
                        "a) 12", "b) 24", "c) 36", "d) 48", "c) 36"));
                list.add(new QuestionData("To'g'ri burchakli uchburchakning burchaklar yig'indisi qanchadir?",
                        "a) 90°", "b) 180°", "c) 270°", "d) 360°", "d) 360°"));
                list.add(new QuestionData("Oltita tomonli yulduzning burchaklar yig'indisi qanchadir?",
                        "a) 120°", "b) 180°", "c) 240°", "d) 360°", "b) 180°"));
                list.add(new QuestionData("Radiusi 5 birlik bo'lgan aylananing uzunligi qanday?",
                        "a) 5π", "b) 10π", "c) 15π", "d) 25π", "b) 10π"));
                list.add(new QuestionData("Kubning hajmi 27 birlik. Kubning bir tomoni uzunligi qanchadir?",
                        "a) 3", "b) 6", "c) 9", "d) 27", "a) 3"));
                list.add(new QuestionData("Katetlari uzunligi 3 va 4 bo'lgan uchburchakning gipotenuzasi uzunligi qanchadir?",
                        "a) 5", "b) 6", "c) 7", "d) 8", "a) 5"));
                list.add(new QuestionData("Bir burchakki muzlatgichning o'rta nuqtasi burchak kesishuvining tarmoqaro joylashgan shakli?",
                        "a) ikki yarim doira", "b) ikki nuqta", "c) kvadrat", "d) to'g'ri chiziq", "a) ikki yarim doira"));
                list.add(new QuestionData("Simmetriyasi qanchalik ikki tomoni teng bo'lgan to'rtburchakning burchaklari yig'indisi?",
                        "a) 180°", "b) 360°", "c) 540°", "d) 720°", "b) 360°"));
                list.add(new QuestionData("Ikki uzun tomoni bo'lgan to'rtburchakka necha diagonal chizish mumkin?",
                        "a) 1", "b) 2", "c) 3", "d) 4", "c) 3"));
                list.add(new QuestionData("Katetlari 6 va 8 bo'lgan uchburchakka o'rta perpendikulyar chiziq chizilsa, uning uzunligi qanchadir?",
                        "a) 6", "b) 7", "c) 8", "d) 10", "d) 10"));
                list.add(new QuestionData("Ikki tomoni teng to'rtburchakning yuzi 32 kvadrat birligiga teng. Bir tomoni 4 birlik. Yon tomonining uzunligi qanday?",
                        "a) 2", "b) 4", "c) 6", "d) 8", "b) 4"));
                list.add(new QuestionData("Burchaklar yarim aylanalarni ajratadigan tomonlar qanchalik bo'lishi kerak?",
                        "a) 10", "b) 20", "c) 30", "d) 40", "c) 30"));
                list.add(new QuestionData("O'rtasiga perpendikulyar chiziq chizilgan uchburchakka  necha perpendikulyar chiziq chizish mumkin?",
                        "a) 0", "b) 1", "c) 2", "d) 3", "c) 2"));
                list.add(new QuestionData("Radiusi 5 birlik bo'lgan aylananing uzunligi qanday?",
                        "a) 5π", "b) 10π", "c) 15π", "d) 25π", "b) 10π"));
                list.add(new QuestionData("Kubning hajmi 27 birlik. Kubning bir tomoni uzunligi qanchadir?",
                        "a) 3", "b) 6", "c) 9", "d) 27", "a) 3"));
                list.add(new QuestionData("Katetlari uzunligi 3 va 4 bo'lgan uchburchakning gipotenuzasi uzunligi qanchadir?",
                        "a) 5", "b) 6", "c) 7", "d) 8", "a) 5"));
                list.add(new QuestionData("Bir burchakki muzlatgichning o'rta nuqtasi burchak kesishuvining tarmoqaro joylashgan shakli?",
                        "a) ikki yarim doira", "b) ikki nuqta", "c) kvadrat", "d) to'g'ri chiziq", "a) ikki yarim doira"));
                list.add(new QuestionData("Simmetriyasi qanchalik ikki tomoni teng bo'lgan to'rtburchakning burchaklari yig'indisi?",
                        "a) 180°", "b) 360°", "c) 540°", "d) 720°", "b) 360°"));
                list.add(new QuestionData("Ikki uzun tomoni bo'lgan to'rtburchakka necha diagonal chizish mumkin?",
                        "a) 1", "b) 2", "c) 3", "d) 4", "c) 3"));
                list.add(new QuestionData("Katetlari 6 va 8 bo'lgan uchburchakka o'rta perpendikulyar chiziq chizilsa, uning uzunligi qanchadir?",
                        "a) 6", "b) 7", "c) 8", "d) 10", "d) 10"));

                break;

            case TARIX:
                list.add(new QuestionData("savol: Aleksandr Mag'nus kimdir?",
                        "a) Yunoniston imperatori",
                        "b) Mo'g'ul imperatorlari",
                        "c) Rassiyada davlat boshqaruvi shaxsan",
                        "d) O'zbekiston buyuk shahri",
                        "a) Yunoniston imperatori"));
                list.add(new QuestionData("savol: Qaysi davrda Madaniyatlar Markazi Samarqand shahri bo'lgan?",
                        "a) Abbosiylar davri",
                        "b) Katta Xorazm shahlar davri",
                        "c) Temuriylar davri",
                        "d) Qo'sho'n davri",
                        "c) Temuriylar davri"));
                list.add(new QuestionData("savol: \"Qo'riyot\" dengiz bo'ylab qaysi davlatni chegaralaydi?",
                        "a) Rossiya",
                        "b) AQSh",
                        "c) Kanada",
                        "d) Braziliya",
                        "a) Rossiya"));
                list.add(new QuestionData("savol: Qaysi tarixchilar \"ilg'orlar tarixi\" deb mashhur?",
                        "a) Gerodot va Tukidid",
                        "b) Beruniy va Ibn Sino",
                        "c) Ibn Haldun va Ibn Rushd",
                        "d) Beruniy va Ibn Sino",
                        "a) Gerodot va Tukidid"));
                list.add(new QuestionData("savol: Qaysi keyingi \"Ipak yo'li\" atamasi bilan mashhur bo'lgan yo'lni rivojlantirdi?",
                        "a) Imperator Aleksandr davri",
                        "b) Xanlar davri",
                        "c) Temuridlar davri",
                        "d) Abbosiylar davri",
                        "c) Temuridlar davri"));
                list.add(new QuestionData("Savol: \"Magna Carta\" qaysi mamlakatda qabul qilingan?",
                        "a) Ingliziston",
                        "b) Fransiya",
                        "c) Germaniya",
                        "d) Rossiyada",
                        "a) Ingliziston"));
                list.add(new QuestionData("savol: Qaysi tarixchilar \"Qadimgi Sharq\" va \"Qadimgi G'arb\" atamalari bilan mashhur?",
                        "a) Ibn Sino va Rozi",
                        "b) Gerodot va Ibn Haldun",
                        "c) Al-Forobiy va Avitsenna",
                        "d) Tukidid va Beruniy",
                        "b) Gerodot va Ibn Haldun"));
                list.add(new QuestionData("savol: Qaysi davlatda \"Terrakota askarlari\" topilgan?",
                        "a) Xitoy",
                        "b) Hindiston",
                        "c) Misr",
                        "d) Yaponiya",
                        "a) Xitoy"));
                list.add(new QuestionData("savol: Qaysi tarixchi \"100-yillik urush\" deb mashhur bo'lgan voqealar to'plamini o'rganib, tarixiy kitob yozdi?",
                        "a) Arnold Toynbi",
                        "b) Fernand Braudel",
                        "c) Edvard Gibbon",
                        "d) Erik Xobsbavm",
                        "c) Edvard Gibbon"));
                list.add(new QuestionData("Savol: Qaysi davrda \"Eng katta Britaniya imperiyasi\" shakllangan?",
                        "a) Hanoverlar davri",
                        "b) Tudorlar davri",
                        "c) Stuartlar davri",
                        "d) Viktoriya davri",
                        "d) Viktoriya davri"));
                list.add(new QuestionData("Qaysi davlat Napoleon do'g'liklariga borib, unga mag'lubiyatni olib kelgan?",
                        "a) Fransiya",
                        "b) Germaniya",
                        "c) Rossiya",
                        "d) Birlashgan Qirollik",
                        "c) Rossiya"));

                // Savol 2
                list.add(new QuestionData("II jahon urushi qachon boshlandi?",
                        "a) 1914",
                        "b) 1915",
                        "c) 1916",
                        "d) 1917",
                        "a) 1914"));

                // Savol 3
                list.add(new QuestionData("Qaysi qaroqaroq imparatorlig'i XIX asrning oxiri - XX asrning boshida o'zaro urushga kirishdi?",
                        "a) Osmonturk imperatorlig'i",
                        "b) Qashqadari imperatorlig'i",
                        "c) Japon imperatorlig'i",
                        "d) Roman imperatorlig'i",
                        "a) Osmonturk imperatorlig'i"));

                // Savol 4
                list.add(new QuestionData("Berlin devori qachon o'rnatildi?",
                        "a) 1961",
                        "b) 1971",
                        "c) 1981",
                        "d) 1991",
                        "a) 1961"));

                // Savol 5
                list.add(new QuestionData("Karl Marx va Friedrich Engels qanday tuzatganlar?",
                        "a) Kommunist partiyani",
                        "b) Englatildi yozganlar",
                        "c) Kapital asarini",
                        "d) Meinkempf asarini",
                        "c) Kapital asarini"));

                // Savol 6
                list.add(new QuestionData("Fransiyadagi Fransuz inqilobi qachon bo'lib o'tdi?",
                        "a) 1789",
                        "b) 1799",
                        "c) 1809",
                        "d) 1819",
                        "a) 1789"));

                // Savol 7
                list.add(new QuestionData("Mustaqil davlatlarning asosiy huquqlari qanday hujjatda aytildi?",
                        "a) Atlantika karta",
                        "b) Mavjudiyat bayoni",
                        "c) Ushbu qonun",
                        "d) Vashington deklaratsiyasi",
                        "d) Vashington deklaratsiyasi"));

                // Savol 8
                list.add(new QuestionData("Maliya-ekonomik hisobotning Qanday yilida amalga oshirilishi kerak?",
                        "a) Hisob yili oxirida",
                        "b) Hisob yili boshida",
                        "c) Hisoblash davrida",
                        "d) Hisoblash vaqtida",
                        "a) Hisob yili oxirida"));

                // Savol 9
                list.add(new QuestionData("Qaysi yil Da Vinchi Leonardo Vincentsi vafot etdi?",
                        "a) 1510",
                        "b) 1519",
                        "c) 1528",
                        "d) 1537",
                        "b) 1519"));

                // Savol 10
                list.add(new QuestionData("Qaysi yil 1-oktyabrda Xitoy Kommunist partiyasi tashkil etildi?",
                        "a) 1941",
                        "b) 1944",
                        "c) 1947",
                        "d) 1950",
                        "a) 1941"));
                break;

            case ADABIYOT:
                list.add(new QuestionData("Navoiyning qaysi asariga \"Xayr qizlar, xayr bola kishilar\" deb o'xshash ibora kirgan?",
                        "a) \"Lison ut-Tayr\"", "b) \"Mahbub ul-Qulub\"", "c) \"Hamsa\"", "d) \"Saddi Iskandariy\"", "a) \"Lison ut-Tayr\""));
                list.add(new QuestionData("G'ofir Almazoriyning asari qaysi asardan olingan?",
                        "a) \"Leyli va Majnun\"", "b) \"Haft Paykar\"", "c) \"Hamsa\"", "d) \"Saddi Iskandariy\"", "b) \"Haft Paykar\""));
                list.add(new QuestionData("Mirzo Ulug'bekning qaysi asarida \"Yosh qizlar shoxida\" qasida yozilgan?",
                        "a) \"Mahbub ul-Qulub\"", "b) \"Munojot\"", "c) \"G'aroyibot\"", "d) \"Navro'znama\"", "d) \"Navro'znama\""));
                list.add(new QuestionData("Qaysi yozuvchi \"Haft Paykar\" asarida Yovgon sultonning sevgilisi bo'lib tasvirlangan?",
                        "a) Navoiy", "b) Firdavsii", "c) Jomi", "d) G'ofir Almazoriy", "c) Jomi"));
                list.add(new QuestionData("Qaysi asar \"Tong otgan kunlar\" haqidagi qasidaga ega?",
                        "a) \"Lison ut-Tayr\"", "b) \"Hayrat ul-abror\"", "c) \"Navro'znama\"", "d) \"Mahbub ul-Qulub\"", "c) \"Navro'znama\""));
                list.add(new QuestionData("Qaysi asar \"Layli va Majnun\" haqidagi she'riy qissani o'z ichiga olgan?",
                        "a) \"Mahbub ul-Qulub\"", "b) \"G'aroyibot\"", "c) \"Hayrat ul-abror\"", "d) \"Navro'znama\"", "a) \"Mahbub ul-Qulub\""));
                list.add(new QuestionData("Qaysi yozuvchi \"Hayrat ul-abror\" asarida \"Shoir\" nomli qasidani yozgan?",
                        "a) Navoiy", "b) Firdavsii", "c) Jomi", "d) G'ofir Almazoriy", "b) Firdavsii"));
                list.add(new QuestionData("Qaysi asar \"Munojot\" haqidagi qasidaga ega?",
                        "a) \"Mahbub ul-Qulub\"", "b) \"G'aroyibot\"", "c) \"Hayrat ul-abror\"", "d) \"Navro'znama\"", "b) \"G'aroyibot\""));
                list.add(new QuestionData("\"Saddi Iskandariy\" asarida kimning haqida \"Devoni Iskandariy\" qasidasini yozgan?",
                        "a) Navoiy", "b) Firdavsii", "c) Jomi", "d) G'ofir Almazoriy", "d) G'ofir Almazoriy"));
                list.add(new QuestionData("Qaysi asar \"G'aroyibot\" haqidagi qasidaga ega?",
                        "a) \"Mahbub ul-Qulub\"", "b) \"Lison ut-Tayr\"", "c) \"Hayrat ul-abror\"", "d) \"Saddi Iskandariy\"", "c) \"Hayrat ul-abror\""));
                list.add(new QuestionData("Kim ʼShayx Sanʼatʼiʼni yozgan?",
                        "a) Tahir Malik",
                        "b) Abdulhamid Cholpon",
                        "c) Abdulla Qodiriy",
                        "d) Oybek",
                        "c) Abdulla Qodiriy"));

                // Savol 2
                list.add(new QuestionData("Qurʼon va yirik xalq adabiyoti mualliflari kimlar?",
                        "a) Temur, Alisher Navoiy",
                        "b) Yusuf Xos Hojib, Zohiriddin Muhammad Babur",
                        "c) Mavlono, Furqat",
                        "d) Fuzuli, Navoiy",
                        "b) Yusuf Xos Hojib, Zohiriddin Muhammad Babur"));

                // Savol 3
                list.add(new QuestionData("«Jahon otashgʼa solamiz, yashnashga ruxsat ber» deb boshlanadigan asar qaysi?",
                        "a) Boburnoma",
                        "b) Navoiyning diwoni",
                        "c) Yusuf Xos Xojibning diwoni",
                        "d) Behzod nomidagi qissa",
                        "b) Navoiyning diwoni"));

                // Savol 4
                list.add(new QuestionData("Oʻzbek adabiyoti ʼnasr siyosatiʼning asoschilari kimlar?",
                        "a) Gʼafur Gʼulom, Xalim Xodjaev",
                        "b) Xalim Xodjaev, Abdulla Qodiriy",
                        "c) Zohir Siddiq, Gʼafur Gʼulom",
                        "d) Abdulla Qodiriy, Zohir Siddiq",
                        "a) Gʼafur Gʼulom, Xalim Xodjaev"));

                // Savol 5
                list.add(new QuestionData("Qaysi shoir butun hayoti davomida urushi kelgusida kelganlarini koʻrsatadi?",
                        "a) Bek yulduzi",
                        "b) Yultuz Omonxoʻja",
                        "c) Navoiy",
                        "d) Oʻrzu Muxammad",
                        "d) Oʻrzu Muxammad"));

                // Savol 6
                list.add(new QuestionData("XIV asrning qanday davri deb ataladi?",
                        "a) Istiqlol davri",
                        "b) Madaniyat davri",
                        "c) Navruziy davri",
                        "d) Oʻzbekiston davri",
                        "a) Istiqlol davri"));

                // Savol 7
                list.add(new QuestionData("Abdulla Oripov qaysi asar bilan tanilgan?",
                        "a) Mendan chaqar",
                        "b) Toraqoʻy",
                        "c) Anvar",
                        "d) Suv sevishganlar",
                        "d) Suv sevishganlar"));

                // Savol 8
                list.add(new QuestionData("Jalol Ikromiy kimning shoir boʻlib tanilgan?",
                        "a) Temur",
                        "b) Jahonotdin Xoʻjayev",
                        "c) Abdulhamid Cholpon",
                        "d) Alisher Navoiy",
                        "c) Abdulhamid Cholpon"));

                // Savol 9
                list.add(new QuestionData("Oʻzbek xalq ertaklaridan qaysi erkak yurtimizning ozodligini tinchladi?",
                        "a) Ogʼajon",
                        "b) Xursand",
                        "c) Layli va Majnun",
                        "d) Farhod va Shirin",
                        "a) Ogʼajon"));

                // Savol 10
                list.add(new QuestionData("Gʼazallar mahorati bilan mashxur shoir kim?",
                        "a) Bobur",
                        "b) Navoiy",
                        "c) Fozil",
                        "d) Zohir Siddiq",
                        "b) Navoiy"));
                // Oson savollar
                list.add(new QuestionData("O'zbekistonning poytaxti qaysi shahar?", "a) Samarqand", "b) Buxoro", "c) Toshkent", "d) Qarshi", "c) Toshkent"));
                list.add(new QuestionData("Ilon musiqlarining asli qaysi mamlakatda paydo bo'lgan?", "a) Hindiston", "b) Faransa", "c) Germaniya", "d) Italiya", "b) Faransa"));
                list.add(new QuestionData("Paxtachilik qilish uslublaridan biri qaysidir?", "a) Rasmiylik", "b) Ornigarchilik", "c) Ko'chbaschiylik", "d) Allayuvlik", "a) Rasmiylik"));
                list.add(new QuestionData("Xorazmda qurilgan ertak qal'asi qaysi shaharda joylashgan?", "a) Urganch", "b) Xiva", "c) Qo'qon", "d) Samarqand", "b) Xiva"));
                list.add(new QuestionData("O'zbekiston Respublikasining bayroqi qaysi yilda qabul qilingan?", "a) 1990", "b) 1991", "c) 1992", "d) 1993", "b) 1991"));

                // Qiyin savollar
                list.add(new QuestionData("Amir Temur qaysi davalarda g'alaba qozongan?", "a) O'rmon dava", "b) Ankara dava", "c) Chingizxon dava", "d) Angliya dava", "a) O'rmon dava"));
                list.add(new QuestionData("Xitoyning poytaxti qaysi shahar?", "a) Pekin", "b) Shanhay", "c) Honkong", "d) Kvangjou", "a) Pekin"));
                list.add(new QuestionData("Petr I qaysi davrda Rossiyaning tsari sifatida o'tgan?", "a) 15 asr", "b) 16 asr", "c) 17 asr", "d) 18 asr", "d) 18 asr"));
                list.add(new QuestionData("Tamerlan qaysi shaharda tug'ilgan?", "a) Buxoro", "b) Shakhrisabz", "c) Andijon", "d) Xiva", "b) Shakhrisabz"));
                list.add(new QuestionData("Yevropaning qaysi qit'asida Mad'ar chet ellarga qarshi urush olib borgan?", "a) Sharqiy Yevropa", "b) Janubiy Yevropa", "c) G'arbiy Yevropa", "d) Shimoliy Yevropa", "a) Sharqiy Yevropa"));

                break;
            case ENGLISH:
                list.add(new QuestionData("What is the capital city of Australia?",
                        "a) Sydney", "b) Melbourne", "c) Canberra", "d) Perth", "c) Canberra"));
                list.add(new QuestionData("Who is the author of the Harry Potter book series?",
                        "a) J.R.R. Tolkien", "b) J.K. Rowling", "c) Stephen King", "d) George R.R. Martin", "b) J.K. Rowling"));
                list.add(new QuestionData("What is the chemical symbol for gold?",
                        "a) Ag", "b) Au", "c) Fe", "d) Hg", "b) Au"));
                list.add(new QuestionData("Which planet is known as the \"Red Planet\"?",
                        "a) Venus", "b) Mars", "c) Jupiter", "d) Saturn", "b) Mars"));
                list.add(new QuestionData("Who painted the Mona Lisa?",
                        "a) Vincent van Gogh", "b) Leonardo da Vinci", "c) Pablo Picasso", "d) Michelangelo", "b) Leonardo da Vinci"));
                list.add(new QuestionData("What is the tallest mountain in the world?",
                        "a) Mount Everest", "b) K2", "c) Mount Kilimanjaro", "d) Mount McKinley", "a) Mount Everest"));
                list.add(new QuestionData("What is the chemical symbol for water?",
                        "a) O2", "b) CO2", "c) H2O", "d) NaCl", "c) H2O"));
                list.add(new QuestionData("Who wrote the play \"Romeo and Juliet\"?",
                        "a) William Shakespeare", "b) Oscar Wilde", "c) George Bernard Shaw", "d) Tennessee Williams", "a) William Shakespeare"));
                list.add(new QuestionData("What is the largest ocean on Earth?",
                        "a) Atlantic Ocean", "b) Indian Ocean", "c) Arctic Ocean", "d) Pacific Ocean", "d) Pacific Ocean"));
                list.add(new QuestionData("What is the fastest land animal?",
                        "a) Cheetah", "b) Lion", "c) Elephant", "d) Giraffe", "a) Cheetah"));

                list.add(new QuestionData("What is the correct plural form of \"child\"?",
                        "a) childs",
                        "b) childes",
                        "c) children",
                        "d) child's",
                        "c) children"));
                list.add(new QuestionData("Which sentence is grammatically correct?",
                        "a) Her and me went to the store.",
                        "b) She and I went to the store.",
                        "c) Me and her went to the store.",
                        "d) Her and I went to the store.",
                        "b) She and I went to the store."));
                list.add(new QuestionData("What is the past tense of the verb \"sing\"?",
                        "a) sung",
                        "b) singed",
                        "c) sang",
                        "d) singing",
                        "c) sang"));
                list.add(new QuestionData("Which of the following is a synonym for \"abundant\"?",
                        "a) scarce",
                        "b) plentiful",
                        "c) meager",
                        "d) sparse",
                        "b) plentiful"));
                list.add(new QuestionData("Which word is the antonym of \"vague\"? ",
                        "a) unclear",
                        "b) specific",
                        "c) ambiguous",
                        "d) uncertain",
                        "b) specific"));
                list.add(new QuestionData("What is the correct comparative form of \"good\"?",
                        "a) gooder",
                        "b) best",
                        "c) more good",
                        "d) better",
                        "d) better"));
                list.add(new QuestionData("In which sentence is the word \"its\" used correctly?",
                        "a) It's cold outside.",
                        "b) Its a beautiful day.",
                        "c) The cat licked it's paw.",
                        "d) The book lost it's cover.",
                        "d) The book lost it's cover."));
                list.add(new QuestionData("Which of these is a metaphor?",
                        "a) He runs as fast as a cheetah.",
                        "b) The stars danced playfully in the sky.",
                        "c) The wind howled through the night.",
                        "d) Time is a thief.",
                        "d) Time is a thief."));
                list.add(new QuestionData("What is the correct plural form of \"ox\"?",
                        "a) oxen",
                        "b) oxes",
                        "c) oxi",
                        "d) oxs",
                        "d) oxs"));
                list.add(new QuestionData("Which of the following is a compound sentence?",
                        "a) She likes coffee; he prefers tea.",
                        "b) Although it rained, the game continued.",
                        "c) The cat slept peacefully on the windowsill.",
                        "d) I ran quickly to catch the bus.",
                        "a) She likes coffee; he prefers tea."));
                list.add(new QuestionData("Choose the correct form of the verb: She ______ to school every day.",
                        "a) go",
                        "b) goes",
                        "c) went",
                        "d) going",
                        "b) goes"));

                // Savol 2
                list.add(new QuestionData("Identify the noun in the sentence: The dog chased the cat.",
                        "a) dog",
                        "b) chased",
                        "c) the",
                        "d) cat",
                        "d) cat"));

                // Savol 3
                list.add(new QuestionData("Which of the following is a correct sentence?",
                        "a) I are hungry.",
                        "b) She have a book.",
                        "c) They is sleeping.",
                        "d) We are studying.",
                        "d) We are studying."));

                // Savol 4
                list.add(new QuestionData("Choose the correct word to complete the sentence: The ________ is on the table.",
                        "a) pen",
                        "b) is",
                        "c) book",
                        "d) cat",
                        "c) book"));

                // Savol 5
                list.add(new QuestionData("Identify the adverb in the sentence: He quickly ran to the store.",
                        "a) He",
                        "b) quickly",
                        "c) ran",
                        "d) store",
                        "b) quickly"));

                // Savol 6
                list.add(new QuestionData("What is the plural form of 'child'?",
                        "a) childs",
                        "b) childes",
                        "c) children",
                        "d) child's",
                        "c) children"));

                // Savol 7
                list.add(new QuestionData("Choose the correct form of the verb: They ______ to the party last night.",
                        "a) go",
                        "b) goes",
                        "c) went",
                        "d) going",
                        "c) went"));

                // Savol 8
                list.add(new QuestionData("Identify the conjunction in the sentence: I will go to the park if it stops raining.",
                        "a) I",
                        "b) will",
                        "c) if",
                        "d) raining",
                        "c) if"));

                // Savol 9
                list.add(new QuestionData("Which sentence is grammatically correct?",
                        "a) Her and me went to the store.",
                        "b) She and I went to the store.",
                        "c) Me and her went to the store.",
                        "d) Her and I went to the store.",
                        "b) She and I went to the store."));

                // Savol 10
                list.add(new QuestionData("Choose the correct word to complete the sentence: The cat sat on ______ lap.",
                        "a) it's",
                        "b) its",
                        "c) its'",
                        "d) it",
                        "b) its"));
                list.add(new QuestionData("What is the capital of France?",
                        "a) London",
                        "b) Paris",
                        "c) Rome",
                        "d) Berlin",
                        "b) Paris"));

                // Savol 2
                list.add(new QuestionData("Which planet is known as the Red Planet?",
                        "a) Venus",
                        "b) Mars",
                        "c) Jupiter",
                        "d) Saturn",
                        "b) Mars"));

                // Savol 3
                list.add(new QuestionData("Who wrote 'Romeo and Juliet'?",
                        "a) William Shakespeare",
                        "b) Charles Dickens",
                        "c) Jane Austen",
                        "d) Mark Twain",
                        "a) William Shakespeare"));

                // Savol 4
                list.add(new QuestionData("What is the chemical symbol for water?",
                        "a) Wo",
                        "b) Hy",
                        "c) Wa",
                        "d) H2O",
                        "d) H2O"));

                // Savol 5
                list.add(new QuestionData("Which country is famous for kangaroos?",
                        "a) Australia",
                        "b) Brazil",
                        "c) India",
                        "d) Canada",
                        "a) Australia"));

                // Savol 6
                list.add(new QuestionData("What is 7 x 8?",
                        "a) 42",
                        "b) 56",
                        "c) 64",
                        "d) 58",
                        "b) 56"));

                // Savol 7
                list.add(new QuestionData("Who painted the Mona Lisa?",
                        "a) Vincent van Gogh",
                        "b) Pablo Picasso",
                        "c) Leonardo da Vinci",
                        "d) Claude Monet",
                        "c) Leonardo da Vinci"));

                // Savol 8
                list.add(new QuestionData("Which is the largest mammal?",
                        "a) Elephant",
                        "b) Blue whale",
                        "c) Giraffe",
                        "d) Rhinoceros",
                        "b) Blue whale"));

                // Savol 9
                list.add(new QuestionData("What is the main ingredient in guacamole?",
                        "a) Tomato",
                        "b) Avocado",
                        "c) Onion",
                        "d) Pepper",
                        "b) Avocado"));

                // Savol 10
                list.add(new QuestionData("Who wrote 'To Kill a Mockingbird'?",
                        "a) Harper Lee",
                        "b) J.K. Rowling",
                        "c) Stephen King",
                        "d) Ernest Hemingway",
                        "a) Harper Lee"));

                break;
            case KIMYO:
                list.add(new QuestionData("Katalizatorlar nima uchun ishlatiladi?",
                        "a) Kimyoviy reaksiyalarni tezlash uchun", "b) Energiantarni saqlash uchun", "c) Kimyoviy elementlarni ajratib turish uchun", "d) Reaksiyalarni to'xtatish uchun", "a) Kimyoviy reaksiyalarni tezlash uchun"));
                list.add(new QuestionData("Elektron konfiguratsiyasi 2s^2 2p^5 bo'lgan element nima?",
                        "a) Azot (N)", "b) Oksigen (O)", "c) Fluor (F)", "d) Klor (Cl)", "a) Azot (N)"));
                list.add(new QuestionData("Asid va bazalar qanday ta'sir ko'rsatadi?",
                        "a) Elektronlar almashish bilan", "b) Iyonlashish bilan", "c) Oksidlashish bilan", "d) Reduksiya bilan", "b) Iyonlashish bilan"));
                list.add(new QuestionData("Kimyoviy reaksiyalarni tezlash uchun qaysi shart kerak?",
                        "a) Haroratni oshirish", "b) Katalizator qo'llash", "c) Kimyoviy moddalar miqdorini oshirish", "d) Yorug'likni oshirish", "b) Katalizator qo'llash"));
                list.add(new QuestionData("Elektronlar qaysi energiya darajasida joylashadi?",
                        "a) Elektronlar orbitallarida", "b) Protonlar orbitallarida", "c) Neutronlar orbitallarida", "d) Yo'q, elektronlar orbitallarda joylashmaydi", "a) Elektronlar orbitallarida"));
                list.add(new QuestionData("Kimyoviy elementlar jadvali qaysi ma'lumotlarni ko'rsatadi?",
                        "a) Elementning atom massasi", "b) Elementning simvoli", "c) Elementning kimiyanaviy xususiyatlari", "d) Barcha variantlar to'g'ri", "d) Barcha variantlar to'g'ri"));
                list.add(new QuestionData("Elektronlar qaysi vositalar orqali aloqa o'rnatadi?",
                        "a) Protonlar orqali", "b) Neutronlar orqali", "c) Elektromagnit o'rtacha orqali", "d) Fotonlar orqali", "c) Elektromagnit o'rtacha orqali"));
                list.add(new QuestionData("PH miqdori 7 dan kichik bo'lgan moddalar nima deyiladi?",
                        "a) Neitral moddalar", "b) Asidlar", "c) Bazalar", "d) Amfoter moddalar", "b) Asidlar"));
                list.add(new QuestionData("Kimyoviy reaksiyada molekulalar qaysi jarayon orqali aloqalangan?",
                        "a) Elektron almashishi bilan", "b) Elektronlar ekanligi bilan", "c) Proton almashishi bilan", "d) Neutron almashishi bilan", "a) Elektron almashishi bilan"));
                list.add(new QuestionData("Elektronlar atomda qaysi tartibda to'planadi?",
                        "a) Burchaklar, tumanlar, orbitallar", "b) Orbitallar, burchaklar, tumanlar", "c) Orbitallar, tumanlar, burchaklar", "d) Tumanlar, orbitallar, burchaklar", "b) Orbitallar, burchaklar, tumanlar"));

                list.add(new QuestionData("Elektronlar qancha urinadilar?",
                        "a) 1.6 x 10^-19 C",
                        "b) 1.6 x 10^-24 C",
                        "c) 9.8 x 10^-2 C",
                        "d) 6.02 x 10^23 C",
                        "a) 1.6 x 10^-19 C"));
                list.add(new QuestionData("Shakl va hajmi qonunini kim ilgari surdi?",
                        "a) Lomonosov",
                        "b) Mendeleev",
                        "c) Avogadro",
                        "d) Boyle",
                        "c) Avogadro"));
                list.add(new QuestionData("Quyosh tizimi kim ilgari surdi?",
                        "a) Copernicus",
                        "b) Newton",
                        "c) Kepler",
                        "d) Galileo",
                        "a) Copernicus"));
                list.add(new QuestionData("Quyilish jismini shakllantirish formula nima?",
                        "a) F = ma",
                        "b) E = mc^2",
                        "c) F = G (m1 * m2) / r^2",
                        "d) P = IV",
                        "c) F = G (m1 * m2) / r^2"));
                list.add(new QuestionData("Oksidlanish-reduksiya reaksiyasida nima qo'llaniladi?",
                        "a) Asos",
                        "b) Aksiyal qo'llab-quvvatlash",
                        "c) Katod",
                        "d) Elektrodniki",
                        "b) Aksiyal qo'llab-quvvatlash"));
                list.add(new QuestionData("Oksidi va suvning ichki ishlari qachondan beri bilinishgan?",
                        "a) 20- asrning boshlari",
                        "b) 18- asrning o'rtalari",
                        "c) 19- asrning oxirlari",
                        "d) 21- asrning boshlari",
                        "c) 19- asrning oxirlari"));
                list.add(new QuestionData("Saf uran (92U) uran oksidini nima bo'lib yoritadi?",
                        "a) UO2",
                        "b) U3O8",
                        "c) UO3",
                        "d) UO",
                        "a) UO2"));
                list.add(new QuestionData("Havo atmosferasining asosiy tarkibiy tuzlari qanchalik?",
                        "a) 70.8%",
                        "b) 21%",
                        "c) 0.04%",
                        "d) 0.9%",
                        "b) 21%"));
                list.add(new QuestionData("Quyilish harorati nima hisoblanadi?",
                        "a) Kelvin",
                        "b) Celsius",
                        "c) Fahrenheit",
                        "d) Rankine",
                        "a) Kelvin"));
                list.add(new QuestionData("Kimyo elementlari jadvali kim tomonidan tuzilgan?",
                        "a) Mendeleev",
                        "b) Avogadro",
                        "c) Lavoisier",
                        "d) Rutherford",
                        "a) Mendeleev"));
                list.add(new QuestionData("Elementlar jadvalining nechanchi elementi silikon (Si)?",
                        "a) 10",
                        "b) 12",
                        "c) 14",
                        "d) 16",
                        "c) 14"));

                // Savol 2
                list.add(new QuestionData("Karbon atomlari nechta oʻrganishi mumkin?",
                        "a) 1",
                        "b) 2",
                        "c) 3",
                        "d) 4",
                        "d) 4"));

                // Savol 3
                list.add(new QuestionData("Kationsiz miqyosiz birlashuvlar qaysi quyidagilar bilan mamlakatdan olinadi?",
                        "a) Quvurlar",
                        "b) Kremniy",
                        "c) Chaklar",
                        "d) Xlorlar",
                        "b) Kremniy"));

                // Savol 4
                list.add(new QuestionData("Shuningdek, termal jarayonlarda suvning oʻzini maxsulotga almashtirish bilan oxigen molekulalari qandayga almashtiriladi?",
                        "a) Oksidlanish",
                        "b) Reduksiya",
                        "c) Yaramaslik",
                        "d) Dissotsiatsiya",
                        "b) Reduksiya"));

                // Savol 5
                list.add(new QuestionData("Elementlar jadvalining qaysi guruhiga kovalent birlashuvlar birjasi sifatida belgilangan?",
                        "a) IV",
                        "b) V",
                        "c) VI",
                        "d) VII",
                        "c) VI"));

                // Savol 6
                list.add(new QuestionData("Soda turli xil, kristall yoki toʻzalangan tuzlarning umumiy nomi nima?",
                        "a) Nitrattlar",
                        "b) Sulfatlar",
                        "c) Karbonatlar",
                        "d) Xloridlar",
                        "c) Karbonatlar"));

                // Savol 7
                list.add(new QuestionData("Elementlar jadvalining nechanchi periodida aliminii (Al) elementi joylashgan?",
                        "a) 2-period",
                        "b) 3-period",
                        "c) 4-period",
                        "d) 5-period",
                        "b) 3-period"));

                // Savol 8
                list.add(new QuestionData("Katta tozalanish darajasi bilan qanday miqdor boʻyicha kombinatsiya qilingan ichki va tashqi zararlar?",
                        "a) Molekulyar tozalanish",
                        "b) Atom tozalanish",
                        "c) Koloidal tozalanish",
                        "d) Suspensiyalash",
                        "c) Koloidal tozalanish"));

                // Savol 9
                list.add(new QuestionData("Elektrolitlar nechta guruhga boʻlinadi?",
                        "a) 1",
                        "b) 2",
                        "c) 3",
                        "d) 4",
                        "d) 4"));

                // Savol 10
                list.add(new QuestionData("Uzbda yagona otkazuvchili suv bilan ishlov beriladigan oʻrganishmi?",
                        "a) 3% natriy xloridli oʻsimlik bilan",
                        "b) 0,9% natriy xloridli oʻsimlik bilan",
                        "c) 5% natriy xloridli oʻsimlik bilan",
                        "d) 10% natriy xloridli oʻsimlik bilan",
                        "b) 0,9% natriy xloridli oʻsimlik bilan"));
                break;

            case FIZIKA:
                list.add(new QuestionData("Elektr qaynashining asosiy xususiyatlari qaysilardir?",
                        "A) Qonuniylik va qonunlar", "B) Dastlabki joriy va jinsl, engel va muhiti ko'rsatgichlar", "C) Yuqori tezligi ko'rish", "D) Isiqlik va chiroqlarning oqimlari", "B) Dastlabki joriy va jinsl, engel va muhiti ko'rsatgichlar"));

                list.add(new QuestionData("Elektr qurilmalarining boshqa nomi qanday?",
                        "A) Rezistor", "B) O'ramizgi", "C) Kondensator", "D) Transistor", "A) Rezistor"));

                list.add(new QuestionData("Bir elektr qurilmasining maktubi muddati qancha bo'lishi mumkin?",
                        "A) 360 V", "B) 220 A", "C) 120 s", "D) 60 W", "C) 120 s"));

                list.add(new QuestionData("Qanday elektr qurilma miqdori ohmda ifodalansa, u qanday qurilma hisoblanadi?",
                        "A) Moshak", "B) O'rta qism", "C) Izolyator", "D) Resistor", "D) Resistor"));

                list.add(new QuestionData("Elektr qurilmani qanday hisoblash mumkin?",
                        "A) P = IV", "B) F = ma", "C) F = kx", "D) E = mc²", "A) P = IV"));

                list.add(new QuestionData("Bir elektrikli loyihaning maqsadi qandaydir?",
                        "A) Energia saqlash", "B) Energia ko'rish", "C) Energia o'zgartirish", "D) Energia almashish", "B) Energia ko'rish"));

                list.add(new QuestionData("Bir elektrikli qurilma o'tkir dasturini aniqlashning eng yaxshi usuli nima?",
                        "A) Kirish-qaytarish prinsipi", "B) Ohm qonuni", "C) Kirish ta'siri", "D) Kuch va tezlik qonuni", "B) Ohm qonuni"));

                list.add(new QuestionData("Elektrik idora tizimi qanday ifodalangan?",
                        "A) AC va DC", "B) Hz va kHz", "C) Amper va Volt", "D) Si va C", "A) AC va DC"));

                list.add(new QuestionData("Elektr energiyasi qanday hisoblanadi?",
                        "A) E = mc²", "B) P = IV", "C) E = Pt", "D) P = I²R", "B) P = IV"));

                list.add(new QuestionData("Elektrik energiyasini saqlashning eng oson usuli qanday?",
                        "A) Batareya",
                        "B) Energiyani hisoblash",
                        "C) Generatsiya",
                        "D) Transformator",
                        "A) Batareya"));

                list.add(new QuestionData("Tezlik vaqtni o'zgartirsa, qancha kuch bo'ladi?",
                        "A) Uzluksiz",
                        "B) Noaniq",
                        "C) Ayirma",
                        "D) Qonunli",
                        "D) Qonunli"));
                list.add(new QuestionData("Ulanish kuchini aniqlash formulasi qanday?",
                        "A) F = ma",
                        "B) P = IV",
                        "C) E = mc²",
                        "D) F = kx",
                        "A) F = ma"));
                list.add(new QuestionData("Qonuniylik qaysi jismlarni jamlab chiqaradi?",
                        "A) Kuch va massa",
                        "B) Kuch va tezlik",
                        "C) Kuch va energiya",
                        "D) Kuch va qonun",
                        "C) Kuch va energiya"));
                list.add(new QuestionData("Harakatlanayotgan jismning o'rtacha tezligi qanday topiladi?",
                        "A) s = ut + ½at²",
                        "B) v = u + at",
                        "C) v² = u² + 2as",
                        "D) s = ½(v + u)t",
                        "A) s = ut + ½at²"));
                list.add(new QuestionData("Qanday holatda qonunlar va qonuniylik mezonlari xususiy bo'lib turgan?",
                        "A) Har ikki holatda",
                        "B) Faqat xarakteristik holatda",
                        "C) Faqat qonunlar holatida",
                        "D) Faqat qonuniylik mezonlari holatida",
                        "B) Faqat xarakteristik holatda"));
                list.add(new QuestionData("Bir jismga qo'yilgan kuchni qanday hisoblash mumkin?",
                        "A) F = ma",
                        "B) P = IV",
                        "C) E = mc²",
                        "D) F = kx",
                        "A) F = ma"));
                list.add(new QuestionData("Bir qurilmaning kuchini qanday hisoblash mumkin?",
                        "A) F = ma",
                        "B) P = IV",
                        "C) E = mc²",
                        "D) F = kx",
                        "A) F = ma"));
                list.add(new QuestionData("Harakatlanayotgan jismin o'rtacha tezligini topish formulasi qanday?",
                        "A) v = u + at",
                        "B) v² = u² + 2as",
                        "C) s = ½(v + u)t",
                        "D) s = ut + ½at²",
                        "B) v² = u² + 2as"));
                list.add(new QuestionData("Qanday elektrikli qurilma o'tkir dasturini aniqlashning eng yaxshi usuli qanday?",
                        "A) Kirish-qaytarish prinsipi",
                        "B) Ohm qonuni",
                        "C) Kirish ta'siri",
                        "D) Kuch va tezlik qonuni",
                        "A) Kirish-qaytarish prinsipi"));
                list.add(new QuestionData("Ulanish kuchini qanday aniqlash mumkin?",
                        "A) F = ma",
                        "B) P = IV",
                        "C) E = mc²",
                        "D) F = kx",
                        "A) F = ma"));
                // Savol 1
                list.add(new QuestionData("Kuch birlikning SI o'lchovi qanday?",
                "a) Niyuton",
                        "b) Joule",
                        "c) Vatt",
                        "d) Volt",
                        "a) Niyuton"));

                // Savol 2
                list.add(new QuestionData("Quyidagilardan qaysi birlik kvektor miqdor?",
                "a) Massa",
                        "b) Tezlik",
                        "c) Hajmi",
                        "d) Tezlik",
                        "d) Tezlik"));

                // Savol 3
                list.add(new QuestionData("Erda gravitatsion tezlanish qanchalik?",
                "a) 9.8 m/s^2",
                        "b) 6.7 m/s^2",
                        "c) 12.3 m/s^2",
                        "d) 5.5 m/s^2",
                        "a) 9.8 m/s^2"));

                // Savol 4
                list.add(new QuestionData("Quyidagilardan qaysi bir oson qurilma turi emas?",
                "a) Koyish",
                        "b) Charka",
                        "c) Tezlanish",
                        "d) Transfarmator",
                        "d) Transfarmator"));

                // Savol 5
                list.add(new QuestionData("Kinetik energiya hisoblash formulasi qanday?",
                "a) KE = 1/2 * mv^2",
                        "b) KE = mgh",
                        "c) KE = Fd",
                        "d) KE = P/t",
                        "a) KE = 1/2 * mv^2"));

                // Savol 6
                list.add(new QuestionData("Elektr to'qi o'lchovi qanday?",
                "a) Vatt",
                        "b) Amper",
                        "c) Joule",
                        "d) Volt",
                        "b) Amper"));

                // Savol 7
                list.add(new QuestionData("Quyidagi gaplardan to'g'ri bo'lgan qaysi bir?",
                "a) Ovoz qolidan tortib yuradi",
                        "b) Ovoz yog'inga chiqadi",
                        "c) Ovoz uzluksiz ravishda sayohat qiladi",
                        "d) Ovoz vakuumda eng tez ravishda sayohat qiladi",
                        "c) Ovoz uzluksiz ravishda sayohat qiladi"));

                // Savol 8
                list.add(new QuestionData("Qaysi qonun cho'qqishtirishning qonuni?",
                "a) Yansab cho'qqishtirish: B = IR",
                        "b) Volt qonuni: P = IV",
                        "c) Joule qonuni: Q = mcΔT",
                        "d) N'uton qonuni: F = ma",
                        "a) Yansab cho'qqishtirish: B = IR"));

                // Savol 9
                list.add(new QuestionData("Kuch birlik qanday?",
                "a) Joule",
                        "b) Volt",
                        "c) Vatt",
                        "d) Om",
                        "c) Vatt"));

                // Savol 10
                list.add(new QuestionData("Kuch birlik qanday?",
                "a) Joule",
                        "b) Volt",
                        "c) Vatt",
                        "d) Om",
                        "c) Vatt"));



                break;
        }
    }
}

