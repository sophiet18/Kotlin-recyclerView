package com.example.kotlinrecyclerviewtutorial

import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerviewtutorial.databinding.CardsCellBinding

class CardViewHolder(
    private val cardsCellBinding: CardsCellBinding,
    private val ClickListener:BookClickListener)
    :RecyclerView.ViewHolder(cardsCellBinding.root){
        fun bindBook(book: Book){
            cardsCellBinding.cover.setImageResource(book.cover)
            cardsCellBinding.title.text = book.title
            cardsCellBinding.author.text = book.author

            cardsCellBinding.cardView.setOnClickListener {
                ClickListener.onClick(book)
            }
        }
    }