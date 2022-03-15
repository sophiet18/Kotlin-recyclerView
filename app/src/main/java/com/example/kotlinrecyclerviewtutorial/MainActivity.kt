package com.example.kotlinrecyclerviewtutorial

import android.app.Activity
import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kotlinrecyclerviewtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BookClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popluateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext,3)
            adapter = CardAdapter(bookList, mainActivity)
        }
    }
    override fun onClick(book: Book) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun popluateBooks() {
        val book1 = Book(
            R.drawable.ic_cover1,
            "Matt Ridley",
            "How Innovation Works And Why It Flourishes In Freedom",
            "Book Description"
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.ic_cover2,
            "Morgan Housel",
            "The Psychology of Money",
            "Timeless Lessons on Wealth, Greed and Happiness"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.ic_cover3,
            "King David",
            "Psalms",
            "How David cries out to the Lord"
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.ic_cover4,
            "Apostle John",
            "John",
            "The Gospel According to John"
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.ic_cover5,
            "the Holy Spirit",
            "Genesis",
            "The beginning of everything"
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.ic_cover6,
            "Matthew",
            "Matthew",
            "The Gospel according to Matthew"
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.ic_cover7,
            "Apostle Paul",
            "Romans",
            "The letter to the Roman church"
        )
        bookList.add(book7)

        val book8 = Book(
            R.drawable.ic_cover8,
            "Isaiah",
            "The book of Isaiah",
            "Revelations to Isaiah"
        )
        bookList.add(book8)

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
        bookList.add(book8)
    }


}