package com.igniquest.corejava.exception;

//Custom exception for invalid month range
class InvalidMonthRangeException extends Exception {
 public InvalidMonthRangeException(String message) {
     super(message);
 }
}