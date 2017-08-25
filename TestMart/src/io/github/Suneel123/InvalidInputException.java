package io.github.Suneel123;

public class InvalidInputException extends Exception {
	private String errorDetails;
	
	public InvalidInputException(String reason, String errorDetails) {
		super(reason);
		this.errorDetails = errorDetails;
	}
}
