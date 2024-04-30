package task4

// [TASK]
// Реализуйте свой класс NewsPoster, с возможностью оповещения других объектов Subscriber новых
// новостей, используя шаблон проектирования наблюдатель.

class NewsPoster {
    private val subscribers = mutableListOf<Subscriber>()

    fun addNewNews(news: String) {
        subscribers.forEach { it.notify(news) }
    }

    fun addSubscriber(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    fun removeSubscriber(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }
}

interface Subscriber {
    fun notify(news: String)
}

class NewsReaderSubscriber : Subscriber {
    override fun notify(news: String) {
        println("NewsReaderSubscriber: $news")
    }
}

class EmailSubscriber : Subscriber {
    override fun notify(news: String) {
        println("EmailSubscriber: $news")
    }
}

fun main() {
    val newsPoster = NewsPoster()
    val newsReaderSubscriber = NewsReaderSubscriber()
    val emailSubscriber = EmailSubscriber()

    newsPoster.addSubscriber(newsReaderSubscriber)
    newsPoster.addSubscriber(emailSubscriber)
    newsPoster.addNewNews("default news >-<")

    newsPoster.removeSubscriber(emailSubscriber)
    newsPoster.addNewNews("one more default news >-<")
}
