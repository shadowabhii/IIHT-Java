package com.reader.services;

import org.springframework.beans.factory.annotation.Autowired;

public class ReaderServiceImpl implements IReaderService {
	
	@Autowired
	IReaderRepository readerRepository;

}
