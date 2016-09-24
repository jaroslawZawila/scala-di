package net.zawila.scala.di.cakepattern

import net.zawila.scala.di.common.Book

trait Books {
  self: BookRepositoryComponent =>

  def getBook(id: Int): Book = {
    bookRepository.get(id)
  }

  def find(author: String): List[Book] = {
    bookRepository.findByAuthor(author)
  }
}
