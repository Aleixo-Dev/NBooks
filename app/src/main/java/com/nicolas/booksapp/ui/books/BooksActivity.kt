package com.nicolas.booksapp.ui.books

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nicolas.booksapp.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.books_title)
        setSupportActionBar(toolbarMain)

        val viewModel: BookViewModel = ViewModelProviders.of(this).get(BookViewModel::class.java)
        viewModel.booksLiveData.observe(this, {
            it?.let { books ->
                with(recyclerBooks) {
                    layoutManager =
                        LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = BooksAdapter(books)
                }
            }
        })
        viewModel.getBooks()
    }
}