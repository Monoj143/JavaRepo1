package JavaBasics;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class ThrowThrows {

	public static void main(String[] args)throws FileAlreadyExistsException,IOException {
		
		throw new IOException();
	}
}
