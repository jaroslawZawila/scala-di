package net.zawila.scala.di.readmonad

import net.zawila.scala.di.common.{Book, BookRepository}

object BookRepositoryImpl extends BookRepository  {
  override def get(bookId: Int): Book = new Book(1, "Author")

  override def findByAuthor(author: String): List[Book] = List(new Book(2, "Author2"))
}
