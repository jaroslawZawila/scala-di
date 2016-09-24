package net.zawila.scala.di.common

trait BookRepository {
  def get(bookId: Int): Book
  def findByAuthor(author: String): List[Book]
}

case class Book(id: Int, author: String)
