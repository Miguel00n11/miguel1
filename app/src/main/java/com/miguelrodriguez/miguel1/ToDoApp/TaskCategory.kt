package com.miguelrodriguez.miguel1.ToDoApp

sealed class TaskCategory {
    object Personal:TaskCategory()
    object Business:TaskCategory()
    object Other:TaskCategory()
}