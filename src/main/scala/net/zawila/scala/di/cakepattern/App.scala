package net.zawila.scala.di.cakepattern

object Application extends App {

  def run() = {
    val book = BookExample.getBook(1)

    println("Get book: "+ book)

    val books = BookExample.find("Author")

    println("Books: " + books)
  }

  object BookExample extends Books with BookRepositoryComponentImp
}
