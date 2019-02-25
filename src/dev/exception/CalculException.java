package dev.exception;

public class CalculException extends Exception{
	public CalculException() {
	}
	public CalculException(String msg) {
		System.out.println(msg);
	}
}
