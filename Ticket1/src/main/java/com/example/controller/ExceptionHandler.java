package com.example.controller;

import com.example.exceptions.IdNotFoundException;

public @interface ExceptionHandler {

	Class<IdNotFoundException> value();

}
