package com.company;

import java.util.Random;

public class Answer {
    private static final Random rnd = new Random();

    private static final String[] commonPhrases = {
            "Нет ничего ценнее слов, сказанных к месту и ко времени",
            "Интересная идея",
            "Хорошая мысль",
            "Иногда нужно просто радоваться жизни"
    };

    public static String getCommonPhrase() {
        return commonPhrases[rnd.nextInt((commonPhrases.length))];
    }

    private static final String[] elusiveAnswers = {
            "Мне кажется, что я не знаю ответа на этот вопрос",
            "Интересный вопрос, попробую подумать позже",
            "Хорошая тема для обсуждения, но я пока что не готов ответить",
            "Интересный вопрос, но я мало что знаю в этой теме",
            "Если бы я знал это",
            "Если бы я знал это, я был бы миллиардером",
            "Я бы хотел знать это",
            "А кто знает?",
            "Это лишь одна из многих вещей, которые мы не знаем об этом",
            "Было бы неплохо узнать об этом, ведь так?",
            "Я не знаю, но, возможно, кто-то из твоих друзей в курсе",
            "К сожалению, в данный момент не могу дать ответ на этот вопрос",
            "Не могу найти информацию об этом в своей программе",
            "Попробуйте перефразировать вопрос, не могу найти ничего, чтобы ответить вам",
            "Не могли бы зайти с другой стороны, а то я не понимаю вас",
            "Даже не знаю, что ответить",
            "Пока что я не знаю ответа на этот вопрос"
    };

    public static String getElusiveAnswer() {
        return elusiveAnswers[rnd.nextInt((elusiveAnswers.length))];
    }

    private static final String[] greetings = {
            "Привет",
            "Доброе утро",
            "Хай",
            "Приветули",
            "И я тебя тоже приветствую, мой любезный и оригинальный собеседник",
            "Приветствую",
            "Отлично выглядишь",
            "Рад тебя видеть",
            "Хэлло",
            "Здравия желаю",
            "Счастлив видеть",
            "Примите моё приветствие",
            "Сколько лет, сколько зим...",
            "Приятно видеть тебя снова"
    };

    public static String getGreeting() {
        return greetings[rnd.nextInt((greetings.length))];
    }

    private static final String[] moods = {
            "Хорошо",
            "Отлично",
            "Лучше всех",
            "Как всегда отлично себя чувствую",
            "Нет настроения",
            "Всё прекрасно",
            "Я соскучился",
            "Лучше чем вчера, но хуже чем завтра",
            "Не так чтобы очень,но и не очень ,чтобы уж так",
            "В полном порядке. Иногда, правда, в случайном"
    };

    public static String getMood() {
        return moods[rnd.nextInt((moods.length))];
    }

    private static final String[] quotes = {
            "Всю жизнь ожидаешь встречи с Кем-то, кто поймёт тебя и примет таким, какой ты есть. А в самом конце обнаруживаешь, что этот Кто-то всегда с тобой. И это — ты сам.",
            "Если ты будешь колоть дрова сам, то согреешься ими дважды.",
            "Если чего хочешь по-настоящему, рано или поздно получишь.",
            "Много узнаешь, путешествуя, если глаз не закрывать.",
            "В жизни счастливых концов на всех не хватает.",
            "Если уехать достаточно далеко, никаких правил не останется.",
            "Магия, как и вино, хороша лишь в определенных условиях.",
            "В двадцать один так хочешь найти любовь, что видишь ее в лице каждого чужака.",
            "Вино говорит. Это общеизвестно.",
            "Начнешь разбираться – рискнешь узнать больше, чем хочешь."
    };

    public static String getQuote() {
        return quotes[rnd.nextInt((quotes.length))];
    }

    private static final String[] books = {
            "451° по Фаренгейту - Рей Брэдбери",
            "1984 - Джордж Оруэлл",
            "Шантарам - Грегори Дэвид Робертс",
            "Мастер и Маргарита - Михаил Булгаков",
            "Три товарища - Эрих Мария Ремарк",
            "Цветы для Элджернона - Даниел Киз",
            "Атлант расправил плечи - Айн Рэнд",
            "Портрет Дориана Грея - Оскар Уайльд",
            "Над пропастью во ржи - Джером Д. Сэлинджер",
            "Сто лет одиночества - Габриэль Гарсиа Маркес",
            "Маленький принц - Антуан де Сент-Экзюпери",
            "Вино из одуванчиков - Рей Брэдбери",
            "Убить пересмешника - Харпер Ли",
            "Преступление и наказание - Фёдор Достоевский",
            "Евгений Онегин - Александр Пушкин",
            "О дивный новый мир - Олдос Хаксли",
            "Алхимик - Пауло Коэльо",
            "Тень горы - Грегори Дэвид Робертс",
            "Гарри Поттер и узник Азкабана - Джоан К. Роулинг"
    };

    public static String getBook() {
        return books[rnd.nextInt((books.length))];
    }

    private static final String[] films = {
            "Побег из Шоушенка, 1994г.",
            "Крёстный отец, 1972г.",
            "Унесённые призраками, 2001г.",
            "Пианист, 2002г.",
            "Новые времена, 1936г.",
            "Одержимость, 2014г.",
            "1+1, 2011г.",
            "Олдбой, 2003г.",
            "Подводная лодка, 1981г.",
            "Звёздочки на земле, 2007г.",
            "Цельнометаллическая оболочка, 1987г.",
            "Жить, 1952г.",
            "Амели, 2001г.",
            "Всё о Еве, 1950г.",
            "Нефть, 2007г.",
            "Остров проклятых, 2010г.",
            "Головоломка, 2015г.",
            "Воин, 2011г.",
            "Викрам Ведха, 2017г."
    };

    public static String getFilm() {
        return films[rnd.nextInt((films.length))];
    }

    private static final String[] songs = {
            "Юность - Dabro",
            "Если тебе будет грустно - Rauf & Faik, NILETTO",
            "Deep End - Fousheé",
            "Медляк - Мари Краймбрери, HammAli",
            "АУФ - SQWOZ BAB, The First Station",
            "Втюрилась - Дора",
            "Therefore I Am - Billie Eilish",
            "Окей - Тима Белорусских",
            "Комета - JONY",
            "Муза - ELMAN",
            "Life - Zivert",
            "Lollipop - Gafur, JONY",
            "Пикачу - Mia Boyka & ЕГОР ШИП",
            "Пустяк - GUF, Murovei, Dina RAF",
            "The Business - Tiësto",
            "I Got Love - Miyagi & Эндшпиль, Рем Дигга",
            "Запомни I love you - SHAMI, Rauf & Faik",
            "Кукла колдуна - Король и Шут",
            "The Banjo Beat - HAYASA G"
    };

    public static String getSong() {
        return songs[rnd.nextInt((songs.length))];
    }
}
