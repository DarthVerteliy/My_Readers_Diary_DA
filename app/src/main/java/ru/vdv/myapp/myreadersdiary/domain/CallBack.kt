package ru.vdv.myapp.myreadersdiary.domain

interface CallBack<T> {
    fun onResult(value: T)
    fun onFailure(t: Int)
}