package ru.vdv.myapp.myreadersdiary.model.repository

import ru.vdv.myapp.myreadersdiary.domain.*

interface Repository {
    fun getListOfBooks(callBack: CallBack<List<Book>>)
    fun getUserInfo(userLogin: String, callBack: CallBack<User>)
    fun postBook(callBack: CallBack<Any>)
    fun patchBook(callBack: CallBack<Any>)
    fun deleteBook(callBack: CallBack<Any>)
    fun putBook(callBack: CallBack<Any>)
    fun headBook(callBack: CallBack<Any>)
    fun optionsBook(callBack: CallBack<Any>)
    fun httpBook(callBack: CallBack<Any>)

    //модуль EVENT
    /**
    ### "Получить список N последних событий для пользователя этого приложения"
     * @param num - максимальное количество событий загружаемых одномоментно (*если не указано
     * то будут загружены все события, в дальнейшем загрузка будет ограничена значением по умолчанию
     * установленным в API DadApproves.ru*)
     * @return возвращает список объектов *[Event]*
     * @throws NullPointerException
     **/
    fun getEventsList(num: Int, callBack: CallBack<List<Event>>)

    /**
    ### "Получить список N последних событий относительно конктерной книги и пользователя этого приложения"
     * @param num - максимальное количество событий загружаемых одномоментно (*если не указано
     * то будут загружены все события, в дальнейшем загрузка будет ограничена значением по умолчанию
     * установленным в API DadApproves.ru*)
     * @param bookId - уникальный идентификатор книги
     * @return возвращает список объектов *[Event]*
     * @throws NullPointerException
     **/
    fun getEventsListOfBook(num: Int, bookId: String, callBack: CallBack<List<Event>>)

    /**
    ### "Получить список совокупных значений недельных активностей пользователя"
     * @return возвращает список объектов *[WeekEvent]* совокупных даннных недельных активностей.
     * @throws NullPointerException
     **/
    fun getSummaryEventData(callBack: CallBack<List<WeekEvent>>)

    fun setEvent(callBack: CallBack<Event>)
    fun putEventOfStartApp(callBack: CallBack<Event>)
    fun putEventOfStopApp(callBack: CallBack<Event>)
    fun putEventOfStartReading(callBack: CallBack<Event>)
    fun putEventOfStopReading(callBack: CallBack<Event>)
    fun putEventOfChangeCurrentPage(callBack: CallBack<Event>)
    fun deleteEvent(callBack: CallBack<Event>)

}