package com.nicolas.booksapp.ui.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nicolas.booksapp.R
import com.nicolas.booksapp.data.model.Book

class BooksAdapter(
    private val books: List<Book>
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bind(books[position])
    }

    override fun getItemCount() = books.size

    class BooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val title: TextView = view..title
        private val author: TextView = view..author

        fun bind(book: Book) {
            title.text = book.title
            author.text = book.author
        }
    }
}