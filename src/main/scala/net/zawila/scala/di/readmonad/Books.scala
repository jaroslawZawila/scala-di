package net.zawila.scala.di.readmonad

import net.zawila.scala.di.common.{BookRepository}

trait Books {
  import scalaz.Reader

  def getBook(id: Int) = Reader ((bookRepository: BookRepository) =>
    bookRepository.get(id)
  )

  def find(author: String)  = Reader ((bookRepository: BookRepository) =>
    bookRepository.findByAuthor(author)
  )
}
