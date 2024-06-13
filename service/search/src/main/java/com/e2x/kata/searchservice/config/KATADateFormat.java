package com.e2x.kata.searchservice.config;

import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.text.FieldPosition;
import java.util.Date;


public class KATADateFormat extends StdDateFormat {

  private static final long serialVersionUID = 1L;

  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    return super.format(date, toAppendTo, fieldPosition);
  }

}