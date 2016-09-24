package net.zawila.scala.di.cakepattern

import net.zawila.scala.di.common.BookRepository

trait BookRepositoryComponent {
  def bookRepository: BookRepository
}
