package net.zawila.scala.di.readmonad

import net.zawila.scala.di.common.{BookRepository, Book}


object Applications extends Application(BookRepositoryImpl)

class Application (booksRepository: BookRepository) {

  def get(id: Int): Book = {
    booksRepository.get(id)
  }

}
