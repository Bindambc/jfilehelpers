package com.jfilehelpers.converters.testobjects;

import com.jfilehelpers.annotations.DelimitedRecord;
import com.jfilehelpers.annotations.FieldConverter;
import com.jfilehelpers.enums.ConverterKind;

import java.util.Date;



@DelimitedRecord
public class DateFormatType1 {
    public int orderID;
    public int employeeID;
    @FieldConverter(converter = ConverterKind.Date, format = "d-M-yyyy")
    public Date orderDate;
    @FieldConverter(converter = ConverterKind.Date, format = "MMddyyyy")
    public Date requiredDate;
    @FieldConverter(converter = ConverterKind.Date, format = "d/M/yy")
    public Date shippedDate;
    public DateFormatType1() {

    }
}
