package ru.netology.hierarchy.view

class ViewGroup: View() {
    var view = View()
    fun addView(view: View) {
        this.view = view
    }
}