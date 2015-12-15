package chapter1;

public interface Lookup {
	/**
	 * Return the value associated with the name, or
	 * null if there is no such value */
	Object find(String name);
}
