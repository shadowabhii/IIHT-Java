package com.reader.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reader.model.ReaderBook;

public interface IReaderRepository extends JpaRepository<ReaderBook, Integer> {

}
