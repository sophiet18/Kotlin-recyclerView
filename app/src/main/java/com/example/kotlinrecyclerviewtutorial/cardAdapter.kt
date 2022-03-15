package com.example.kotlinrecyclerviewtutorial

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerviewtutorial.databinding.CardsCellBinding

class CardAdapter (private val books: List<Book>,
                   private val ClickListener:BookClickListener)
    :RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardsCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, ClickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindBook(books[position])
    }

    override fun getItemCount(): Int = books.size
}