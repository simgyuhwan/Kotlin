package com.group.libraryapp.domain.book

import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface BookRepository : JpaRepository<Book, Long> {

    fun findByName(bookName: String) : Book?
    fun findBookById(bookId: Long) : Book?
    fun findBookByName(name: String) : Book?
}